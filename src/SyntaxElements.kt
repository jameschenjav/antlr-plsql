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

	private fun recursiveParse(ctx: ParserRuleContext) {
		val synClass = ruleMap[ctx::class]
		if (synClass == null) {
			startParse(ctx)
		} else {
			val synItem = synClass.createInstance()
			synItem.parse(ctx)
			afterMatch(synItem, ctx, synClass)
		}
	}

	protected fun startParse(ctx: ParserRuleContext) {
		ctx.children?.forEach {c ->
			val p = c.payload
			if (p is ParserRuleContext) {
				recursiveParse(p)
			}
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
		startParse(ctx)
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
		startParse(ctx)
	}

	override fun convertJson(jsonMap: MutableMap<String, Any?>) {
		jsonMap["n"] = identifier
		if (items.isNotEmpty()) jsonMap["es"] = items.map { it.toJsonMap() }
		super.convertJson(jsonMap)
	}
}

// Expression Elements
@OnRules([PlSqlParser.Query_blockContext::class])
class QueryBlock: HolderItem()

@OnRules([PlSqlParser.Relational_operatorContext::class])
class RelationOp: HolderItem()

// Expressions
@OnRules([PlSqlParser.Cursor_expressionContext::class])
@SubRules([QueryBlock::class])
class CursorExpression: SynItem()

@OnRules([PlSqlParser.Compound_expressionContext::class])
@SubRules([Concatenation::class])
class CompoundExpression: SynItem()

@OnRules([PlSqlParser.Relational_expressionContext::class])
@SubRules([RelationOp::class, RelationalExpression::class, CompoundExpression::class])
class RelationalExpression: SynItem()

@OnRules([PlSqlParser.Multiset_expressionContext::class])
@SubRules([RelationalExpression::class, Concatenation::class])
class MultisetExpression: SynItem()

@OnRules([PlSqlParser.Logical_expressionContext::class])
@SubRules([MultisetExpression::class])
class LogicalExpression: SynItem()

// Statement Elements
@OnRules([PlSqlParser.ExpressionContext::class])
@SubRules([CursorExpression::class, LogicalExpression::class])
class Expression: SynItem()

@OnRules([PlSqlParser.Id_expressionContext::class])
class IdExpression: Identifier()

@OnRules([PlSqlParser.ConcatenationContext::class])
@SubRules([GeneralElement::class])
class Concatenation: SynItem()

// Assignment
@OnRules([PlSqlParser.Bind_variableContext::class])
class BindVariable: HolderItem()

@OnRules([PlSqlParser.General_element_partContext::class])
@SubRules([IdExpression::class, Argument::class])
class GeneralElementPart: SynItem()

@OnRules([PlSqlParser.General_elementContext::class])
@SubRules([GeneralElementPart::class])
class GeneralElement: SynItem()

// If
@OnRules([PlSqlParser.Elsif_partContext::class])
@SubRules([Expression::class, StatementsBlock::class])
class ElsIf: SynItem()

@OnRules([PlSqlParser.Else_partContext::class])
@SubRules([Expression::class, StatementsBlock::class])
class Else: SynItem()

// Loop
@OnRules([PlSqlParser.Label_declarationContext::class])
@SubRules([IdExpression::class])
class LabelDecl: SynItem()

@OnRules([PlSqlParser.Cursor_loop_paramContext::class])
@SubRules([Identifier::class, Concatenation::class,
	IdExpression::class, GeneralElement::class, BindVariable::class, Expression::class, SelectStatement::class])
class CursorLoopParam: SynItem()

// Func call
@OnRules([PlSqlParser.Routine_nameContext::class])
class RoutineName: Identifier()

@OnRules([PlSqlParser.Keep_clauseContext::class])
class KeepClause: HolderItem()

@OnRules([PlSqlParser.ArgumentContext::class])
@SubRules([Identifier::class, Expression::class, KeepClause::class])
class Argument: SynItem()

// Statements
abstract class BaseStatement: SynItem()

@OnRules([PlSqlParser.Assignment_statementContext::class])
@SubRules([BindVariable::class, GeneralElement::class, Expression::class])
class AssignStatement: BaseStatement()

@OnRules([PlSqlParser.Continue_statementContext::class])
@SubRules([IdExpression::class, Expression::class])
class ContinueStatement: BaseStatement()

@OnRules([PlSqlParser.Exit_statementContext::class])
@SubRules([IdExpression::class, Expression::class])
class ExitStatement: BaseStatement()

@OnRules([PlSqlParser.Goto_statementContext::class])
@SubRules([IdExpression::class])
class GotoStatement: BaseStatement()

@OnRules([PlSqlParser.If_statementContext::class])
@SubRules([Expression::class, StatementsBlock::class, ElsIf::class, Else::class])
class IfStatement: BaseStatement()

@OnRules([PlSqlParser.Loop_statementContext::class])
@SubRules([LabelDecl::class, Expression::class, CursorLoopParam::class, StatementsBlock::class, IdExpression::class])
class LoopStatement: BaseStatement()

@OnRules([PlSqlParser.Forall_statementContext::class])
@SubRules([Identifier::class, Concatenation::class, SqlStatement::class])
class ForallStatement: BaseStatement()

@OnRules([PlSqlParser.Null_statementContext::class])
class NullStatement: BaseStatement()

@OnRules([PlSqlParser.Raise_statementContext::class])
@SubRules([IdExpression::class, Identifier::class])
class RaiseStatement: BaseStatement()

@OnRules([PlSqlParser.Return_statementContext::class])
@SubRules([Expression::class])
class ReturnStatement: BaseStatement()

@OnRules([PlSqlParser.Case_statementContext::class])
@SubRules([Expression::class, StatementsBlock::class, IdExpression::class])
class CaseStatement: BaseStatement()

@OnRules([PlSqlParser.Sql_statementContext::class])
class SqlStatement: BaseStatement()

@OnRules([PlSqlParser.Function_callContext::class])
@SubRules([RoutineName::class, Argument::class])
class FuncCallStatement: BaseStatement()

@OnRules([PlSqlParser.Pipe_row_statementContext::class])
@SubRules([Expression::class])
class PipRowStatement: BaseStatement()

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
class ExceptionName: Identifier()

@OnRules([PlSqlParser.Seq_of_statementsContext::class])
@SubRules([
	AssignStatement::class,
	ContinueStatement::class,
	ExitStatement::class,
	GotoStatement::class,
	IfStatement::class,
	LoopStatement::class,
	ForallStatement::class,
	NullStatement::class,
	RaiseStatement::class,
	ReturnStatement::class,
	CaseStatement::class,
	SqlStatement::class,
	FuncCallStatement::class,
	PipRowStatement::class
])
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
