// Generated from de/vhdl/grammar/VHDLParser.g4 by ANTLR 4.13.2
package de.vhdl.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VHDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VHDLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VHDLParser#abstract_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_literal(VHDLParser.Abstract_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#access_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_type_definition(VHDLParser.Access_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#across_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcross_aspect(VHDLParser.Across_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#actual_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_designator(VHDLParser.Actual_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#actual_parameter_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_parameter_part(VHDLParser.Actual_parameter_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#actual_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_part(VHDLParser.Actual_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#adding_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdding_operator(VHDLParser.Adding_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(VHDLParser.AggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#alias_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_declaration(VHDLParser.Alias_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#alias_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_designator(VHDLParser.Alias_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#alias_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_indication(VHDLParser.Alias_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#allocator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocator(VHDLParser.AllocatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#architecture_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture_body(VHDLParser.Architecture_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#architecture_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture_declarative_part(VHDLParser.Architecture_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#architecture_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture_statement(VHDLParser.Architecture_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#architecture_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture_statement_part(VHDLParser.Architecture_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#array_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_nature_definition(VHDLParser.Array_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#array_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type_definition(VHDLParser.Array_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(VHDLParser.AssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_statement(VHDLParser.Assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#association_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation_element(VHDLParser.Association_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#association_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation_list(VHDLParser.Association_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#attribute_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_declaration(VHDLParser.Attribute_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#attribute_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_designator(VHDLParser.Attribute_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#attribute_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_specification(VHDLParser.Attribute_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#base_unit_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_unit_declaration(VHDLParser.Base_unit_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#binding_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding_indication(VHDLParser.Binding_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#block_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_configuration(VHDLParser.Block_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#block_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_declarative_item(VHDLParser.Block_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#block_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_declarative_part(VHDLParser.Block_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#block_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_header(VHDLParser.Block_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#block_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_specification(VHDLParser.Block_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(VHDLParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#block_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement_part(VHDLParser.Block_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#branch_quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_quantity_declaration(VHDLParser.Branch_quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#break_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_element(VHDLParser.Break_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#break_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_list(VHDLParser.Break_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#break_selector_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_selector_clause(VHDLParser.Break_selector_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(VHDLParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(VHDLParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#case_statement_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement_alternative(VHDLParser.Case_statement_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(VHDLParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#choices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoices(VHDLParser.ChoicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#component_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_configuration(VHDLParser.Component_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#component_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_declaration(VHDLParser.Component_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#component_instantiation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_instantiation_statement(VHDLParser.Component_instantiation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#component_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_specification(VHDLParser.Component_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#composite_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_nature_definition(VHDLParser.Composite_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#composite_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_type_definition(VHDLParser.Composite_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_assertion_statement(VHDLParser.Concurrent_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#concurrent_break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_break_statement(VHDLParser.Concurrent_break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#concurrent_procedure_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_procedure_call_statement(VHDLParser.Concurrent_procedure_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#concurrent_signal_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_signal_assignment_statement(VHDLParser.Concurrent_signal_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(VHDLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#condition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_clause(VHDLParser.Condition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#conditional_signal_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_signal_assignment(VHDLParser.Conditional_signal_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#conditional_waveforms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_waveforms(VHDLParser.Conditional_waveformsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#configuration_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_declaration(VHDLParser.Configuration_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#configuration_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_declarative_item(VHDLParser.Configuration_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#configuration_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_declarative_part(VHDLParser.Configuration_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#configuration_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_item(VHDLParser.Configuration_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#configuration_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguration_specification(VHDLParser.Configuration_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(VHDLParser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#constrained_array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrained_array_definition(VHDLParser.Constrained_array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#constrained_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrained_nature_definition(VHDLParser.Constrained_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(VHDLParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#context_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_clause(VHDLParser.Context_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#context_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_item(VHDLParser.Context_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#delay_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_mechanism(VHDLParser.Delay_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#design_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign_file(VHDLParser.Design_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#design_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign_unit(VHDLParser.Design_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(VHDLParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(VHDLParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#disconnection_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnection_specification(VHDLParser.Disconnection_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#discrete_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_range(VHDLParser.Discrete_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#element_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_association(VHDLParser.Element_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#element_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_declaration(VHDLParser.Element_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#element_subnature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_subnature_definition(VHDLParser.Element_subnature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#element_subtype_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_subtype_definition(VHDLParser.Element_subtype_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_aspect(VHDLParser.Entity_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_class(VHDLParser.Entity_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_class_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_class_entry(VHDLParser.Entity_class_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_class_entry_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_class_entry_list(VHDLParser.Entity_class_entry_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_declaration(VHDLParser.Entity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_declarative_item(VHDLParser.Entity_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_declarative_part(VHDLParser.Entity_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_designator(VHDLParser.Entity_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_header(VHDLParser.Entity_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name_list(VHDLParser.Entity_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_specification(VHDLParser.Entity_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_statement(VHDLParser.Entity_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_statement_part(VHDLParser.Entity_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_tag(VHDLParser.Entity_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#enumeration_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_literal(VHDLParser.Enumeration_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#enumeration_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_type_definition(VHDLParser.Enumeration_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(VHDLParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VHDLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(VHDLParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#file_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_declaration(VHDLParser.File_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#file_logical_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_logical_name(VHDLParser.File_logical_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#file_open_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_open_information(VHDLParser.File_open_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#file_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_type_definition(VHDLParser.File_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_parameter_list(VHDLParser.Formal_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#formal_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_part(VHDLParser.Formal_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#free_quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFree_quantity_declaration(VHDLParser.Free_quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#generate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_statement(VHDLParser.Generate_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#generation_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneration_scheme(VHDLParser.Generation_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#generic_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_clause(VHDLParser.Generic_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#generic_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_list(VHDLParser.Generic_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#generic_map_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_map_aspect(VHDLParser.Generic_map_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#group_constituent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_constituent(VHDLParser.Group_constituentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#group_constituent_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_constituent_list(VHDLParser.Group_constituent_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#group_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_declaration(VHDLParser.Group_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#group_template_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_template_declaration(VHDLParser.Group_template_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#guarded_signal_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuarded_signal_specification(VHDLParser.Guarded_signal_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VHDLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(VHDLParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(VHDLParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#index_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_constraint(VHDLParser.Index_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#index_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_specification(VHDLParser.Index_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#index_subtype_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_subtype_definition(VHDLParser.Index_subtype_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#instantiated_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiated_unit(VHDLParser.Instantiated_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#instantiation_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiation_list(VHDLParser.Instantiation_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_constant_declaration(VHDLParser.Interface_constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration(VHDLParser.Interface_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_element(VHDLParser.Interface_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_file_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_file_declaration(VHDLParser.Interface_file_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_signal_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_signal_list(VHDLParser.Interface_signal_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_port_list(VHDLParser.Interface_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_list(VHDLParser.Interface_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_quantity_declaration(VHDLParser.Interface_quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_port_declaration(VHDLParser.Interface_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_signal_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_signal_declaration(VHDLParser.Interface_signal_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_terminal_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_terminal_declaration(VHDLParser.Interface_terminal_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_variable_declaration(VHDLParser.Interface_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#iteration_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_scheme(VHDLParser.Iteration_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#label_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_colon(VHDLParser.Label_colonContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#library_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_clause(VHDLParser.Library_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#library_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_unit(VHDLParser.Library_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(VHDLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#logical_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_name(VHDLParser.Logical_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#logical_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_name_list(VHDLParser.Logical_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(VHDLParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(VHDLParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#signal_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_mode(VHDLParser.Signal_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#multiplying_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplying_operator(VHDLParser.Multiplying_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(VHDLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#name_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_part(VHDLParser.Name_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#selected_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_name(VHDLParser.Selected_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#selected_name_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_name_part(VHDLParser.Selected_name_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#function_call_or_indexed_name_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#slice_name_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice_name_part(VHDLParser.Slice_name_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#attribute_name_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name_part(VHDLParser.Attribute_name_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#nature_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNature_declaration(VHDLParser.Nature_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNature_definition(VHDLParser.Nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#nature_element_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNature_element_declaration(VHDLParser.Nature_element_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#next_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_statement(VHDLParser.Next_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(VHDLParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#object_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_declaration(VHDLParser.Object_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpts(VHDLParser.OptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(VHDLParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#package_body_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_declarative_item(VHDLParser.Package_body_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#package_body_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_declarative_part(VHDLParser.Package_body_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(VHDLParser.Package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#package_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declarative_item(VHDLParser.Package_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#package_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declarative_part(VHDLParser.Package_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#parameter_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_specification(VHDLParser.Parameter_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#physical_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_literal(VHDLParser.Physical_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#physical_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_type_definition(VHDLParser.Physical_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#port_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_clause(VHDLParser.Port_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_list(VHDLParser.Port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#port_map_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_map_aspect(VHDLParser.Port_map_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(VHDLParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#primary_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_unit(VHDLParser.Primary_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#procedural_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_declarative_item(VHDLParser.Procedural_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#procedural_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_declarative_part(VHDLParser.Procedural_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#procedural_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_statement_part(VHDLParser.Procedural_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#procedure_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call(VHDLParser.Procedure_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#procedure_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call_statement(VHDLParser.Procedure_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#process_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess_declarative_item(VHDLParser.Process_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#process_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess_declarative_part(VHDLParser.Process_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#process_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess_statement(VHDLParser.Process_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#process_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess_statement_part(VHDLParser.Process_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#qualified_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_expression(VHDLParser.Qualified_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantity_declaration(VHDLParser.Quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#quantity_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantity_list(VHDLParser.Quantity_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#quantity_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantity_specification(VHDLParser.Quantity_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#range_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_decl(VHDLParser.Range_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#explicit_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_range(VHDLParser.Explicit_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#range_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_constraint(VHDLParser.Range_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#record_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_nature_definition(VHDLParser.Record_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#record_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_definition(VHDLParser.Record_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(VHDLParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(VHDLParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#report_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReport_statement(VHDLParser.Report_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(VHDLParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#scalar_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_nature_definition(VHDLParser.Scalar_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#scalar_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_type_definition(VHDLParser.Scalar_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#secondary_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondary_unit(VHDLParser.Secondary_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#secondary_unit_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondary_unit_declaration(VHDLParser.Secondary_unit_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#selected_signal_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_signal_assignment(VHDLParser.Selected_signal_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#selected_waveforms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_waveforms(VHDLParser.Selected_waveformsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#sensitivity_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensitivity_clause(VHDLParser.Sensitivity_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#sensitivity_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensitivity_list(VHDLParser.Sensitivity_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#sequence_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_of_statements(VHDLParser.Sequence_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#sequential_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential_statement(VHDLParser.Sequential_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(VHDLParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#shift_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_operator(VHDLParser.Shift_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#signal_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#signal_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_declaration(VHDLParser.Signal_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#signal_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_kind(VHDLParser.Signal_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#signal_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_list(VHDLParser.Signal_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(VHDLParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(VHDLParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#simple_simultaneous_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_simultaneous_statement(VHDLParser.Simple_simultaneous_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#simultaneous_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_alternative(VHDLParser.Simultaneous_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#simultaneous_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_case_statement(VHDLParser.Simultaneous_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#simultaneous_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_if_statement(VHDLParser.Simultaneous_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#simultaneous_procedural_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_procedural_statement(VHDLParser.Simultaneous_procedural_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#simultaneous_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_statement(VHDLParser.Simultaneous_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#simultaneous_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimultaneous_statement_part(VHDLParser.Simultaneous_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#source_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_aspect(VHDLParser.Source_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#source_quantity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_quantity_declaration(VHDLParser.Source_quantity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#step_limit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_limit_specification(VHDLParser.Step_limit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subnature_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubnature_declaration(VHDLParser.Subnature_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subnature_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubnature_indication(VHDLParser.Subnature_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subprogram_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_body(VHDLParser.Subprogram_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subprogram_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_declaration(VHDLParser.Subprogram_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subprogram_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_declarative_item(VHDLParser.Subprogram_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subprogram_declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_declarative_part(VHDLParser.Subprogram_declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subprogram_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_kind(VHDLParser.Subprogram_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subprogram_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_specification(VHDLParser.Subprogram_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#procedure_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_specification(VHDLParser.Procedure_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#function_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_specification(VHDLParser.Function_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subprogram_statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_statement_part(VHDLParser.Subprogram_statement_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subtype_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_declaration(VHDLParser.Subtype_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#subtype_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_indication(VHDLParser.Subtype_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffix(VHDLParser.SuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(VHDLParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(VHDLParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#terminal_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal_aspect(VHDLParser.Terminal_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#terminal_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal_declaration(VHDLParser.Terminal_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#through_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrough_aspect(VHDLParser.Through_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#timeout_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeout_clause(VHDLParser.Timeout_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#tolerance_aspect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTolerance_aspect(VHDLParser.Tolerance_aspectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(VHDLParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(VHDLParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#unconstrained_array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconstrained_array_definition(VHDLParser.Unconstrained_array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#unconstrained_nature_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconstrained_nature_definition(VHDLParser.Unconstrained_nature_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#use_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_clause(VHDLParser.Use_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#variable_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment_statement(VHDLParser.Variable_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(VHDLParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#wait_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_statement(VHDLParser.Wait_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#waveform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaveform(VHDLParser.WaveformContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#waveform_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaveform_element(VHDLParser.Waveform_elementContext ctx);
}