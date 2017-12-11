import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.json.JSONObject
import java.io.ByteArrayInputStream
import java.io.File
import java.nio.charset.Charset

class PlSql: PlSqlParserBaseListener() {
	val document by lazy { Document() }
	var tokenList = listOf<Token>()
	var code = ""

	override fun exitMain(ctx: PlSqlParser.MainContext?) {
		document.parse(ctx!!)
	}

	fun parse(fileName: String): PlSql {
		val file = File(fileName)
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

		private fun createTokenData(token: Token) = TokenData(
			token.line, token.charPositionInLine, token.startIndex, token.stopIndex+1, token.type
		)

		private var files = mutableListOf<String>()

		object Flags {
			var t = false // token
			var c = false // code
			var h = false // help
		}

		private val helpMessage = """
    |Javelin PL/SQL Parser Usage
    |	-h	Help:	Display this message
    |	-t	Tokens:	Generate JSON with Tokens
    |	-c	Code:	Generate JSON with Code
		""".trimMargin()


		@JvmStatic
		fun main(args: Array<String>) {
			args.forEach {
				if (it.startsWith('-')) {
					when (it[1]) {
						't' -> Flags.t = true
						'c' -> Flags.c = true
						'h' -> Flags.h = true
					}
				} else {
					files.add(it)
				}
			}

			if (Flags.h || files.isEmpty()) {
				println(helpMessage)
				return
			}

			val docs = files.map { PlSql().parse(it) }
			val jsonMap = mutableMapOf<String, Any?>(
				"symbol_types" to SynItem.Global.symbolTypes,
				"files" to docs.map {
					val r = it.document.toDataMap()
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
