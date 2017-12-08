import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.ByteArrayInputStream
import java.io.File

class PlSql: PlSqlParserBaseListener() {
	override fun exitJavln_body(ctx: PlSqlParser.Javln_bodyContext?) {
		for (c in ctx!!.children) {
			println(c)
		}
	}

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			println(args[0])
			val file = File(args[0])
			val stream = ByteArrayInputStream(file.readBytes())
			val lexer = PlSqlLexer(CharStreams.fromStream(stream))
			val tokens = CommonTokenStream(lexer)
			val parser = PlSqlParser(tokens)
			val listener = PlSql()
			val walker = ParseTreeWalker()
			walker.walk(listener, parser.javln())
		}
	}
}
