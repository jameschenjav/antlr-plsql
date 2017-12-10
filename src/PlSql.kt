import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.ByteArrayInputStream
import java.io.File

class PlSql: PlSqlParserBaseListener() {
	private val document by lazy { Document() }
	private var tokenList = listOf<Token>()

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

	fun toJson(): String {
//		|  "tokens":[${tokenList.joinToString(",") { tokenToJson(it) }}],
		return """{
		|  "symbol_types":[${SynItem.Global.symbolTypes.joinToString(",") { "\"$it\"" }}],
		|  "syntax":${document.toJson()}
		|}""".trimMargin()
	}

	companion object {
		private fun tokenToJson(token: Token) = """{
			"r":${token.line},
			"c":${token.charPositionInLine},
			"b":${token.startIndex},
			"e":${token.stopIndex+1},
			"t":${token.type}
		}""".replace(Regex("\\n\\s*"), "")

		@JvmStatic
		fun main(args: Array<String>) {
			val path = "./javln/"
			val fileName = "procedure_claim_change_cpay_prop_reco.sql"
//			val fileName = "procedure_policy_unposted_policy_trans.sql"
			val filePath = "$path$fileName"

			val plsql = PlSql()
			println(plsql.parse(filePath).toJson())
		}
	}
}
