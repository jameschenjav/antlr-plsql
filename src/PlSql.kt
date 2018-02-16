import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.tree.*
import org.json.JSONObject
import java.io.ByteArrayInputStream
import java.io.File
import java.nio.charset.Charset

class PlSql: PlSqlParserBaseListener() {
	val document by lazy { Document() }
	var lineCount = 0
	var tokenList = listOf<Token>()
	var code = ""

	override fun exitMain(ctx: PlSqlParser.MainContext?) {
		document.parse(ctx!!)
	}

	fun parse(fileName: String): PlSql {
		val file = File(fileName)
		System.err.println("Parsing:\t${file.name}")

		val bytes = file.readBytes()
		val stream = ByteArrayInputStream(bytes)
		val lexer = PlSqlLexer(CharStreams.fromStream(stream))
		val tokens = CommonTokenStream(lexer)
		val parser = PlSqlParser(tokens)
		val walker = ParseTreeWalker()

		document.setFile(file.name)
		walker.walk(this, parser.javln())

		if (Flags.t) {
			lexer.reset()
			tokenList = lexer.allTokens
		}

		if (Flags.c) {
			code = bytes.toString(Charset.forName("UTF-8"))
		}

		lineCount = bytes.count { it.toChar() == '\n' } + 1

		System.err.println("Finished:\t${file.name} ($lineCount lines)")
		return this
	}

	companion object {
		data class TokenData(
			val r: Int,	// row
			val c: Int,	// col
			val b: Int,	// beg
			val e: Int,	// end
			val t: Int	// type
		)

		data class Jo(
			val tk: String,
			val nodes: List<Jo>? = null,
			val v: String? = null
		)

		private fun convertContent(n: RuleNode): String {
			val s = n.javaClass.simpleName
			return s.substring(0, s.length - 7).toLowerCase()
		}

		private fun walk(t: ParseTree): Jo {
			if (t is ErrorNode) {
				return Jo("ERR", v = t.toString())
			}
			if (t is TerminalNode) {
				return Jo("Str", v = t.toString())
			}

			val node = t as RuleNode
			val count = node.childCount
			var i = 0
			val nodes = mutableListOf<Jo>()
			while (i < count) {
				nodes.add(walk(node.getChild(i)))
				i += 1
			}
			return Jo(convertContent(t), nodes.toList())
		}

		private fun createTokenData(token: Token) = TokenData(
			token.line, token.charPositionInLine, token.startIndex, token.stopIndex+1, token.type
		)

		private var files = mutableListOf<String>()

		object Flags {
			var t = false // token
			var c = false // code
			var h = false // help
			var a = false // TEST
		}

		private val helpMessage = """
    |Javelin PL/SQL Parser Usage
    |	-h	Help:	Display this message
    |	-t	Tokens:	Generate JSON with Tokens
    |	-c	Code:	Generate JSON with Code
    |	-a	AST:	Generate AST as JSON
		""".trimMargin()

		@JvmStatic
		fun main(args: Array<String>) {
			args.forEach {
				if (it.startsWith('-')) {
					when (it[1]) {
						't' -> Flags.t = true
						'c' -> Flags.c = true
						'h' -> Flags.h = true
						'a' -> Flags.a = true
					}
				} else {
					files.add(it)
				}
			}

			if (Flags.h || files.isEmpty()) {
				println(helpMessage)
				return
			}

			if (Flags.a) {
				val jsonItems = mutableListOf<String>()
				val re = Regex("[\\\\/]")
				files.forEach {
					System.err.println("Parsing:\t${it}")
					val stream = ByteArrayInputStream(File(it).readBytes())
					val lexer = PlSqlLexer(CharStreams.fromStream(stream))
					val parser = PlSqlParser(CommonTokenStream(lexer))
					jsonItems.add(""""${it.split(re).last()}":${JSONObject(walk(parser.javln())).toString()}""")
				}

				println(jsonItems.joinToString(",", "{", "}"))
				return
			}

			val docs = files.map { PlSql().parse(it) }
			val jsonMap = mutableMapOf<String, Any?>(
				"symbol_types" to SynItem.Global.symbolTypes,
				"files" to docs.map {
					val r = it.document.toDataMap()
					r["line_count"] = it.lineCount
					if (Flags.t) {
						r["tokens"] = it.tokenList.map { createTokenData(it) }
					}
					if (Flags.c) {
						r["code"] = it.code
					}
					r
				}
			)
			println(JSONObject(jsonMap))
		}
	}
}
