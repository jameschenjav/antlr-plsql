import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.ByteArrayInputStream
import java.io.File

class PlSql: PlSqlParserBaseListener() {
	fun travelRuleTree(node: ParserRuleContext, depth: Int = 0) {
		val indent = "\t".repeat(depth)
		val paths : MutableList<String> = mutableListOf()
		var n: ParserRuleContext = node

		var children = node.children
		while (children.size == 1) {
			val p = children[0].payload
			if (p is ParserRuleContext) {
				paths.add(n.javaClass.simpleName)
				n = p
				children = p.children
			} else {
				break
			}
		}

		paths.add(n.javaClass.simpleName)
		println("${indent}${paths.joinToString(" -> ")}")

		for (c in children) {
			if (c.payload is ParserRuleContext) {
				travelRuleTree(c.payload as ParserRuleContext, depth+1)
			} else {
				println("${indent}\t'${c}'")
			}
		}
	}

	override fun exitJavln_body(ctx: PlSqlParser.Javln_bodyContext?) {
		travelRuleTree(ctx!!)
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
