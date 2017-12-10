import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Token
import kotlin.reflect.KClass
import kotlin.reflect.full.findAnnotation

enum class SymbolType {
	UNKNOWN,
	TYPE,
	VARIABLE,
	CURSOR,
	EXCEPTION,
	PROCEDURE,
	FUNCTION,
	ROOT,
}

abstract class SynItem {
	val type: String
		get() = javaClass.simpleName
	abstract val text: String
	open fun toJson(): String {
		return ""
	}
}

open class Identifier(s: String) {
	open val name = s.replace("\"", "").toLowerCase()
	open val isSymbol: Boolean
		get() = false
	open fun toJson(): String {
		return "\"$name\""
	}
}

class TokenInfo(token: Token) {
	val line = token.line
	val column = token.charPositionInLine
	val start = token.startIndex
	val stop = token.stopIndex
	val index = token.tokenIndex

	fun toJson(): String {
		return """{
			"line": $line,
			"column": $column,
			"start": $start,
			"stop": $stop,
			"index": $index
		}
		""".replace(Regex("\\n\\s*"), "")
	}

	companion object {
		fun Json(token: Token): String {
			return """{
				"line": ${token.line},
				"column": ${token.charPositionInLine},
				"start": ${token.startIndex},
				"stop": ${token.stopIndex}
			}""".replace(Regex("\\n\\s*"), "")
		}
	}
}

class Statement(type: String): Identifier(type)

annotation class Syntax(val contextClass: KClass<out ParserRuleContext>)

open class SymbolSyntax(val ctx: ParserRuleContext) {
	val elements = mutableListOf<SymbolSyntax>()

	fun defaultParse(ctx: ParserRuleContext) {
		//
	}

	open fun parse(ctx: ParserRuleContext) {
		if (this::class.contextClass == ctx::class) {}
	}
}

@Syntax(PlSqlParser.Javln_bodyContext::class)
class SyntaxJavln(ctx: ParserRuleContext): SymbolSyntax(ctx)

class SymbolTokens(ctx: ParserRuleContext) {
	val start = TokenInfo(ctx.start)
	val stop = TokenInfo(ctx.stop)
}

open class Symbol constructor(ctx: ParserRuleContext, type: SymbolType?, parent: Symbol? = null) : Identifier("") {
	private var symbolName: String = ""
	private var symbolType: SymbolType? = type
	private val symbolParent: Symbol? = parent
	val tokens = SymbolTokens(ctx)

	val type: SymbolType
		get() = symbolType ?: SymbolType.UNKNOWN
	val parent: Symbol?
		get() = symbolParent

	fun assginType(t: SymbolType): Symbol {
		if (symbolType == null && t > SymbolType.UNKNOWN && t < SymbolType.ROOT) {
			symbolType = t
		}
		return this
	}

	fun assignName(v: String): Symbol {
		val s = v.replace("\"", "").toLowerCase()
		if (symbolName != "" || s == "") return this
		symbolName = s
		parent?.scope?.set(s, this)
		return this
	}

	override val isSymbol: Boolean
		get() = true
	override val name: String
		get() = symbolName

	val hasScope: Boolean
		get() = type >= SymbolType.PROCEDURE

	val scope: MutableMap<String, Symbol> = mutableMapOf()
	val symbolList: MutableList<Symbol> = mutableListOf()
	val idMap: MutableMap<String, Identifier> = mutableMapOf()

	fun newSymbol(ctx: ParserRuleContext, type: SymbolType? = null): Symbol {
		val symbol = Symbol(ctx, type, this)
		symbolList.add(symbol)
		return symbol
	}

	fun getIdentifier(name: String): Identifier {
		var id = idMap[name]
		if (id != null) return id

		id = Identifier(name)
		idMap[name] = id
		return id
	}

	fun setIdentifier(name: String): Symbol {
		if (idMap.containsKey(name)) return this
		idMap[name] = Identifier(name)
		return this
	}

	fun findSymbol(s: String): Symbol? {
		return scope[s] ?: parent?.findSymbol(s)
	}

	override fun toJson(): String {
		val obj = mutableMapOf(
			"name" to "\"${name}\"",
			"type" to "\"${type}\"",
			"token_index" to """{
				"start": ${tokens.start.index},
				"stop": ${tokens.stop.index}
			}""".replace(Regex("\\n\\s*"), "")
		)

		if (symbolList.isNotEmpty()) {
			val ss = mutableListOf<String>()
			symbolList.forEach { s -> ss.add(s.toJson()) }
			obj["symbols"] = "[${ss.joinToString(", ")}]"
		}

		return "{${obj.map { (k, v) -> "\"${k}\": ${v}" }.joinToString(", ")}}"
	}
}

val KClass<out SymbolSyntax>.contextClass: KClass<out ParserRuleContext>
	get() {
		val syntax = this.findAnnotation<Syntax>()
		return syntax?.contextClass ?: ParserRuleContext::class
	}
