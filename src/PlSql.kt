import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.ByteArrayInputStream
import java.io.File
import java.util.*

class PlSql: PlSqlParserBaseListener() {
	class Ast(val rootCtx: ParserRuleContext) {
		val rootSymbol = Symbol(rootCtx, SymbolType.ROOT)
		private val symbolStack: Stack<Symbol> = Stack()
		private var currentScope = rootSymbol
		private var currentSymbol = rootSymbol
		private var pushedScope = false
		private var waitName = false

		init {
			symbolStack.push(currentScope)
		}

		fun pushCurrent() {
			pushScope(currentSymbol)
		}

		fun pushScope(symbol: Symbol) {
			symbolStack.push(symbol)
			currentScope = symbol
			pushedScope = true
		}

		fun popScope(): Symbol? {
			if (symbolStack.size == 1) return null
			val r = symbolStack.pop()
			currentScope = symbolStack.peek()
			return r
		}

		fun newSymbol(ctx: ParserRuleContext, type: SymbolType? = null): Symbol {
			currentSymbol = currentScope.newSymbol(ctx, type)
			return currentSymbol
		}

		fun needPopScope(): Boolean {
			val r = pushedScope
			pushedScope = false
			return r
		}

		fun processNode(ctx: ParserRuleContext): ParserRuleContext {
			when (ctx) {
				is PlSqlParser.Create_function_bodyContext -> {
					newSymbol(ctx, SymbolType.FUNCTION)
					pushCurrent()
					waitName = true
				}
				is PlSqlParser.Function_bodyContext -> {
					newSymbol(ctx, SymbolType.FUNCTION)
					pushCurrent()
					waitName = true
				}
				is PlSqlParser.Create_procedure_bodyContext -> {
					newSymbol(ctx, SymbolType.PROCEDURE)
					pushCurrent()
					waitName = true
				}
				is PlSqlParser.Procedure_bodyContext -> {
					newSymbol(ctx, SymbolType.PROCEDURE)
					pushCurrent()
					waitName = true
				}

				is PlSqlParser.Variable_declarationContext -> {
					newSymbol(ctx, SymbolType.VARIABLE)
					waitName = true
				}
				is PlSqlParser.Cursor_declarationContext -> {
					newSymbol(ctx, SymbolType.CURSOR)
					waitName = true
				}
				is PlSqlParser.Type_declarationContext -> {
					newSymbol(ctx, SymbolType.TYPE)
					waitName = true
				}
				is PlSqlParser.Exception_declarationContext -> {
					newSymbol(ctx, SymbolType.EXCEPTION)
					waitName = true
				}

				is PlSqlParser.Regular_nameContext,
				is PlSqlParser.Common_nameContext,
				is PlSqlParser.IdentifierContext
				-> {
					if (waitName) {
						currentSymbol.assignName(ctx.text)
						waitName = false
					}
				}
			}
			return ctx
		}

		fun travelRuleTree(node: ParserRuleContext, depth: Int = 0) {
//			val indent = "\t".repeat(depth)
			val paths : MutableList<String> = mutableListOf()
			var ctx = processNode(node)

			var children = node.children
			if (children != null) {
				while (children.size == 1) {
					val p = children[0].payload
					if (p is ParserRuleContext) {
						paths.add(ctx.javaClass.simpleName)
						ctx = processNode(p)
						children = p.children
					} else {
						break
					}
				}
			}

			val needPop = needPopScope()
			paths.add(ctx.javaClass.simpleName)
//			println("${indent}${paths.joinToString(" -> ")}")

			if (children != null) {
				for (c in children) {
					val p = c.payload
					if (p is ParserRuleContext) {
						travelRuleTree(p, depth+1)
					} else {
//						println("${indent}\t'${c}'")
					}
				}
			}

			if (needPop) {
				popScope()
			}
		}

		fun build() {
			travelRuleTree(rootCtx)
		}

		fun toJson(): String {
			return "{${rootSymbol.scope.map{ (k, v) -> "\"$k\": ${v.toJson()}" }.joinToString(", ")}}"
		}
	}

	override fun exitJavln_body(ctx: PlSqlParser.Javln_bodyContext?) {
		ast = Ast(ctx!!)
		ast?.build()
	}

	var ast: Ast? = null

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			val path = "./javln/"
			val fileName = "procedure_policy_update_item_reinsurance.sql"
			val filePath = "$path$fileName"
			println(filePath)

			val file = File(filePath)
			val stream = ByteArrayInputStream(file.readBytes())
			val lexer = PlSqlLexer(CharStreams.fromStream(stream))
			val tokens = CommonTokenStream(lexer)
			val parser = PlSqlParser(tokens)
			val listener = PlSql()
			val walker = ParseTreeWalker()

			walker.walk(listener, parser.javln())
			lexer.reset()

			val json = """{
"symbols": ${listener.ast?.toJson() ?: "null"},
"tokens": [${lexer.allTokens.map { t -> TokenInfo.Json(t) }.joinToString(", ")}]
}"""
			println(json)
		}
	}
}
