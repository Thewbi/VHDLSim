// Generated from de/vhdl/grammar/VHDLParser.g4 by ANTLR 4.13.2
package de.vhdl.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VHDLParser}.
 */
public interface VHDLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VHDLParser#abstract_literal}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_literal(VHDLParser.Abstract_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#abstract_literal}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_literal(VHDLParser.Abstract_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#access_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterAccess_type_definition(VHDLParser.Access_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#access_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitAccess_type_definition(VHDLParser.Access_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#across_aspect}.
	 * @param ctx the parse tree
	 */
	void enterAcross_aspect(VHDLParser.Across_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#across_aspect}.
	 * @param ctx the parse tree
	 */
	void exitAcross_aspect(VHDLParser.Across_aspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#actual_designator}.
	 * @param ctx the parse tree
	 */
	void enterActual_designator(VHDLParser.Actual_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#actual_designator}.
	 * @param ctx the parse tree
	 */
	void exitActual_designator(VHDLParser.Actual_designatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#actual_parameter_part}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter_part(VHDLParser.Actual_parameter_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#actual_parameter_part}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter_part(VHDLParser.Actual_parameter_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#actual_part}.
	 * @param ctx the parse tree
	 */
	void enterActual_part(VHDLParser.Actual_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#actual_part}.
	 * @param ctx the parse tree
	 */
	void exitActual_part(VHDLParser.Actual_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#adding_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdding_operator(VHDLParser.Adding_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#adding_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdding_operator(VHDLParser.Adding_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(VHDLParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(VHDLParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#alias_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAlias_declaration(VHDLParser.Alias_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#alias_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAlias_declaration(VHDLParser.Alias_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#alias_designator}.
	 * @param ctx the parse tree
	 */
	void enterAlias_designator(VHDLParser.Alias_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#alias_designator}.
	 * @param ctx the parse tree
	 */
	void exitAlias_designator(VHDLParser.Alias_designatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#alias_indication}.
	 * @param ctx the parse tree
	 */
	void enterAlias_indication(VHDLParser.Alias_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#alias_indication}.
	 * @param ctx the parse tree
	 */
	void exitAlias_indication(VHDLParser.Alias_indicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#allocator}.
	 * @param ctx the parse tree
	 */
	void enterAllocator(VHDLParser.AllocatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#allocator}.
	 * @param ctx the parse tree
	 */
	void exitAllocator(VHDLParser.AllocatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#architecture_body}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture_body(VHDLParser.Architecture_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#architecture_body}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture_body(VHDLParser.Architecture_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#architecture_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture_declarative_part(VHDLParser.Architecture_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#architecture_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture_declarative_part(VHDLParser.Architecture_declarative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#architecture_statement}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture_statement(VHDLParser.Architecture_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#architecture_statement}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture_statement(VHDLParser.Architecture_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#architecture_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture_statement_part(VHDLParser.Architecture_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#architecture_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture_statement_part(VHDLParser.Architecture_statement_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#array_nature_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_nature_definition(VHDLParser.Array_nature_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#array_nature_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_nature_definition(VHDLParser.Array_nature_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#array_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_type_definition(VHDLParser.Array_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#array_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_type_definition(VHDLParser.Array_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(VHDLParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(VHDLParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_statement(VHDLParser.Assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_statement(VHDLParser.Assertion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#association_element}.
	 * @param ctx the parse tree
	 */
	void enterAssociation_element(VHDLParser.Association_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#association_element}.
	 * @param ctx the parse tree
	 */
	void exitAssociation_element(VHDLParser.Association_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#association_list}.
	 * @param ctx the parse tree
	 */
	void enterAssociation_list(VHDLParser.Association_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#association_list}.
	 * @param ctx the parse tree
	 */
	void exitAssociation_list(VHDLParser.Association_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(VHDLParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(VHDLParser.Attribute_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_designator(VHDLParser.Attribute_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_designator(VHDLParser.Attribute_designatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#attribute_specification}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_specification(VHDLParser.Attribute_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#attribute_specification}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_specification(VHDLParser.Attribute_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#base_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBase_unit_declaration(VHDLParser.Base_unit_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#base_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBase_unit_declaration(VHDLParser.Base_unit_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#binding_indication}.
	 * @param ctx the parse tree
	 */
	void enterBinding_indication(VHDLParser.Binding_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#binding_indication}.
	 * @param ctx the parse tree
	 */
	void exitBinding_indication(VHDLParser.Binding_indicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#block_configuration}.
	 * @param ctx the parse tree
	 */
	void enterBlock_configuration(VHDLParser.Block_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#block_configuration}.
	 * @param ctx the parse tree
	 */
	void exitBlock_configuration(VHDLParser.Block_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#block_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterBlock_declarative_item(VHDLParser.Block_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#block_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitBlock_declarative_item(VHDLParser.Block_declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#block_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterBlock_declarative_part(VHDLParser.Block_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#block_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitBlock_declarative_part(VHDLParser.Block_declarative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#block_header}.
	 * @param ctx the parse tree
	 */
	void enterBlock_header(VHDLParser.Block_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#block_header}.
	 * @param ctx the parse tree
	 */
	void exitBlock_header(VHDLParser.Block_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#block_specification}.
	 * @param ctx the parse tree
	 */
	void enterBlock_specification(VHDLParser.Block_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#block_specification}.
	 * @param ctx the parse tree
	 */
	void exitBlock_specification(VHDLParser.Block_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(VHDLParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(VHDLParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#block_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement_part(VHDLParser.Block_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#block_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement_part(VHDLParser.Block_statement_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#branch_quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBranch_quantity_declaration(VHDLParser.Branch_quantity_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#branch_quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBranch_quantity_declaration(VHDLParser.Branch_quantity_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#break_element}.
	 * @param ctx the parse tree
	 */
	void enterBreak_element(VHDLParser.Break_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#break_element}.
	 * @param ctx the parse tree
	 */
	void exitBreak_element(VHDLParser.Break_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#break_list}.
	 * @param ctx the parse tree
	 */
	void enterBreak_list(VHDLParser.Break_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#break_list}.
	 * @param ctx the parse tree
	 */
	void exitBreak_list(VHDLParser.Break_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#break_selector_clause}.
	 * @param ctx the parse tree
	 */
	void enterBreak_selector_clause(VHDLParser.Break_selector_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#break_selector_clause}.
	 * @param ctx the parse tree
	 */
	void exitBreak_selector_clause(VHDLParser.Break_selector_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(VHDLParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(VHDLParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(VHDLParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(VHDLParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#case_statement_alternative}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_alternative(VHDLParser.Case_statement_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#case_statement_alternative}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_alternative(VHDLParser.Case_statement_alternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(VHDLParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(VHDLParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#choices}.
	 * @param ctx the parse tree
	 */
	void enterChoices(VHDLParser.ChoicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#choices}.
	 * @param ctx the parse tree
	 */
	void exitChoices(VHDLParser.ChoicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#component_configuration}.
	 * @param ctx the parse tree
	 */
	void enterComponent_configuration(VHDLParser.Component_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#component_configuration}.
	 * @param ctx the parse tree
	 */
	void exitComponent_configuration(VHDLParser.Component_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void enterComponent_declaration(VHDLParser.Component_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void exitComponent_declaration(VHDLParser.Component_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#component_instantiation_statement}.
	 * @param ctx the parse tree
	 */
	void enterComponent_instantiation_statement(VHDLParser.Component_instantiation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#component_instantiation_statement}.
	 * @param ctx the parse tree
	 */
	void exitComponent_instantiation_statement(VHDLParser.Component_instantiation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#component_specification}.
	 * @param ctx the parse tree
	 */
	void enterComponent_specification(VHDLParser.Component_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#component_specification}.
	 * @param ctx the parse tree
	 */
	void exitComponent_specification(VHDLParser.Component_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#composite_nature_definition}.
	 * @param ctx the parse tree
	 */
	void enterComposite_nature_definition(VHDLParser.Composite_nature_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#composite_nature_definition}.
	 * @param ctx the parse tree
	 */
	void exitComposite_nature_definition(VHDLParser.Composite_nature_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#composite_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterComposite_type_definition(VHDLParser.Composite_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#composite_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitComposite_type_definition(VHDLParser.Composite_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_assertion_statement(VHDLParser.Concurrent_assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_assertion_statement(VHDLParser.Concurrent_assertion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#concurrent_break_statement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_break_statement(VHDLParser.Concurrent_break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#concurrent_break_statement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_break_statement(VHDLParser.Concurrent_break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#concurrent_procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_procedure_call_statement(VHDLParser.Concurrent_procedure_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#concurrent_procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_procedure_call_statement(VHDLParser.Concurrent_procedure_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#concurrent_signal_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_signal_assignment_statement(VHDLParser.Concurrent_signal_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#concurrent_signal_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_signal_assignment_statement(VHDLParser.Concurrent_signal_assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(VHDLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(VHDLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void enterCondition_clause(VHDLParser.Condition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void exitCondition_clause(VHDLParser.Condition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#conditional_signal_assignment}.
	 * @param ctx the parse tree
	 */
	void enterConditional_signal_assignment(VHDLParser.Conditional_signal_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#conditional_signal_assignment}.
	 * @param ctx the parse tree
	 */
	void exitConditional_signal_assignment(VHDLParser.Conditional_signal_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#conditional_waveforms}.
	 * @param ctx the parse tree
	 */
	void enterConditional_waveforms(VHDLParser.Conditional_waveformsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#conditional_waveforms}.
	 * @param ctx the parse tree
	 */
	void exitConditional_waveforms(VHDLParser.Conditional_waveformsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#configuration_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_declaration(VHDLParser.Configuration_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#configuration_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_declaration(VHDLParser.Configuration_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#configuration_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_declarative_item(VHDLParser.Configuration_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#configuration_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_declarative_item(VHDLParser.Configuration_declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#configuration_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_declarative_part(VHDLParser.Configuration_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#configuration_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_declarative_part(VHDLParser.Configuration_declarative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#configuration_item}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_item(VHDLParser.Configuration_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#configuration_item}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_item(VHDLParser.Configuration_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#configuration_specification}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration_specification(VHDLParser.Configuration_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#configuration_specification}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration_specification(VHDLParser.Configuration_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(VHDLParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(VHDLParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#constrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void enterConstrained_array_definition(VHDLParser.Constrained_array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#constrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void exitConstrained_array_definition(VHDLParser.Constrained_array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#constrained_nature_definition}.
	 * @param ctx the parse tree
	 */
	void enterConstrained_nature_definition(VHDLParser.Constrained_nature_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#constrained_nature_definition}.
	 * @param ctx the parse tree
	 */
	void exitConstrained_nature_definition(VHDLParser.Constrained_nature_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(VHDLParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(VHDLParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void enterContext_clause(VHDLParser.Context_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void exitContext_clause(VHDLParser.Context_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#context_item}.
	 * @param ctx the parse tree
	 */
	void enterContext_item(VHDLParser.Context_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#context_item}.
	 * @param ctx the parse tree
	 */
	void exitContext_item(VHDLParser.Context_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#delay_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterDelay_mechanism(VHDLParser.Delay_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#delay_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitDelay_mechanism(VHDLParser.Delay_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#design_file}.
	 * @param ctx the parse tree
	 */
	void enterDesign_file(VHDLParser.Design_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#design_file}.
	 * @param ctx the parse tree
	 */
	void exitDesign_file(VHDLParser.Design_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#design_unit}.
	 * @param ctx the parse tree
	 */
	void enterDesign_unit(VHDLParser.Design_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#design_unit}.
	 * @param ctx the parse tree
	 */
	void exitDesign_unit(VHDLParser.Design_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(VHDLParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(VHDLParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(VHDLParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(VHDLParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#disconnection_specification}.
	 * @param ctx the parse tree
	 */
	void enterDisconnection_specification(VHDLParser.Disconnection_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#disconnection_specification}.
	 * @param ctx the parse tree
	 */
	void exitDisconnection_specification(VHDLParser.Disconnection_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#discrete_range}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_range(VHDLParser.Discrete_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#discrete_range}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_range(VHDLParser.Discrete_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#element_association}.
	 * @param ctx the parse tree
	 */
	void enterElement_association(VHDLParser.Element_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#element_association}.
	 * @param ctx the parse tree
	 */
	void exitElement_association(VHDLParser.Element_associationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#element_declaration}.
	 * @param ctx the parse tree
	 */
	void enterElement_declaration(VHDLParser.Element_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#element_declaration}.
	 * @param ctx the parse tree
	 */
	void exitElement_declaration(VHDLParser.Element_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#element_subnature_definition}.
	 * @param ctx the parse tree
	 */
	void enterElement_subnature_definition(VHDLParser.Element_subnature_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#element_subnature_definition}.
	 * @param ctx the parse tree
	 */
	void exitElement_subnature_definition(VHDLParser.Element_subnature_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#element_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void enterElement_subtype_definition(VHDLParser.Element_subtype_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#element_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void exitElement_subtype_definition(VHDLParser.Element_subtype_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_aspect}.
	 * @param ctx the parse tree
	 */
	void enterEntity_aspect(VHDLParser.Entity_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_aspect}.
	 * @param ctx the parse tree
	 */
	void exitEntity_aspect(VHDLParser.Entity_aspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_class}.
	 * @param ctx the parse tree
	 */
	void enterEntity_class(VHDLParser.Entity_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_class}.
	 * @param ctx the parse tree
	 */
	void exitEntity_class(VHDLParser.Entity_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_class_entry}.
	 * @param ctx the parse tree
	 */
	void enterEntity_class_entry(VHDLParser.Entity_class_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_class_entry}.
	 * @param ctx the parse tree
	 */
	void exitEntity_class_entry(VHDLParser.Entity_class_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_class_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterEntity_class_entry_list(VHDLParser.Entity_class_entry_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_class_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitEntity_class_entry_list(VHDLParser.Entity_class_entry_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEntity_declaration(VHDLParser.Entity_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEntity_declaration(VHDLParser.Entity_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterEntity_declarative_item(VHDLParser.Entity_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitEntity_declarative_item(VHDLParser.Entity_declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterEntity_declarative_part(VHDLParser.Entity_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitEntity_declarative_part(VHDLParser.Entity_declarative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_designator}.
	 * @param ctx the parse tree
	 */
	void enterEntity_designator(VHDLParser.Entity_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_designator}.
	 * @param ctx the parse tree
	 */
	void exitEntity_designator(VHDLParser.Entity_designatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_header}.
	 * @param ctx the parse tree
	 */
	void enterEntity_header(VHDLParser.Entity_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_header}.
	 * @param ctx the parse tree
	 */
	void exitEntity_header(VHDLParser.Entity_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_name_list}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_list(VHDLParser.Entity_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_name_list}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_list(VHDLParser.Entity_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_specification}.
	 * @param ctx the parse tree
	 */
	void enterEntity_specification(VHDLParser.Entity_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_specification}.
	 * @param ctx the parse tree
	 */
	void exitEntity_specification(VHDLParser.Entity_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_statement}.
	 * @param ctx the parse tree
	 */
	void enterEntity_statement(VHDLParser.Entity_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_statement}.
	 * @param ctx the parse tree
	 */
	void exitEntity_statement(VHDLParser.Entity_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterEntity_statement_part(VHDLParser.Entity_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitEntity_statement_part(VHDLParser.Entity_statement_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_tag}.
	 * @param ctx the parse tree
	 */
	void enterEntity_tag(VHDLParser.Entity_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_tag}.
	 * @param ctx the parse tree
	 */
	void exitEntity_tag(VHDLParser.Entity_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#enumeration_literal}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_literal(VHDLParser.Enumeration_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#enumeration_literal}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_literal(VHDLParser.Enumeration_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#enumeration_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_type_definition(VHDLParser.Enumeration_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#enumeration_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_type_definition(VHDLParser.Enumeration_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(VHDLParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(VHDLParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VHDLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VHDLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(VHDLParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(VHDLParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#file_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFile_declaration(VHDLParser.File_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#file_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFile_declaration(VHDLParser.File_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#file_logical_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_logical_name(VHDLParser.File_logical_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#file_logical_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_logical_name(VHDLParser.File_logical_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#file_open_information}.
	 * @param ctx the parse tree
	 */
	void enterFile_open_information(VHDLParser.File_open_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#file_open_information}.
	 * @param ctx the parse tree
	 */
	void exitFile_open_information(VHDLParser.File_open_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#file_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFile_type_definition(VHDLParser.File_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#file_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFile_type_definition(VHDLParser.File_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(VHDLParser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(VHDLParser.Formal_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#formal_part}.
	 * @param ctx the parse tree
	 */
	void enterFormal_part(VHDLParser.Formal_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#formal_part}.
	 * @param ctx the parse tree
	 */
	void exitFormal_part(VHDLParser.Formal_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#free_quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFree_quantity_declaration(VHDLParser.Free_quantity_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#free_quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFree_quantity_declaration(VHDLParser.Free_quantity_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#generate_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_statement(VHDLParser.Generate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#generate_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_statement(VHDLParser.Generate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#generation_scheme}.
	 * @param ctx the parse tree
	 */
	void enterGeneration_scheme(VHDLParser.Generation_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#generation_scheme}.
	 * @param ctx the parse tree
	 */
	void exitGeneration_scheme(VHDLParser.Generation_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#generic_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_clause(VHDLParser.Generic_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#generic_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_clause(VHDLParser.Generic_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#generic_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_list(VHDLParser.Generic_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#generic_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_list(VHDLParser.Generic_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#generic_map_aspect}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_map_aspect(VHDLParser.Generic_map_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#generic_map_aspect}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_map_aspect(VHDLParser.Generic_map_aspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#group_constituent}.
	 * @param ctx the parse tree
	 */
	void enterGroup_constituent(VHDLParser.Group_constituentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#group_constituent}.
	 * @param ctx the parse tree
	 */
	void exitGroup_constituent(VHDLParser.Group_constituentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#group_constituent_list}.
	 * @param ctx the parse tree
	 */
	void enterGroup_constituent_list(VHDLParser.Group_constituent_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#group_constituent_list}.
	 * @param ctx the parse tree
	 */
	void exitGroup_constituent_list(VHDLParser.Group_constituent_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#group_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGroup_declaration(VHDLParser.Group_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#group_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGroup_declaration(VHDLParser.Group_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#group_template_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGroup_template_declaration(VHDLParser.Group_template_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#group_template_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGroup_template_declaration(VHDLParser.Group_template_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#guarded_signal_specification}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_signal_specification(VHDLParser.Guarded_signal_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#guarded_signal_specification}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_signal_specification(VHDLParser.Guarded_signal_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(VHDLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(VHDLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(VHDLParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(VHDLParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(VHDLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(VHDLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void enterIndex_constraint(VHDLParser.Index_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void exitIndex_constraint(VHDLParser.Index_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#index_specification}.
	 * @param ctx the parse tree
	 */
	void enterIndex_specification(VHDLParser.Index_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#index_specification}.
	 * @param ctx the parse tree
	 */
	void exitIndex_specification(VHDLParser.Index_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#index_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void enterIndex_subtype_definition(VHDLParser.Index_subtype_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#index_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void exitIndex_subtype_definition(VHDLParser.Index_subtype_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#instantiated_unit}.
	 * @param ctx the parse tree
	 */
	void enterInstantiated_unit(VHDLParser.Instantiated_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#instantiated_unit}.
	 * @param ctx the parse tree
	 */
	void exitInstantiated_unit(VHDLParser.Instantiated_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#instantiation_list}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation_list(VHDLParser.Instantiation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#instantiation_list}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation_list(VHDLParser.Instantiation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_constant_declaration(VHDLParser.Interface_constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_constant_declaration(VHDLParser.Interface_constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration(VHDLParser.Interface_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration(VHDLParser.Interface_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_element}.
	 * @param ctx the parse tree
	 */
	void enterInterface_element(VHDLParser.Interface_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_element}.
	 * @param ctx the parse tree
	 */
	void exitInterface_element(VHDLParser.Interface_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_file_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_file_declaration(VHDLParser.Interface_file_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_file_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_file_declaration(VHDLParser.Interface_file_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_signal_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_signal_list(VHDLParser.Interface_signal_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_signal_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_signal_list(VHDLParser.Interface_signal_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_port_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_port_list(VHDLParser.Interface_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_port_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_port_list(VHDLParser.Interface_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_list(VHDLParser.Interface_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_list(VHDLParser.Interface_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_quantity_declaration(VHDLParser.Interface_quantity_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_quantity_declaration(VHDLParser.Interface_quantity_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_port_declaration(VHDLParser.Interface_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_port_declaration(VHDLParser.Interface_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_signal_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_signal_declaration(VHDLParser.Interface_signal_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_signal_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_signal_declaration(VHDLParser.Interface_signal_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_terminal_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_terminal_declaration(VHDLParser.Interface_terminal_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_terminal_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_terminal_declaration(VHDLParser.Interface_terminal_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_variable_declaration(VHDLParser.Interface_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_variable_declaration(VHDLParser.Interface_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#iteration_scheme}.
	 * @param ctx the parse tree
	 */
	void enterIteration_scheme(VHDLParser.Iteration_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#iteration_scheme}.
	 * @param ctx the parse tree
	 */
	void exitIteration_scheme(VHDLParser.Iteration_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#label_colon}.
	 * @param ctx the parse tree
	 */
	void enterLabel_colon(VHDLParser.Label_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#label_colon}.
	 * @param ctx the parse tree
	 */
	void exitLabel_colon(VHDLParser.Label_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#library_clause}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_clause(VHDLParser.Library_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#library_clause}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_clause(VHDLParser.Library_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#library_unit}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_unit(VHDLParser.Library_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#library_unit}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_unit(VHDLParser.Library_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(VHDLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(VHDLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#logical_name}.
	 * @param ctx the parse tree
	 */
	void enterLogical_name(VHDLParser.Logical_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#logical_name}.
	 * @param ctx the parse tree
	 */
	void exitLogical_name(VHDLParser.Logical_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#logical_name_list}.
	 * @param ctx the parse tree
	 */
	void enterLogical_name_list(VHDLParser.Logical_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#logical_name_list}.
	 * @param ctx the parse tree
	 */
	void exitLogical_name_list(VHDLParser.Logical_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(VHDLParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(VHDLParser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(VHDLParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(VHDLParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#signal_mode}.
	 * @param ctx the parse tree
	 */
	void enterSignal_mode(VHDLParser.Signal_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#signal_mode}.
	 * @param ctx the parse tree
	 */
	void exitSignal_mode(VHDLParser.Signal_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#multiplying_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplying_operator(VHDLParser.Multiplying_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#multiplying_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplying_operator(VHDLParser.Multiplying_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(VHDLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(VHDLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#name_part}.
	 * @param ctx the parse tree
	 */
	void enterName_part(VHDLParser.Name_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#name_part}.
	 * @param ctx the parse tree
	 */
	void exitName_part(VHDLParser.Name_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#selected_name}.
	 * @param ctx the parse tree
	 */
	void enterSelected_name(VHDLParser.Selected_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#selected_name}.
	 * @param ctx the parse tree
	 */
	void exitSelected_name(VHDLParser.Selected_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#selected_name_part}.
	 * @param ctx the parse tree
	 */
	void enterSelected_name_part(VHDLParser.Selected_name_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#selected_name_part}.
	 * @param ctx the parse tree
	 */
	void exitSelected_name_part(VHDLParser.Selected_name_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#function_call_or_indexed_name_part}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#function_call_or_indexed_name_part}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#slice_name_part}.
	 * @param ctx the parse tree
	 */
	void enterSlice_name_part(VHDLParser.Slice_name_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#slice_name_part}.
	 * @param ctx the parse tree
	 */
	void exitSlice_name_part(VHDLParser.Slice_name_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#attribute_name_part}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name_part(VHDLParser.Attribute_name_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#attribute_name_part}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name_part(VHDLParser.Attribute_name_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#nature_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNature_declaration(VHDLParser.Nature_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#nature_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNature_declaration(VHDLParser.Nature_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#nature_definition}.
	 * @param ctx the parse tree
	 */
	void enterNature_definition(VHDLParser.Nature_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#nature_definition}.
	 * @param ctx the parse tree
	 */
	void exitNature_definition(VHDLParser.Nature_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#nature_element_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNature_element_declaration(VHDLParser.Nature_element_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#nature_element_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNature_element_declaration(VHDLParser.Nature_element_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#next_statement}.
	 * @param ctx the parse tree
	 */
	void enterNext_statement(VHDLParser.Next_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#next_statement}.
	 * @param ctx the parse tree
	 */
	void exitNext_statement(VHDLParser.Next_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(VHDLParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(VHDLParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#object_declaration}.
	 * @param ctx the parse tree
	 */
	void enterObject_declaration(VHDLParser.Object_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#object_declaration}.
	 * @param ctx the parse tree
	 */
	void exitObject_declaration(VHDLParser.Object_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#opts}.
	 * @param ctx the parse tree
	 */
	void enterOpts(VHDLParser.OptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#opts}.
	 * @param ctx the parse tree
	 */
	void exitOpts(VHDLParser.OptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(VHDLParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(VHDLParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#package_body_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_declarative_item(VHDLParser.Package_body_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#package_body_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_declarative_item(VHDLParser.Package_body_declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#package_body_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_declarative_part(VHDLParser.Package_body_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#package_body_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_declarative_part(VHDLParser.Package_body_declarative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(VHDLParser.Package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(VHDLParser.Package_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#package_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declarative_item(VHDLParser.Package_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#package_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declarative_item(VHDLParser.Package_declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#package_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declarative_part(VHDLParser.Package_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#package_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declarative_part(VHDLParser.Package_declarative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void enterParameter_specification(VHDLParser.Parameter_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void exitParameter_specification(VHDLParser.Parameter_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#physical_literal}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_literal(VHDLParser.Physical_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#physical_literal}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_literal(VHDLParser.Physical_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#physical_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_type_definition(VHDLParser.Physical_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#physical_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_type_definition(VHDLParser.Physical_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#port_clause}.
	 * @param ctx the parse tree
	 */
	void enterPort_clause(VHDLParser.Port_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#port_clause}.
	 * @param ctx the parse tree
	 */
	void exitPort_clause(VHDLParser.Port_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#port_list}.
	 * @param ctx the parse tree
	 */
	void enterPort_list(VHDLParser.Port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#port_list}.
	 * @param ctx the parse tree
	 */
	void exitPort_list(VHDLParser.Port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#port_map_aspect}.
	 * @param ctx the parse tree
	 */
	void enterPort_map_aspect(VHDLParser.Port_map_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#port_map_aspect}.
	 * @param ctx the parse tree
	 */
	void exitPort_map_aspect(VHDLParser.Port_map_aspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(VHDLParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(VHDLParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#primary_unit}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_unit(VHDLParser.Primary_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#primary_unit}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_unit(VHDLParser.Primary_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#procedural_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_declarative_item(VHDLParser.Procedural_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#procedural_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_declarative_item(VHDLParser.Procedural_declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#procedural_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_declarative_part(VHDLParser.Procedural_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#procedural_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_declarative_part(VHDLParser.Procedural_declarative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#procedural_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_statement_part(VHDLParser.Procedural_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#procedural_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_statement_part(VHDLParser.Procedural_statement_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(VHDLParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(VHDLParser.Procedure_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call_statement(VHDLParser.Procedure_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call_statement(VHDLParser.Procedure_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#process_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterProcess_declarative_item(VHDLParser.Process_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#process_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitProcess_declarative_item(VHDLParser.Process_declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#process_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterProcess_declarative_part(VHDLParser.Process_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#process_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitProcess_declarative_part(VHDLParser.Process_declarative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#process_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcess_statement(VHDLParser.Process_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#process_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcess_statement(VHDLParser.Process_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#process_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterProcess_statement_part(VHDLParser.Process_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#process_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitProcess_statement_part(VHDLParser.Process_statement_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#qualified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQualified_expression(VHDLParser.Qualified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#qualified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQualified_expression(VHDLParser.Qualified_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void enterQuantity_declaration(VHDLParser.Quantity_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void exitQuantity_declaration(VHDLParser.Quantity_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#quantity_list}.
	 * @param ctx the parse tree
	 */
	void enterQuantity_list(VHDLParser.Quantity_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#quantity_list}.
	 * @param ctx the parse tree
	 */
	void exitQuantity_list(VHDLParser.Quantity_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#quantity_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuantity_specification(VHDLParser.Quantity_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#quantity_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuantity_specification(VHDLParser.Quantity_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#range_decl}.
	 * @param ctx the parse tree
	 */
	void enterRange_decl(VHDLParser.Range_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#range_decl}.
	 * @param ctx the parse tree
	 */
	void exitRange_decl(VHDLParser.Range_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#explicit_range}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_range(VHDLParser.Explicit_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#explicit_range}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_range(VHDLParser.Explicit_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#range_constraint}.
	 * @param ctx the parse tree
	 */
	void enterRange_constraint(VHDLParser.Range_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#range_constraint}.
	 * @param ctx the parse tree
	 */
	void exitRange_constraint(VHDLParser.Range_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#record_nature_definition}.
	 * @param ctx the parse tree
	 */
	void enterRecord_nature_definition(VHDLParser.Record_nature_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#record_nature_definition}.
	 * @param ctx the parse tree
	 */
	void exitRecord_nature_definition(VHDLParser.Record_nature_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_definition(VHDLParser.Record_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_definition(VHDLParser.Record_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(VHDLParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(VHDLParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(VHDLParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(VHDLParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#report_statement}.
	 * @param ctx the parse tree
	 */
	void enterReport_statement(VHDLParser.Report_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#report_statement}.
	 * @param ctx the parse tree
	 */
	void exitReport_statement(VHDLParser.Report_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(VHDLParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(VHDLParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#scalar_nature_definition}.
	 * @param ctx the parse tree
	 */
	void enterScalar_nature_definition(VHDLParser.Scalar_nature_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#scalar_nature_definition}.
	 * @param ctx the parse tree
	 */
	void exitScalar_nature_definition(VHDLParser.Scalar_nature_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#scalar_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterScalar_type_definition(VHDLParser.Scalar_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#scalar_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitScalar_type_definition(VHDLParser.Scalar_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#secondary_unit}.
	 * @param ctx the parse tree
	 */
	void enterSecondary_unit(VHDLParser.Secondary_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#secondary_unit}.
	 * @param ctx the parse tree
	 */
	void exitSecondary_unit(VHDLParser.Secondary_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#secondary_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSecondary_unit_declaration(VHDLParser.Secondary_unit_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#secondary_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSecondary_unit_declaration(VHDLParser.Secondary_unit_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#selected_signal_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSelected_signal_assignment(VHDLParser.Selected_signal_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#selected_signal_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSelected_signal_assignment(VHDLParser.Selected_signal_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#selected_waveforms}.
	 * @param ctx the parse tree
	 */
	void enterSelected_waveforms(VHDLParser.Selected_waveformsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#selected_waveforms}.
	 * @param ctx the parse tree
	 */
	void exitSelected_waveforms(VHDLParser.Selected_waveformsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#sensitivity_clause}.
	 * @param ctx the parse tree
	 */
	void enterSensitivity_clause(VHDLParser.Sensitivity_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#sensitivity_clause}.
	 * @param ctx the parse tree
	 */
	void exitSensitivity_clause(VHDLParser.Sensitivity_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#sensitivity_list}.
	 * @param ctx the parse tree
	 */
	void enterSensitivity_list(VHDLParser.Sensitivity_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#sensitivity_list}.
	 * @param ctx the parse tree
	 */
	void exitSensitivity_list(VHDLParser.Sensitivity_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#sequence_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSequence_of_statements(VHDLParser.Sequence_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#sequence_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSequence_of_statements(VHDLParser.Sequence_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#sequential_statement}.
	 * @param ctx the parse tree
	 */
	void enterSequential_statement(VHDLParser.Sequential_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#sequential_statement}.
	 * @param ctx the parse tree
	 */
	void exitSequential_statement(VHDLParser.Sequential_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(VHDLParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(VHDLParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void enterShift_operator(VHDLParser.Shift_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void exitShift_operator(VHDLParser.Shift_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#signal_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#signal_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#signal_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSignal_declaration(VHDLParser.Signal_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#signal_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSignal_declaration(VHDLParser.Signal_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#signal_kind}.
	 * @param ctx the parse tree
	 */
	void enterSignal_kind(VHDLParser.Signal_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#signal_kind}.
	 * @param ctx the parse tree
	 */
	void exitSignal_kind(VHDLParser.Signal_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#signal_list}.
	 * @param ctx the parse tree
	 */
	void enterSignal_list(VHDLParser.Signal_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#signal_list}.
	 * @param ctx the parse tree
	 */
	void exitSignal_list(VHDLParser.Signal_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(VHDLParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(VHDLParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(VHDLParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(VHDLParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#simple_simultaneous_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_simultaneous_statement(VHDLParser.Simple_simultaneous_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#simple_simultaneous_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_simultaneous_statement(VHDLParser.Simple_simultaneous_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#simultaneous_alternative}.
	 * @param ctx the parse tree
	 */
	void enterSimultaneous_alternative(VHDLParser.Simultaneous_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#simultaneous_alternative}.
	 * @param ctx the parse tree
	 */
	void exitSimultaneous_alternative(VHDLParser.Simultaneous_alternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#simultaneous_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimultaneous_case_statement(VHDLParser.Simultaneous_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#simultaneous_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimultaneous_case_statement(VHDLParser.Simultaneous_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#simultaneous_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimultaneous_if_statement(VHDLParser.Simultaneous_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#simultaneous_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimultaneous_if_statement(VHDLParser.Simultaneous_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#simultaneous_procedural_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimultaneous_procedural_statement(VHDLParser.Simultaneous_procedural_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#simultaneous_procedural_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimultaneous_procedural_statement(VHDLParser.Simultaneous_procedural_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#simultaneous_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimultaneous_statement(VHDLParser.Simultaneous_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#simultaneous_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimultaneous_statement(VHDLParser.Simultaneous_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#simultaneous_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterSimultaneous_statement_part(VHDLParser.Simultaneous_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#simultaneous_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitSimultaneous_statement_part(VHDLParser.Simultaneous_statement_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#source_aspect}.
	 * @param ctx the parse tree
	 */
	void enterSource_aspect(VHDLParser.Source_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#source_aspect}.
	 * @param ctx the parse tree
	 */
	void exitSource_aspect(VHDLParser.Source_aspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#source_quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSource_quantity_declaration(VHDLParser.Source_quantity_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#source_quantity_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSource_quantity_declaration(VHDLParser.Source_quantity_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#step_limit_specification}.
	 * @param ctx the parse tree
	 */
	void enterStep_limit_specification(VHDLParser.Step_limit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#step_limit_specification}.
	 * @param ctx the parse tree
	 */
	void exitStep_limit_specification(VHDLParser.Step_limit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subnature_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubnature_declaration(VHDLParser.Subnature_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subnature_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubnature_declaration(VHDLParser.Subnature_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subnature_indication}.
	 * @param ctx the parse tree
	 */
	void enterSubnature_indication(VHDLParser.Subnature_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subnature_indication}.
	 * @param ctx the parse tree
	 */
	void exitSubnature_indication(VHDLParser.Subnature_indicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subprogram_body}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_body(VHDLParser.Subprogram_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subprogram_body}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_body(VHDLParser.Subprogram_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_declaration(VHDLParser.Subprogram_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_declaration(VHDLParser.Subprogram_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subprogram_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_declarative_item(VHDLParser.Subprogram_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subprogram_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_declarative_item(VHDLParser.Subprogram_declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subprogram_declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_declarative_part(VHDLParser.Subprogram_declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subprogram_declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_declarative_part(VHDLParser.Subprogram_declarative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subprogram_kind}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_kind(VHDLParser.Subprogram_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subprogram_kind}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_kind(VHDLParser.Subprogram_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subprogram_specification}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_specification(VHDLParser.Subprogram_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subprogram_specification}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_specification(VHDLParser.Subprogram_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#procedure_specification}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_specification(VHDLParser.Procedure_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#procedure_specification}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_specification(VHDLParser.Procedure_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#function_specification}.
	 * @param ctx the parse tree
	 */
	void enterFunction_specification(VHDLParser.Function_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#function_specification}.
	 * @param ctx the parse tree
	 */
	void exitFunction_specification(VHDLParser.Function_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subprogram_statement_part}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_statement_part(VHDLParser.Subprogram_statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subprogram_statement_part}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_statement_part(VHDLParser.Subprogram_statement_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(VHDLParser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(VHDLParser.Subtype_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#subtype_indication}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_indication(VHDLParser.Subtype_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#subtype_indication}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_indication(VHDLParser.Subtype_indicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffix(VHDLParser.SuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffix(VHDLParser.SuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(VHDLParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(VHDLParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(VHDLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(VHDLParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#terminal_aspect}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_aspect(VHDLParser.Terminal_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#terminal_aspect}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_aspect(VHDLParser.Terminal_aspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#terminal_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_declaration(VHDLParser.Terminal_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#terminal_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_declaration(VHDLParser.Terminal_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#through_aspect}.
	 * @param ctx the parse tree
	 */
	void enterThrough_aspect(VHDLParser.Through_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#through_aspect}.
	 * @param ctx the parse tree
	 */
	void exitThrough_aspect(VHDLParser.Through_aspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#timeout_clause}.
	 * @param ctx the parse tree
	 */
	void enterTimeout_clause(VHDLParser.Timeout_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#timeout_clause}.
	 * @param ctx the parse tree
	 */
	void exitTimeout_clause(VHDLParser.Timeout_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#tolerance_aspect}.
	 * @param ctx the parse tree
	 */
	void enterTolerance_aspect(VHDLParser.Tolerance_aspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#tolerance_aspect}.
	 * @param ctx the parse tree
	 */
	void exitTolerance_aspect(VHDLParser.Tolerance_aspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(VHDLParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(VHDLParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(VHDLParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(VHDLParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#unconstrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void enterUnconstrained_array_definition(VHDLParser.Unconstrained_array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#unconstrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void exitUnconstrained_array_definition(VHDLParser.Unconstrained_array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#unconstrained_nature_definition}.
	 * @param ctx the parse tree
	 */
	void enterUnconstrained_nature_definition(VHDLParser.Unconstrained_nature_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#unconstrained_nature_definition}.
	 * @param ctx the parse tree
	 */
	void exitUnconstrained_nature_definition(VHDLParser.Unconstrained_nature_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void enterUse_clause(VHDLParser.Use_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void exitUse_clause(VHDLParser.Use_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#variable_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment_statement(VHDLParser.Variable_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#variable_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment_statement(VHDLParser.Variable_assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(VHDLParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(VHDLParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void enterWait_statement(VHDLParser.Wait_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void exitWait_statement(VHDLParser.Wait_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#waveform}.
	 * @param ctx the parse tree
	 */
	void enterWaveform(VHDLParser.WaveformContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#waveform}.
	 * @param ctx the parse tree
	 */
	void exitWaveform(VHDLParser.WaveformContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#waveform_element}.
	 * @param ctx the parse tree
	 */
	void enterWaveform_element(VHDLParser.Waveform_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#waveform_element}.
	 * @param ctx the parse tree
	 */
	void exitWaveform_element(VHDLParser.Waveform_elementContext ctx);
}