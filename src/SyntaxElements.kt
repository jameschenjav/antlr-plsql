import org.antlr.v4.runtime.ParserRuleContext
import org.json.JSONObject
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.isSubclassOf

data class TokenInfo(
	val rb: Int, // row begin
	val re: Int, // row end
	val tb: Int, // token begin index
	val te: Int // token end
)

abstract class SynItem {
	private val ruleMap by lazy { this::class.rulesMap }

	protected val type = javaClass.simpleName!!

	protected val items = mutableListOf<SynItem>()

	protected fun recursiveParse(ctx: ParserRuleContext) {
		val synClass = ruleMap[ctx::class]
		if (synClass == null) {
			val children = ctx.children
			children?.forEach {c ->
				val p = c.payload
				if (p is ParserRuleContext) {
					recursiveParse(p)
				}
			}
		} else {
			val synItem = synClass.createInstance()
			synItem.parse(ctx)
			afterMatch(synItem, ctx, synClass)
		}
	}

	open protected fun convertJson(jsonMap: MutableMap<String, Any?>) {
		if (items.isNotEmpty()) jsonMap["es"] = items.map { it.toJsonMap() }
	}

	open protected fun afterMatch(synItem: SynItem?, ctx: ParserRuleContext, synClass: KClass<out SynItem>) {
		if (synItem != null) {
			items.add(synItem)
		}
	}

	open fun parse(ctx: ParserRuleContext) {
		recursiveParse(ctx)
	}

	fun toJsonMap(): MutableMap<String, Any?> {
		val jsonMap = mutableMapOf<String, Any?>("t" to type)
		convertJson(jsonMap)
		return jsonMap
	}

	fun toJson(): String {
		return JSONObject(toJsonMap()).toString()
	}

	object Global {
		private val registered = mutableMapOf<KClass<out SynItem>, SyntaxMap>()
		val symbolTypes = mutableListOf<String>()

		fun getMap(synClass: KClass<out SynItem>): SyntaxMap {
			var result = registered[synClass]
			if (result != null) return result

			if (synClass.isSubclassOf(Symbol::class)) {
				symbolTypes.add(synClass.simpleName!!)
			}

			val syntax = synClass.findAnnotation<SubRules>()
			val ruleList = syntax?.SubRuleList?.toList() ?: listOf()
			val map = mutableMapOf<KClass<out ParserRuleContext>, KClass<out SynItem>>()
			for (rule in ruleList) {
				rule.rules.forEach { map[it] = rule }
			}

			result = map.toMap()
			registered[synClass] = result
			return result
		}
	}
}

typealias SyntaxMap = Map<KClass<out ParserRuleContext>, KClass<out SynItem>>

annotation class OnRules(val Rules: Array<KClass<out ParserRuleContext>>)
annotation class SubRules(val SubRuleList: Array<KClass<out SynItem>>)

val KClass<out SynItem>.rules: Array<KClass<out ParserRuleContext>>
	get() = this.findAnnotation<OnRules>()?.Rules ?: arrayOf()

val KClass<out SynItem>.rulesMap: SyntaxMap
	get() = SynItem.Global.getMap(this)

open class HolderItem : SynItem() {
	private lateinit var tokenInfo: TokenInfo

	protected fun updateTokenInfo(ctx: ParserRuleContext) {
		val start = ctx.start
		val stop = ctx.stop
		tokenInfo = TokenInfo(
			start.line,
			stop.line,
			start.tokenIndex,
			stop.tokenIndex
		)
	}

	override fun parse(ctx: ParserRuleContext) {
		updateTokenInfo(ctx)
	}

	override fun convertJson(jsonMap: MutableMap<String, Any?>) {
		jsonMap["tk"] = tokenInfo
	}
}

// Basic Items
@OnRules([PlSqlParser.Regular_nameContext::class, PlSqlParser.Common_nameContext::class, PlSqlParser.IdentifierContext::class])
open class Identifier: SynItem() {
	var name = ""

	override fun parse(ctx: ParserRuleContext) {
		name = ctx.text.trim('"').toLowerCase()
	}

	override fun convertJson(jsonMap: MutableMap<String, Any?>) {
		jsonMap["n"] = name
	}
}

