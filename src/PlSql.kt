import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.ByteArrayInputStream
import java.io.File

class PlSql: PlSqlParserBaseListener() {
	private val document by lazy { Document() }

	override fun exitMain(ctx: PlSqlParser.MainContext?) {
		document.parse(ctx!!)
	}

	fun parse(fileName: String): String {
		val file = File(fileName)
		val stream = ByteArrayInputStream(file.readBytes())
		val lexer = PlSqlLexer(CharStreams.fromStream(stream))
		val tokens = CommonTokenStream(lexer)
		val parser = PlSqlParser(tokens)
		val walker = ParseTreeWalker()

		document.setFile(file.name)
		walker.walk(this, parser.javln())
		lexer.reset()
		return """{
		|  "symbols": ${document.toJson()},
		|  "tokens": [${lexer.allTokens.joinToString(", ") { tokenToJson(it) }}]
		|}""".trimMargin()
	}

	companion object {
		private fun tokenToJson(token: Token) = """{
			"line": ${token.line},
			"column": ${token.charPositionInLine},
			"start": ${token.startIndex},
			"stop": ${token.stopIndex}
		}""".replace(Regex("\\n\\s*"), "")

		@JvmStatic
		fun main(args: Array<String>) {
			val path = "./javln/"
//			val fileName = "procedure_policy_update_item_reinsurance.sql"
			val fileName = "procedure_policy_unposted_policy_trans.sql"
			val filePath = "$path$fileName"

			val plsql = PlSql()
			println(plsql.parse(filePath))
		}
	}
}
