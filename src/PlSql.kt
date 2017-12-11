import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.json.JSONObject
import java.io.ByteArrayInputStream
import java.io.File

class PlSql: PlSqlParserBaseListener() {
	val document by lazy { Document() }
	var tokenList = listOf<Token>()

	override fun exitMain(ctx: PlSqlParser.MainContext?) {
		document.parse(ctx!!)
	}

	fun parse(fileName: String): PlSql {
		val file = File(fileName)
		val stream = ByteArrayInputStream(file.readBytes())
		val lexer = PlSqlLexer(CharStreams.fromStream(stream))
		val tokens = CommonTokenStream(lexer)
		val parser = PlSqlParser(tokens)
		val walker = ParseTreeWalker()

		document.setFile(file.name)
		walker.walk(this, parser.javln())
		lexer.reset()
		tokenList = lexer.allTokens
		return this
	}

	companion object {
		private fun tokenToJson(token: Token) = """{
			"r":${token.line},
			"c":${token.charPositionInLine},
			"b":${token.startIndex},
			"e":${token.stopIndex+1},
			"t":${token.type}
		}""".replace(Regex("\\n\\s*"), "")

		private val debugFileNames by lazy { debugFiles.map { "$debugPath$it" } }
		private val debugPath by lazy { "./javln/" }
		private val debugFiles by lazy { arrayOf(
			"procedure_claim_change_cpay_prop_reco.sql"
//		private val debugFileName by lazy { "procedure_policy_unposted_policy_trans.sql" }
		) }

		@JvmStatic
		fun main(args: Array<String>) {
			val files = if (args.size > 0) args.toList() else debugFileNames
			val docs = files.map { PlSql().parse(it).document }
			val jsonMap = mutableMapOf<String, Any?>(
				"symbol_types" to SynItem.Global.symbolTypes,
				"files" to docs.map { it.toDataMap() }
			)
			println(JSONObject(jsonMap))
		}
	}
}