@OnRules([PlSqlParser.Type_nameContext::class])
class TypeName: Identifier()

@OnRules([PlSqlParser.Type_specContext::class])
@SubRules([TypeName::class])
class TypeSpec: SynItem()

@OnRules([PlSqlParser.Select_statementContext::class])
@SubRules([TypeName::class])
class SelectStatement: SynItem()

// Base Symbol Item
abstract class Symbol: HolderItem() {
	protected var identifier: String = ""

	override fun afterMatch(synItem: SynItem?, ctx: ParserRuleContext, synClass: KClass<out SynItem>) {
		if (synItem == null) return
		when (synItem) {
			is Identifier -> {
				identifier = synItem.name
			}
		}
		items.add(synItem)
	}

	override fun parse(ctx: ParserRuleContext) {
		updateTokenInfo(ctx)
		recursiveParse(ctx)
	}

	override fun convertJson(jsonMap: MutableMap<String, Any?>) {
		jsonMap["n"] = identifier
		if (items.isNotEmpty()) jsonMap["es"] = items.map { it.toJsonMap() }
		super.convertJson(jsonMap)
	}
}

// temp
@OnRules([PlSqlParser.StatementContext::class])
class Statement: HolderItem()

// Declarations
@OnRules([PlSqlParser.Variable_declarationContext::class])
@SubRules([Identifier::class, TypeSpec::class])
class VariableDecl: Symbol()

@OnRules([PlSqlParser.Cursor_declarationContext::class])
@SubRules([Identifier::class, SelectStatement::class])
class CursorDecl: Symbol()

@OnRules([PlSqlParser.Type_declarationContext::class])
@SubRules([Identifier::class, SelectStatement::class])
class TypeDecl: Symbol()

// Signature
@OnRules([PlSqlParser.Parameter_descContext::class])
class ParamDesc: SynItem()

@OnRules([PlSqlParser.ParameterContext::class])
@SubRules([Identifier::class, ParamDesc::class, TypeSpec::class])
class Parameter: Symbol()

@OnRules([PlSqlParser.ParametersContext::class])
@SubRules([Parameter::class])
class ParametersBlock: SynItem()

@OnRules([PlSqlParser.Invoker_rights_clauseContext::class])
class InvokerRights: SynItem()

@OnRules([PlSqlParser.Seq_of_declare_specsContext::class])
@SubRules([VariableDecl::class, CursorDecl::class, TypeDecl::class, Procedure::class, Function::class])
class DeclarationsBlock: SynItem()

// Body
@OnRules([PlSqlParser.Exception_nameContext::class])
class ExceptionName: HolderItem()

@OnRules([PlSqlParser.Seq_of_statementsContext::class])
@SubRules([Statement::class])
class StatementsBlock: SynItem()

@OnRules([PlSqlParser.Exception_handlerContext::class])
@SubRules([ExceptionName::class, StatementsBlock::class])
class ExceptionCase: SynItem()

@OnRules([PlSqlParser.ExceptionsContext::class])
@SubRules([ExceptionCase::class])
class ExceptionBlock: SynItem()

@OnRules([PlSqlParser.BodyContext::class])
@SubRules([StatementsBlock::class, ExceptionBlock::class])
class Body: SynItem()

// Procedure/Function
@OnRules([PlSqlParser.Procedure_bodyContext::class, PlSqlParser.Create_procedure_bodyContext::class])
@SubRules([Identifier::class, ParametersBlock::class, InvokerRights::class, DeclarationsBlock::class, Body::class])
class Procedure: Symbol()

@OnRules([PlSqlParser.Function_bodyContext::class, PlSqlParser.Create_function_bodyContext::class])
@SubRules([Identifier::class, ParametersBlock::class, InvokerRights::class, DeclarationsBlock::class, Body::class])
class Function: Symbol()

@SubRules([Procedure::class, Function::class])
class Document: SynItem() {
	private var fileName = ""

	fun setFile(filename: String) {
		fileName = filename
	}

	override fun convertJson(jsonMap: MutableMap<String, Any?>) {
		jsonMap["filename"] = fileName
		super.convertJson(jsonMap)
	}
}
