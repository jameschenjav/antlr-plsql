// Generated from PlSqlParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlSqlParser}.
 */
public interface PlSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#javln}.
	 * @param ctx the parse tree
	 */
	void enterJavln(PlSqlParser.JavlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#javln}.
	 * @param ctx the parse tree
	 */
	void exitJavln(PlSqlParser.JavlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(PlSqlParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(PlSqlParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(PlSqlParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(PlSqlParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function(PlSqlParser.Alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function(PlSqlParser.Alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_body(PlSqlParser.Create_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_body(PlSqlParser.Create_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_enable_clause(PlSqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_enable_clause(PlSqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_clause(PlSqlParser.Partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_clause(PlSqlParser.Partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void enterResult_cache_clause(PlSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void exitResult_cache_clause(PlSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void enterRelies_on_part(PlSqlParser.Relies_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void exitRelies_on_part(PlSqlParser.Relies_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void enterStreaming_clause(PlSqlParser.Streaming_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void exitStreaming_clause(PlSqlParser.Streaming_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void enterDrop_package(PlSqlParser.Drop_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void exitDrop_package(PlSqlParser.Drop_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void enterAlter_package(PlSqlParser.Alter_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void exitAlter_package(PlSqlParser.Alter_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package(PlSqlParser.Create_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package(PlSqlParser.Create_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body(PlSqlParser.Create_package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body(PlSqlParser.Create_package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_spec(PlSqlParser.Package_obj_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_spec(PlSqlParser.Package_obj_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_spec(PlSqlParser.Procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_spec(PlSqlParser.Procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(PlSqlParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(PlSqlParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_body(PlSqlParser.Package_obj_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_body(PlSqlParser.Package_obj_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(PlSqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(PlSqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterAlter_procedure(PlSqlParser.Alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitAlter_procedure(PlSqlParser.Alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(PlSqlParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(PlSqlParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_body(PlSqlParser.Procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_body(PlSqlParser.Procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_body(PlSqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_body(PlSqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PlSqlParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PlSqlParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(PlSqlParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(PlSqlParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger(PlSqlParser.Alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger(PlSqlParser.Alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger(PlSqlParser.Create_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger(PlSqlParser.Create_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_follows_clause(PlSqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_follows_clause(PlSqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_when_clause(PlSqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_when_clause(PlSqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterSimple_dml_trigger(PlSqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitSimple_dml_trigger(PlSqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_row(PlSqlParser.For_each_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_row(PlSqlParser.For_each_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCompound_dml_trigger(PlSqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCompound_dml_trigger(PlSqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_trigger(PlSqlParser.Non_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_trigger(PlSqlParser.Non_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_body(PlSqlParser.Trigger_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_body(PlSqlParser.Trigger_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_clause(PlSqlParser.Routine_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_clause(PlSqlParser.Routine_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterCompound_trigger_block(PlSqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitCompound_trigger_block(PlSqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void enterTiming_point_section(PlSqlParser.Timing_point_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void exitTiming_point_section(PlSqlParser.Timing_point_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_event(PlSqlParser.Non_dml_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_event(PlSqlParser.Non_dml_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_clause(PlSqlParser.Dml_event_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_clause(PlSqlParser.Dml_event_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_element(PlSqlParser.Dml_event_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_element(PlSqlParser.Dml_event_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_nested_clause(PlSqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_nested_clause(PlSqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_clause(PlSqlParser.Referencing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_clause(PlSqlParser.Referencing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_element(PlSqlParser.Referencing_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_element(PlSqlParser.Referencing_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(PlSqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(PlSqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type(PlSqlParser.Alter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type(PlSqlParser.Alter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompile_type_clause(PlSqlParser.Compile_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompile_type_clause(PlSqlParser.Compile_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterReplace_type_clause(PlSqlParser.Replace_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitReplace_type_clause(PlSqlParser.Replace_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_spec(PlSqlParser.Alter_method_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_spec(PlSqlParser.Alter_method_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_element(PlSqlParser.Alter_method_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_element(PlSqlParser.Alter_method_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_attribute_definition(PlSqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_attribute_definition(PlSqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_definition(PlSqlParser.Attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_definition(PlSqlParser.Attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collection_clauses(PlSqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collection_clauses(PlSqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_handling_clause(PlSqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_handling_clause(PlSqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void enterDependent_exceptions_part(PlSqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void exitDependent_exceptions_part(PlSqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(PlSqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(PlSqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(PlSqlParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(PlSqlParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_def(PlSqlParser.Object_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_def(PlSqlParser.Object_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_as_part(PlSqlParser.Object_as_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_as_part(PlSqlParser.Object_as_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_under_part(PlSqlParser.Object_under_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_under_part(PlSqlParser.Object_under_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_type_def(PlSqlParser.Nested_table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_type_def(PlSqlParser.Nested_table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type(PlSqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type(PlSqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void enterType_body(PlSqlParser.Type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void exitType_body(PlSqlParser.Type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void enterType_body_elements(PlSqlParser.Type_body_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void exitType_body_elements(PlSqlParser.Type_body_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_func_declaration(PlSqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_func_declaration(PlSqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_in_type(PlSqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_in_type(PlSqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterProc_decl_in_type(PlSqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitProc_decl_in_type(PlSqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_in_type(PlSqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_in_type(PlSqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(PlSqlParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(PlSqlParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void enterModifier_clause(PlSqlParser.Modifier_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void exitModifier_clause(PlSqlParser.Modifier_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void enterObject_member_spec(PlSqlParser.Object_member_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void exitObject_member_spec(PlSqlParser.Object_member_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type_attr(PlSqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type_attr(PlSqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec(PlSqlParser.Element_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec(PlSqlParser.Element_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec_options(PlSqlParser.Element_spec_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec_options(PlSqlParser.Element_spec_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_spec(PlSqlParser.Subprogram_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_spec(PlSqlParser.Subprogram_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_procedure_spec(PlSqlParser.Type_procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_procedure_spec(PlSqlParser.Type_procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_function_spec(PlSqlParser.Type_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_function_spec(PlSqlParser.Type_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_spec(PlSqlParser.Constructor_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_spec(PlSqlParser.Constructor_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_function_spec(PlSqlParser.Map_order_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_function_spec(PlSqlParser.Map_order_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void enterPragma_clause(PlSqlParser.Pragma_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void exitPragma_clause(PlSqlParser.Pragma_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void enterPragma_elements(PlSqlParser.Pragma_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void exitPragma_elements(PlSqlParser.Pragma_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_elements_parameter(PlSqlParser.Type_elements_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_elements_parameter(PlSqlParser.Type_elements_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(PlSqlParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(PlSqlParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(PlSqlParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(PlSqlParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(PlSqlParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(PlSqlParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void enterSequence_spec(PlSqlParser.Sequence_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void exitSequence_spec(PlSqlParser.Sequence_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void enterSequence_start_clause(PlSqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void exitSequence_start_clause(PlSqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(PlSqlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(PlSqlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_index}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index(PlSqlParser.Alter_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_index}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index(PlSqlParser.Alter_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user(PlSqlParser.Create_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user(PlSqlParser.Create_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user(PlSqlParser.Alter_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user(PlSqlParser.Alter_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_identified_by}.
	 * @param ctx the parse tree
	 */
	void enterAlter_identified_by(PlSqlParser.Alter_identified_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_identified_by}.
	 * @param ctx the parse tree
	 */
	void exitAlter_identified_by(PlSqlParser.Alter_identified_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#identified_by}.
	 * @param ctx the parse tree
	 */
	void enterIdentified_by(PlSqlParser.Identified_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#identified_by}.
	 * @param ctx the parse tree
	 */
	void exitIdentified_by(PlSqlParser.Identified_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#identified_other_clause}.
	 * @param ctx the parse tree
	 */
	void enterIdentified_other_clause(PlSqlParser.Identified_other_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#identified_other_clause}.
	 * @param ctx the parse tree
	 */
	void exitIdentified_other_clause(PlSqlParser.Identified_other_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterUser_tablespace_clause(PlSqlParser.User_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitUser_tablespace_clause(PlSqlParser.User_tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#quota_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuota_clause(PlSqlParser.Quota_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#quota_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuota_clause(PlSqlParser.Quota_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#profile_clause}.
	 * @param ctx the parse tree
	 */
	void enterProfile_clause(PlSqlParser.Profile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#profile_clause}.
	 * @param ctx the parse tree
	 */
	void exitProfile_clause(PlSqlParser.Profile_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#role_clause}.
	 * @param ctx the parse tree
	 */
	void enterRole_clause(PlSqlParser.Role_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#role_clause}.
	 * @param ctx the parse tree
	 */
	void exitRole_clause(PlSqlParser.Role_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_default_role_clause}.
	 * @param ctx the parse tree
	 */
	void enterUser_default_role_clause(PlSqlParser.User_default_role_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_default_role_clause}.
	 * @param ctx the parse tree
	 */
	void exitUser_default_role_clause(PlSqlParser.User_default_role_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#password_expire_clause}.
	 * @param ctx the parse tree
	 */
	void enterPassword_expire_clause(PlSqlParser.Password_expire_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#password_expire_clause}.
	 * @param ctx the parse tree
	 */
	void exitPassword_expire_clause(PlSqlParser.Password_expire_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_lock_clause}.
	 * @param ctx the parse tree
	 */
	void enterUser_lock_clause(PlSqlParser.User_lock_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_lock_clause}.
	 * @param ctx the parse tree
	 */
	void exitUser_lock_clause(PlSqlParser.User_lock_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_editions_clause}.
	 * @param ctx the parse tree
	 */
	void enterUser_editions_clause(PlSqlParser.User_editions_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_editions_clause}.
	 * @param ctx the parse tree
	 */
	void exitUser_editions_clause(PlSqlParser.User_editions_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_user_editions_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_editions_clause(PlSqlParser.Alter_user_editions_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_user_editions_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_editions_clause(PlSqlParser.Alter_user_editions_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#proxy_clause}.
	 * @param ctx the parse tree
	 */
	void enterProxy_clause(PlSqlParser.Proxy_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#proxy_clause}.
	 * @param ctx the parse tree
	 */
	void exitProxy_clause(PlSqlParser.Proxy_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#container_names}.
	 * @param ctx the parse tree
	 */
	void enterContainer_names(PlSqlParser.Container_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#container_names}.
	 * @param ctx the parse tree
	 */
	void exitContainer_names(PlSqlParser.Container_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_container_data}.
	 * @param ctx the parse tree
	 */
	void enterSet_container_data(PlSqlParser.Set_container_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_container_data}.
	 * @param ctx the parse tree
	 */
	void exitSet_container_data(PlSqlParser.Set_container_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_rem_container_data}.
	 * @param ctx the parse tree
	 */
	void enterAdd_rem_container_data(PlSqlParser.Add_rem_container_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_rem_container_data}.
	 * @param ctx the parse tree
	 */
	void exitAdd_rem_container_data(PlSqlParser.Add_rem_container_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#container_data_clause}.
	 * @param ctx the parse tree
	 */
	void enterContainer_data_clause(PlSqlParser.Container_data_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#container_data_clause}.
	 * @param ctx the parse tree
	 */
	void exitContainer_data_clause(PlSqlParser.Container_data_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(PlSqlParser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(PlSqlParser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grant_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_statement(PlSqlParser.Grant_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grant_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_statement(PlSqlParser.Grant_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#container_clause}.
	 * @param ctx the parse tree
	 */
	void enterContainer_clause(PlSqlParser.Container_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#container_clause}.
	 * @param ctx the parse tree
	 */
	void exitContainer_clause(PlSqlParser.Container_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(PlSqlParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(PlSqlParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#view_options}.
	 * @param ctx the parse tree
	 */
	void enterView_options(PlSqlParser.View_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#view_options}.
	 * @param ctx the parse tree
	 */
	void exitView_options(PlSqlParser.View_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#view_alias_constraint}.
	 * @param ctx the parse tree
	 */
	void enterView_alias_constraint(PlSqlParser.View_alias_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#view_alias_constraint}.
	 * @param ctx the parse tree
	 */
	void exitView_alias_constraint(PlSqlParser.View_alias_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_view_clause}.
	 * @param ctx the parse tree
	 */
	void enterObject_view_clause(PlSqlParser.Object_view_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_view_clause}.
	 * @param ctx the parse tree
	 */
	void exitObject_view_clause(PlSqlParser.Object_view_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void enterInline_constraint(PlSqlParser.Inline_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void exitInline_constraint(PlSqlParser.Inline_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 */
	void enterOut_of_line_constraint(PlSqlParser.Out_of_line_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 */
	void exitOut_of_line_constraint(PlSqlParser.Out_of_line_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constraint_state}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_state(PlSqlParser.Constraint_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constraint_state}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_state(PlSqlParser.Constraint_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreate_tablespace(PlSqlParser.Create_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreate_tablespace(PlSqlParser.Create_tablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#permanent_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterPermanent_tablespace_clause(PlSqlParser.Permanent_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#permanent_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitPermanent_tablespace_clause(PlSqlParser.Permanent_tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace_encryption_spec}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_encryption_spec(PlSqlParser.Tablespace_encryption_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace_encryption_spec}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_encryption_spec(PlSqlParser.Tablespace_encryption_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterLogging_clause(PlSqlParser.Logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitLogging_clause(PlSqlParser.Logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#extent_management_clause}.
	 * @param ctx the parse tree
	 */
	void enterExtent_management_clause(PlSqlParser.Extent_management_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#extent_management_clause}.
	 * @param ctx the parse tree
	 */
	void exitExtent_management_clause(PlSqlParser.Extent_management_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#segment_management_clause}.
	 * @param ctx the parse tree
	 */
	void enterSegment_management_clause(PlSqlParser.Segment_management_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#segment_management_clause}.
	 * @param ctx the parse tree
	 */
	void exitSegment_management_clause(PlSqlParser.Segment_management_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#flashback_mode_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_mode_clause(PlSqlParser.Flashback_mode_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#flashback_mode_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_mode_clause(PlSqlParser.Flashback_mode_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#temporary_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterTemporary_tablespace_clause(PlSqlParser.Temporary_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#temporary_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitTemporary_tablespace_clause(PlSqlParser.Temporary_tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_group_clause(PlSqlParser.Tablespace_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_group_clause(PlSqlParser.Tablespace_group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#undo_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterUndo_tablespace_clause(PlSqlParser.Undo_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#undo_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitUndo_tablespace_clause(PlSqlParser.Undo_tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace_retention_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_retention_clause(PlSqlParser.Tablespace_retention_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace_retention_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_retention_clause(PlSqlParser.Tablespace_retention_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datafile_specification}.
	 * @param ctx the parse tree
	 */
	void enterDatafile_specification(PlSqlParser.Datafile_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datafile_specification}.
	 * @param ctx the parse tree
	 */
	void exitDatafile_specification(PlSqlParser.Datafile_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tempfile_specification}.
	 * @param ctx the parse tree
	 */
	void enterTempfile_specification(PlSqlParser.Tempfile_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tempfile_specification}.
	 * @param ctx the parse tree
	 */
	void exitTempfile_specification(PlSqlParser.Tempfile_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datafile_tempfile_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatafile_tempfile_spec(PlSqlParser.Datafile_tempfile_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datafile_tempfile_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatafile_tempfile_spec(PlSqlParser.Datafile_tempfile_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#redo_log_file_spec}.
	 * @param ctx the parse tree
	 */
	void enterRedo_log_file_spec(PlSqlParser.Redo_log_file_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#redo_log_file_spec}.
	 * @param ctx the parse tree
	 */
	void exitRedo_log_file_spec(PlSqlParser.Redo_log_file_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#autoextend_clause}.
	 * @param ctx the parse tree
	 */
	void enterAutoextend_clause(PlSqlParser.Autoextend_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#autoextend_clause}.
	 * @param ctx the parse tree
	 */
	void exitAutoextend_clause(PlSqlParser.Autoextend_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#maxsize_clause}.
	 * @param ctx the parse tree
	 */
	void enterMaxsize_clause(PlSqlParser.Maxsize_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#maxsize_clause}.
	 * @param ctx the parse tree
	 */
	void exitMaxsize_clause(PlSqlParser.Maxsize_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#build_clause}.
	 * @param ctx the parse tree
	 */
	void enterBuild_clause(PlSqlParser.Build_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#build_clause}.
	 * @param ctx the parse tree
	 */
	void exitBuild_clause(PlSqlParser.Build_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parallel_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_clause(PlSqlParser.Parallel_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parallel_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_clause(PlSqlParser.Parallel_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_materialized_view_log}.
	 * @param ctx the parse tree
	 */
	void enterCreate_materialized_view_log(PlSqlParser.Create_materialized_view_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_materialized_view_log}.
	 * @param ctx the parse tree
	 */
	void exitCreate_materialized_view_log(PlSqlParser.Create_materialized_view_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#new_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterNew_values_clause(PlSqlParser.New_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#new_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitNew_values_clause(PlSqlParser.New_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_purge_clause(PlSqlParser.Mv_log_purge_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_purge_clause(PlSqlParser.Mv_log_purge_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_materialized_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_materialized_view(PlSqlParser.Create_materialized_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_materialized_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_materialized_view(PlSqlParser.Create_materialized_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void enterCreate_mv_refresh(PlSqlParser.Create_mv_refreshContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void exitCreate_mv_refresh(PlSqlParser.Create_mv_refreshContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(PlSqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(PlSqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_range_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterTable_range_partition_by_clause(PlSqlParser.Table_range_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_range_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitTable_range_partition_by_clause(PlSqlParser.Table_range_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datatype_null_enable}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_null_enable(PlSqlParser.Datatype_null_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datatype_null_enable}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_null_enable(PlSqlParser.Datatype_null_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#size_clause}.
	 * @param ctx the parse tree
	 */
	void enterSize_clause(PlSqlParser.Size_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#size_clause}.
	 * @param ctx the parse tree
	 */
	void exitSize_clause(PlSqlParser.Size_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_compression}.
	 * @param ctx the parse tree
	 */
	void enterTable_compression(PlSqlParser.Table_compressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_compression}.
	 * @param ctx the parse tree
	 */
	void exitTable_compression(PlSqlParser.Table_compressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#physical_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_attributes_clause(PlSqlParser.Physical_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#physical_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_attributes_clause(PlSqlParser.Physical_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterStorage_clause(PlSqlParser.Storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitStorage_clause(PlSqlParser.Storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#deferred_segment_creation}.
	 * @param ctx the parse tree
	 */
	void enterDeferred_segment_creation(PlSqlParser.Deferred_segment_creationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#deferred_segment_creation}.
	 * @param ctx the parse tree
	 */
	void exitDeferred_segment_creation(PlSqlParser.Deferred_segment_creationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#segment_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterSegment_attributes_clause(PlSqlParser.Segment_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#segment_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitSegment_attributes_clause(PlSqlParser.Segment_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#physical_properties}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_properties(PlSqlParser.Physical_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#physical_properties}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_properties(PlSqlParser.Physical_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#row_movement_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_movement_clause(PlSqlParser.Row_movement_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#row_movement_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_movement_clause(PlSqlParser.Row_movement_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#flashback_archive_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_archive_clause(PlSqlParser.Flashback_archive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#flashback_archive_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_archive_clause(PlSqlParser.Flashback_archive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(PlSqlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(PlSqlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#comment_on_column}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_column(PlSqlParser.Comment_on_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#comment_on_column}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_column(PlSqlParser.Comment_on_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void enterCreate_synonym(PlSqlParser.Create_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void exitCreate_synonym(PlSqlParser.Create_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#comment_on_table}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_table(PlSqlParser.Comment_on_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#comment_on_table}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_table(PlSqlParser.Comment_on_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(PlSqlParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(PlSqlParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAdd_constraint(PlSqlParser.Add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAdd_constraint(PlSqlParser.Add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#check_constraint}.
	 * @param ctx the parse tree
	 */
	void enterCheck_constraint(PlSqlParser.Check_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#check_constraint}.
	 * @param ctx the parse tree
	 */
	void exitCheck_constraint(PlSqlParser.Check_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDrop_constraint(PlSqlParser.Drop_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDrop_constraint(PlSqlParser.Drop_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#enable_constraint}.
	 * @param ctx the parse tree
	 */
	void enterEnable_constraint(PlSqlParser.Enable_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#enable_constraint}.
	 * @param ctx the parse tree
	 */
	void exitEnable_constraint(PlSqlParser.Enable_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#disable_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDisable_constraint(PlSqlParser.Disable_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#disable_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDisable_constraint(PlSqlParser.Disable_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(PlSqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(PlSqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#references_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferences_clause(PlSqlParser.References_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#references_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferences_clause(PlSqlParser.References_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#on_delete_clause}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete_clause(PlSqlParser.On_delete_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#on_delete_clause}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete_clause(PlSqlParser.On_delete_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unique_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnique_key_clause(PlSqlParser.Unique_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unique_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnique_key_clause(PlSqlParser.Unique_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#primary_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_key_clause(PlSqlParser.Primary_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#primary_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_key_clause(PlSqlParser.Primary_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_block(PlSqlParser.Anonymous_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_block(PlSqlParser.Anonymous_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(PlSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(PlSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_parameters_clause(PlSqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_parameters_clause(PlSqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void enterCall_spec(PlSqlParser.Call_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void exitCall_spec(PlSqlParser.Call_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void enterJava_spec(PlSqlParser.Java_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void exitJava_spec(PlSqlParser.Java_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void enterC_spec(PlSqlParser.C_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void exitC_spec(PlSqlParser.C_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_agent_in_clause(PlSqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_agent_in_clause(PlSqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_parameters_clause(PlSqlParser.C_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_parameters_clause(PlSqlParser.C_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PlSqlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PlSqlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter_desc}.
	 * @param ctx the parse tree
	 */
	void enterParameter_desc(PlSqlParser.Parameter_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter_desc}.
	 * @param ctx the parse tree
	 */
	void exitParameter_desc(PlSqlParser.Parameter_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_part(PlSqlParser.Default_value_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_part(PlSqlParser.Default_value_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#seq_of_declare_specs}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_declare_specs(PlSqlParser.Seq_of_declare_specsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#seq_of_declare_specs}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_declare_specs(PlSqlParser.Seq_of_declare_specsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_spec(PlSqlParser.Declare_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_spec(PlSqlParser.Declare_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PlSqlParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PlSqlParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(PlSqlParser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(PlSqlParser.Subtype_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(PlSqlParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(PlSqlParser.Cursor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void enterParameter_spec(PlSqlParser.Parameter_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void exitParameter_spec(PlSqlParser.Parameter_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(PlSqlParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(PlSqlParser.Exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPragma_declaration(PlSqlParser.Pragma_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPragma_declaration(PlSqlParser.Pragma_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#record_type_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_def(PlSqlParser.Record_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#record_type_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_def(PlSqlParser.Record_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void enterField_spec(PlSqlParser.Field_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void exitField_spec(PlSqlParser.Field_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#ref_cursor_type_def}.
	 * @param ctx the parse tree
	 */
	void enterRef_cursor_type_def(PlSqlParser.Ref_cursor_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#ref_cursor_type_def}.
	 * @param ctx the parse tree
	 */
	void exitRef_cursor_type_def(PlSqlParser.Ref_cursor_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(PlSqlParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(PlSqlParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_def(PlSqlParser.Table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_def(PlSqlParser.Table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void enterTable_indexed_by_part(PlSqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void exitTable_indexed_by_part(PlSqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type_def(PlSqlParser.Varray_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type_def(PlSqlParser.Varray_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_statements(PlSqlParser.Seq_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_statements(PlSqlParser.Seq_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLabel_declaration(PlSqlParser.Label_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLabel_declaration(PlSqlParser.Label_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PlSqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PlSqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void enterSwallow_to_semi(PlSqlParser.Swallow_to_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void exitSwallow_to_semi(PlSqlParser.Swallow_to_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(PlSqlParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(PlSqlParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(PlSqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(PlSqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(PlSqlParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(PlSqlParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(PlSqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(PlSqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PlSqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PlSqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void enterElsif_part(PlSqlParser.Elsif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void exitElsif_part(PlSqlParser.Elsif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(PlSqlParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(PlSqlParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(PlSqlParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(PlSqlParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void enterCursor_loop_param(PlSqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void exitCursor_loop_param(PlSqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void enterForall_statement(PlSqlParser.Forall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void exitForall_statement(PlSqlParser.Forall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void enterBounds_clause(PlSqlParser.Bounds_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void exitBounds_clause(PlSqlParser.Bounds_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void enterBetween_bound(PlSqlParser.Between_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void exitBetween_bound(PlSqlParser.Between_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(PlSqlParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(PlSqlParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(PlSqlParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(PlSqlParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(PlSqlParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(PlSqlParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(PlSqlParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(PlSqlParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PlSqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PlSqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PlSqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PlSqlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 */
	void enterPipe_row_statement(PlSqlParser.Pipe_row_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 */
	void exitPipe_row_statement(PlSqlParser.Pipe_row_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PlSqlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PlSqlParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exceptions}.
	 * @param ctx the parse tree
	 */
	void enterExceptions(PlSqlParser.ExceptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exceptions}.
	 * @param ctx the parse tree
	 */
	void exitExceptions(PlSqlParser.ExceptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(PlSqlParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(PlSqlParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_block(PlSqlParser.Trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_block(PlSqlParser.Trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PlSqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PlSqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(PlSqlParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(PlSqlParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate(PlSqlParser.Execute_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate(PlSqlParser.Execute_immediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_returning_clause(PlSqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_returning_clause(PlSqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_manipulation_language_statements(PlSqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_manipulation_language_statements(PlSqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void enterCursor_manipulation_statements(PlSqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void exitCursor_manipulation_statements(PlSqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(PlSqlParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(PlSqlParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(PlSqlParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(PlSqlParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(PlSqlParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(PlSqlParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_for_statement(PlSqlParser.Open_for_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_for_statement(PlSqlParser.Open_for_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_control_statements(PlSqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_control_statements(PlSqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_command(PlSqlParser.Set_transaction_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_command(PlSqlParser.Set_transaction_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_constraint_command(PlSqlParser.Set_constraint_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_constraint_command(PlSqlParser.Set_constraint_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(PlSqlParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(PlSqlParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void enterWrite_clause(PlSqlParser.Write_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void exitWrite_clause(PlSqlParser.Write_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(PlSqlParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(PlSqlParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_statement(PlSqlParser.Savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_statement(PlSqlParser.Savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(PlSqlParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(PlSqlParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(PlSqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(PlSqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(PlSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(PlSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void enterFactoring_element(PlSqlParser.Factoring_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void exitFactoring_element(PlSqlParser.Factoring_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(PlSqlParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(PlSqlParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(PlSqlParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(PlSqlParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(PlSqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(PlSqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_basic_elements(PlSqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_basic_elements(PlSqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_operation_part(PlSqlParser.Subquery_operation_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_operation_part(PlSqlParser.Subquery_operation_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(PlSqlParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(PlSqlParser.Query_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void enterSelected_element(PlSqlParser.Selected_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void exitSelected_element(PlSqlParser.Selected_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(PlSqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(PlSqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elements(PlSqlParser.Select_list_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elements(PlSqlParser.Select_list_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_list(PlSqlParser.Table_ref_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_list(PlSqlParser.Table_ref_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(PlSqlParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(PlSqlParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux(PlSqlParser.Table_ref_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux(PlSqlParser.Table_ref_auxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_ref_aux_internal_one}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux_internal_one(PlSqlParser.Table_ref_aux_internal_oneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_ref_aux_internal_one}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux_internal_one(PlSqlParser.Table_ref_aux_internal_oneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_ref_aux_internal_two}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux_internal_two(PlSqlParser.Table_ref_aux_internal_twoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_ref_aux_internal_two}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux_internal_two(PlSqlParser.Table_ref_aux_internal_twoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_ref_aux_internal_three}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux_internal_three(PlSqlParser.Table_ref_aux_internal_threeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_ref_aux_internal_three}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux_internal_three(PlSqlParser.Table_ref_aux_internal_threeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(PlSqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(PlSqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on_part(PlSqlParser.Join_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on_part(PlSqlParser.Join_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_using_part(PlSqlParser.Join_using_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_using_part(PlSqlParser.Join_using_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(PlSqlParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(PlSqlParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(PlSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(PlSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(PlSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(PlSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(PlSqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(PlSqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_element(PlSqlParser.Pivot_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_element(PlSqlParser.Pivot_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(PlSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(PlSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(PlSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(PlSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_element(PlSqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_element(PlSqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_elements(PlSqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_elements(PlSqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(PlSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(PlSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(PlSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(PlSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_elements(PlSqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_elements(PlSqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(PlSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(PlSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void enterStart_part(PlSqlParser.Start_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void exitStart_part(PlSqlParser.Start_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(PlSqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(PlSqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_elements(PlSqlParser.Group_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_elements(PlSqlParser.Group_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(PlSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(PlSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(PlSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(PlSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_elements(PlSqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_elements(PlSqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(PlSqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(PlSqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(PlSqlParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(PlSqlParser.Model_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(PlSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(PlSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(PlSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(PlSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(PlSqlParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(PlSqlParser.Reference_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(PlSqlParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(PlSqlParser.Main_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(PlSqlParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(PlSqlParser.Model_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_partition_part(PlSqlParser.Model_column_partition_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_partition_part(PlSqlParser.Model_column_partition_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_list(PlSqlParser.Model_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_list(PlSqlParser.Model_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void enterModel_column(PlSqlParser.Model_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void exitModel_column(PlSqlParser.Model_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(PlSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(PlSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_part(PlSqlParser.Model_rules_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_part(PlSqlParser.Model_rules_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_element(PlSqlParser.Model_rules_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_element(PlSqlParser.Model_rules_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(PlSqlParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(PlSqlParser.Cell_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_iterate_clause(PlSqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_iterate_clause(PlSqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void enterUntil_part(PlSqlParser.Until_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void exitUntil_part(PlSqlParser.Until_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(PlSqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(PlSqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_elements(PlSqlParser.Order_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_elements(PlSqlParser.Order_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(PlSqlParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(PlSqlParser.For_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_of_part(PlSqlParser.For_update_of_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_of_part(PlSqlParser.For_update_of_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_options(PlSqlParser.For_update_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_options(PlSqlParser.For_update_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(PlSqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(PlSqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(PlSqlParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(PlSqlParser.Update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterColumn_based_update_set_clause(PlSqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitColumn_based_update_set_clause(PlSqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(PlSqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(PlSqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(PlSqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(PlSqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(PlSqlParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(PlSqlParser.Single_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(PlSqlParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(PlSqlParser.Multi_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_element(PlSqlParser.Multi_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_element(PlSqlParser.Multi_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(PlSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(PlSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_when_part(PlSqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_when_part(PlSqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_else_part(PlSqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_else_part(PlSqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(PlSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(PlSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(PlSqlParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(PlSqlParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(PlSqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(PlSqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(PlSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(PlSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void enterMerge_element(PlSqlParser.Merge_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void exitMerge_element(PlSqlParser.Merge_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_delete_part(PlSqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_delete_part(PlSqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(PlSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(PlSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void enterSelected_tableview(PlSqlParser.Selected_tableviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void exitSelected_tableview(PlSqlParser.Selected_tableviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_statement(PlSqlParser.Lock_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_statement(PlSqlParser.Lock_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void enterWait_nowait_part(PlSqlParser.Wait_nowait_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void exitWait_nowait_part(PlSqlParser.Wait_nowait_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_element(PlSqlParser.Lock_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_element(PlSqlParser.Lock_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode(PlSqlParser.Lock_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode(PlSqlParser.Lock_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_table_ref(PlSqlParser.General_table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_table_ref(PlSqlParser.General_table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterStatic_returning_clause(PlSqlParser.Static_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitStatic_returning_clause(PlSqlParser.Static_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(PlSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(PlSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_into_part(PlSqlParser.Error_logging_into_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_into_part(PlSqlParser.Error_logging_into_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_reject_part(PlSqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_reject_part(PlSqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(PlSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(PlSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_expression(PlSqlParser.Table_collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_expression(PlSqlParser.Table_collection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restriction_clause(PlSqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restriction_clause(PlSqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(PlSqlParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(PlSqlParser.Sample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void enterSeed_part(PlSqlParser.Seed_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void exitSeed_part(PlSqlParser.Seed_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(PlSqlParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(PlSqlParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PlSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PlSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(PlSqlParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(PlSqlParser.Cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(PlSqlParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(PlSqlParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_expression(PlSqlParser.Multiset_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_expression(PlSqlParser.Multiset_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(PlSqlParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(PlSqlParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(PlSqlParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(PlSqlParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(PlSqlParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(PlSqlParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void enterIn_elements(PlSqlParser.In_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void exitIn_elements(PlSqlParser.In_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void enterBetween_elements(PlSqlParser.Between_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void exitBetween_elements(PlSqlParser.Between_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(PlSqlParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(PlSqlParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(PlSqlParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(PlSqlParser.Interval_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression(PlSqlParser.Model_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression(PlSqlParser.Model_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression_element(PlSqlParser.Model_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression_element(PlSqlParser.Model_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(PlSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(PlSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(PlSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(PlSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(PlSqlParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(PlSqlParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(PlSqlParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(PlSqlParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(PlSqlParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(PlSqlParser.Simple_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_when_part(PlSqlParser.Simple_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_when_part(PlSqlParser.Simple_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(PlSqlParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(PlSqlParser.Searched_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_when_part(PlSqlParser.Searched_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_when_part(PlSqlParser.Searched_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void enterCase_else_part(PlSqlParser.Case_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void exitCase_else_part(PlSqlParser.Case_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PlSqlParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PlSqlParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuantified_expression(PlSqlParser.Quantified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuantified_expression(PlSqlParser.Quantified_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#string_function}.
	 * @param ctx the parse tree
	 */
	void enterString_function(PlSqlParser.String_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#string_function}.
	 * @param ctx the parse tree
	 */
	void exitString_function(PlSqlParser.String_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void enterStandard_function(PlSqlParser.Standard_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void exitStandard_function(PlSqlParser.Standard_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric_function_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function_wrapper(PlSqlParser.Numeric_function_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric_function_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function_wrapper(PlSqlParser.Numeric_function_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric_function}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function(PlSqlParser.Numeric_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric_function}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function(PlSqlParser.Numeric_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#other_function}.
	 * @param ctx the parse tree
	 */
	void enterOther_function(PlSqlParser.Other_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#other_function}.
	 * @param ctx the parse tree
	 */
	void exitOther_function(PlSqlParser.Other_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause_keyword(PlSqlParser.Over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause_keyword(PlSqlParser.Over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_clause_keyword(PlSqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_clause_keyword(PlSqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void enterStandard_prediction_function_keyword(PlSqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void exitStandard_prediction_function_keyword(PlSqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(PlSqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(PlSqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(PlSqlParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(PlSqlParser.Windowing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_type(PlSqlParser.Windowing_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_type(PlSqlParser.Windowing_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_elements(PlSqlParser.Windowing_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_elements(PlSqlParser.Windowing_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(PlSqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(PlSqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void enterUsing_element(PlSqlParser.Using_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void exitUsing_element(PlSqlParser.Using_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void enterCollect_order_by_part(PlSqlParser.Collect_order_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void exitCollect_order_by_part(PlSqlParser.Collect_order_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_part(PlSqlParser.Within_or_over_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_part(PlSqlParser.Within_or_over_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void enterCost_matrix_clause(PlSqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void exitCost_matrix_clause(PlSqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing_clause(PlSqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing_clause(PlSqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes_clause(PlSqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes_clause(PlSqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespaces_clause(PlSqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespaces_clause(PlSqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(PlSqlParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(PlSqlParser.Xml_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void enterXml_general_default_part(PlSqlParser.Xml_general_default_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void exitXml_general_default_part(PlSqlParser.Xml_general_default_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterXml_multiuse_expression_element(PlSqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitXml_multiuse_expression_element(PlSqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_version_part(PlSqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_version_part(PlSqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_standalone_part(PlSqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_standalone_part(PlSqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_enconding_part(PlSqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_enconding_part(PlSqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_version_part(PlSqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_version_part(PlSqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_ident_part(PlSqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_ident_part(PlSqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void enterSql_plus_command(PlSqlParser.Sql_plus_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void exitSql_plus_command(PlSqlParser.Sql_plus_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void enterWhenever_command(PlSqlParser.Whenever_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void exitWhenever_command(PlSqlParser.Whenever_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_command(PlSqlParser.Set_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_command(PlSqlParser.Set_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(PlSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(PlSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(PlSqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(PlSqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(PlSqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(PlSqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PlSqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PlSqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(PlSqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(PlSqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void enterXml_column_name(PlSqlParser.Xml_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void exitXml_column_name(PlSqlParser.Xml_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_name(PlSqlParser.Routine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_name(PlSqlParser.Routine_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#common_name}.
	 * @param ctx the parse tree
	 */
	void enterCommon_name(PlSqlParser.Common_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#common_name}.
	 * @param ctx the parse tree
	 */
	void exitCommon_name(PlSqlParser.Common_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#regular_name}.
	 * @param ctx the parse tree
	 */
	void enterRegular_name(PlSqlParser.Regular_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#regular_name}.
	 * @param ctx the parse tree
	 */
	void exitRegular_name(PlSqlParser.Regular_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_name(PlSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_name(PlSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grantee_name}.
	 * @param ctx the parse tree
	 */
	void enterGrantee_name(PlSqlParser.Grantee_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grantee_name}.
	 * @param ctx the parse tree
	 */
	void exitGrantee_name(PlSqlParser.Grantee_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#role_name}.
	 * @param ctx the parse tree
	 */
	void enterRole_name(PlSqlParser.Role_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#role_name}.
	 * @param ctx the parse tree
	 */
	void exitRole_name(PlSqlParser.Role_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(PlSqlParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(PlSqlParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(PlSqlParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(PlSqlParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(PlSqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(PlSqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_name(PlSqlParser.Sequence_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_name(PlSqlParser.Sequence_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void enterException_name(PlSqlParser.Exception_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void exitException_name(PlSqlParser.Exception_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(PlSqlParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(PlSqlParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(PlSqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(PlSqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void enterRecord_name(PlSqlParser.Record_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void exitRecord_name(PlSqlParser.Record_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(PlSqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(PlSqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void enterTableview_name(PlSqlParser.Tableview_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void exitTableview_name(PlSqlParser.Tableview_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void enterChar_set_name(PlSqlParser.Char_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void exitChar_set_name(PlSqlParser.Char_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#schema_object_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_object_name(PlSqlParser.Schema_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#schema_object_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_object_name(PlSqlParser.Schema_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dir_object_name}.
	 * @param ctx the parse tree
	 */
	void enterDir_object_name(PlSqlParser.Dir_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dir_object_name}.
	 * @param ctx the parse tree
	 */
	void exitDir_object_name(PlSqlParser.Dir_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_object_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_object_name(PlSqlParser.User_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_object_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_object_name(PlSqlParser.User_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grant_object_name}.
	 * @param ctx the parse tree
	 */
	void enterGrant_object_name(PlSqlParser.Grant_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grant_object_name}.
	 * @param ctx the parse tree
	 */
	void exitGrant_object_name(PlSqlParser.Grant_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(PlSqlParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(PlSqlParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#paren_column_list}.
	 * @param ctx the parse tree
	 */
	void enterParen_column_list(PlSqlParser.Paren_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#paren_column_list}.
	 * @param ctx the parse tree
	 */
	void exitParen_column_list(PlSqlParser.Paren_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void enterKeep_clause(PlSqlParser.Keep_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void exitKeep_clause(PlSqlParser.Keep_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(PlSqlParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(PlSqlParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_analytic(PlSqlParser.Function_argument_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_analytic(PlSqlParser.Function_argument_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_modeling(PlSqlParser.Function_argument_modelingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_modeling(PlSqlParser.Function_argument_modelingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void enterRespect_or_ignore_nulls(PlSqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void exitRespect_or_ignore_nulls(PlSqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PlSqlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PlSqlParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(PlSqlParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(PlSqlParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(PlSqlParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(PlSqlParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_part(PlSqlParser.Precision_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_part(PlSqlParser.Precision_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void enterNative_datatype_element(PlSqlParser.Native_datatype_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void exitNative_datatype_element(PlSqlParser.Native_datatype_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void enterBind_variable(PlSqlParser.Bind_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void exitBind_variable(PlSqlParser.Bind_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element(PlSqlParser.General_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element(PlSqlParser.General_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element_part(PlSqlParser.General_element_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element_part(PlSqlParser.General_element_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(PlSqlParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(PlSqlParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_privilege}.
	 * @param ctx the parse tree
	 */
	void enterObject_privilege(PlSqlParser.Object_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_privilege}.
	 * @param ctx the parse tree
	 */
	void exitObject_privilege(PlSqlParser.Object_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#system_privilege}.
	 * @param ctx the parse tree
	 */
	void enterSystem_privilege(PlSqlParser.System_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#system_privilege}.
	 * @param ctx the parse tree
	 */
	void exitSystem_privilege(PlSqlParser.System_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PlSqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PlSqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(PlSqlParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(PlSqlParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_negative(PlSqlParser.Numeric_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_negative(PlSqlParser.Numeric_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(PlSqlParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(PlSqlParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PlSqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PlSqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(PlSqlParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(PlSqlParser.Id_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_sign(PlSqlParser.Outer_join_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_sign(PlSqlParser.Outer_join_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void enterRegular_id(PlSqlParser.Regular_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void exitRegular_id(PlSqlParser.Regular_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#string_function_name}.
	 * @param ctx the parse tree
	 */
	void enterString_function_name(PlSqlParser.String_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#string_function_name}.
	 * @param ctx the parse tree
	 */
	void exitString_function_name(PlSqlParser.String_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric_function_name}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function_name(PlSqlParser.Numeric_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric_function_name}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function_name(PlSqlParser.Numeric_function_nameContext ctx);
}