// Generated from de/vhdl/grammar/VHDLParser.g4 by ANTLR 4.13.2
package de.vhdl.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VHDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABS=1, ACCESS=2, ACROSS=3, AFTER=4, ALIAS=5, ALL=6, AND=7, ARCHITECTURE=8, 
		ARRAY=9, ASSERT=10, ATTRIBUTE=11, BEGIN=12, BLOCK=13, BODY=14, BREAK=15, 
		BUFFER=16, BUS=17, CASE=18, COMPONENT=19, CONFIGURATION=20, CONSTANT=21, 
		DISCONNECT=22, DOWNTO=23, END=24, ENTITY=25, ELSE=26, ELSIF=27, EXIT=28, 
		FILE=29, FOR=30, FUNCTION=31, GENERATE=32, GENERIC=33, GROUP=34, GUARDED=35, 
		IF=36, IMPURE=37, IN=38, INERTIAL=39, INOUT=40, IS=41, LABEL=42, LIBRARY=43, 
		LIMIT=44, LINKAGE=45, LITERAL=46, LOOP=47, MAP=48, MOD=49, NAND=50, NATURE=51, 
		NEW=52, NEXT=53, NOISE=54, NOR=55, NOT=56, NULL_=57, OF=58, ON=59, OPEN=60, 
		OR=61, OTHERS=62, OUT=63, PACKAGE=64, PORT=65, POSTPONED=66, PROCESS=67, 
		PROCEDURE=68, PROCEDURAL=69, PURE=70, QUANTITY=71, RANGE=72, REVERSE_RANGE=73, 
		REJECT=74, REM=75, RECORD=76, REFERENCE=77, REGISTER=78, REPORT=79, RETURN=80, 
		ROL=81, ROR=82, SELECT=83, SEVERITY=84, SHARED=85, SIGNAL=86, SLA=87, 
		SLL=88, SPECTRUM=89, SRA=90, SRL=91, SUBNATURE=92, SUBTYPE=93, TERMINAL=94, 
		THEN=95, THROUGH=96, TO=97, TOLERANCE=98, TRANSPORT=99, TYPE=100, UNAFFECTED=101, 
		UNITS=102, UNTIL=103, USE=104, VARIABLE=105, WAIT=106, WITH=107, WHEN=108, 
		WHILE=109, XNOR=110, XOR=111, BASE_LITERAL=112, BIT_STRING_LITERAL=113, 
		BIT_STRING_LITERAL_BINARY=114, BIT_STRING_LITERAL_OCTAL=115, BIT_STRING_LITERAL_HEX=116, 
		REAL_LITERAL=117, BASIC_IDENTIFIER=118, EXTENDED_IDENTIFIER=119, LETTER=120, 
		COMMENT=121, BLOCK_COMMENT=122, TAB=123, SPACE=124, NEWLINE=125, CR=126, 
		CHARACTER_LITERAL=127, STRING_LITERAL=128, OTHER_SPECIAL_CHARACTER=129, 
		DOUBLESTAR=130, ASSIGN=131, LE=132, GE=133, ARROW=134, NEQ=135, VARASGN=136, 
		BOX=137, DBLQUOTE=138, SEMI=139, COMMA=140, AMPERSAND=141, LPAREN=142, 
		RPAREN=143, LBRACKET=144, RBRACKET=145, COLON=146, MUL=147, DIV=148, PLUS=149, 
		MINUS=150, LOWERTHAN=151, GREATERTHAN=152, EQ=153, BAR=154, DOT=155, BACKSLASH=156, 
		EXPONENT=157, HEXDIGIT=158, INTEGER=159, DIGIT=160, BASED_INTEGER=161, 
		EXTENDED_DIGIT=162, APOSTROPHE=163;
	public static final int
		RULE_abstract_literal = 0, RULE_access_type_definition = 1, RULE_across_aspect = 2, 
		RULE_actual_designator = 3, RULE_actual_parameter_part = 4, RULE_actual_part = 5, 
		RULE_adding_operator = 6, RULE_aggregate = 7, RULE_alias_declaration = 8, 
		RULE_alias_designator = 9, RULE_alias_indication = 10, RULE_allocator = 11, 
		RULE_architecture_body = 12, RULE_architecture_declarative_part = 13, 
		RULE_architecture_statement = 14, RULE_architecture_statement_part = 15, 
		RULE_array_nature_definition = 16, RULE_array_type_definition = 17, RULE_assertion = 18, 
		RULE_assertion_statement = 19, RULE_association_element = 20, RULE_association_list = 21, 
		RULE_attribute_declaration = 22, RULE_attribute_designator = 23, RULE_attribute_specification = 24, 
		RULE_base_unit_declaration = 25, RULE_binding_indication = 26, RULE_block_configuration = 27, 
		RULE_block_declarative_item = 28, RULE_block_declarative_part = 29, RULE_block_header = 30, 
		RULE_block_specification = 31, RULE_block_statement = 32, RULE_block_statement_part = 33, 
		RULE_branch_quantity_declaration = 34, RULE_break_element = 35, RULE_break_list = 36, 
		RULE_break_selector_clause = 37, RULE_break_statement = 38, RULE_case_statement = 39, 
		RULE_case_statement_alternative = 40, RULE_choice = 41, RULE_choices = 42, 
		RULE_component_configuration = 43, RULE_component_declaration = 44, RULE_component_instantiation_statement = 45, 
		RULE_component_specification = 46, RULE_composite_nature_definition = 47, 
		RULE_composite_type_definition = 48, RULE_concurrent_assertion_statement = 49, 
		RULE_concurrent_break_statement = 50, RULE_concurrent_procedure_call_statement = 51, 
		RULE_concurrent_signal_assignment_statement = 52, RULE_condition = 53, 
		RULE_condition_clause = 54, RULE_conditional_signal_assignment = 55, RULE_conditional_waveforms = 56, 
		RULE_configuration_declaration = 57, RULE_configuration_declarative_item = 58, 
		RULE_configuration_declarative_part = 59, RULE_configuration_item = 60, 
		RULE_configuration_specification = 61, RULE_constant_declaration = 62, 
		RULE_constrained_array_definition = 63, RULE_constrained_nature_definition = 64, 
		RULE_constraint = 65, RULE_context_clause = 66, RULE_context_item = 67, 
		RULE_delay_mechanism = 68, RULE_design_file = 69, RULE_design_unit = 70, 
		RULE_designator = 71, RULE_direction = 72, RULE_disconnection_specification = 73, 
		RULE_discrete_range = 74, RULE_element_association = 75, RULE_element_declaration = 76, 
		RULE_element_subnature_definition = 77, RULE_element_subtype_definition = 78, 
		RULE_entity_aspect = 79, RULE_entity_class = 80, RULE_entity_class_entry = 81, 
		RULE_entity_class_entry_list = 82, RULE_entity_declaration = 83, RULE_entity_declarative_item = 84, 
		RULE_entity_declarative_part = 85, RULE_entity_designator = 86, RULE_entity_header = 87, 
		RULE_entity_name_list = 88, RULE_entity_specification = 89, RULE_entity_statement = 90, 
		RULE_entity_statement_part = 91, RULE_entity_tag = 92, RULE_enumeration_literal = 93, 
		RULE_enumeration_type_definition = 94, RULE_exit_statement = 95, RULE_expression = 96, 
		RULE_factor = 97, RULE_file_declaration = 98, RULE_file_logical_name = 99, 
		RULE_file_open_information = 100, RULE_file_type_definition = 101, RULE_formal_parameter_list = 102, 
		RULE_formal_part = 103, RULE_free_quantity_declaration = 104, RULE_generate_statement = 105, 
		RULE_generation_scheme = 106, RULE_generic_clause = 107, RULE_generic_list = 108, 
		RULE_generic_map_aspect = 109, RULE_group_constituent = 110, RULE_group_constituent_list = 111, 
		RULE_group_declaration = 112, RULE_group_template_declaration = 113, RULE_guarded_signal_specification = 114, 
		RULE_identifier = 115, RULE_identifier_list = 116, RULE_if_statement = 117, 
		RULE_index_constraint = 118, RULE_index_specification = 119, RULE_index_subtype_definition = 120, 
		RULE_instantiated_unit = 121, RULE_instantiation_list = 122, RULE_interface_constant_declaration = 123, 
		RULE_interface_declaration = 124, RULE_interface_element = 125, RULE_interface_file_declaration = 126, 
		RULE_interface_signal_list = 127, RULE_interface_port_list = 128, RULE_interface_list = 129, 
		RULE_interface_quantity_declaration = 130, RULE_interface_port_declaration = 131, 
		RULE_interface_signal_declaration = 132, RULE_interface_terminal_declaration = 133, 
		RULE_interface_variable_declaration = 134, RULE_iteration_scheme = 135, 
		RULE_label_colon = 136, RULE_library_clause = 137, RULE_library_unit = 138, 
		RULE_literal = 139, RULE_logical_name = 140, RULE_logical_name_list = 141, 
		RULE_logical_operator = 142, RULE_loop_statement = 143, RULE_signal_mode = 144, 
		RULE_multiplying_operator = 145, RULE_name = 146, RULE_name_part = 147, 
		RULE_selected_name = 148, RULE_selected_name_part = 149, RULE_function_call_or_indexed_name_part = 150, 
		RULE_slice_name_part = 151, RULE_attribute_name_part = 152, RULE_nature_declaration = 153, 
		RULE_nature_definition = 154, RULE_nature_element_declaration = 155, RULE_next_statement = 156, 
		RULE_numeric_literal = 157, RULE_object_declaration = 158, RULE_opts = 159, 
		RULE_package_body = 160, RULE_package_body_declarative_item = 161, RULE_package_body_declarative_part = 162, 
		RULE_package_declaration = 163, RULE_package_declarative_item = 164, RULE_package_declarative_part = 165, 
		RULE_parameter_specification = 166, RULE_physical_literal = 167, RULE_physical_type_definition = 168, 
		RULE_port_clause = 169, RULE_port_list = 170, RULE_port_map_aspect = 171, 
		RULE_primary = 172, RULE_primary_unit = 173, RULE_procedural_declarative_item = 174, 
		RULE_procedural_declarative_part = 175, RULE_procedural_statement_part = 176, 
		RULE_procedure_call = 177, RULE_procedure_call_statement = 178, RULE_process_declarative_item = 179, 
		RULE_process_declarative_part = 180, RULE_process_statement = 181, RULE_process_statement_part = 182, 
		RULE_qualified_expression = 183, RULE_quantity_declaration = 184, RULE_quantity_list = 185, 
		RULE_quantity_specification = 186, RULE_range_decl = 187, RULE_explicit_range = 188, 
		RULE_range_constraint = 189, RULE_record_nature_definition = 190, RULE_record_type_definition = 191, 
		RULE_relation = 192, RULE_relational_operator = 193, RULE_report_statement = 194, 
		RULE_return_statement = 195, RULE_scalar_nature_definition = 196, RULE_scalar_type_definition = 197, 
		RULE_secondary_unit = 198, RULE_secondary_unit_declaration = 199, RULE_selected_signal_assignment = 200, 
		RULE_selected_waveforms = 201, RULE_sensitivity_clause = 202, RULE_sensitivity_list = 203, 
		RULE_sequence_of_statements = 204, RULE_sequential_statement = 205, RULE_shift_expression = 206, 
		RULE_shift_operator = 207, RULE_signal_assignment_statement = 208, RULE_signal_declaration = 209, 
		RULE_signal_kind = 210, RULE_signal_list = 211, RULE_signature = 212, 
		RULE_simple_expression = 213, RULE_simple_simultaneous_statement = 214, 
		RULE_simultaneous_alternative = 215, RULE_simultaneous_case_statement = 216, 
		RULE_simultaneous_if_statement = 217, RULE_simultaneous_procedural_statement = 218, 
		RULE_simultaneous_statement = 219, RULE_simultaneous_statement_part = 220, 
		RULE_source_aspect = 221, RULE_source_quantity_declaration = 222, RULE_step_limit_specification = 223, 
		RULE_subnature_declaration = 224, RULE_subnature_indication = 225, RULE_subprogram_body = 226, 
		RULE_subprogram_declaration = 227, RULE_subprogram_declarative_item = 228, 
		RULE_subprogram_declarative_part = 229, RULE_subprogram_kind = 230, RULE_subprogram_specification = 231, 
		RULE_procedure_specification = 232, RULE_function_specification = 233, 
		RULE_subprogram_statement_part = 234, RULE_subtype_declaration = 235, 
		RULE_subtype_indication = 236, RULE_suffix = 237, RULE_target = 238, RULE_term = 239, 
		RULE_terminal_aspect = 240, RULE_terminal_declaration = 241, RULE_through_aspect = 242, 
		RULE_timeout_clause = 243, RULE_tolerance_aspect = 244, RULE_type_declaration = 245, 
		RULE_type_definition = 246, RULE_unconstrained_array_definition = 247, 
		RULE_unconstrained_nature_definition = 248, RULE_use_clause = 249, RULE_variable_assignment_statement = 250, 
		RULE_variable_declaration = 251, RULE_wait_statement = 252, RULE_waveform = 253, 
		RULE_waveform_element = 254;
	private static String[] makeRuleNames() {
		return new String[] {
			"abstract_literal", "access_type_definition", "across_aspect", "actual_designator", 
			"actual_parameter_part", "actual_part", "adding_operator", "aggregate", 
			"alias_declaration", "alias_designator", "alias_indication", "allocator", 
			"architecture_body", "architecture_declarative_part", "architecture_statement", 
			"architecture_statement_part", "array_nature_definition", "array_type_definition", 
			"assertion", "assertion_statement", "association_element", "association_list", 
			"attribute_declaration", "attribute_designator", "attribute_specification", 
			"base_unit_declaration", "binding_indication", "block_configuration", 
			"block_declarative_item", "block_declarative_part", "block_header", "block_specification", 
			"block_statement", "block_statement_part", "branch_quantity_declaration", 
			"break_element", "break_list", "break_selector_clause", "break_statement", 
			"case_statement", "case_statement_alternative", "choice", "choices", 
			"component_configuration", "component_declaration", "component_instantiation_statement", 
			"component_specification", "composite_nature_definition", "composite_type_definition", 
			"concurrent_assertion_statement", "concurrent_break_statement", "concurrent_procedure_call_statement", 
			"concurrent_signal_assignment_statement", "condition", "condition_clause", 
			"conditional_signal_assignment", "conditional_waveforms", "configuration_declaration", 
			"configuration_declarative_item", "configuration_declarative_part", "configuration_item", 
			"configuration_specification", "constant_declaration", "constrained_array_definition", 
			"constrained_nature_definition", "constraint", "context_clause", "context_item", 
			"delay_mechanism", "design_file", "design_unit", "designator", "direction", 
			"disconnection_specification", "discrete_range", "element_association", 
			"element_declaration", "element_subnature_definition", "element_subtype_definition", 
			"entity_aspect", "entity_class", "entity_class_entry", "entity_class_entry_list", 
			"entity_declaration", "entity_declarative_item", "entity_declarative_part", 
			"entity_designator", "entity_header", "entity_name_list", "entity_specification", 
			"entity_statement", "entity_statement_part", "entity_tag", "enumeration_literal", 
			"enumeration_type_definition", "exit_statement", "expression", "factor", 
			"file_declaration", "file_logical_name", "file_open_information", "file_type_definition", 
			"formal_parameter_list", "formal_part", "free_quantity_declaration", 
			"generate_statement", "generation_scheme", "generic_clause", "generic_list", 
			"generic_map_aspect", "group_constituent", "group_constituent_list", 
			"group_declaration", "group_template_declaration", "guarded_signal_specification", 
			"identifier", "identifier_list", "if_statement", "index_constraint", 
			"index_specification", "index_subtype_definition", "instantiated_unit", 
			"instantiation_list", "interface_constant_declaration", "interface_declaration", 
			"interface_element", "interface_file_declaration", "interface_signal_list", 
			"interface_port_list", "interface_list", "interface_quantity_declaration", 
			"interface_port_declaration", "interface_signal_declaration", "interface_terminal_declaration", 
			"interface_variable_declaration", "iteration_scheme", "label_colon", 
			"library_clause", "library_unit", "literal", "logical_name", "logical_name_list", 
			"logical_operator", "loop_statement", "signal_mode", "multiplying_operator", 
			"name", "name_part", "selected_name", "selected_name_part", "function_call_or_indexed_name_part", 
			"slice_name_part", "attribute_name_part", "nature_declaration", "nature_definition", 
			"nature_element_declaration", "next_statement", "numeric_literal", "object_declaration", 
			"opts", "package_body", "package_body_declarative_item", "package_body_declarative_part", 
			"package_declaration", "package_declarative_item", "package_declarative_part", 
			"parameter_specification", "physical_literal", "physical_type_definition", 
			"port_clause", "port_list", "port_map_aspect", "primary", "primary_unit", 
			"procedural_declarative_item", "procedural_declarative_part", "procedural_statement_part", 
			"procedure_call", "procedure_call_statement", "process_declarative_item", 
			"process_declarative_part", "process_statement", "process_statement_part", 
			"qualified_expression", "quantity_declaration", "quantity_list", "quantity_specification", 
			"range_decl", "explicit_range", "range_constraint", "record_nature_definition", 
			"record_type_definition", "relation", "relational_operator", "report_statement", 
			"return_statement", "scalar_nature_definition", "scalar_type_definition", 
			"secondary_unit", "secondary_unit_declaration", "selected_signal_assignment", 
			"selected_waveforms", "sensitivity_clause", "sensitivity_list", "sequence_of_statements", 
			"sequential_statement", "shift_expression", "shift_operator", "signal_assignment_statement", 
			"signal_declaration", "signal_kind", "signal_list", "signature", "simple_expression", 
			"simple_simultaneous_statement", "simultaneous_alternative", "simultaneous_case_statement", 
			"simultaneous_if_statement", "simultaneous_procedural_statement", "simultaneous_statement", 
			"simultaneous_statement_part", "source_aspect", "source_quantity_declaration", 
			"step_limit_specification", "subnature_declaration", "subnature_indication", 
			"subprogram_body", "subprogram_declaration", "subprogram_declarative_item", 
			"subprogram_declarative_part", "subprogram_kind", "subprogram_specification", 
			"procedure_specification", "function_specification", "subprogram_statement_part", 
			"subtype_declaration", "subtype_indication", "suffix", "target", "term", 
			"terminal_aspect", "terminal_declaration", "through_aspect", "timeout_clause", 
			"tolerance_aspect", "type_declaration", "type_definition", "unconstrained_array_definition", 
			"unconstrained_nature_definition", "use_clause", "variable_assignment_statement", 
			"variable_declaration", "wait_statement", "waveform", "waveform_element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'\\n'", "'\\r'", null, null, null, "'**'", 
			"'=='", "'<='", "'>='", "'=>'", "'/='", "':='", "'<>'", "'\"'", "';'", 
			"','", "'&'", "'('", "')'", "'['", "']'", "':'", "'*'", "'/'", "'+'", 
			"'-'", "'<'", "'>'", "'='", "'|'", "'.'", "'\\'", null, null, null, null, 
			null, null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABS", "ACCESS", "ACROSS", "AFTER", "ALIAS", "ALL", "AND", "ARCHITECTURE", 
			"ARRAY", "ASSERT", "ATTRIBUTE", "BEGIN", "BLOCK", "BODY", "BREAK", "BUFFER", 
			"BUS", "CASE", "COMPONENT", "CONFIGURATION", "CONSTANT", "DISCONNECT", 
			"DOWNTO", "END", "ENTITY", "ELSE", "ELSIF", "EXIT", "FILE", "FOR", "FUNCTION", 
			"GENERATE", "GENERIC", "GROUP", "GUARDED", "IF", "IMPURE", "IN", "INERTIAL", 
			"INOUT", "IS", "LABEL", "LIBRARY", "LIMIT", "LINKAGE", "LITERAL", "LOOP", 
			"MAP", "MOD", "NAND", "NATURE", "NEW", "NEXT", "NOISE", "NOR", "NOT", 
			"NULL_", "OF", "ON", "OPEN", "OR", "OTHERS", "OUT", "PACKAGE", "PORT", 
			"POSTPONED", "PROCESS", "PROCEDURE", "PROCEDURAL", "PURE", "QUANTITY", 
			"RANGE", "REVERSE_RANGE", "REJECT", "REM", "RECORD", "REFERENCE", "REGISTER", 
			"REPORT", "RETURN", "ROL", "ROR", "SELECT", "SEVERITY", "SHARED", "SIGNAL", 
			"SLA", "SLL", "SPECTRUM", "SRA", "SRL", "SUBNATURE", "SUBTYPE", "TERMINAL", 
			"THEN", "THROUGH", "TO", "TOLERANCE", "TRANSPORT", "TYPE", "UNAFFECTED", 
			"UNITS", "UNTIL", "USE", "VARIABLE", "WAIT", "WITH", "WHEN", "WHILE", 
			"XNOR", "XOR", "BASE_LITERAL", "BIT_STRING_LITERAL", "BIT_STRING_LITERAL_BINARY", 
			"BIT_STRING_LITERAL_OCTAL", "BIT_STRING_LITERAL_HEX", "REAL_LITERAL", 
			"BASIC_IDENTIFIER", "EXTENDED_IDENTIFIER", "LETTER", "COMMENT", "BLOCK_COMMENT", 
			"TAB", "SPACE", "NEWLINE", "CR", "CHARACTER_LITERAL", "STRING_LITERAL", 
			"OTHER_SPECIAL_CHARACTER", "DOUBLESTAR", "ASSIGN", "LE", "GE", "ARROW", 
			"NEQ", "VARASGN", "BOX", "DBLQUOTE", "SEMI", "COMMA", "AMPERSAND", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "COLON", "MUL", "DIV", "PLUS", "MINUS", 
			"LOWERTHAN", "GREATERTHAN", "EQ", "BAR", "DOT", "BACKSLASH", "EXPONENT", 
			"HEXDIGIT", "INTEGER", "DIGIT", "BASED_INTEGER", "EXTENDED_DIGIT", "APOSTROPHE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VHDLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VHDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Abstract_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(VHDLParser.INTEGER, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(VHDLParser.REAL_LITERAL, 0); }
		public TerminalNode BASE_LITERAL() { return getToken(VHDLParser.BASE_LITERAL, 0); }
		public Abstract_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAbstract_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAbstract_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAbstract_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abstract_literalContext abstract_literal() throws RecognitionException {
		Abstract_literalContext _localctx = new Abstract_literalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abstract_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 140737488355361L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Access_type_definitionContext extends ParserRuleContext {
		public TerminalNode ACCESS() { return getToken(VHDLParser.ACCESS, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Access_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAccess_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAccess_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAccess_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_type_definitionContext access_type_definition() throws RecognitionException {
		Access_type_definitionContext _localctx = new Access_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_access_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(ACCESS);
			setState(513);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Across_aspectContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode ACROSS() { return getToken(VHDLParser.ACROSS, 0); }
		public Tolerance_aspectContext tolerance_aspect() {
			return getRuleContext(Tolerance_aspectContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Across_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_across_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAcross_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAcross_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAcross_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Across_aspectContext across_aspect() throws RecognitionException {
		Across_aspectContext _localctx = new Across_aspectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_across_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			identifier_list();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOLERANCE) {
				{
				setState(516);
				tolerance_aspect();
				}
			}

			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(519);
				match(VARASGN);
				setState(520);
				expression();
				}
			}

			setState(523);
			match(ACROSS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Actual_designatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(VHDLParser.OPEN, 0); }
		public Actual_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterActual_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitActual_designator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitActual_designator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_designatorContext actual_designator() throws RecognitionException {
		Actual_designatorContext _localctx = new Actual_designatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actual_designator);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
			case NEW:
			case NOT:
			case NULL_:
			case BASE_LITERAL:
			case BIT_STRING_LITERAL:
			case REAL_LITERAL:
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case LPAREN:
			case PLUS:
			case MINUS:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				expression();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(OPEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Actual_parameter_partContext extends ParserRuleContext {
		public Association_listContext association_list() {
			return getRuleContext(Association_listContext.class,0);
		}
		public Actual_parameter_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterActual_parameter_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitActual_parameter_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitActual_parameter_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_parameter_partContext actual_parameter_part() throws RecognitionException {
		Actual_parameter_partContext _localctx = new Actual_parameter_partContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actual_parameter_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			association_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Actual_partContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Actual_designatorContext actual_designator() {
			return getRuleContext(Actual_designatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Actual_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterActual_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitActual_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitActual_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_partContext actual_part() throws RecognitionException {
		Actual_partContext _localctx = new Actual_partContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_actual_part);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				name();
				setState(532);
				match(LPAREN);
				setState(533);
				actual_designator();
				setState(534);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				actual_designator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Adding_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(VHDLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VHDLParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(VHDLParser.AMPERSAND, 0); }
		public Adding_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adding_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAdding_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAdding_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAdding_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adding_operatorContext adding_operator() throws RecognitionException {
		Adding_operatorContext _localctx = new Adding_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_adding_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_la = _input.LA(1);
			if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & 769L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public List<Element_associationContext> element_association() {
			return getRuleContexts(Element_associationContext.class);
		}
		public Element_associationContext element_association(int i) {
			return getRuleContext(Element_associationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAggregate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAggregate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(LPAREN);
			setState(542);
			element_association();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(543);
				match(COMMA);
				setState(544);
				element_association();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alias_declarationContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(VHDLParser.ALIAS, 0); }
		public Alias_designatorContext alias_designator() {
			return getRuleContext(Alias_designatorContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Alias_indicationContext alias_indication() {
			return getRuleContext(Alias_indicationContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Alias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAlias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAlias_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAlias_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_declarationContext alias_declaration() throws RecognitionException {
		Alias_declarationContext _localctx = new Alias_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alias_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(ALIAS);
			setState(553);
			alias_designator();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(554);
				match(COLON);
				setState(555);
				alias_indication();
				}
			}

			setState(558);
			match(IS);
			setState(559);
			name();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(560);
				signature();
				}
			}

			setState(563);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alias_designatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHARACTER_LITERAL() { return getToken(VHDLParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(VHDLParser.STRING_LITERAL, 0); }
		public Alias_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAlias_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAlias_designator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAlias_designator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_designatorContext alias_designator() throws RecognitionException {
		Alias_designatorContext _localctx = new Alias_designatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alias_designator);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				identifier();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(CHARACTER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alias_indicationContext extends ParserRuleContext {
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Alias_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAlias_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAlias_indication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAlias_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_indicationContext alias_indication() throws RecognitionException {
		Alias_indicationContext _localctx = new Alias_indicationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alias_indication);
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				subnature_indication();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				subtype_indication();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllocatorContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(VHDLParser.NEW, 0); }
		public Qualified_expressionContext qualified_expression() {
			return getRuleContext(Qualified_expressionContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public AllocatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAllocator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAllocator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAllocator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllocatorContext allocator() throws RecognitionException {
		AllocatorContext _localctx = new AllocatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_allocator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(NEW);
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(575);
				qualified_expression();
				}
				break;
			case 2:
				{
				setState(576);
				subtype_indication();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Architecture_bodyContext extends ParserRuleContext {
		public List<TerminalNode> ARCHITECTURE() { return getTokens(VHDLParser.ARCHITECTURE); }
		public TerminalNode ARCHITECTURE(int i) {
			return getToken(VHDLParser.ARCHITECTURE, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OF() { return getToken(VHDLParser.OF, 0); }
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Architecture_declarative_partContext architecture_declarative_part() {
			return getRuleContext(Architecture_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(VHDLParser.BEGIN, 0); }
		public Architecture_statement_partContext architecture_statement_part() {
			return getRuleContext(Architecture_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Architecture_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterArchitecture_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitArchitecture_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitArchitecture_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Architecture_bodyContext architecture_body() throws RecognitionException {
		Architecture_bodyContext _localctx = new Architecture_bodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_architecture_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(ARCHITECTURE);
			setState(580);
			identifier();
			setState(581);
			match(OF);
			setState(582);
			identifier();
			setState(583);
			match(IS);
			setState(584);
			architecture_declarative_part();
			setState(585);
			match(BEGIN);
			setState(586);
			architecture_statement_part();
			setState(587);
			match(END);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARCHITECTURE) {
				{
				setState(588);
				match(ARCHITECTURE);
				}
			}

			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(591);
				identifier();
				}
			}

			setState(594);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Architecture_declarative_partContext extends ParserRuleContext {
		public List<Block_declarative_itemContext> block_declarative_item() {
			return getRuleContexts(Block_declarative_itemContext.class);
		}
		public Block_declarative_itemContext block_declarative_item(int i) {
			return getRuleContext(Block_declarative_itemContext.class,i);
		}
		public Architecture_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterArchitecture_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitArchitecture_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitArchitecture_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Architecture_declarative_partContext architecture_declarative_part() throws RecognitionException {
		Architecture_declarative_partContext _localctx = new Architecture_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_architecture_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269550383466528L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210571231245L) != 0)) {
				{
				{
				setState(596);
				block_declarative_item();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Architecture_statementContext extends ParserRuleContext {
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Process_statementContext process_statement() {
			return getRuleContext(Process_statementContext.class,0);
		}
		public Concurrent_procedure_call_statementContext concurrent_procedure_call_statement() {
			return getRuleContext(Concurrent_procedure_call_statementContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Concurrent_assertion_statementContext concurrent_assertion_statement() {
			return getRuleContext(Concurrent_assertion_statementContext.class,0);
		}
		public Concurrent_signal_assignment_statementContext concurrent_signal_assignment_statement() {
			return getRuleContext(Concurrent_signal_assignment_statementContext.class,0);
		}
		public TerminalNode POSTPONED() { return getToken(VHDLParser.POSTPONED, 0); }
		public Component_instantiation_statementContext component_instantiation_statement() {
			return getRuleContext(Component_instantiation_statementContext.class,0);
		}
		public Generate_statementContext generate_statement() {
			return getRuleContext(Generate_statementContext.class,0);
		}
		public Concurrent_break_statementContext concurrent_break_statement() {
			return getRuleContext(Concurrent_break_statementContext.class,0);
		}
		public Simultaneous_statementContext simultaneous_statement() {
			return getRuleContext(Simultaneous_statementContext.class,0);
		}
		public Architecture_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterArchitecture_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitArchitecture_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitArchitecture_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Architecture_statementContext architecture_statement() throws RecognitionException {
		Architecture_statementContext _localctx = new Architecture_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_architecture_statement);
		try {
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				block_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				process_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(604);
					label_colon();
					}
					break;
				}
				setState(607);
				concurrent_procedure_call_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(608);
					label_colon();
					}
					break;
				}
				setState(611);
				concurrent_assertion_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(612);
					label_colon();
					}
					break;
				}
				setState(616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(615);
					match(POSTPONED);
					}
					break;
				}
				setState(618);
				concurrent_signal_assignment_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(619);
				component_instantiation_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(620);
				generate_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(621);
				concurrent_break_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(622);
				simultaneous_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Architecture_statement_partContext extends ParserRuleContext {
		public List<Architecture_statementContext> architecture_statement() {
			return getRuleContexts(Architecture_statementContext.class);
		}
		public Architecture_statementContext architecture_statement(int i) {
			return getRuleContext(Architecture_statementContext.class,i);
		}
		public Architecture_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterArchitecture_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitArchitecture_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitArchitecture_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Architecture_statement_partContext architecture_statement_part() throws RecognitionException {
		Architecture_statement_partContext _localctx = new Architecture_statement_partContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_architecture_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220676450460926978L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 6933504931592667147L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 131457L) != 0)) {
				{
				{
				setState(625);
				architecture_statement();
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_nature_definitionContext extends ParserRuleContext {
		public Unconstrained_nature_definitionContext unconstrained_nature_definition() {
			return getRuleContext(Unconstrained_nature_definitionContext.class,0);
		}
		public Constrained_nature_definitionContext constrained_nature_definition() {
			return getRuleContext(Constrained_nature_definitionContext.class,0);
		}
		public Array_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterArray_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitArray_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitArray_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_nature_definitionContext array_nature_definition() throws RecognitionException {
		Array_nature_definitionContext _localctx = new Array_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_nature_definition);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				unconstrained_nature_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				constrained_nature_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_type_definitionContext extends ParserRuleContext {
		public Unconstrained_array_definitionContext unconstrained_array_definition() {
			return getRuleContext(Unconstrained_array_definitionContext.class,0);
		}
		public Constrained_array_definitionContext constrained_array_definition() {
			return getRuleContext(Constrained_array_definitionContext.class,0);
		}
		public Array_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterArray_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitArray_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitArray_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_type_definitionContext array_type_definition() throws RecognitionException {
		Array_type_definitionContext _localctx = new Array_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_type_definition);
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				unconstrained_array_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				constrained_array_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(VHDLParser.ASSERT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode REPORT() { return getToken(VHDLParser.REPORT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEVERITY() { return getToken(VHDLParser.SEVERITY, 0); }
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(ASSERT);
			setState(640);
			condition();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(641);
				match(REPORT);
				setState(642);
				expression();
				}
			}

			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEVERITY) {
				{
				setState(645);
				match(SEVERITY);
				setState(646);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assertion_statementContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Assertion_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAssertion_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAssertion_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAssertion_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assertion_statementContext assertion_statement() throws RecognitionException {
		Assertion_statementContext _localctx = new Assertion_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assertion_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(649);
				label_colon();
				}
			}

			setState(652);
			assertion();
			setState(653);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Association_elementContext extends ParserRuleContext {
		public Actual_partContext actual_part() {
			return getRuleContext(Actual_partContext.class,0);
		}
		public Formal_partContext formal_part() {
			return getRuleContext(Formal_partContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(VHDLParser.ARROW, 0); }
		public Association_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAssociation_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAssociation_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAssociation_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Association_elementContext association_element() throws RecognitionException {
		Association_elementContext _localctx = new Association_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_association_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(655);
				formal_part();
				setState(656);
				match(ARROW);
				}
				break;
			}
			setState(660);
			actual_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Association_listContext extends ParserRuleContext {
		public List<Association_elementContext> association_element() {
			return getRuleContexts(Association_elementContext.class);
		}
		public Association_elementContext association_element(int i) {
			return getRuleContext(Association_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Association_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAssociation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAssociation_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAssociation_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Association_listContext association_list() throws RecognitionException {
		Association_listContext _localctx = new Association_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_association_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			association_element();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(663);
				match(COMMA);
				setState(664);
				association_element();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_declarationContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(VHDLParser.ATTRIBUTE, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAttribute_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAttribute_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attribute_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(ATTRIBUTE);
			setState(671);
			label_colon();
			setState(672);
			name();
			setState(673);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_designatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(VHDLParser.RANGE, 0); }
		public TerminalNode REVERSE_RANGE() { return getToken(VHDLParser.REVERSE_RANGE, 0); }
		public TerminalNode ACROSS() { return getToken(VHDLParser.ACROSS, 0); }
		public TerminalNode THROUGH() { return getToken(VHDLParser.THROUGH, 0); }
		public TerminalNode REFERENCE() { return getToken(VHDLParser.REFERENCE, 0); }
		public TerminalNode TOLERANCE() { return getToken(VHDLParser.TOLERANCE, 0); }
		public Attribute_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAttribute_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAttribute_designator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAttribute_designator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_designatorContext attribute_designator() throws RecognitionException {
		Attribute_designatorContext _localctx = new Attribute_designatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attribute_designator);
		try {
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				identifier();
				}
				break;
			case RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(RANGE);
				}
				break;
			case REVERSE_RANGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				match(REVERSE_RANGE);
				}
				break;
			case ACROSS:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				match(ACROSS);
				}
				break;
			case THROUGH:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				match(THROUGH);
				}
				break;
			case REFERENCE:
				enterOuterAlt(_localctx, 6);
				{
				setState(680);
				match(REFERENCE);
				}
				break;
			case TOLERANCE:
				enterOuterAlt(_localctx, 7);
				{
				setState(681);
				match(TOLERANCE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_specificationContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(VHDLParser.ATTRIBUTE, 0); }
		public Attribute_designatorContext attribute_designator() {
			return getRuleContext(Attribute_designatorContext.class,0);
		}
		public TerminalNode OF() { return getToken(VHDLParser.OF, 0); }
		public Entity_specificationContext entity_specification() {
			return getRuleContext(Entity_specificationContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Attribute_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAttribute_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAttribute_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAttribute_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_specificationContext attribute_specification() throws RecognitionException {
		Attribute_specificationContext _localctx = new Attribute_specificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attribute_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(ATTRIBUTE);
			setState(685);
			attribute_designator();
			setState(686);
			match(OF);
			setState(687);
			entity_specification();
			setState(688);
			match(IS);
			setState(689);
			expression();
			setState(690);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_unit_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Base_unit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_unit_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBase_unit_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBase_unit_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBase_unit_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_unit_declarationContext base_unit_declaration() throws RecognitionException {
		Base_unit_declarationContext _localctx = new Base_unit_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_base_unit_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			identifier();
			setState(693);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binding_indicationContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(VHDLParser.USE, 0); }
		public Entity_aspectContext entity_aspect() {
			return getRuleContext(Entity_aspectContext.class,0);
		}
		public Generic_map_aspectContext generic_map_aspect() {
			return getRuleContext(Generic_map_aspectContext.class,0);
		}
		public Port_map_aspectContext port_map_aspect() {
			return getRuleContext(Port_map_aspectContext.class,0);
		}
		public Binding_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBinding_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBinding_indication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBinding_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binding_indicationContext binding_indication() throws RecognitionException {
		Binding_indicationContext _localctx = new Binding_indicationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_binding_indication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USE) {
				{
				setState(695);
				match(USE);
				setState(696);
				entity_aspect();
				}
			}

			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(699);
				generic_map_aspect();
				}
			}

			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(702);
				port_map_aspect();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_configurationContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(VHDLParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(VHDLParser.FOR, i);
		}
		public Block_specificationContext block_specification() {
			return getRuleContext(Block_specificationContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public List<Use_clauseContext> use_clause() {
			return getRuleContexts(Use_clauseContext.class);
		}
		public Use_clauseContext use_clause(int i) {
			return getRuleContext(Use_clauseContext.class,i);
		}
		public List<Configuration_itemContext> configuration_item() {
			return getRuleContexts(Configuration_itemContext.class);
		}
		public Configuration_itemContext configuration_item(int i) {
			return getRuleContext(Configuration_itemContext.class,i);
		}
		public Block_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBlock_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBlock_configuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBlock_configuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_configurationContext block_configuration() throws RecognitionException {
		Block_configurationContext _localctx = new Block_configurationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(FOR);
			setState(706);
			block_specification();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USE) {
				{
				{
				setState(707);
				use_clause();
				}
				}
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOR) {
				{
				{
				setState(713);
				configuration_item();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			match(END);
			setState(720);
			match(FOR);
			setState(721);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Component_declarationContext component_declaration() {
			return getRuleContext(Component_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Configuration_specificationContext configuration_specification() {
			return getRuleContext(Configuration_specificationContext.class,0);
		}
		public Disconnection_specificationContext disconnection_specification() {
			return getRuleContext(Disconnection_specificationContext.class,0);
		}
		public Step_limit_specificationContext step_limit_specification() {
			return getRuleContext(Step_limit_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Nature_declarationContext nature_declaration() {
			return getRuleContext(Nature_declarationContext.class,0);
		}
		public Subnature_declarationContext subnature_declaration() {
			return getRuleContext(Subnature_declarationContext.class,0);
		}
		public Quantity_declarationContext quantity_declaration() {
			return getRuleContext(Quantity_declarationContext.class,0);
		}
		public Terminal_declarationContext terminal_declaration() {
			return getRuleContext(Terminal_declarationContext.class,0);
		}
		public Block_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBlock_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBlock_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBlock_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_declarative_itemContext block_declarative_item() throws RecognitionException {
		Block_declarative_itemContext _localctx = new Block_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block_declarative_item);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(727);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(728);
				signal_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(729);
				variable_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(730);
				file_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(731);
				alias_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(732);
				component_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(733);
				attribute_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(734);
				attribute_specification();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(735);
				configuration_specification();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(736);
				disconnection_specification();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(737);
				step_limit_specification();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(738);
				use_clause();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(739);
				group_template_declaration();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(740);
				group_declaration();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(741);
				nature_declaration();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(742);
				subnature_declaration();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(743);
				quantity_declaration();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(744);
				terminal_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_declarative_partContext extends ParserRuleContext {
		public List<Block_declarative_itemContext> block_declarative_item() {
			return getRuleContexts(Block_declarative_itemContext.class);
		}
		public Block_declarative_itemContext block_declarative_item(int i) {
			return getRuleContext(Block_declarative_itemContext.class,i);
		}
		public Block_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBlock_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBlock_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBlock_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_declarative_partContext block_declarative_part() throws RecognitionException {
		Block_declarative_partContext _localctx = new Block_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269550383466528L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210571231245L) != 0)) {
				{
				{
				setState(747);
				block_declarative_item();
				}
				}
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_headerContext extends ParserRuleContext {
		public Generic_clauseContext generic_clause() {
			return getRuleContext(Generic_clauseContext.class,0);
		}
		public Port_clauseContext port_clause() {
			return getRuleContext(Port_clauseContext.class,0);
		}
		public Generic_map_aspectContext generic_map_aspect() {
			return getRuleContext(Generic_map_aspectContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(VHDLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VHDLParser.SEMI, i);
		}
		public Port_map_aspectContext port_map_aspect() {
			return getRuleContext(Port_map_aspectContext.class,0);
		}
		public Block_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBlock_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBlock_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBlock_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_headerContext block_header() throws RecognitionException {
		Block_headerContext _localctx = new Block_headerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(753);
				generic_clause();
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERIC) {
					{
					setState(754);
					generic_map_aspect();
					setState(755);
					match(SEMI);
					}
				}

				}
			}

			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(761);
				port_clause();
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PORT) {
					{
					setState(762);
					port_map_aspect();
					setState(763);
					match(SEMI);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_specificationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Index_specificationContext index_specification() {
			return getRuleContext(Index_specificationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Block_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBlock_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBlock_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBlock_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_specificationContext block_specification() throws RecognitionException {
		Block_specificationContext _localctx = new Block_specificationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block_specification);
		int _la;
		try {
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				identifier();
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(770);
					match(LPAREN);
					setState(771);
					index_specification();
					setState(772);
					match(RPAREN);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_statementContext extends ParserRuleContext {
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<TerminalNode> BLOCK() { return getTokens(VHDLParser.BLOCK); }
		public TerminalNode BLOCK(int i) {
			return getToken(VHDLParser.BLOCK, i);
		}
		public Block_headerContext block_header() {
			return getRuleContext(Block_headerContext.class,0);
		}
		public Block_declarative_partContext block_declarative_part() {
			return getRuleContext(Block_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(VHDLParser.BEGIN, 0); }
		public Block_statement_partContext block_statement_part() {
			return getRuleContext(Block_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			label_colon();
			setState(780);
			match(BLOCK);
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(781);
				match(LPAREN);
				setState(782);
				expression();
				setState(783);
				match(RPAREN);
				}
			}

			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(787);
				match(IS);
				}
			}

			setState(790);
			block_header();
			setState(791);
			block_declarative_part();
			setState(792);
			match(BEGIN);
			setState(793);
			block_statement_part();
			setState(794);
			match(END);
			setState(795);
			match(BLOCK);
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(796);
				identifier();
				}
			}

			setState(799);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_statement_partContext extends ParserRuleContext {
		public List<Architecture_statementContext> architecture_statement() {
			return getRuleContexts(Architecture_statementContext.class);
		}
		public Architecture_statementContext architecture_statement(int i) {
			return getRuleContext(Architecture_statementContext.class,i);
		}
		public Block_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBlock_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBlock_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBlock_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statement_partContext block_statement_part() throws RecognitionException {
		Block_statement_partContext _localctx = new Block_statement_partContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220676450460926978L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 6933504931592667147L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 131457L) != 0)) {
				{
				{
				setState(801);
				architecture_statement();
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Branch_quantity_declarationContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(VHDLParser.QUANTITY, 0); }
		public Terminal_aspectContext terminal_aspect() {
			return getRuleContext(Terminal_aspectContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Across_aspectContext across_aspect() {
			return getRuleContext(Across_aspectContext.class,0);
		}
		public Through_aspectContext through_aspect() {
			return getRuleContext(Through_aspectContext.class,0);
		}
		public Branch_quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBranch_quantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBranch_quantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBranch_quantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_quantity_declarationContext branch_quantity_declaration() throws RecognitionException {
		Branch_quantity_declarationContext _localctx = new Branch_quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_branch_quantity_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(QUANTITY);
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(808);
				across_aspect();
				}
				break;
			}
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(811);
				through_aspect();
				}
				break;
			}
			setState(814);
			terminal_aspect();
			setState(815);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_elementContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(VHDLParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Break_selector_clauseContext break_selector_clause() {
			return getRuleContext(Break_selector_clauseContext.class,0);
		}
		public Break_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBreak_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBreak_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBreak_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_elementContext break_element() throws RecognitionException {
		Break_elementContext _localctx = new Break_elementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_break_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(817);
				break_selector_clause();
				}
			}

			setState(820);
			name();
			setState(821);
			match(ARROW);
			setState(822);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_listContext extends ParserRuleContext {
		public List<Break_elementContext> break_element() {
			return getRuleContexts(Break_elementContext.class);
		}
		public Break_elementContext break_element(int i) {
			return getRuleContext(Break_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Break_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBreak_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBreak_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBreak_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_listContext break_list() throws RecognitionException {
		Break_listContext _localctx = new Break_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_break_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			break_element();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(825);
				match(COMMA);
				setState(826);
				break_element();
				}
				}
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_selector_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VHDLParser.FOR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode USE() { return getToken(VHDLParser.USE, 0); }
		public Break_selector_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_selector_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBreak_selector_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBreak_selector_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBreak_selector_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_selector_clauseContext break_selector_clause() throws RecognitionException {
		Break_selector_clauseContext _localctx = new Break_selector_clauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_break_selector_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(FOR);
			setState(833);
			name();
			setState(834);
			match(USE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(VHDLParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Break_listContext break_list() {
			return getRuleContext(Break_listContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(VHDLParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_break_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(836);
				label_colon();
				}
			}

			setState(839);
			match(BREAK);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 1027L) != 0)) {
				{
				setState(840);
				break_list();
				}
			}

			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(843);
				match(WHEN);
				setState(844);
				condition();
				}
			}

			setState(847);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_statementContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(VHDLParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(VHDLParser.CASE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<Case_statement_alternativeContext> case_statement_alternative() {
			return getRuleContexts(Case_statement_alternativeContext.class);
		}
		public Case_statement_alternativeContext case_statement_alternative(int i) {
			return getRuleContext(Case_statement_alternativeContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitCase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitCase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(849);
				label_colon();
				}
			}

			setState(852);
			match(CASE);
			setState(853);
			expression();
			setState(854);
			match(IS);
			setState(856); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(855);
				case_statement_alternative();
				}
				}
				setState(858); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(860);
			match(END);
			setState(861);
			match(CASE);
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(862);
				identifier();
				}
			}

			setState(865);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_statement_alternativeContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(VHDLParser.WHEN, 0); }
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(VHDLParser.ARROW, 0); }
		public Sequence_of_statementsContext sequence_of_statements() {
			return getRuleContext(Sequence_of_statementsContext.class,0);
		}
		public Case_statement_alternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterCase_statement_alternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitCase_statement_alternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitCase_statement_alternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statement_alternativeContext case_statement_alternative() throws RecognitionException {
		Case_statement_alternativeContext _localctx = new Case_statement_alternativeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_case_statement_alternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(WHEN);
			setState(868);
			choices();
			setState(869);
			match(ARROW);
			setState(870);
			sequence_of_statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChoiceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode OTHERS() { return getToken(VHDLParser.OTHERS, 0); }
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_choice);
		try {
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				discrete_range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(874);
				simple_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(875);
				match(OTHERS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChoicesContext extends ParserRuleContext {
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(VHDLParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(VHDLParser.BAR, i);
		}
		public ChoicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterChoices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitChoices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitChoices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoicesContext choices() throws RecognitionException {
		ChoicesContext _localctx = new ChoicesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			choice();
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(879);
				match(BAR);
				setState(880);
				choice();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_configurationContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(VHDLParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(VHDLParser.FOR, i);
		}
		public Component_specificationContext component_specification() {
			return getRuleContext(Component_specificationContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(VHDLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VHDLParser.SEMI, i);
		}
		public Binding_indicationContext binding_indication() {
			return getRuleContext(Binding_indicationContext.class,0);
		}
		public Block_configurationContext block_configuration() {
			return getRuleContext(Block_configurationContext.class,0);
		}
		public Component_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterComponent_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitComponent_configuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitComponent_configuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_configurationContext component_configuration() throws RecognitionException {
		Component_configurationContext _localctx = new Component_configurationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_component_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(FOR);
			setState(887);
			component_specification();
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERIC || _la==PORT || _la==USE || _la==SEMI) {
				{
				setState(888);
				binding_indication();
				setState(889);
				match(SEMI);
				}
			}

			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(893);
				block_configuration();
				}
			}

			setState(896);
			match(END);
			setState(897);
			match(FOR);
			setState(898);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_declarationContext extends ParserRuleContext {
		public List<TerminalNode> COMPONENT() { return getTokens(VHDLParser.COMPONENT); }
		public TerminalNode COMPONENT(int i) {
			return getToken(VHDLParser.COMPONENT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Generic_clauseContext generic_clause() {
			return getRuleContext(Generic_clauseContext.class,0);
		}
		public Port_clauseContext port_clause() {
			return getRuleContext(Port_clauseContext.class,0);
		}
		public Component_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterComponent_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitComponent_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitComponent_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_declarationContext component_declaration() throws RecognitionException {
		Component_declarationContext _localctx = new Component_declarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_component_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(COMPONENT);
			setState(901);
			identifier();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(902);
				match(IS);
				}
			}

			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(905);
				generic_clause();
				}
			}

			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(908);
				port_clause();
				}
			}

			setState(911);
			match(END);
			setState(912);
			match(COMPONENT);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(913);
				identifier();
				}
			}

			setState(916);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_instantiation_statementContext extends ParserRuleContext {
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Instantiated_unitContext instantiated_unit() {
			return getRuleContext(Instantiated_unitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Generic_map_aspectContext generic_map_aspect() {
			return getRuleContext(Generic_map_aspectContext.class,0);
		}
		public Port_map_aspectContext port_map_aspect() {
			return getRuleContext(Port_map_aspectContext.class,0);
		}
		public Component_instantiation_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_instantiation_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterComponent_instantiation_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitComponent_instantiation_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitComponent_instantiation_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_instantiation_statementContext component_instantiation_statement() throws RecognitionException {
		Component_instantiation_statementContext _localctx = new Component_instantiation_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_component_instantiation_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			label_colon();
			setState(919);
			instantiated_unit();
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(920);
				generic_map_aspect();
				}
			}

			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(923);
				port_map_aspect();
				}
			}

			setState(926);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_specificationContext extends ParserRuleContext {
		public Instantiation_listContext instantiation_list() {
			return getRuleContext(Instantiation_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Component_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterComponent_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitComponent_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitComponent_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_specificationContext component_specification() throws RecognitionException {
		Component_specificationContext _localctx = new Component_specificationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_component_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			instantiation_list();
			setState(929);
			match(COLON);
			setState(930);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Composite_nature_definitionContext extends ParserRuleContext {
		public Array_nature_definitionContext array_nature_definition() {
			return getRuleContext(Array_nature_definitionContext.class,0);
		}
		public Record_nature_definitionContext record_nature_definition() {
			return getRuleContext(Record_nature_definitionContext.class,0);
		}
		public Composite_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterComposite_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitComposite_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitComposite_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composite_nature_definitionContext composite_nature_definition() throws RecognitionException {
		Composite_nature_definitionContext _localctx = new Composite_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_composite_nature_definition);
		try {
			setState(934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				array_nature_definition();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				record_nature_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Composite_type_definitionContext extends ParserRuleContext {
		public Array_type_definitionContext array_type_definition() {
			return getRuleContext(Array_type_definitionContext.class,0);
		}
		public Record_type_definitionContext record_type_definition() {
			return getRuleContext(Record_type_definitionContext.class,0);
		}
		public Composite_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterComposite_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitComposite_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitComposite_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composite_type_definitionContext composite_type_definition() throws RecognitionException {
		Composite_type_definitionContext _localctx = new Composite_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_composite_type_definition);
		try {
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				array_type_definition();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				record_type_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Concurrent_assertion_statementContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode POSTPONED() { return getToken(VHDLParser.POSTPONED, 0); }
		public Concurrent_assertion_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_assertion_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConcurrent_assertion_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConcurrent_assertion_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConcurrent_assertion_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_assertion_statementContext concurrent_assertion_statement() throws RecognitionException {
		Concurrent_assertion_statementContext _localctx = new Concurrent_assertion_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_concurrent_assertion_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(940);
				label_colon();
				}
			}

			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(943);
				match(POSTPONED);
				}
			}

			setState(946);
			assertion();
			setState(947);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Concurrent_break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(VHDLParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Break_listContext break_list() {
			return getRuleContext(Break_listContext.class,0);
		}
		public Sensitivity_clauseContext sensitivity_clause() {
			return getRuleContext(Sensitivity_clauseContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(VHDLParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Concurrent_break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConcurrent_break_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConcurrent_break_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConcurrent_break_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_break_statementContext concurrent_break_statement() throws RecognitionException {
		Concurrent_break_statementContext _localctx = new Concurrent_break_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_concurrent_break_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(949);
				label_colon();
				}
			}

			setState(952);
			match(BREAK);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 1027L) != 0)) {
				{
				setState(953);
				break_list();
				}
			}

			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(956);
				sensitivity_clause();
				}
			}

			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(959);
				match(WHEN);
				setState(960);
				condition();
				}
			}

			setState(963);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Concurrent_procedure_call_statementContext extends ParserRuleContext {
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode POSTPONED() { return getToken(VHDLParser.POSTPONED, 0); }
		public Concurrent_procedure_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_procedure_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConcurrent_procedure_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConcurrent_procedure_call_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConcurrent_procedure_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_procedure_call_statementContext concurrent_procedure_call_statement() throws RecognitionException {
		Concurrent_procedure_call_statementContext _localctx = new Concurrent_procedure_call_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_concurrent_procedure_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(965);
				label_colon();
				}
				break;
			}
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(968);
				match(POSTPONED);
				}
			}

			setState(971);
			procedure_call();
			setState(972);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Concurrent_signal_assignment_statementContext extends ParserRuleContext {
		public Conditional_signal_assignmentContext conditional_signal_assignment() {
			return getRuleContext(Conditional_signal_assignmentContext.class,0);
		}
		public Selected_signal_assignmentContext selected_signal_assignment() {
			return getRuleContext(Selected_signal_assignmentContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode POSTPONED() { return getToken(VHDLParser.POSTPONED, 0); }
		public Concurrent_signal_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_signal_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConcurrent_signal_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConcurrent_signal_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConcurrent_signal_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_signal_assignment_statementContext concurrent_signal_assignment_statement() throws RecognitionException {
		Concurrent_signal_assignment_statementContext _localctx = new Concurrent_signal_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_concurrent_signal_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(974);
				label_colon();
				}
				break;
			}
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(977);
				match(POSTPONED);
				}
			}

			setState(982);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
			case LPAREN:
				{
				setState(980);
				conditional_signal_assignment();
				}
				break;
			case WITH:
				{
				setState(981);
				selected_signal_assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_clauseContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(VHDLParser.UNTIL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Condition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterCondition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitCondition_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitCondition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_clauseContext condition_clause() throws RecognitionException {
		Condition_clauseContext _localctx = new Condition_clauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_condition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(UNTIL);
			setState(987);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_signal_assignmentContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode LE() { return getToken(VHDLParser.LE, 0); }
		public OptsContext opts() {
			return getRuleContext(OptsContext.class,0);
		}
		public Conditional_waveformsContext conditional_waveforms() {
			return getRuleContext(Conditional_waveformsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Conditional_signal_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_signal_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConditional_signal_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConditional_signal_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConditional_signal_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_signal_assignmentContext conditional_signal_assignment() throws RecognitionException {
		Conditional_signal_assignmentContext _localctx = new Conditional_signal_assignmentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_conditional_signal_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			target();
			setState(990);
			match(LE);
			setState(991);
			opts();
			setState(992);
			conditional_waveforms();
			setState(993);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_waveformsContext extends ParserRuleContext {
		public WaveformContext waveform() {
			return getRuleContext(WaveformContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(VHDLParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(VHDLParser.ELSE, 0); }
		public Conditional_waveformsContext conditional_waveforms() {
			return getRuleContext(Conditional_waveformsContext.class,0);
		}
		public Conditional_waveformsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_waveforms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConditional_waveforms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConditional_waveforms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConditional_waveforms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_waveformsContext conditional_waveforms() throws RecognitionException {
		Conditional_waveformsContext _localctx = new Conditional_waveformsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_conditional_waveforms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			waveform();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(996);
				match(WHEN);
				setState(997);
				condition();
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(998);
					match(ELSE);
					setState(999);
					conditional_waveforms();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Configuration_declarationContext extends ParserRuleContext {
		public List<TerminalNode> CONFIGURATION() { return getTokens(VHDLParser.CONFIGURATION); }
		public TerminalNode CONFIGURATION(int i) {
			return getToken(VHDLParser.CONFIGURATION, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OF() { return getToken(VHDLParser.OF, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Configuration_declarative_partContext configuration_declarative_part() {
			return getRuleContext(Configuration_declarative_partContext.class,0);
		}
		public Block_configurationContext block_configuration() {
			return getRuleContext(Block_configurationContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Configuration_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConfiguration_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConfiguration_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConfiguration_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_declarationContext configuration_declaration() throws RecognitionException {
		Configuration_declarationContext _localctx = new Configuration_declarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_configuration_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(CONFIGURATION);
			setState(1005);
			identifier();
			setState(1006);
			match(OF);
			setState(1007);
			name();
			setState(1008);
			match(IS);
			setState(1009);
			configuration_declarative_part();
			setState(1010);
			block_configuration();
			setState(1011);
			match(END);
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(1012);
				match(CONFIGURATION);
				}
			}

			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1015);
				identifier();
				}
			}

			setState(1018);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Configuration_declarative_itemContext extends ParserRuleContext {
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Configuration_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConfiguration_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConfiguration_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConfiguration_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_declarative_itemContext configuration_declarative_item() throws RecognitionException {
		Configuration_declarative_itemContext _localctx = new Configuration_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_configuration_declarative_item);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				use_clause();
				}
				break;
			case ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				attribute_specification();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1022);
				group_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Configuration_declarative_partContext extends ParserRuleContext {
		public List<Configuration_declarative_itemContext> configuration_declarative_item() {
			return getRuleContexts(Configuration_declarative_itemContext.class);
		}
		public Configuration_declarative_itemContext configuration_declarative_item(int i) {
			return getRuleContext(Configuration_declarative_itemContext.class,i);
		}
		public Configuration_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConfiguration_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConfiguration_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConfiguration_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_declarative_partContext configuration_declarative_part() throws RecognitionException {
		Configuration_declarative_partContext _localctx = new Configuration_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_configuration_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE || _la==GROUP || _la==USE) {
				{
				{
				setState(1025);
				configuration_declarative_item();
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Configuration_itemContext extends ParserRuleContext {
		public Block_configurationContext block_configuration() {
			return getRuleContext(Block_configurationContext.class,0);
		}
		public Component_configurationContext component_configuration() {
			return getRuleContext(Component_configurationContext.class,0);
		}
		public Configuration_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConfiguration_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConfiguration_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConfiguration_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_itemContext configuration_item() throws RecognitionException {
		Configuration_itemContext _localctx = new Configuration_itemContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_configuration_item);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031);
				block_configuration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032);
				component_configuration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Configuration_specificationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VHDLParser.FOR, 0); }
		public Component_specificationContext component_specification() {
			return getRuleContext(Component_specificationContext.class,0);
		}
		public Binding_indicationContext binding_indication() {
			return getRuleContext(Binding_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Configuration_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConfiguration_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConfiguration_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConfiguration_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_specificationContext configuration_specification() throws RecognitionException {
		Configuration_specificationContext _localctx = new Configuration_specificationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_configuration_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(FOR);
			setState(1036);
			component_specification();
			setState(1037);
			binding_indication();
			setState(1038);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(VHDLParser.CONSTANT, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(CONSTANT);
			setState(1041);
			identifier_list();
			setState(1042);
			match(COLON);
			setState(1043);
			subtype_indication();
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1044);
				match(VARASGN);
				setState(1045);
				expression();
				}
			}

			setState(1048);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constrained_array_definitionContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(VHDLParser.ARRAY, 0); }
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public TerminalNode OF() { return getToken(VHDLParser.OF, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Constrained_array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrained_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConstrained_array_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConstrained_array_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConstrained_array_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constrained_array_definitionContext constrained_array_definition() throws RecognitionException {
		Constrained_array_definitionContext _localctx = new Constrained_array_definitionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_constrained_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(ARRAY);
			setState(1051);
			index_constraint();
			setState(1052);
			match(OF);
			setState(1053);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constrained_nature_definitionContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(VHDLParser.ARRAY, 0); }
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public TerminalNode OF() { return getToken(VHDLParser.OF, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public Constrained_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrained_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConstrained_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConstrained_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConstrained_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constrained_nature_definitionContext constrained_nature_definition() throws RecognitionException {
		Constrained_nature_definitionContext _localctx = new Constrained_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constrained_nature_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(ARRAY);
			setState(1056);
			index_constraint();
			setState(1057);
			match(OF);
			setState(1058);
			subnature_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintContext extends ParserRuleContext {
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constraint);
		try {
			setState(1062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				range_constraint();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				index_constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Context_clauseContext extends ParserRuleContext {
		public List<Context_itemContext> context_item() {
			return getRuleContexts(Context_itemContext.class);
		}
		public Context_itemContext context_item(int i) {
			return getRuleContext(Context_itemContext.class,i);
		}
		public Context_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterContext_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitContext_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitContext_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_clauseContext context_clause() throws RecognitionException {
		Context_clauseContext _localctx = new Context_clauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_context_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIBRARY || _la==USE) {
				{
				{
				setState(1064);
				context_item();
				}
				}
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Context_itemContext extends ParserRuleContext {
		public Library_clauseContext library_clause() {
			return getRuleContext(Library_clauseContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Context_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterContext_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitContext_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitContext_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_itemContext context_item() throws RecognitionException {
		Context_itemContext _localctx = new Context_itemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_context_item);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIBRARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				library_clause();
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				use_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delay_mechanismContext extends ParserRuleContext {
		public TerminalNode TRANSPORT() { return getToken(VHDLParser.TRANSPORT, 0); }
		public TerminalNode INERTIAL() { return getToken(VHDLParser.INERTIAL, 0); }
		public TerminalNode REJECT() { return getToken(VHDLParser.REJECT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Delay_mechanismContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_mechanism; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterDelay_mechanism(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitDelay_mechanism(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitDelay_mechanism(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delay_mechanismContext delay_mechanism() throws RecognitionException {
		Delay_mechanismContext _localctx = new Delay_mechanismContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_delay_mechanism);
		int _la;
		try {
			setState(1080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRANSPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				match(TRANSPORT);
				}
				break;
			case INERTIAL:
			case REJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REJECT) {
					{
					setState(1075);
					match(REJECT);
					setState(1076);
					expression();
					}
				}

				setState(1079);
				match(INERTIAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Design_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VHDLParser.EOF, 0); }
		public List<Design_unitContext> design_unit() {
			return getRuleContexts(Design_unitContext.class);
		}
		public Design_unitContext design_unit(int i) {
			return getRuleContext(Design_unitContext.class,i);
		}
		public Design_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterDesign_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitDesign_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitDesign_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Design_fileContext design_file() throws RecognitionException {
		Design_fileContext _localctx = new Design_fileContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_design_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796127625472L) != 0) || _la==PACKAGE || _la==USE) {
				{
				{
				setState(1082);
				design_unit();
				}
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1088);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Design_unitContext extends ParserRuleContext {
		public Context_clauseContext context_clause() {
			return getRuleContext(Context_clauseContext.class,0);
		}
		public Library_unitContext library_unit() {
			return getRuleContext(Library_unitContext.class,0);
		}
		public Design_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterDesign_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitDesign_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitDesign_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Design_unitContext design_unit() throws RecognitionException {
		Design_unitContext _localctx = new Design_unitContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_design_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			context_clause();
			setState(1091);
			library_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DesignatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(VHDLParser.STRING_LITERAL, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_designator);
		try {
			setState(1095);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				identifier();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(VHDLParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(VHDLParser.DOWNTO, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Disconnection_specificationContext extends ParserRuleContext {
		public TerminalNode DISCONNECT() { return getToken(VHDLParser.DISCONNECT, 0); }
		public Guarded_signal_specificationContext guarded_signal_specification() {
			return getRuleContext(Guarded_signal_specificationContext.class,0);
		}
		public TerminalNode AFTER() { return getToken(VHDLParser.AFTER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Disconnection_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnection_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterDisconnection_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitDisconnection_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitDisconnection_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Disconnection_specificationContext disconnection_specification() throws RecognitionException {
		Disconnection_specificationContext _localctx = new Disconnection_specificationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_disconnection_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(DISCONNECT);
			setState(1100);
			guarded_signal_specification();
			setState(1101);
			match(AFTER);
			setState(1102);
			expression();
			setState(1103);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Discrete_rangeContext extends ParserRuleContext {
		public Range_declContext range_decl() {
			return getRuleContext(Range_declContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Discrete_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discrete_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterDiscrete_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitDiscrete_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitDiscrete_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Discrete_rangeContext discrete_range() throws RecognitionException {
		Discrete_rangeContext _localctx = new Discrete_rangeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_discrete_range);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				range_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				subtype_indication();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_associationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(VHDLParser.ARROW, 0); }
		public Element_associationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterElement_association(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitElement_association(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitElement_association(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_associationContext element_association() throws RecognitionException {
		Element_associationContext _localctx = new Element_associationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_element_association);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1109);
				choices();
				setState(1110);
				match(ARROW);
				}
				break;
			}
			setState(1114);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Element_subtype_definitionContext element_subtype_definition() {
			return getRuleContext(Element_subtype_definitionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Element_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterElement_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitElement_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitElement_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_declarationContext element_declaration() throws RecognitionException {
		Element_declarationContext _localctx = new Element_declarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_element_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			identifier_list();
			setState(1117);
			match(COLON);
			setState(1118);
			element_subtype_definition();
			setState(1119);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_subnature_definitionContext extends ParserRuleContext {
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public Element_subnature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_subnature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterElement_subnature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitElement_subnature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitElement_subnature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_subnature_definitionContext element_subnature_definition() throws RecognitionException {
		Element_subnature_definitionContext _localctx = new Element_subnature_definitionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_element_subnature_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			subnature_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_subtype_definitionContext extends ParserRuleContext {
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Element_subtype_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_subtype_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterElement_subtype_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitElement_subtype_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitElement_subtype_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_subtype_definitionContext element_subtype_definition() throws RecognitionException {
		Element_subtype_definitionContext _localctx = new Element_subtype_definitionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_element_subtype_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_aspectContext extends ParserRuleContext {
		public TerminalNode ENTITY() { return getToken(VHDLParser.ENTITY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode CONFIGURATION() { return getToken(VHDLParser.CONFIGURATION, 0); }
		public TerminalNode OPEN() { return getToken(VHDLParser.OPEN, 0); }
		public Entity_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_aspectContext entity_aspect() throws RecognitionException {
		Entity_aspectContext _localctx = new Entity_aspectContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_entity_aspect);
		int _la;
		try {
			setState(1136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				match(ENTITY);
				setState(1126);
				name();
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1127);
					match(LPAREN);
					setState(1128);
					identifier();
					setState(1129);
					match(RPAREN);
					}
				}

				}
				break;
			case CONFIGURATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133);
				match(CONFIGURATION);
				setState(1134);
				name();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1135);
				match(OPEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_classContext extends ParserRuleContext {
		public TerminalNode ENTITY() { return getToken(VHDLParser.ENTITY, 0); }
		public TerminalNode ARCHITECTURE() { return getToken(VHDLParser.ARCHITECTURE, 0); }
		public TerminalNode CONFIGURATION() { return getToken(VHDLParser.CONFIGURATION, 0); }
		public TerminalNode PROCEDURE() { return getToken(VHDLParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(VHDLParser.FUNCTION, 0); }
		public TerminalNode PACKAGE() { return getToken(VHDLParser.PACKAGE, 0); }
		public TerminalNode TYPE() { return getToken(VHDLParser.TYPE, 0); }
		public TerminalNode SUBTYPE() { return getToken(VHDLParser.SUBTYPE, 0); }
		public TerminalNode CONSTANT() { return getToken(VHDLParser.CONSTANT, 0); }
		public TerminalNode SIGNAL() { return getToken(VHDLParser.SIGNAL, 0); }
		public TerminalNode VARIABLE() { return getToken(VHDLParser.VARIABLE, 0); }
		public TerminalNode COMPONENT() { return getToken(VHDLParser.COMPONENT, 0); }
		public TerminalNode LABEL() { return getToken(VHDLParser.LABEL, 0); }
		public TerminalNode LITERAL() { return getToken(VHDLParser.LITERAL, 0); }
		public TerminalNode UNITS() { return getToken(VHDLParser.UNITS, 0); }
		public TerminalNode GROUP() { return getToken(VHDLParser.GROUP, 0); }
		public TerminalNode FILE() { return getToken(VHDLParser.FILE, 0); }
		public TerminalNode NATURE() { return getToken(VHDLParser.NATURE, 0); }
		public TerminalNode SUBNATURE() { return getToken(VHDLParser.SUBNATURE, 0); }
		public TerminalNode QUANTITY() { return getToken(VHDLParser.QUANTITY, 0); }
		public TerminalNode TERMINAL() { return getToken(VHDLParser.TERMINAL, 0); }
		public Entity_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_classContext entity_class() throws RecognitionException {
		Entity_classContext _localctx = new Entity_classContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_entity_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2326586505822464L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2544503881873L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_class_entryContext extends ParserRuleContext {
		public Entity_classContext entity_class() {
			return getRuleContext(Entity_classContext.class,0);
		}
		public TerminalNode BOX() { return getToken(VHDLParser.BOX, 0); }
		public Entity_class_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_class_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_class_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_class_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_class_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_class_entryContext entity_class_entry() throws RecognitionException {
		Entity_class_entryContext _localctx = new Entity_class_entryContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_entity_class_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			entity_class();
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOX) {
				{
				setState(1141);
				match(BOX);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_class_entry_listContext extends ParserRuleContext {
		public List<Entity_class_entryContext> entity_class_entry() {
			return getRuleContexts(Entity_class_entryContext.class);
		}
		public Entity_class_entryContext entity_class_entry(int i) {
			return getRuleContext(Entity_class_entryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Entity_class_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_class_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_class_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_class_entry_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_class_entry_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_class_entry_listContext entity_class_entry_list() throws RecognitionException {
		Entity_class_entry_listContext _localctx = new Entity_class_entry_listContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_entity_class_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			entity_class_entry();
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1145);
				match(COMMA);
				setState(1146);
				entity_class_entry();
				}
				}
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ENTITY() { return getTokens(VHDLParser.ENTITY); }
		public TerminalNode ENTITY(int i) {
			return getToken(VHDLParser.ENTITY, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Entity_headerContext entity_header() {
			return getRuleContext(Entity_headerContext.class,0);
		}
		public Entity_declarative_partContext entity_declarative_part() {
			return getRuleContext(Entity_declarative_partContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public TerminalNode BEGIN() { return getToken(VHDLParser.BEGIN, 0); }
		public Entity_statement_partContext entity_statement_part() {
			return getRuleContext(Entity_statement_partContext.class,0);
		}
		public Entity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_declarationContext entity_declaration() throws RecognitionException {
		Entity_declarationContext _localctx = new Entity_declarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_entity_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(ENTITY);
			setState(1153);
			identifier();
			setState(1154);
			match(IS);
			setState(1155);
			entity_header();
			setState(1156);
			entity_declarative_part();
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(1157);
				match(BEGIN);
				setState(1158);
				entity_statement_part();
				}
			}

			setState(1161);
			match(END);
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTITY) {
				{
				setState(1162);
				match(ENTITY);
				}
			}

			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1165);
				identifier();
				}
			}

			setState(1168);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Disconnection_specificationContext disconnection_specification() {
			return getRuleContext(Disconnection_specificationContext.class,0);
		}
		public Step_limit_specificationContext step_limit_specification() {
			return getRuleContext(Step_limit_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Nature_declarationContext nature_declaration() {
			return getRuleContext(Nature_declarationContext.class,0);
		}
		public Subnature_declarationContext subnature_declaration() {
			return getRuleContext(Subnature_declarationContext.class,0);
		}
		public Quantity_declarationContext quantity_declaration() {
			return getRuleContext(Quantity_declarationContext.class,0);
		}
		public Terminal_declarationContext terminal_declaration() {
			return getRuleContext(Terminal_declarationContext.class,0);
		}
		public Entity_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_declarative_itemContext entity_declarative_item() throws RecognitionException {
		Entity_declarative_itemContext _localctx = new Entity_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_entity_declarative_item);
		try {
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1170);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1172);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1173);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1174);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1175);
				signal_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1176);
				variable_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1177);
				file_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1178);
				alias_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1179);
				attribute_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1180);
				attribute_specification();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1181);
				disconnection_specification();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1182);
				step_limit_specification();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1183);
				use_clause();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1184);
				group_template_declaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1185);
				group_declaration();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1186);
				nature_declaration();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1187);
				subnature_declaration();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1188);
				quantity_declaration();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1189);
				terminal_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_declarative_partContext extends ParserRuleContext {
		public List<Entity_declarative_itemContext> entity_declarative_item() {
			return getRuleContexts(Entity_declarative_itemContext.class);
		}
		public Entity_declarative_itemContext entity_declarative_item(int i) {
			return getRuleContext(Entity_declarative_itemContext.class,i);
		}
		public Entity_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_declarative_partContext entity_declarative_part() throws RecognitionException {
		Entity_declarative_partContext _localctx = new Entity_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_entity_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269549309200416L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210571231245L) != 0)) {
				{
				{
				setState(1192);
				entity_declarative_item();
				}
				}
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_designatorContext extends ParserRuleContext {
		public Entity_tagContext entity_tag() {
			return getRuleContext(Entity_tagContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Entity_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_designator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_designator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_designatorContext entity_designator() throws RecognitionException {
		Entity_designatorContext _localctx = new Entity_designatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_entity_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			entity_tag();
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(1199);
				signature();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_headerContext extends ParserRuleContext {
		public Generic_clauseContext generic_clause() {
			return getRuleContext(Generic_clauseContext.class,0);
		}
		public Port_clauseContext port_clause() {
			return getRuleContext(Port_clauseContext.class,0);
		}
		public Entity_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_headerContext entity_header() throws RecognitionException {
		Entity_headerContext _localctx = new Entity_headerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_entity_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(1202);
				generic_clause();
				}
			}

			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(1205);
				port_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_name_listContext extends ParserRuleContext {
		public List<Entity_designatorContext> entity_designator() {
			return getRuleContexts(Entity_designatorContext.class);
		}
		public Entity_designatorContext entity_designator(int i) {
			return getRuleContext(Entity_designatorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public TerminalNode OTHERS() { return getToken(VHDLParser.OTHERS, 0); }
		public TerminalNode ALL() { return getToken(VHDLParser.ALL, 0); }
		public Entity_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_name_listContext entity_name_list() throws RecognitionException {
		Entity_name_listContext _localctx = new Entity_name_listContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_entity_name_list);
		int _la;
		try {
			setState(1218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				entity_designator();
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1209);
					match(COMMA);
					setState(1210);
					entity_designator();
					}
					}
					setState(1215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				match(OTHERS);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1217);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_specificationContext extends ParserRuleContext {
		public Entity_name_listContext entity_name_list() {
			return getRuleContext(Entity_name_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Entity_classContext entity_class() {
			return getRuleContext(Entity_classContext.class,0);
		}
		public Entity_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_specificationContext entity_specification() throws RecognitionException {
		Entity_specificationContext _localctx = new Entity_specificationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_entity_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			entity_name_list();
			setState(1221);
			match(COLON);
			setState(1222);
			entity_class();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_statementContext extends ParserRuleContext {
		public Concurrent_assertion_statementContext concurrent_assertion_statement() {
			return getRuleContext(Concurrent_assertion_statementContext.class,0);
		}
		public Process_statementContext process_statement() {
			return getRuleContext(Process_statementContext.class,0);
		}
		public Concurrent_procedure_call_statementContext concurrent_procedure_call_statement() {
			return getRuleContext(Concurrent_procedure_call_statementContext.class,0);
		}
		public Entity_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_statementContext entity_statement() throws RecognitionException {
		Entity_statementContext _localctx = new Entity_statementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_entity_statement);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				concurrent_assertion_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				process_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1226);
				concurrent_procedure_call_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_statement_partContext extends ParserRuleContext {
		public List<Entity_statementContext> entity_statement() {
			return getRuleContexts(Entity_statementContext.class);
		}
		public Entity_statementContext entity_statement(int i) {
			return getRuleContext(Entity_statementContext.class,i);
		}
		public Entity_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_statement_partContext entity_statement_part() throws RecognitionException {
		Entity_statement_partContext _localctx = new Entity_statement_partContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_entity_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSERT || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 13510798882111491L) != 0)) {
				{
				{
				setState(1229);
				entity_statement();
				}
				}
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Entity_tagContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHARACTER_LITERAL() { return getToken(VHDLParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(VHDLParser.STRING_LITERAL, 0); }
		public Entity_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEntity_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEntity_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEntity_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_tagContext entity_tag() throws RecognitionException {
		Entity_tagContext _localctx = new Entity_tagContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_entity_tag);
		try {
			setState(1238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				identifier();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				match(CHARACTER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1237);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enumeration_literalContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHARACTER_LITERAL() { return getToken(VHDLParser.CHARACTER_LITERAL, 0); }
		public Enumeration_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEnumeration_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEnumeration_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEnumeration_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumeration_literalContext enumeration_literal() throws RecognitionException {
		Enumeration_literalContext _localctx = new Enumeration_literalContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumeration_literal);
		try {
			setState(1242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				identifier();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				match(CHARACTER_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enumeration_type_definitionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public List<Enumeration_literalContext> enumeration_literal() {
			return getRuleContexts(Enumeration_literalContext.class);
		}
		public Enumeration_literalContext enumeration_literal(int i) {
			return getRuleContext(Enumeration_literalContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Enumeration_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterEnumeration_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitEnumeration_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitEnumeration_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumeration_type_definitionContext enumeration_type_definition() throws RecognitionException {
		Enumeration_type_definitionContext _localctx = new Enumeration_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumeration_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(LPAREN);
			setState(1245);
			enumeration_literal();
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1246);
				match(COMMA);
				setState(1247);
				enumeration_literal();
				}
				}
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1253);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(VHDLParser.EXIT, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(VHDLParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitExit_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitExit_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_exit_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1255);
				label_colon();
				}
			}

			setState(1258);
			match(EXIT);
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1259);
				identifier();
				}
			}

			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1262);
				match(WHEN);
				setState(1263);
				condition();
				}
			}

			setState(1266);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<Logical_operatorContext> logical_operator() {
			return getRuleContexts(Logical_operatorContext.class);
		}
		public Logical_operatorContext logical_operator(int i) {
			return getRuleContext(Logical_operatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			relation();
			setState(1274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1269);
					logical_operator();
					setState(1270);
					relation();
					}
					} 
				}
				setState(1276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode DOUBLESTAR() { return getToken(VHDLParser.DOUBLESTAR, 0); }
		public TerminalNode ABS() { return getToken(VHDLParser.ABS, 0); }
		public TerminalNode NOT() { return getToken(VHDLParser.NOT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_factor);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case NULL_:
			case BASE_LITERAL:
			case BIT_STRING_LITERAL:
			case REAL_LITERAL:
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case LPAREN:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				primary();
				setState(1280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1278);
					match(DOUBLESTAR);
					setState(1279);
					primary();
					}
					break;
				}
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				match(ABS);
				setState(1283);
				primary();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1284);
				match(NOT);
				setState(1285);
				primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_declarationContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(VHDLParser.FILE, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public File_open_informationContext file_open_information() {
			return getRuleContext(File_open_informationContext.class,0);
		}
		public File_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFile_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFile_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFile_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_declarationContext file_declaration() throws RecognitionException {
		File_declarationContext _localctx = new File_declarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_file_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(FILE);
			setState(1289);
			identifier_list();
			setState(1290);
			match(COLON);
			setState(1291);
			subtype_indication();
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS || _la==OPEN) {
				{
				setState(1292);
				file_open_information();
				}
			}

			setState(1295);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_logical_nameContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public File_logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_logical_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFile_logical_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFile_logical_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFile_logical_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_logical_nameContext file_logical_name() throws RecognitionException {
		File_logical_nameContext _localctx = new File_logical_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_file_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_open_informationContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public File_logical_nameContext file_logical_name() {
			return getRuleContext(File_logical_nameContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(VHDLParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public File_open_informationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_open_information; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFile_open_information(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFile_open_information(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFile_open_information(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_open_informationContext file_open_information() throws RecognitionException {
		File_open_informationContext _localctx = new File_open_informationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_file_open_information);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(1299);
				match(OPEN);
				setState(1300);
				expression();
				}
			}

			setState(1303);
			match(IS);
			setState(1304);
			file_logical_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_type_definitionContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(VHDLParser.FILE, 0); }
		public TerminalNode OF() { return getToken(VHDLParser.OF, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public File_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFile_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFile_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFile_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_type_definitionContext file_type_definition() throws RecognitionException {
		File_type_definitionContext _localctx = new File_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_file_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(FILE);
			setState(1307);
			match(OF);
			setState(1308);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_parameter_listContext extends ParserRuleContext {
		public Interface_listContext interface_list() {
			return getRuleContext(Interface_listContext.class,0);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFormal_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFormal_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFormal_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_formal_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			interface_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_partContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Explicit_rangeContext explicit_range() {
			return getRuleContext(Explicit_rangeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Formal_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFormal_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFormal_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFormal_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_partContext formal_part() throws RecognitionException {
		Formal_partContext _localctx = new Formal_partContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_formal_part);
		try {
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				identifier();
				setState(1314);
				match(LPAREN);
				setState(1315);
				explicit_range();
				setState(1316);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Free_quantity_declarationContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(VHDLParser.QUANTITY, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Free_quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_free_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFree_quantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFree_quantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFree_quantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Free_quantity_declarationContext free_quantity_declaration() throws RecognitionException {
		Free_quantity_declarationContext _localctx = new Free_quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_free_quantity_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			match(QUANTITY);
			setState(1321);
			identifier_list();
			setState(1322);
			match(COLON);
			setState(1323);
			subtype_indication();
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1324);
				match(VARASGN);
				setState(1325);
				expression();
				}
			}

			setState(1328);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generate_statementContext extends ParserRuleContext {
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Generation_schemeContext generation_scheme() {
			return getRuleContext(Generation_schemeContext.class,0);
		}
		public List<TerminalNode> GENERATE() { return getTokens(VHDLParser.GENERATE); }
		public TerminalNode GENERATE(int i) {
			return getToken(VHDLParser.GENERATE, i);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public TerminalNode BEGIN() { return getToken(VHDLParser.BEGIN, 0); }
		public List<Architecture_statementContext> architecture_statement() {
			return getRuleContexts(Architecture_statementContext.class);
		}
		public Architecture_statementContext architecture_statement(int i) {
			return getRuleContext(Architecture_statementContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Block_declarative_itemContext> block_declarative_item() {
			return getRuleContexts(Block_declarative_itemContext.class);
		}
		public Block_declarative_itemContext block_declarative_item(int i) {
			return getRuleContext(Block_declarative_itemContext.class,i);
		}
		public Generate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGenerate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGenerate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGenerate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generate_statementContext generate_statement() throws RecognitionException {
		Generate_statementContext _localctx = new Generate_statementContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_generate_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			label_colon();
			setState(1331);
			generation_scheme();
			setState(1332);
			match(GENERATE);
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269550383470624L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210571231245L) != 0)) {
				{
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2269550383466528L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210571231245L) != 0)) {
					{
					{
					setState(1333);
					block_declarative_item();
					}
					}
					setState(1338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1339);
				match(BEGIN);
				}
			}

			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220676450460926978L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 6933504931592667147L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 131457L) != 0)) {
				{
				{
				setState(1342);
				architecture_statement();
				}
				}
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1348);
			match(END);
			setState(1349);
			match(GENERATE);
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1350);
				identifier();
				}
			}

			setState(1353);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generation_schemeContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VHDLParser.FOR, 0); }
		public Parameter_specificationContext parameter_specification() {
			return getRuleContext(Parameter_specificationContext.class,0);
		}
		public TerminalNode IF() { return getToken(VHDLParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Generation_schemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generation_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGeneration_scheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGeneration_scheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGeneration_scheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generation_schemeContext generation_scheme() throws RecognitionException {
		Generation_schemeContext _localctx = new Generation_schemeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_generation_scheme);
		try {
			setState(1359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1355);
				match(FOR);
				setState(1356);
				parameter_specification();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				match(IF);
				setState(1358);
				condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_clauseContext extends ParserRuleContext {
		public TerminalNode GENERIC() { return getToken(VHDLParser.GENERIC, 0); }
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Generic_listContext generic_list() {
			return getRuleContext(Generic_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Generic_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGeneric_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGeneric_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGeneric_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_clauseContext generic_clause() throws RecognitionException {
		Generic_clauseContext _localctx = new Generic_clauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_generic_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			match(GENERIC);
			setState(1362);
			match(LPAREN);
			setState(1363);
			generic_list();
			setState(1364);
			match(RPAREN);
			setState(1365);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_listContext extends ParserRuleContext {
		public List<Interface_constant_declarationContext> interface_constant_declaration() {
			return getRuleContexts(Interface_constant_declarationContext.class);
		}
		public Interface_constant_declarationContext interface_constant_declaration(int i) {
			return getRuleContext(Interface_constant_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VHDLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VHDLParser.SEMI, i);
		}
		public Generic_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGeneric_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGeneric_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGeneric_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_listContext generic_list() throws RecognitionException {
		Generic_listContext _localctx = new Generic_listContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_generic_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			interface_constant_declaration();
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1368);
				match(SEMI);
				setState(1369);
				interface_constant_declaration();
				}
				}
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_map_aspectContext extends ParserRuleContext {
		public TerminalNode GENERIC() { return getToken(VHDLParser.GENERIC, 0); }
		public TerminalNode MAP() { return getToken(VHDLParser.MAP, 0); }
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Association_listContext association_list() {
			return getRuleContext(Association_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Generic_map_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_map_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGeneric_map_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGeneric_map_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGeneric_map_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_map_aspectContext generic_map_aspect() throws RecognitionException {
		Generic_map_aspectContext _localctx = new Generic_map_aspectContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_generic_map_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(GENERIC);
			setState(1376);
			match(MAP);
			setState(1377);
			match(LPAREN);
			setState(1378);
			association_list();
			setState(1379);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_constituentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CHARACTER_LITERAL() { return getToken(VHDLParser.CHARACTER_LITERAL, 0); }
		public Group_constituentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_constituent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGroup_constituent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGroup_constituent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGroup_constituent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_constituentContext group_constituent() throws RecognitionException {
		Group_constituentContext _localctx = new Group_constituentContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_group_constituent);
		try {
			setState(1383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				name();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				match(CHARACTER_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_constituent_listContext extends ParserRuleContext {
		public List<Group_constituentContext> group_constituent() {
			return getRuleContexts(Group_constituentContext.class);
		}
		public Group_constituentContext group_constituent(int i) {
			return getRuleContext(Group_constituentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Group_constituent_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_constituent_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGroup_constituent_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGroup_constituent_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGroup_constituent_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_constituent_listContext group_constituent_list() throws RecognitionException {
		Group_constituent_listContext _localctx = new Group_constituent_listContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_group_constituent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			group_constituent();
			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1386);
				match(COMMA);
				setState(1387);
				group_constituent();
				}
				}
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_declarationContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(VHDLParser.GROUP, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Group_constituent_listContext group_constituent_list() {
			return getRuleContext(Group_constituent_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Group_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGroup_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGroup_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGroup_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_declarationContext group_declaration() throws RecognitionException {
		Group_declarationContext _localctx = new Group_declarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_group_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(GROUP);
			setState(1394);
			label_colon();
			setState(1395);
			name();
			setState(1396);
			match(LPAREN);
			setState(1397);
			group_constituent_list();
			setState(1398);
			match(RPAREN);
			setState(1399);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_template_declarationContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(VHDLParser.GROUP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Entity_class_entry_listContext entity_class_entry_list() {
			return getRuleContext(Entity_class_entry_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Group_template_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_template_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGroup_template_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGroup_template_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGroup_template_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_template_declarationContext group_template_declaration() throws RecognitionException {
		Group_template_declarationContext _localctx = new Group_template_declarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_group_template_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(GROUP);
			setState(1402);
			identifier();
			setState(1403);
			match(IS);
			setState(1404);
			match(LPAREN);
			setState(1405);
			entity_class_entry_list();
			setState(1406);
			match(RPAREN);
			setState(1407);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Guarded_signal_specificationContext extends ParserRuleContext {
		public Signal_listContext signal_list() {
			return getRuleContext(Signal_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Guarded_signal_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_signal_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterGuarded_signal_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitGuarded_signal_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitGuarded_signal_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_signal_specificationContext guarded_signal_specification() throws RecognitionException {
		Guarded_signal_specificationContext _localctx = new Guarded_signal_specificationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_guarded_signal_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			signal_list();
			setState(1410);
			match(COLON);
			setState(1411);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode BASIC_IDENTIFIER() { return getToken(VHDLParser.BASIC_IDENTIFIER, 0); }
		public TerminalNode EXTENDED_IDENTIFIER() { return getToken(VHDLParser.EXTENDED_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			_la = _input.LA(1);
			if ( !(_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Identifier_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			identifier();
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1416);
				match(COMMA);
				setState(1417);
				identifier();
				}
				}
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(VHDLParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(VHDLParser.IF, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(VHDLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(VHDLParser.THEN, i);
		}
		public List<Sequence_of_statementsContext> sequence_of_statements() {
			return getRuleContexts(Sequence_of_statementsContext.class);
		}
		public Sequence_of_statementsContext sequence_of_statements(int i) {
			return getRuleContext(Sequence_of_statementsContext.class,i);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<TerminalNode> ELSIF() { return getTokens(VHDLParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(VHDLParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(VHDLParser.ELSE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1423);
				label_colon();
				}
			}

			setState(1426);
			match(IF);
			setState(1427);
			condition();
			setState(1428);
			match(THEN);
			setState(1429);
			sequence_of_statements();
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(1430);
				match(ELSIF);
				setState(1431);
				condition();
				setState(1432);
				match(THEN);
				setState(1433);
				sequence_of_statements();
				}
				}
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1440);
				match(ELSE);
				setState(1441);
				sequence_of_statements();
				}
			}

			setState(1444);
			match(END);
			setState(1445);
			match(IF);
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1446);
				identifier();
				}
			}

			setState(1449);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_constraintContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public List<Discrete_rangeContext> discrete_range() {
			return getRuleContexts(Discrete_rangeContext.class);
		}
		public Discrete_rangeContext discrete_range(int i) {
			return getRuleContext(Discrete_rangeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Index_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterIndex_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitIndex_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitIndex_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_constraintContext index_constraint() throws RecognitionException {
		Index_constraintContext _localctx = new Index_constraintContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_index_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(LPAREN);
			setState(1452);
			discrete_range();
			setState(1457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1453);
				match(COMMA);
				setState(1454);
				discrete_range();
				}
				}
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1460);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_specificationContext extends ParserRuleContext {
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Index_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterIndex_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitIndex_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitIndex_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_specificationContext index_specification() throws RecognitionException {
		Index_specificationContext _localctx = new Index_specificationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_index_specification);
		try {
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				discrete_range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1463);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_subtype_definitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(VHDLParser.RANGE, 0); }
		public TerminalNode BOX() { return getToken(VHDLParser.BOX, 0); }
		public Index_subtype_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_subtype_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterIndex_subtype_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitIndex_subtype_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitIndex_subtype_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_subtype_definitionContext index_subtype_definition() throws RecognitionException {
		Index_subtype_definitionContext _localctx = new Index_subtype_definitionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_index_subtype_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			name();
			setState(1467);
			match(RANGE);
			setState(1468);
			match(BOX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instantiated_unitContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COMPONENT() { return getToken(VHDLParser.COMPONENT, 0); }
		public TerminalNode ENTITY() { return getToken(VHDLParser.ENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode CONFIGURATION() { return getToken(VHDLParser.CONFIGURATION, 0); }
		public Instantiated_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiated_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInstantiated_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInstantiated_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInstantiated_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instantiated_unitContext instantiated_unit() throws RecognitionException {
		Instantiated_unitContext _localctx = new Instantiated_unitContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_instantiated_unit);
		int _la;
		try {
			setState(1484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPONENT:
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMPONENT) {
					{
					setState(1470);
					match(COMPONENT);
					}
				}

				setState(1473);
				name();
				}
				break;
			case ENTITY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				match(ENTITY);
				setState(1475);
				name();
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1476);
					match(LPAREN);
					setState(1477);
					identifier();
					setState(1478);
					match(RPAREN);
					}
				}

				}
				break;
			case CONFIGURATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1482);
				match(CONFIGURATION);
				setState(1483);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instantiation_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public TerminalNode OTHERS() { return getToken(VHDLParser.OTHERS, 0); }
		public TerminalNode ALL() { return getToken(VHDLParser.ALL, 0); }
		public Instantiation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInstantiation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInstantiation_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInstantiation_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instantiation_listContext instantiation_list() throws RecognitionException {
		Instantiation_listContext _localctx = new Instantiation_listContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_instantiation_list);
		int _la;
		try {
			setState(1496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				identifier();
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1487);
					match(COMMA);
					setState(1488);
					identifier();
					}
					}
					setState(1493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				match(OTHERS);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1495);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_constant_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(VHDLParser.CONSTANT, 0); }
		public TerminalNode IN() { return getToken(VHDLParser.IN, 0); }
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interface_constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_constant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_constant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_constant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_constant_declarationContext interface_constant_declaration() throws RecognitionException {
		Interface_constant_declarationContext _localctx = new Interface_constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_interface_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(1498);
				match(CONSTANT);
				}
			}

			setState(1501);
			identifier_list();
			setState(1502);
			match(COLON);
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(1503);
				match(IN);
				}
			}

			setState(1506);
			subtype_indication();
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1507);
				match(VARASGN);
				setState(1508);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_declarationContext extends ParserRuleContext {
		public Interface_constant_declarationContext interface_constant_declaration() {
			return getRuleContext(Interface_constant_declarationContext.class,0);
		}
		public Interface_signal_declarationContext interface_signal_declaration() {
			return getRuleContext(Interface_signal_declarationContext.class,0);
		}
		public Interface_variable_declarationContext interface_variable_declaration() {
			return getRuleContext(Interface_variable_declarationContext.class,0);
		}
		public Interface_file_declarationContext interface_file_declaration() {
			return getRuleContext(Interface_file_declarationContext.class,0);
		}
		public Interface_terminal_declarationContext interface_terminal_declaration() {
			return getRuleContext(Interface_terminal_declarationContext.class,0);
		}
		public Interface_quantity_declarationContext interface_quantity_declaration() {
			return getRuleContext(Interface_quantity_declarationContext.class,0);
		}
		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_interface_declaration);
		try {
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1511);
				interface_constant_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1512);
				interface_signal_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1513);
				interface_variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1514);
				interface_file_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1515);
				interface_terminal_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1516);
				interface_quantity_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_elementContext extends ParserRuleContext {
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Interface_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_elementContext interface_element() throws RecognitionException {
		Interface_elementContext _localctx = new Interface_elementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_interface_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			interface_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_file_declarationContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(VHDLParser.FILE, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Interface_file_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_file_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_file_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_file_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_file_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_file_declarationContext interface_file_declaration() throws RecognitionException {
		Interface_file_declarationContext _localctx = new Interface_file_declarationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_interface_file_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(FILE);
			setState(1522);
			identifier_list();
			setState(1523);
			match(COLON);
			setState(1524);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_signal_listContext extends ParserRuleContext {
		public List<Interface_signal_declarationContext> interface_signal_declaration() {
			return getRuleContexts(Interface_signal_declarationContext.class);
		}
		public Interface_signal_declarationContext interface_signal_declaration(int i) {
			return getRuleContext(Interface_signal_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VHDLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VHDLParser.SEMI, i);
		}
		public Interface_signal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_signal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_signal_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_signal_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_signal_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_signal_listContext interface_signal_list() throws RecognitionException {
		Interface_signal_listContext _localctx = new Interface_signal_listContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_interface_signal_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			interface_signal_declaration();
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1527);
				match(SEMI);
				setState(1528);
				interface_signal_declaration();
				}
				}
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_port_listContext extends ParserRuleContext {
		public List<Interface_port_declarationContext> interface_port_declaration() {
			return getRuleContexts(Interface_port_declarationContext.class);
		}
		public Interface_port_declarationContext interface_port_declaration(int i) {
			return getRuleContext(Interface_port_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VHDLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VHDLParser.SEMI, i);
		}
		public Interface_port_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_port_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_port_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_port_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_port_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_port_listContext interface_port_list() throws RecognitionException {
		Interface_port_listContext _localctx = new Interface_port_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_interface_port_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			interface_port_declaration();
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1535);
				match(SEMI);
				setState(1536);
				interface_port_declaration();
				}
				}
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_listContext extends ParserRuleContext {
		public List<Interface_elementContext> interface_element() {
			return getRuleContexts(Interface_elementContext.class);
		}
		public Interface_elementContext interface_element(int i) {
			return getRuleContext(Interface_elementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VHDLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VHDLParser.SEMI, i);
		}
		public Interface_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_listContext interface_list() throws RecognitionException {
		Interface_listContext _localctx = new Interface_listContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_interface_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			interface_element();
			setState(1547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1543);
				match(SEMI);
				setState(1544);
				interface_element();
				}
				}
				setState(1549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_quantity_declarationContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(VHDLParser.QUANTITY, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(VHDLParser.IN, 0); }
		public TerminalNode OUT() { return getToken(VHDLParser.OUT, 0); }
		public Interface_quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_quantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_quantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_quantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_quantity_declarationContext interface_quantity_declaration() throws RecognitionException {
		Interface_quantity_declarationContext _localctx = new Interface_quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_interface_quantity_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			match(QUANTITY);
			setState(1551);
			identifier_list();
			setState(1552);
			match(COLON);
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(1553);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1556);
			subtype_indication();
			setState(1559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1557);
				match(VARASGN);
				setState(1558);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_port_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Signal_modeContext signal_mode() {
			return getRuleContext(Signal_modeContext.class,0);
		}
		public TerminalNode BUS() { return getToken(VHDLParser.BUS, 0); }
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interface_port_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_port_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_port_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_port_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_port_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_port_declarationContext interface_port_declaration() throws RecognitionException {
		Interface_port_declarationContext _localctx = new Interface_port_declarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_interface_port_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			identifier_list();
			setState(1562);
			match(COLON);
			setState(1564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223335478093086720L) != 0)) {
				{
				setState(1563);
				signal_mode();
				}
			}

			setState(1566);
			subtype_indication();
			setState(1568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BUS) {
				{
				setState(1567);
				match(BUS);
				}
			}

			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1570);
				match(VARASGN);
				setState(1571);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_signal_declarationContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(VHDLParser.SIGNAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Signal_modeContext signal_mode() {
			return getRuleContext(Signal_modeContext.class,0);
		}
		public TerminalNode BUS() { return getToken(VHDLParser.BUS, 0); }
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interface_signal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_signal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_signal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_signal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_signal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_signal_declarationContext interface_signal_declaration() throws RecognitionException {
		Interface_signal_declarationContext _localctx = new Interface_signal_declarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_interface_signal_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(SIGNAL);
			setState(1575);
			identifier_list();
			setState(1576);
			match(COLON);
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223335478093086720L) != 0)) {
				{
				setState(1577);
				signal_mode();
				}
			}

			setState(1580);
			subtype_indication();
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BUS) {
				{
				setState(1581);
				match(BUS);
				}
			}

			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1584);
				match(VARASGN);
				setState(1585);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_terminal_declarationContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(VHDLParser.TERMINAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public Interface_terminal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_terminal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_terminal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_terminal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_terminal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_terminal_declarationContext interface_terminal_declaration() throws RecognitionException {
		Interface_terminal_declarationContext _localctx = new Interface_terminal_declarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_interface_terminal_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			match(TERMINAL);
			setState(1589);
			identifier_list();
			setState(1590);
			match(COLON);
			setState(1591);
			subnature_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interface_variable_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(VHDLParser.VARIABLE, 0); }
		public Signal_modeContext signal_mode() {
			return getRuleContext(Signal_modeContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interface_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterInterface_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitInterface_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitInterface_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_variable_declarationContext interface_variable_declaration() throws RecognitionException {
		Interface_variable_declarationContext _localctx = new Interface_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_interface_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(1593);
				match(VARIABLE);
				}
			}

			setState(1596);
			identifier_list();
			setState(1597);
			match(COLON);
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223335478093086720L) != 0)) {
				{
				setState(1598);
				signal_mode();
				}
			}

			setState(1601);
			subtype_indication();
			setState(1604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1602);
				match(VARASGN);
				setState(1603);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Iteration_schemeContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VHDLParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode FOR() { return getToken(VHDLParser.FOR, 0); }
		public Parameter_specificationContext parameter_specification() {
			return getRuleContext(Parameter_specificationContext.class,0);
		}
		public Iteration_schemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterIteration_scheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitIteration_scheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitIteration_scheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_schemeContext iteration_scheme() throws RecognitionException {
		Iteration_schemeContext _localctx = new Iteration_schemeContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_iteration_scheme);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				match(WHILE);
				setState(1607);
				condition();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1608);
				match(FOR);
				setState(1609);
				parameter_specification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Label_colonContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Label_colonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterLabel_colon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitLabel_colon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitLabel_colon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_colonContext label_colon() throws RecognitionException {
		Label_colonContext _localctx = new Label_colonContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_label_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			identifier();
			setState(1613);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Library_clauseContext extends ParserRuleContext {
		public TerminalNode LIBRARY() { return getToken(VHDLParser.LIBRARY, 0); }
		public Logical_name_listContext logical_name_list() {
			return getRuleContext(Logical_name_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Library_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterLibrary_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitLibrary_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitLibrary_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Library_clauseContext library_clause() throws RecognitionException {
		Library_clauseContext _localctx = new Library_clauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_library_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			match(LIBRARY);
			setState(1616);
			logical_name_list();
			setState(1617);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Library_unitContext extends ParserRuleContext {
		public Secondary_unitContext secondary_unit() {
			return getRuleContext(Secondary_unitContext.class,0);
		}
		public Primary_unitContext primary_unit() {
			return getRuleContext(Primary_unitContext.class,0);
		}
		public Library_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterLibrary_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitLibrary_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitLibrary_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Library_unitContext library_unit() throws RecognitionException {
		Library_unitContext _localctx = new Library_unitContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_library_unit);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				secondary_unit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				primary_unit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NULL_() { return getToken(VHDLParser.NULL_, 0); }
		public TerminalNode BIT_STRING_LITERAL() { return getToken(VHDLParser.BIT_STRING_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(VHDLParser.STRING_LITERAL, 0); }
		public Enumeration_literalContext enumeration_literal() {
			return getRuleContext(Enumeration_literalContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_literal);
		try {
			setState(1628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1623);
				match(NULL_);
				}
				break;
			case BIT_STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1624);
				match(BIT_STRING_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1625);
				match(STRING_LITERAL);
				}
				break;
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1626);
				enumeration_literal();
				}
				break;
			case BASE_LITERAL:
			case REAL_LITERAL:
			case INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1627);
				numeric_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterLogical_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitLogical_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitLogical_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_nameContext logical_name() throws RecognitionException {
		Logical_nameContext _localctx = new Logical_nameContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_name_listContext extends ParserRuleContext {
		public List<Logical_nameContext> logical_name() {
			return getRuleContexts(Logical_nameContext.class);
		}
		public Logical_nameContext logical_name(int i) {
			return getRuleContext(Logical_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Logical_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterLogical_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitLogical_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitLogical_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_name_listContext logical_name_list() throws RecognitionException {
		Logical_name_listContext _localctx = new Logical_name_listContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_logical_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			logical_name();
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1633);
				match(COMMA);
				setState(1634);
				logical_name();
				}
				}
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(VHDLParser.AND, 0); }
		public TerminalNode OR() { return getToken(VHDLParser.OR, 0); }
		public TerminalNode NAND() { return getToken(VHDLParser.NAND, 0); }
		public TerminalNode NOR() { return getToken(VHDLParser.NOR, 0); }
		public TerminalNode XOR() { return getToken(VHDLParser.XOR, 0); }
		public TerminalNode XNOR() { return getToken(VHDLParser.XNOR, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2342997706139500672L) != 0) || _la==XNOR || _la==XOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_statementContext extends ParserRuleContext {
		public List<TerminalNode> LOOP() { return getTokens(VHDLParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(VHDLParser.LOOP, i);
		}
		public Sequence_of_statementsContext sequence_of_statements() {
			return getRuleContext(Sequence_of_statementsContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Iteration_schemeContext iteration_scheme() {
			return getRuleContext(Iteration_schemeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1642);
				label_colon();
				}
			}

			setState(1646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR || _la==WHILE) {
				{
				setState(1645);
				iteration_scheme();
				}
			}

			setState(1648);
			match(LOOP);
			setState(1649);
			sequence_of_statements();
			setState(1650);
			match(END);
			setState(1651);
			match(LOOP);
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1652);
				identifier();
				}
			}

			setState(1655);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signal_modeContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(VHDLParser.IN, 0); }
		public TerminalNode OUT() { return getToken(VHDLParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(VHDLParser.INOUT, 0); }
		public TerminalNode BUFFER() { return getToken(VHDLParser.BUFFER, 0); }
		public TerminalNode LINKAGE() { return getToken(VHDLParser.LINKAGE, 0); }
		public Signal_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_mode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSignal_mode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSignal_mode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSignal_mode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_modeContext signal_mode() throws RecognitionException {
		Signal_modeContext _localctx = new Signal_modeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_signal_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223335478093086720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multiplying_operatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(VHDLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VHDLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(VHDLParser.MOD, 0); }
		public TerminalNode REM() { return getToken(VHDLParser.REM, 0); }
		public Multiplying_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplying_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterMultiplying_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitMultiplying_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitMultiplying_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplying_operatorContext multiplying_operator() throws RecognitionException {
		Multiplying_operatorContext _localctx = new Multiplying_operatorContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_multiplying_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			_la = _input.LA(1);
			if ( !(_la==MOD || _la==REM || _la==MUL || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(VHDLParser.STRING_LITERAL, 0); }
		public List<Name_partContext> name_part() {
			return getRuleContexts(Name_partContext.class);
		}
		public Name_partContext name_part(int i) {
			return getRuleContext(Name_partContext.class,i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				{
				setState(1661);
				identifier();
				}
				break;
			case STRING_LITERAL:
				{
				setState(1662);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1665);
					name_part();
					}
					} 
				}
				setState(1670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Name_partContext extends ParserRuleContext {
		public Selected_name_partContext selected_name_part() {
			return getRuleContext(Selected_name_partContext.class,0);
		}
		public Function_call_or_indexed_name_partContext function_call_or_indexed_name_part() {
			return getRuleContext(Function_call_or_indexed_name_partContext.class,0);
		}
		public Slice_name_partContext slice_name_part() {
			return getRuleContext(Slice_name_partContext.class,0);
		}
		public Attribute_name_partContext attribute_name_part() {
			return getRuleContext(Attribute_name_partContext.class,0);
		}
		public Name_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterName_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitName_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitName_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_partContext name_part() throws RecognitionException {
		Name_partContext _localctx = new Name_partContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_name_part);
		try {
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				selected_name_part();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1672);
				function_call_or_indexed_name_part();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1673);
				slice_name_part();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1674);
				attribute_name_part();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Selected_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(VHDLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VHDLParser.DOT, i);
		}
		public List<SuffixContext> suffix() {
			return getRuleContexts(SuffixContext.class);
		}
		public SuffixContext suffix(int i) {
			return getRuleContext(SuffixContext.class,i);
		}
		public Selected_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selected_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSelected_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSelected_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSelected_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selected_nameContext selected_name() throws RecognitionException {
		Selected_nameContext _localctx = new Selected_nameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_selected_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			identifier();
			setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1678);
				match(DOT);
				setState(1679);
				suffix();
				}
				}
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Selected_name_partContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(VHDLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VHDLParser.DOT, i);
		}
		public List<SuffixContext> suffix() {
			return getRuleContexts(SuffixContext.class);
		}
		public SuffixContext suffix(int i) {
			return getRuleContext(SuffixContext.class,i);
		}
		public Selected_name_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selected_name_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSelected_name_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSelected_name_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSelected_name_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selected_name_partContext selected_name_part() throws RecognitionException {
		Selected_name_partContext _localctx = new Selected_name_partContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_selected_name_part);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1687); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1685);
					match(DOT);
					setState(1686);
					suffix();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1689); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_or_indexed_name_partContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Actual_parameter_partContext actual_parameter_part() {
			return getRuleContext(Actual_parameter_partContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Function_call_or_indexed_name_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_or_indexed_name_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFunction_call_or_indexed_name_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFunction_call_or_indexed_name_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFunction_call_or_indexed_name_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_or_indexed_name_partContext function_call_or_indexed_name_part() throws RecognitionException {
		Function_call_or_indexed_name_partContext _localctx = new Function_call_or_indexed_name_partContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_function_call_or_indexed_name_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(LPAREN);
			setState(1692);
			actual_parameter_part();
			setState(1693);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Slice_name_partContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Slice_name_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_name_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSlice_name_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSlice_name_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSlice_name_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slice_name_partContext slice_name_part() throws RecognitionException {
		Slice_name_partContext _localctx = new Slice_name_partContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_slice_name_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(LPAREN);
			setState(1696);
			discrete_range();
			setState(1697);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_name_partContext extends ParserRuleContext {
		public TerminalNode APOSTROPHE() { return getToken(VHDLParser.APOSTROPHE, 0); }
		public Attribute_designatorContext attribute_designator() {
			return getRuleContext(Attribute_designatorContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Attribute_name_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterAttribute_name_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitAttribute_name_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitAttribute_name_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_name_partContext attribute_name_part() throws RecognitionException {
		Attribute_name_partContext _localctx = new Attribute_name_partContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_attribute_name_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(1699);
				signature();
				}
			}

			setState(1702);
			match(APOSTROPHE);
			setState(1703);
			attribute_designator();
			setState(1708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1704);
				match(LPAREN);
				setState(1705);
				expression();
				setState(1706);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nature_declarationContext extends ParserRuleContext {
		public TerminalNode NATURE() { return getToken(VHDLParser.NATURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Nature_definitionContext nature_definition() {
			return getRuleContext(Nature_definitionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Nature_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nature_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterNature_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitNature_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitNature_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nature_declarationContext nature_declaration() throws RecognitionException {
		Nature_declarationContext _localctx = new Nature_declarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_nature_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			match(NATURE);
			setState(1711);
			identifier();
			setState(1712);
			match(IS);
			setState(1713);
			nature_definition();
			setState(1714);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nature_definitionContext extends ParserRuleContext {
		public Scalar_nature_definitionContext scalar_nature_definition() {
			return getRuleContext(Scalar_nature_definitionContext.class,0);
		}
		public Composite_nature_definitionContext composite_nature_definition() {
			return getRuleContext(Composite_nature_definitionContext.class,0);
		}
		public Nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterNature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitNature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitNature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nature_definitionContext nature_definition() throws RecognitionException {
		Nature_definitionContext _localctx = new Nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_nature_definition);
		try {
			setState(1718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1716);
				scalar_nature_definition();
				}
				break;
			case ARRAY:
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1717);
				composite_nature_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nature_element_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Element_subnature_definitionContext element_subnature_definition() {
			return getRuleContext(Element_subnature_definitionContext.class,0);
		}
		public Nature_element_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nature_element_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterNature_element_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitNature_element_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitNature_element_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nature_element_declarationContext nature_element_declaration() throws RecognitionException {
		Nature_element_declarationContext _localctx = new Nature_element_declarationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_nature_element_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			identifier_list();
			setState(1721);
			match(COLON);
			setState(1722);
			element_subnature_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Next_statementContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(VHDLParser.NEXT, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(VHDLParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Next_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterNext_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitNext_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitNext_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_statementContext next_statement() throws RecognitionException {
		Next_statementContext _localctx = new Next_statementContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_next_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1724);
				label_colon();
				}
			}

			setState(1727);
			match(NEXT);
			setState(1729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1728);
				identifier();
				}
			}

			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1731);
				match(WHEN);
				setState(1732);
				condition();
				}
			}

			setState(1735);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_literalContext extends ParserRuleContext {
		public Abstract_literalContext abstract_literal() {
			return getRuleContext(Abstract_literalContext.class,0);
		}
		public Physical_literalContext physical_literal() {
			return getRuleContext(Physical_literalContext.class,0);
		}
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_numeric_literal);
		try {
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1737);
				abstract_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1738);
				physical_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Object_declarationContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Terminal_declarationContext terminal_declaration() {
			return getRuleContext(Terminal_declarationContext.class,0);
		}
		public Quantity_declarationContext quantity_declaration() {
			return getRuleContext(Quantity_declarationContext.class,0);
		}
		public Object_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterObject_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitObject_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitObject_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_declarationContext object_declaration() throws RecognitionException {
		Object_declarationContext _localctx = new Object_declarationContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_object_declaration);
		try {
			setState(1747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1741);
				constant_declaration();
				}
				break;
			case SIGNAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1742);
				signal_declaration();
				}
				break;
			case SHARED:
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1743);
				variable_declaration();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1744);
				file_declaration();
				}
				break;
			case TERMINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1745);
				terminal_declaration();
				}
				break;
			case QUANTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1746);
				quantity_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptsContext extends ParserRuleContext {
		public TerminalNode GUARDED() { return getToken(VHDLParser.GUARDED, 0); }
		public Delay_mechanismContext delay_mechanism() {
			return getRuleContext(Delay_mechanismContext.class,0);
		}
		public OptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterOpts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitOpts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitOpts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptsContext opts() throws RecognitionException {
		OptsContext _localctx = new OptsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GUARDED) {
				{
				setState(1749);
				match(GUARDED);
				}
			}

			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 1152921538966585345L) != 0)) {
				{
				setState(1752);
				delay_mechanism();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_bodyContext extends ParserRuleContext {
		public List<TerminalNode> PACKAGE() { return getTokens(VHDLParser.PACKAGE); }
		public TerminalNode PACKAGE(int i) {
			return getToken(VHDLParser.PACKAGE, i);
		}
		public List<TerminalNode> BODY() { return getTokens(VHDLParser.BODY); }
		public TerminalNode BODY(int i) {
			return getToken(VHDLParser.BODY, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Package_body_declarative_partContext package_body_declarative_part() {
			return getRuleContext(Package_body_declarative_partContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(PACKAGE);
			setState(1756);
			match(BODY);
			setState(1757);
			identifier();
			setState(1758);
			match(IS);
			setState(1759);
			package_body_declarative_part();
			setState(1760);
			match(END);
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(1761);
				match(PACKAGE);
				setState(1762);
				match(BODY);
				}
			}

			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1765);
				identifier();
				}
			}

			setState(1768);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_body_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Package_body_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPackage_body_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPackage_body_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPackage_body_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_declarative_itemContext package_body_declarative_item() throws RecognitionException {
		Package_body_declarative_itemContext _localctx = new Package_body_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_package_body_declarative_item);
		try {
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1771);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1772);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1773);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1774);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1775);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1776);
				file_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1777);
				alias_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1778);
				use_clause();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1779);
				group_template_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1780);
				group_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_body_declarative_partContext extends ParserRuleContext {
		public List<Package_body_declarative_itemContext> package_body_declarative_item() {
			return getRuleContexts(Package_body_declarative_itemContext.class);
		}
		public Package_body_declarative_itemContext package_body_declarative_item(int i) {
			return getRuleContext(Package_body_declarative_itemContext.class,i);
		}
		public Package_body_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPackage_body_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPackage_body_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPackage_body_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_declarative_partContext package_body_declarative_part() throws RecognitionException {
		Package_body_declarative_partContext _localctx = new Package_body_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_package_body_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 157305274400L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210487083013L) != 0)) {
				{
				{
				setState(1783);
				package_body_declarative_item();
				}
				}
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_declarationContext extends ParserRuleContext {
		public List<TerminalNode> PACKAGE() { return getTokens(VHDLParser.PACKAGE); }
		public TerminalNode PACKAGE(int i) {
			return getToken(VHDLParser.PACKAGE, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Package_declarative_partContext package_declarative_part() {
			return getRuleContext(Package_declarative_partContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPackage_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPackage_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPackage_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_package_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			match(PACKAGE);
			setState(1790);
			identifier();
			setState(1791);
			match(IS);
			setState(1792);
			package_declarative_part();
			setState(1793);
			match(END);
			setState(1795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(1794);
				match(PACKAGE);
				}
			}

			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1797);
				identifier();
				}
			}

			setState(1800);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Component_declarationContext component_declaration() {
			return getRuleContext(Component_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Disconnection_specificationContext disconnection_specification() {
			return getRuleContext(Disconnection_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Nature_declarationContext nature_declaration() {
			return getRuleContext(Nature_declarationContext.class,0);
		}
		public Subnature_declarationContext subnature_declaration() {
			return getRuleContext(Subnature_declarationContext.class,0);
		}
		public Terminal_declarationContext terminal_declaration() {
			return getRuleContext(Terminal_declarationContext.class,0);
		}
		public Package_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPackage_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPackage_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPackage_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_declarative_itemContext package_declarative_item() throws RecognitionException {
		Package_declarative_itemContext _localctx = new Package_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_package_declarative_item);
		try {
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1803);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1804);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1805);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1806);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1807);
				signal_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1808);
				variable_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1809);
				file_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1810);
				alias_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1811);
				component_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1812);
				attribute_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1813);
				attribute_specification();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1814);
				disconnection_specification();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1815);
				use_clause();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1816);
				group_template_declaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1817);
				group_declaration();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1818);
				nature_declaration();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1819);
				subnature_declaration();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1820);
				terminal_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_declarative_partContext extends ParserRuleContext {
		public List<Package_declarative_itemContext> package_declarative_item() {
			return getRuleContexts(Package_declarative_itemContext.class);
		}
		public Package_declarative_itemContext package_declarative_item(int i) {
			return getRuleContext(Package_declarative_itemContext.class,i);
		}
		public Package_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPackage_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPackage_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPackage_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_declarative_partContext package_declarative_part() throws RecognitionException {
		Package_declarative_partContext _localctx = new Package_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_package_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251957123680288L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210571231237L) != 0)) {
				{
				{
				setState(1823);
				package_declarative_item();
				}
				}
				setState(1828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_specificationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(VHDLParser.IN, 0); }
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public Parameter_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterParameter_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitParameter_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitParameter_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_specificationContext parameter_specification() throws RecognitionException {
		Parameter_specificationContext _localctx = new Parameter_specificationContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_parameter_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			identifier();
			setState(1830);
			match(IN);
			setState(1831);
			discrete_range();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Physical_literalContext extends ParserRuleContext {
		public Abstract_literalContext abstract_literal() {
			return getRuleContext(Abstract_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Physical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPhysical_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPhysical_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPhysical_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Physical_literalContext physical_literal() throws RecognitionException {
		Physical_literalContext _localctx = new Physical_literalContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_physical_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			abstract_literal();
			{
			setState(1834);
			identifier();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Physical_type_definitionContext extends ParserRuleContext {
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public List<TerminalNode> UNITS() { return getTokens(VHDLParser.UNITS); }
		public TerminalNode UNITS(int i) {
			return getToken(VHDLParser.UNITS, i);
		}
		public Base_unit_declarationContext base_unit_declaration() {
			return getRuleContext(Base_unit_declarationContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public List<Secondary_unit_declarationContext> secondary_unit_declaration() {
			return getRuleContexts(Secondary_unit_declarationContext.class);
		}
		public Secondary_unit_declarationContext secondary_unit_declaration(int i) {
			return getRuleContext(Secondary_unit_declarationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Physical_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPhysical_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPhysical_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPhysical_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Physical_type_definitionContext physical_type_definition() throws RecognitionException {
		Physical_type_definitionContext _localctx = new Physical_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_physical_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			range_constraint();
			setState(1837);
			match(UNITS);
			setState(1838);
			base_unit_declaration();
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				{
				setState(1839);
				secondary_unit_declaration();
				}
				}
				setState(1844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1845);
			match(END);
			setState(1846);
			match(UNITS);
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1847);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Port_clauseContext extends ParserRuleContext {
		public TerminalNode PORT() { return getToken(VHDLParser.PORT, 0); }
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Port_listContext port_list() {
			return getRuleContext(Port_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Port_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPort_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPort_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPort_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_clauseContext port_clause() throws RecognitionException {
		Port_clauseContext _localctx = new Port_clauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_port_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			match(PORT);
			setState(1851);
			match(LPAREN);
			setState(1852);
			port_list();
			setState(1853);
			match(RPAREN);
			setState(1854);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Port_listContext extends ParserRuleContext {
		public Interface_port_listContext interface_port_list() {
			return getRuleContext(Interface_port_listContext.class,0);
		}
		public Port_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPort_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPort_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPort_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_listContext port_list() throws RecognitionException {
		Port_listContext _localctx = new Port_listContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_port_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			interface_port_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Port_map_aspectContext extends ParserRuleContext {
		public TerminalNode PORT() { return getToken(VHDLParser.PORT, 0); }
		public TerminalNode MAP() { return getToken(VHDLParser.MAP, 0); }
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Association_listContext association_list() {
			return getRuleContext(Association_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Port_map_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_map_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPort_map_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPort_map_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPort_map_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_map_aspectContext port_map_aspect() throws RecognitionException {
		Port_map_aspectContext _localctx = new Port_map_aspectContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_port_map_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			match(PORT);
			setState(1859);
			match(MAP);
			setState(1860);
			match(LPAREN);
			setState(1861);
			association_list();
			setState(1862);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Qualified_expressionContext qualified_expression() {
			return getRuleContext(Qualified_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public AllocatorContext allocator() {
			return getRuleContext(AllocatorContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_primary);
		try {
			setState(1873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1864);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1865);
				qualified_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1866);
				match(LPAREN);
				setState(1867);
				expression();
				setState(1868);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1870);
				allocator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1871);
				aggregate();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1872);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_unitContext extends ParserRuleContext {
		public Entity_declarationContext entity_declaration() {
			return getRuleContext(Entity_declarationContext.class,0);
		}
		public Configuration_declarationContext configuration_declaration() {
			return getRuleContext(Configuration_declarationContext.class,0);
		}
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public Primary_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterPrimary_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitPrimary_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitPrimary_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_unitContext primary_unit() throws RecognitionException {
		Primary_unitContext _localctx = new Primary_unitContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_primary_unit);
		try {
			setState(1878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1875);
				entity_declaration();
				}
				break;
			case CONFIGURATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
				configuration_declaration();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1877);
				package_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedural_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Procedural_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedural_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcedural_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcedural_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcedural_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedural_declarative_itemContext procedural_declarative_item() throws RecognitionException {
		Procedural_declarative_itemContext _localctx = new Procedural_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_procedural_declarative_item);
		try {
			setState(1892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1880);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1881);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1882);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1883);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1884);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1885);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1886);
				alias_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1887);
				attribute_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1888);
				attribute_specification();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1889);
				use_clause();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1890);
				group_template_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1891);
				group_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedural_declarative_partContext extends ParserRuleContext {
		public List<Procedural_declarative_itemContext> procedural_declarative_item() {
			return getRuleContexts(Procedural_declarative_itemContext.class);
		}
		public Procedural_declarative_itemContext procedural_declarative_item(int i) {
			return getRuleContext(Procedural_declarative_itemContext.class,i);
		}
		public Procedural_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedural_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcedural_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcedural_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcedural_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedural_declarative_partContext procedural_declarative_part() throws RecognitionException {
		Procedural_declarative_partContext _localctx = new Procedural_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_procedural_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 156768405536L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210487083013L) != 0)) {
				{
				{
				setState(1894);
				procedural_declarative_item();
				}
				}
				setState(1899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedural_statement_partContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Procedural_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedural_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcedural_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcedural_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcedural_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedural_statement_partContext procedural_statement_part() throws RecognitionException {
		Procedural_statement_partContext _localctx = new Procedural_statement_partContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_procedural_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 153263194880902144L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & -9222807436425953277L) != 0)) {
				{
				{
				setState(1900);
				sequential_statement();
				}
				}
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_callContext extends ParserRuleContext {
		public Selected_nameContext selected_name() {
			return getRuleContext(Selected_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Actual_parameter_partContext actual_parameter_part() {
			return getRuleContext(Actual_parameter_partContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Procedure_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcedure_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcedure_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcedure_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_procedure_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			selected_name();
			setState(1911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1907);
				match(LPAREN);
				setState(1908);
				actual_parameter_part();
				setState(1909);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_call_statementContext extends ParserRuleContext {
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Procedure_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcedure_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcedure_call_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcedure_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_call_statementContext procedure_call_statement() throws RecognitionException {
		Procedure_call_statementContext _localctx = new Procedure_call_statementContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_procedure_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1913);
				label_colon();
				}
				break;
			}
			setState(1916);
			procedure_call();
			setState(1917);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Process_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Process_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcess_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcess_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcess_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Process_declarative_itemContext process_declarative_item() throws RecognitionException {
		Process_declarative_itemContext _localctx = new Process_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_process_declarative_item);
		try {
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1919);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1920);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1921);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1922);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1923);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1924);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1925);
				file_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1926);
				alias_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1927);
				attribute_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1928);
				attribute_specification();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1929);
				use_clause();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1930);
				group_template_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1931);
				group_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Process_declarative_partContext extends ParserRuleContext {
		public List<Process_declarative_itemContext> process_declarative_item() {
			return getRuleContexts(Process_declarative_itemContext.class);
		}
		public Process_declarative_itemContext process_declarative_item(int i) {
			return getRuleContext(Process_declarative_itemContext.class,i);
		}
		public Process_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcess_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcess_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcess_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Process_declarative_partContext process_declarative_part() throws RecognitionException {
		Process_declarative_partContext _localctx = new Process_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_process_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 157305276448L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210487083013L) != 0)) {
				{
				{
				setState(1934);
				process_declarative_item();
				}
				}
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Process_statementContext extends ParserRuleContext {
		public List<TerminalNode> PROCESS() { return getTokens(VHDLParser.PROCESS); }
		public TerminalNode PROCESS(int i) {
			return getToken(VHDLParser.PROCESS, i);
		}
		public Process_declarative_partContext process_declarative_part() {
			return getRuleContext(Process_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(VHDLParser.BEGIN, 0); }
		public Process_statement_partContext process_statement_part() {
			return getRuleContext(Process_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<TerminalNode> POSTPONED() { return getTokens(VHDLParser.POSTPONED); }
		public TerminalNode POSTPONED(int i) {
			return getToken(VHDLParser.POSTPONED, i);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Sensitivity_listContext sensitivity_list() {
			return getRuleContext(Sensitivity_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Process_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcess_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcess_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcess_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Process_statementContext process_statement() throws RecognitionException {
		Process_statementContext _localctx = new Process_statementContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_process_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1940);
				label_colon();
				}
			}

			setState(1944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(1943);
				match(POSTPONED);
				}
			}

			setState(1946);
			match(PROCESS);
			setState(1951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1947);
				match(LPAREN);
				setState(1948);
				sensitivity_list();
				setState(1949);
				match(RPAREN);
				}
			}

			setState(1954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1953);
				match(IS);
				}
			}

			setState(1956);
			process_declarative_part();
			setState(1957);
			match(BEGIN);
			setState(1958);
			process_statement_part();
			setState(1959);
			match(END);
			setState(1961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(1960);
				match(POSTPONED);
				}
			}

			setState(1963);
			match(PROCESS);
			setState(1965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(1964);
				identifier();
				}
			}

			setState(1967);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Process_statement_partContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Process_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcess_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcess_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcess_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Process_statement_partContext process_statement_part() throws RecognitionException {
		Process_statement_partContext _localctx = new Process_statement_partContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_process_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 153263194880902144L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & -9222807436425953277L) != 0)) {
				{
				{
				setState(1969);
				sequential_statement();
				}
				}
				setState(1974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_expressionContext extends ParserRuleContext {
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode APOSTROPHE() { return getToken(VHDLParser.APOSTROPHE, 0); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Qualified_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterQualified_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitQualified_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitQualified_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_expressionContext qualified_expression() throws RecognitionException {
		Qualified_expressionContext _localctx = new Qualified_expressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_qualified_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			subtype_indication();
			setState(1976);
			match(APOSTROPHE);
			setState(1982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1977);
				aggregate();
				}
				break;
			case 2:
				{
				setState(1978);
				match(LPAREN);
				setState(1979);
				expression();
				setState(1980);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Quantity_declarationContext extends ParserRuleContext {
		public Free_quantity_declarationContext free_quantity_declaration() {
			return getRuleContext(Free_quantity_declarationContext.class,0);
		}
		public Branch_quantity_declarationContext branch_quantity_declaration() {
			return getRuleContext(Branch_quantity_declarationContext.class,0);
		}
		public Source_quantity_declarationContext source_quantity_declaration() {
			return getRuleContext(Source_quantity_declarationContext.class,0);
		}
		public Quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterQuantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitQuantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitQuantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantity_declarationContext quantity_declaration() throws RecognitionException {
		Quantity_declarationContext _localctx = new Quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_quantity_declaration);
		try {
			setState(1987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				free_quantity_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				branch_quantity_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1986);
				source_quantity_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Quantity_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public TerminalNode OTHERS() { return getToken(VHDLParser.OTHERS, 0); }
		public TerminalNode ALL() { return getToken(VHDLParser.ALL, 0); }
		public Quantity_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterQuantity_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitQuantity_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitQuantity_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantity_listContext quantity_list() throws RecognitionException {
		Quantity_listContext _localctx = new Quantity_listContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_quantity_list);
		int _la;
		try {
			setState(1999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1989);
				name();
				setState(1994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1990);
					match(COMMA);
					setState(1991);
					name();
					}
					}
					setState(1996);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1997);
				match(OTHERS);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1998);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Quantity_specificationContext extends ParserRuleContext {
		public Quantity_listContext quantity_list() {
			return getRuleContext(Quantity_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Quantity_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterQuantity_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitQuantity_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitQuantity_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantity_specificationContext quantity_specification() throws RecognitionException {
		Quantity_specificationContext _localctx = new Quantity_specificationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_quantity_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			quantity_list();
			setState(2002);
			match(COLON);
			setState(2003);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_declContext extends ParserRuleContext {
		public Explicit_rangeContext explicit_range() {
			return getRuleContext(Explicit_rangeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Range_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterRange_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitRange_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitRange_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_declContext range_decl() throws RecognitionException {
		Range_declContext _localctx = new Range_declContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_range_decl);
		try {
			setState(2007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2005);
				explicit_range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2006);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_rangeContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Explicit_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterExplicit_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitExplicit_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitExplicit_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_rangeContext explicit_range() throws RecognitionException {
		Explicit_rangeContext _localctx = new Explicit_rangeContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_explicit_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			simple_expression();
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(2010);
				direction();
				setState(2011);
				simple_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_constraintContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(VHDLParser.RANGE, 0); }
		public Range_declContext range_decl() {
			return getRuleContext(Range_declContext.class,0);
		}
		public Range_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterRange_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitRange_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitRange_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_constraintContext range_constraint() throws RecognitionException {
		Range_constraintContext _localctx = new Range_constraintContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_range_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			match(RANGE);
			setState(2016);
			range_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Record_nature_definitionContext extends ParserRuleContext {
		public List<TerminalNode> RECORD() { return getTokens(VHDLParser.RECORD); }
		public TerminalNode RECORD(int i) {
			return getToken(VHDLParser.RECORD, i);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public List<Nature_element_declarationContext> nature_element_declaration() {
			return getRuleContexts(Nature_element_declarationContext.class);
		}
		public Nature_element_declarationContext nature_element_declaration(int i) {
			return getRuleContext(Nature_element_declarationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Record_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterRecord_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitRecord_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitRecord_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_nature_definitionContext record_nature_definition() throws RecognitionException {
		Record_nature_definitionContext _localctx = new Record_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_record_nature_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			match(RECORD);
			setState(2020); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2019);
				nature_element_declaration();
				}
				}
				setState(2022); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER );
			setState(2024);
			match(END);
			setState(2025);
			match(RECORD);
			setState(2027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2026);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Record_type_definitionContext extends ParserRuleContext {
		public List<TerminalNode> RECORD() { return getTokens(VHDLParser.RECORD); }
		public TerminalNode RECORD(int i) {
			return getToken(VHDLParser.RECORD, i);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public List<Element_declarationContext> element_declaration() {
			return getRuleContexts(Element_declarationContext.class);
		}
		public Element_declarationContext element_declaration(int i) {
			return getRuleContext(Element_declarationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Record_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterRecord_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitRecord_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitRecord_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_type_definitionContext record_type_definition() throws RecognitionException {
		Record_type_definitionContext _localctx = new Record_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_record_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			match(RECORD);
			setState(2031); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2030);
				element_declaration();
				}
				}
				setState(2033); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER );
			setState(2035);
			match(END);
			setState(2036);
			match(RECORD);
			setState(2038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2037);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_relation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			shift_expression();
			setState(2044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(2041);
				relational_operator();
				setState(2042);
				shift_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_operatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(VHDLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VHDLParser.NEQ, 0); }
		public TerminalNode LOWERTHAN() { return getToken(VHDLParser.LOWERTHAN, 0); }
		public TerminalNode LE() { return getToken(VHDLParser.LE, 0); }
		public TerminalNode GREATERTHAN() { return getToken(VHDLParser.GREATERTHAN, 0); }
		public TerminalNode GE() { return getToken(VHDLParser.GE, 0); }
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 3670027L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Report_statementContext extends ParserRuleContext {
		public TerminalNode REPORT() { return getToken(VHDLParser.REPORT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode SEVERITY() { return getToken(VHDLParser.SEVERITY, 0); }
		public Report_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterReport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitReport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitReport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Report_statementContext report_statement() throws RecognitionException {
		Report_statementContext _localctx = new Report_statementContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_report_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2048);
				label_colon();
				}
			}

			setState(2051);
			match(REPORT);
			setState(2052);
			expression();
			setState(2055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEVERITY) {
				{
				setState(2053);
				match(SEVERITY);
				setState(2054);
				expression();
				}
			}

			setState(2057);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(VHDLParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2059);
				label_colon();
				}
			}

			setState(2062);
			match(RETURN);
			setState(2064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220676381741154306L) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 141150879056099L) != 0)) {
				{
				setState(2063);
				expression();
				}
			}

			setState(2066);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Scalar_nature_definitionContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode ACROSS() { return getToken(VHDLParser.ACROSS, 0); }
		public TerminalNode THROUGH() { return getToken(VHDLParser.THROUGH, 0); }
		public TerminalNode REFERENCE() { return getToken(VHDLParser.REFERENCE, 0); }
		public Scalar_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterScalar_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitScalar_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitScalar_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_nature_definitionContext scalar_nature_definition() throws RecognitionException {
		Scalar_nature_definitionContext _localctx = new Scalar_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_scalar_nature_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			name();
			setState(2069);
			match(ACROSS);
			setState(2070);
			name();
			setState(2071);
			match(THROUGH);
			setState(2072);
			name();
			setState(2073);
			match(REFERENCE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Scalar_type_definitionContext extends ParserRuleContext {
		public Physical_type_definitionContext physical_type_definition() {
			return getRuleContext(Physical_type_definitionContext.class,0);
		}
		public Enumeration_type_definitionContext enumeration_type_definition() {
			return getRuleContext(Enumeration_type_definitionContext.class,0);
		}
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public Scalar_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterScalar_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitScalar_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitScalar_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_type_definitionContext scalar_type_definition() throws RecognitionException {
		Scalar_type_definitionContext _localctx = new Scalar_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_scalar_type_definition);
		try {
			setState(2078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2075);
				physical_type_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2076);
				enumeration_type_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2077);
				range_constraint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Secondary_unitContext extends ParserRuleContext {
		public Architecture_bodyContext architecture_body() {
			return getRuleContext(Architecture_bodyContext.class,0);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public Secondary_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSecondary_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSecondary_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSecondary_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secondary_unitContext secondary_unit() throws RecognitionException {
		Secondary_unitContext _localctx = new Secondary_unitContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_secondary_unit);
		try {
			setState(2082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARCHITECTURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2080);
				architecture_body();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2081);
				package_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Secondary_unit_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VHDLParser.EQ, 0); }
		public Physical_literalContext physical_literal() {
			return getRuleContext(Physical_literalContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Secondary_unit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_unit_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSecondary_unit_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSecondary_unit_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSecondary_unit_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secondary_unit_declarationContext secondary_unit_declaration() throws RecognitionException {
		Secondary_unit_declarationContext _localctx = new Secondary_unit_declarationContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_secondary_unit_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			identifier();
			setState(2085);
			match(EQ);
			setState(2086);
			physical_literal();
			setState(2087);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Selected_signal_assignmentContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(VHDLParser.WITH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(VHDLParser.SELECT, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode LE() { return getToken(VHDLParser.LE, 0); }
		public OptsContext opts() {
			return getRuleContext(OptsContext.class,0);
		}
		public Selected_waveformsContext selected_waveforms() {
			return getRuleContext(Selected_waveformsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Selected_signal_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selected_signal_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSelected_signal_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSelected_signal_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSelected_signal_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selected_signal_assignmentContext selected_signal_assignment() throws RecognitionException {
		Selected_signal_assignmentContext _localctx = new Selected_signal_assignmentContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_selected_signal_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			match(WITH);
			setState(2090);
			expression();
			setState(2091);
			match(SELECT);
			setState(2092);
			target();
			setState(2093);
			match(LE);
			setState(2094);
			opts();
			setState(2095);
			selected_waveforms();
			setState(2096);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Selected_waveformsContext extends ParserRuleContext {
		public List<WaveformContext> waveform() {
			return getRuleContexts(WaveformContext.class);
		}
		public WaveformContext waveform(int i) {
			return getRuleContext(WaveformContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(VHDLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(VHDLParser.WHEN, i);
		}
		public List<ChoicesContext> choices() {
			return getRuleContexts(ChoicesContext.class);
		}
		public ChoicesContext choices(int i) {
			return getRuleContext(ChoicesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Selected_waveformsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selected_waveforms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSelected_waveforms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSelected_waveforms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSelected_waveforms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selected_waveformsContext selected_waveforms() throws RecognitionException {
		Selected_waveformsContext _localctx = new Selected_waveformsContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_selected_waveforms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
			waveform();
			setState(2099);
			match(WHEN);
			setState(2100);
			choices();
			setState(2108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2101);
				match(COMMA);
				setState(2102);
				waveform();
				setState(2103);
				match(WHEN);
				setState(2104);
				choices();
				}
				}
				setState(2110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sensitivity_clauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(VHDLParser.ON, 0); }
		public Sensitivity_listContext sensitivity_list() {
			return getRuleContext(Sensitivity_listContext.class,0);
		}
		public Sensitivity_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensitivity_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSensitivity_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSensitivity_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSensitivity_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sensitivity_clauseContext sensitivity_clause() throws RecognitionException {
		Sensitivity_clauseContext _localctx = new Sensitivity_clauseContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_sensitivity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
			match(ON);
			setState(2112);
			sensitivity_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sensitivity_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Sensitivity_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensitivity_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSensitivity_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSensitivity_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSensitivity_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sensitivity_listContext sensitivity_list() throws RecognitionException {
		Sensitivity_listContext _localctx = new Sensitivity_listContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_sensitivity_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			name();
			setState(2119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2115);
				match(COMMA);
				setState(2116);
				name();
				}
				}
				setState(2121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sequence_of_statementsContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Sequence_of_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_of_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSequence_of_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSequence_of_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSequence_of_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_of_statementsContext sequence_of_statements() throws RecognitionException {
		Sequence_of_statementsContext _localctx = new Sequence_of_statementsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_sequence_of_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 153263194880902144L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & -9222807436425953277L) != 0)) {
				{
				{
				setState(2122);
				sequential_statement();
				}
				}
				setState(2127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sequential_statementContext extends ParserRuleContext {
		public Wait_statementContext wait_statement() {
			return getRuleContext(Wait_statementContext.class,0);
		}
		public Assertion_statementContext assertion_statement() {
			return getRuleContext(Assertion_statementContext.class,0);
		}
		public Report_statementContext report_statement() {
			return getRuleContext(Report_statementContext.class,0);
		}
		public Signal_assignment_statementContext signal_assignment_statement() {
			return getRuleContext(Signal_assignment_statementContext.class,0);
		}
		public Variable_assignment_statementContext variable_assignment_statement() {
			return getRuleContext(Variable_assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Next_statementContext next_statement() {
			return getRuleContext(Next_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode NULL_() { return getToken(VHDLParser.NULL_, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Procedure_call_statementContext procedure_call_statement() {
			return getRuleContext(Procedure_call_statementContext.class,0);
		}
		public Sequential_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequential_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSequential_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSequential_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSequential_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequential_statementContext sequential_statement() throws RecognitionException {
		Sequential_statementContext _localctx = new Sequential_statementContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_sequential_statement);
		int _la;
		try {
			setState(2146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2128);
				wait_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2129);
				assertion_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2130);
				report_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2131);
				signal_assignment_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2132);
				variable_assignment_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2133);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2134);
				case_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2135);
				loop_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2136);
				next_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2137);
				exit_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2138);
				return_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
					{
					setState(2139);
					label_colon();
					}
				}

				setState(2142);
				match(NULL_);
				setState(2143);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2144);
				break_statement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2145);
				procedure_call_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public Shift_operatorContext shift_operator() {
			return getRuleContext(Shift_operatorContext.class,0);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_shift_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			simple_expression();
			setState(2152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(2149);
				shift_operator();
				setState(2150);
				simple_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shift_operatorContext extends ParserRuleContext {
		public TerminalNode SLL() { return getToken(VHDLParser.SLL, 0); }
		public TerminalNode SRL() { return getToken(VHDLParser.SRL, 0); }
		public TerminalNode SLA() { return getToken(VHDLParser.SLA, 0); }
		public TerminalNode SRA() { return getToken(VHDLParser.SRA, 0); }
		public TerminalNode ROL() { return getToken(VHDLParser.ROL, 0); }
		public TerminalNode ROR() { return getToken(VHDLParser.ROR, 0); }
		public Shift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterShift_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitShift_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitShift_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_operatorContext shift_operator() throws RecognitionException {
		Shift_operatorContext _localctx = new Shift_operatorContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_shift_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2154);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 1731L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signal_assignment_statementContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode LE() { return getToken(VHDLParser.LE, 0); }
		public WaveformContext waveform() {
			return getRuleContext(WaveformContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Delay_mechanismContext delay_mechanism() {
			return getRuleContext(Delay_mechanismContext.class,0);
		}
		public Signal_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSignal_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSignal_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSignal_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_assignment_statementContext signal_assignment_statement() throws RecognitionException {
		Signal_assignment_statementContext _localctx = new Signal_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_signal_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(2156);
				label_colon();
				}
				break;
			}
			setState(2159);
			target();
			setState(2160);
			match(LE);
			setState(2162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 1152921538966585345L) != 0)) {
				{
				setState(2161);
				delay_mechanism();
				}
			}

			setState(2164);
			waveform();
			setState(2165);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signal_declarationContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(VHDLParser.SIGNAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Signal_kindContext signal_kind() {
			return getRuleContext(Signal_kindContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Signal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSignal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSignal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSignal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_declarationContext signal_declaration() throws RecognitionException {
		Signal_declarationContext _localctx = new Signal_declarationContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_signal_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			match(SIGNAL);
			setState(2168);
			identifier_list();
			setState(2169);
			match(COLON);
			setState(2170);
			subtype_indication();
			setState(2172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BUS || _la==REGISTER) {
				{
				setState(2171);
				signal_kind();
				}
			}

			setState(2176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(2174);
				match(VARASGN);
				setState(2175);
				expression();
				}
			}

			setState(2178);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signal_kindContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(VHDLParser.REGISTER, 0); }
		public TerminalNode BUS() { return getToken(VHDLParser.BUS, 0); }
		public Signal_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSignal_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSignal_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSignal_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_kindContext signal_kind() throws RecognitionException {
		Signal_kindContext _localctx = new Signal_kindContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_signal_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			_la = _input.LA(1);
			if ( !(_la==BUS || _la==REGISTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signal_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public TerminalNode OTHERS() { return getToken(VHDLParser.OTHERS, 0); }
		public TerminalNode ALL() { return getToken(VHDLParser.ALL, 0); }
		public Signal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSignal_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSignal_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSignal_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_listContext signal_list() throws RecognitionException {
		Signal_listContext _localctx = new Signal_listContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_signal_list);
		int _la;
		try {
			setState(2192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2182);
				name();
				setState(2187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2183);
					match(COMMA);
					setState(2184);
					name();
					}
					}
					setState(2189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2190);
				match(OTHERS);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2191);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(VHDLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(VHDLParser.RBRACKET, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(VHDLParser.RETURN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			match(LBRACKET);
			setState(2203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 1027L) != 0)) {
				{
				setState(2195);
				name();
				setState(2200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2196);
					match(COMMA);
					setState(2197);
					name();
					}
					}
					setState(2202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(2205);
				match(RETURN);
				setState(2206);
				name();
				}
			}

			setState(2209);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Adding_operatorContext> adding_operator() {
			return getRuleContexts(Adding_operatorContext.class);
		}
		public Adding_operatorContext adding_operator(int i) {
			return getRuleContext(Adding_operatorContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(VHDLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VHDLParser.MINUS, 0); }
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_simple_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(2211);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2214);
			term();
			setState(2220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2215);
					adding_operator();
					setState(2216);
					term();
					}
					} 
				}
				setState(2222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_simultaneous_statementContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(VHDLParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Tolerance_aspectContext tolerance_aspect() {
			return getRuleContext(Tolerance_aspectContext.class,0);
		}
		public Simple_simultaneous_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_simultaneous_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSimple_simultaneous_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSimple_simultaneous_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSimple_simultaneous_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_simultaneous_statementContext simple_simultaneous_statement() throws RecognitionException {
		Simple_simultaneous_statementContext _localctx = new Simple_simultaneous_statementContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_simple_simultaneous_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(2223);
				label_colon();
				}
				break;
			}
			setState(2226);
			simple_expression();
			setState(2227);
			match(ASSIGN);
			setState(2228);
			simple_expression();
			setState(2230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOLERANCE) {
				{
				setState(2229);
				tolerance_aspect();
				}
			}

			setState(2232);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simultaneous_alternativeContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(VHDLParser.WHEN, 0); }
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(VHDLParser.ARROW, 0); }
		public Simultaneous_statement_partContext simultaneous_statement_part() {
			return getRuleContext(Simultaneous_statement_partContext.class,0);
		}
		public Simultaneous_alternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSimultaneous_alternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSimultaneous_alternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSimultaneous_alternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_alternativeContext simultaneous_alternative() throws RecognitionException {
		Simultaneous_alternativeContext _localctx = new Simultaneous_alternativeContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_simultaneous_alternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2234);
			match(WHEN);
			setState(2235);
			choices();
			setState(2236);
			match(ARROW);
			setState(2237);
			simultaneous_statement_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simultaneous_case_statementContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(VHDLParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(VHDLParser.CASE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode USE() { return getToken(VHDLParser.USE, 0); }
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<Simultaneous_alternativeContext> simultaneous_alternative() {
			return getRuleContexts(Simultaneous_alternativeContext.class);
		}
		public Simultaneous_alternativeContext simultaneous_alternative(int i) {
			return getRuleContext(Simultaneous_alternativeContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Simultaneous_case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSimultaneous_case_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSimultaneous_case_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSimultaneous_case_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_case_statementContext simultaneous_case_statement() throws RecognitionException {
		Simultaneous_case_statementContext _localctx = new Simultaneous_case_statementContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_simultaneous_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2239);
				label_colon();
				}
			}

			setState(2242);
			match(CASE);
			setState(2243);
			expression();
			setState(2244);
			match(USE);
			setState(2246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2245);
				simultaneous_alternative();
				}
				}
				setState(2248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(2250);
			match(END);
			setState(2251);
			match(CASE);
			setState(2253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2252);
				identifier();
				}
			}

			setState(2255);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simultaneous_if_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VHDLParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> USE() { return getTokens(VHDLParser.USE); }
		public TerminalNode USE(int i) {
			return getToken(VHDLParser.USE, i);
		}
		public List<Simultaneous_statement_partContext> simultaneous_statement_part() {
			return getRuleContexts(Simultaneous_statement_partContext.class);
		}
		public Simultaneous_statement_partContext simultaneous_statement_part(int i) {
			return getRuleContext(Simultaneous_statement_partContext.class,i);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<TerminalNode> ELSIF() { return getTokens(VHDLParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(VHDLParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(VHDLParser.ELSE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Simultaneous_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSimultaneous_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSimultaneous_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSimultaneous_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_if_statementContext simultaneous_if_statement() throws RecognitionException {
		Simultaneous_if_statementContext _localctx = new Simultaneous_if_statementContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_simultaneous_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2257);
				label_colon();
				}
			}

			setState(2260);
			match(IF);
			setState(2261);
			condition();
			setState(2262);
			match(USE);
			setState(2263);
			simultaneous_statement_part();
			setState(2271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(2264);
				match(ELSIF);
				setState(2265);
				condition();
				setState(2266);
				match(USE);
				setState(2267);
				simultaneous_statement_part();
				}
				}
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(2274);
				match(ELSE);
				setState(2275);
				simultaneous_statement_part();
				}
			}

			setState(2278);
			match(END);
			setState(2279);
			match(USE);
			setState(2281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2280);
				identifier();
				}
			}

			setState(2283);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simultaneous_procedural_statementContext extends ParserRuleContext {
		public List<TerminalNode> PROCEDURAL() { return getTokens(VHDLParser.PROCEDURAL); }
		public TerminalNode PROCEDURAL(int i) {
			return getToken(VHDLParser.PROCEDURAL, i);
		}
		public Procedural_declarative_partContext procedural_declarative_part() {
			return getRuleContext(Procedural_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(VHDLParser.BEGIN, 0); }
		public Procedural_statement_partContext procedural_statement_part() {
			return getRuleContext(Procedural_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Simultaneous_procedural_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_procedural_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSimultaneous_procedural_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSimultaneous_procedural_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSimultaneous_procedural_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_procedural_statementContext simultaneous_procedural_statement() throws RecognitionException {
		Simultaneous_procedural_statementContext _localctx = new Simultaneous_procedural_statementContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_simultaneous_procedural_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2285);
				label_colon();
				}
			}

			setState(2288);
			match(PROCEDURAL);
			setState(2290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2289);
				match(IS);
				}
			}

			setState(2292);
			procedural_declarative_part();
			setState(2293);
			match(BEGIN);
			setState(2294);
			procedural_statement_part();
			setState(2295);
			match(END);
			setState(2296);
			match(PROCEDURAL);
			setState(2298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2297);
				identifier();
				}
			}

			setState(2300);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simultaneous_statementContext extends ParserRuleContext {
		public Simple_simultaneous_statementContext simple_simultaneous_statement() {
			return getRuleContext(Simple_simultaneous_statementContext.class,0);
		}
		public Simultaneous_if_statementContext simultaneous_if_statement() {
			return getRuleContext(Simultaneous_if_statementContext.class,0);
		}
		public Simultaneous_case_statementContext simultaneous_case_statement() {
			return getRuleContext(Simultaneous_case_statementContext.class,0);
		}
		public Simultaneous_procedural_statementContext simultaneous_procedural_statement() {
			return getRuleContext(Simultaneous_procedural_statementContext.class,0);
		}
		public TerminalNode NULL_() { return getToken(VHDLParser.NULL_, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Simultaneous_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSimultaneous_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSimultaneous_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSimultaneous_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_statementContext simultaneous_statement() throws RecognitionException {
		Simultaneous_statementContext _localctx = new Simultaneous_statementContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_simultaneous_statement);
		int _la;
		try {
			setState(2311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2302);
				simple_simultaneous_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2303);
				simultaneous_if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2304);
				simultaneous_case_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2305);
				simultaneous_procedural_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
					{
					setState(2306);
					label_colon();
					}
				}

				setState(2309);
				match(NULL_);
				setState(2310);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simultaneous_statement_partContext extends ParserRuleContext {
		public List<Simultaneous_statementContext> simultaneous_statement() {
			return getRuleContexts(Simultaneous_statementContext.class);
		}
		public Simultaneous_statementContext simultaneous_statement(int i) {
			return getRuleContext(Simultaneous_statementContext.class,i);
		}
		public Simultaneous_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSimultaneous_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSimultaneous_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSimultaneous_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_statement_partContext simultaneous_statement_part() throws RecognitionException {
		Simultaneous_statement_partContext _localctx = new Simultaneous_statement_partContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_simultaneous_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220676450460893186L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 866687841571176449L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 131457L) != 0)) {
				{
				{
				setState(2313);
				simultaneous_statement();
				}
				}
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Source_aspectContext extends ParserRuleContext {
		public TerminalNode SPECTRUM() { return getToken(VHDLParser.SPECTRUM, 0); }
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(VHDLParser.COMMA, 0); }
		public TerminalNode NOISE() { return getToken(VHDLParser.NOISE, 0); }
		public Source_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSource_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSource_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSource_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_aspectContext source_aspect() throws RecognitionException {
		Source_aspectContext _localctx = new Source_aspectContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_source_aspect);
		try {
			setState(2326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPECTRUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(2319);
				match(SPECTRUM);
				setState(2320);
				simple_expression();
				setState(2321);
				match(COMMA);
				setState(2322);
				simple_expression();
				}
				break;
			case NOISE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2324);
				match(NOISE);
				setState(2325);
				simple_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Source_quantity_declarationContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(VHDLParser.QUANTITY, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Source_aspectContext source_aspect() {
			return getRuleContext(Source_aspectContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Source_quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSource_quantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSource_quantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSource_quantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_quantity_declarationContext source_quantity_declaration() throws RecognitionException {
		Source_quantity_declarationContext _localctx = new Source_quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_source_quantity_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			match(QUANTITY);
			setState(2329);
			identifier_list();
			setState(2330);
			match(COLON);
			setState(2331);
			subtype_indication();
			setState(2332);
			source_aspect();
			setState(2333);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Step_limit_specificationContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(VHDLParser.LIMIT, 0); }
		public Quantity_specificationContext quantity_specification() {
			return getRuleContext(Quantity_specificationContext.class,0);
		}
		public TerminalNode WITH() { return getToken(VHDLParser.WITH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Step_limit_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_limit_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterStep_limit_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitStep_limit_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitStep_limit_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_limit_specificationContext step_limit_specification() throws RecognitionException {
		Step_limit_specificationContext _localctx = new Step_limit_specificationContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_step_limit_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			match(LIMIT);
			setState(2336);
			quantity_specification();
			setState(2337);
			match(WITH);
			setState(2338);
			expression();
			setState(2339);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subnature_declarationContext extends ParserRuleContext {
		public TerminalNode SUBNATURE() { return getToken(VHDLParser.SUBNATURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Subnature_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnature_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubnature_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubnature_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubnature_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subnature_declarationContext subnature_declaration() throws RecognitionException {
		Subnature_declarationContext _localctx = new Subnature_declarationContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_subnature_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			match(SUBNATURE);
			setState(2342);
			identifier();
			setState(2343);
			match(IS);
			setState(2344);
			subnature_indication();
			setState(2345);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subnature_indicationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public TerminalNode TOLERANCE() { return getToken(VHDLParser.TOLERANCE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ACROSS() { return getToken(VHDLParser.ACROSS, 0); }
		public TerminalNode THROUGH() { return getToken(VHDLParser.THROUGH, 0); }
		public Subnature_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnature_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubnature_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubnature_indication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubnature_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subnature_indicationContext subnature_indication() throws RecognitionException {
		Subnature_indicationContext _localctx = new Subnature_indicationContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_subnature_indication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			name();
			setState(2349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2348);
				index_constraint();
				}
			}

			setState(2357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOLERANCE) {
				{
				setState(2351);
				match(TOLERANCE);
				setState(2352);
				expression();
				setState(2353);
				match(ACROSS);
				setState(2354);
				expression();
				setState(2355);
				match(THROUGH);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subprogram_bodyContext extends ParserRuleContext {
		public Subprogram_specificationContext subprogram_specification() {
			return getRuleContext(Subprogram_specificationContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Subprogram_declarative_partContext subprogram_declarative_part() {
			return getRuleContext(Subprogram_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(VHDLParser.BEGIN, 0); }
		public Subprogram_statement_partContext subprogram_statement_part() {
			return getRuleContext(Subprogram_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Subprogram_kindContext subprogram_kind() {
			return getRuleContext(Subprogram_kindContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public Subprogram_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubprogram_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubprogram_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubprogram_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_bodyContext subprogram_body() throws RecognitionException {
		Subprogram_bodyContext _localctx = new Subprogram_bodyContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_subprogram_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			subprogram_specification();
			setState(2360);
			match(IS);
			setState(2361);
			subprogram_declarative_part();
			setState(2362);
			match(BEGIN);
			setState(2363);
			subprogram_statement_part();
			setState(2364);
			match(END);
			setState(2366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION || _la==PROCEDURE) {
				{
				setState(2365);
				subprogram_kind();
				}
			}

			setState(2369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 1027L) != 0)) {
				{
				setState(2368);
				designator();
				}
			}

			setState(2371);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subprogram_declarationContext extends ParserRuleContext {
		public Subprogram_specificationContext subprogram_specification() {
			return getRuleContext(Subprogram_specificationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Subprogram_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubprogram_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubprogram_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubprogram_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_declarationContext subprogram_declaration() throws RecognitionException {
		Subprogram_declarationContext _localctx = new Subprogram_declarationContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_subprogram_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			subprogram_specification();
			setState(2374);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subprogram_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Subprogram_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubprogram_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubprogram_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubprogram_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_declarative_itemContext subprogram_declarative_item() throws RecognitionException {
		Subprogram_declarative_itemContext _localctx = new Subprogram_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_subprogram_declarative_item);
		try {
			setState(2389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2376);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2377);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2378);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2379);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2380);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2381);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2382);
				file_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2383);
				alias_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2384);
				attribute_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2385);
				attribute_specification();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2386);
				use_clause();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2387);
				group_template_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2388);
				group_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subprogram_declarative_partContext extends ParserRuleContext {
		public List<Subprogram_declarative_itemContext> subprogram_declarative_item() {
			return getRuleContexts(Subprogram_declarative_itemContext.class);
		}
		public Subprogram_declarative_itemContext subprogram_declarative_item(int i) {
			return getRuleContext(Subprogram_declarative_itemContext.class,i);
		}
		public Subprogram_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubprogram_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubprogram_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubprogram_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_declarative_partContext subprogram_declarative_part() throws RecognitionException {
		Subprogram_declarative_partContext _localctx = new Subprogram_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_subprogram_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 157305276448L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 210487083013L) != 0)) {
				{
				{
				setState(2391);
				subprogram_declarative_item();
				}
				}
				setState(2396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subprogram_kindContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(VHDLParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(VHDLParser.FUNCTION, 0); }
		public Subprogram_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubprogram_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubprogram_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubprogram_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_kindContext subprogram_kind() throws RecognitionException {
		Subprogram_kindContext _localctx = new Subprogram_kindContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_subprogram_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subprogram_specificationContext extends ParserRuleContext {
		public Procedure_specificationContext procedure_specification() {
			return getRuleContext(Procedure_specificationContext.class,0);
		}
		public Function_specificationContext function_specification() {
			return getRuleContext(Function_specificationContext.class,0);
		}
		public Subprogram_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubprogram_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubprogram_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubprogram_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_specificationContext subprogram_specification() throws RecognitionException {
		Subprogram_specificationContext _localctx = new Subprogram_specificationContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_subprogram_specification);
		try {
			setState(2401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2399);
				procedure_specification();
				}
				break;
			case FUNCTION:
			case IMPURE:
			case PURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2400);
				function_specification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_specificationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(VHDLParser.PROCEDURE, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public Procedure_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterProcedure_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitProcedure_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitProcedure_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_specificationContext procedure_specification() throws RecognitionException {
		Procedure_specificationContext _localctx = new Procedure_specificationContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_procedure_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			match(PROCEDURE);
			setState(2404);
			designator();
			setState(2409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2405);
				match(LPAREN);
				setState(2406);
				formal_parameter_list();
				setState(2407);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_specificationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(VHDLParser.FUNCTION, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(VHDLParser.RETURN, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode PURE() { return getToken(VHDLParser.PURE, 0); }
		public TerminalNode IMPURE() { return getToken(VHDLParser.IMPURE, 0); }
		public Function_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterFunction_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitFunction_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitFunction_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_specificationContext function_specification() throws RecognitionException {
		Function_specificationContext _localctx = new Function_specificationContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_function_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPURE || _la==PURE) {
				{
				setState(2411);
				_la = _input.LA(1);
				if ( !(_la==IMPURE || _la==PURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2414);
			match(FUNCTION);
			setState(2415);
			designator();
			setState(2420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2416);
				match(LPAREN);
				setState(2417);
				formal_parameter_list();
				setState(2418);
				match(RPAREN);
				}
			}

			setState(2422);
			match(RETURN);
			setState(2423);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subprogram_statement_partContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Subprogram_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubprogram_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubprogram_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubprogram_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_statement_partContext subprogram_statement_part() throws RecognitionException {
		Subprogram_statement_partContext _localctx = new Subprogram_statement_partContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_subprogram_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 153263194880902144L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & -9222807436425953277L) != 0)) {
				{
				{
				setState(2425);
				sequential_statement();
				}
				}
				setState(2430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subtype_declarationContext extends ParserRuleContext {
		public TerminalNode SUBTYPE() { return getToken(VHDLParser.SUBTYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Subtype_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtype_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubtype_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubtype_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubtype_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subtype_declarationContext subtype_declaration() throws RecognitionException {
		Subtype_declarationContext _localctx = new Subtype_declarationContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_subtype_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2431);
			match(SUBTYPE);
			setState(2432);
			identifier();
			setState(2433);
			match(IS);
			setState(2434);
			subtype_indication();
			setState(2435);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subtype_indicationContext extends ParserRuleContext {
		public List<Selected_nameContext> selected_name() {
			return getRuleContexts(Selected_nameContext.class);
		}
		public Selected_nameContext selected_name(int i) {
			return getRuleContext(Selected_nameContext.class,i);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public Tolerance_aspectContext tolerance_aspect() {
			return getRuleContext(Tolerance_aspectContext.class,0);
		}
		public Subtype_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtype_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSubtype_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSubtype_indication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSubtype_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subtype_indicationContext subtype_indication() throws RecognitionException {
		Subtype_indicationContext _localctx = new Subtype_indicationContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_subtype_indication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			selected_name();
			setState(2439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2438);
				selected_name();
				}
			}

			setState(2442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==LPAREN) {
				{
				setState(2441);
				constraint();
				}
			}

			setState(2445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2444);
				tolerance_aspect();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuffixContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHARACTER_LITERAL() { return getToken(VHDLParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(VHDLParser.STRING_LITERAL, 0); }
		public TerminalNode ALL() { return getToken(VHDLParser.ALL, 0); }
		public SuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_suffix);
		try {
			setState(2451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2447);
				identifier();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2448);
				match(CHARACTER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2449);
				match(STRING_LITERAL);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2450);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TargetContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_target);
		try {
			setState(2455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2453);
				name();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2454);
				aggregate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Multiplying_operatorContext> multiplying_operator() {
			return getRuleContexts(Multiplying_operatorContext.class);
		}
		public Multiplying_operatorContext multiplying_operator(int i) {
			return getRuleContext(Multiplying_operatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			factor();
			setState(2463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2458);
					multiplying_operator();
					setState(2459);
					factor();
					}
					} 
				}
				setState(2465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Terminal_aspectContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode TO() { return getToken(VHDLParser.TO, 0); }
		public Terminal_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterTerminal_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitTerminal_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitTerminal_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Terminal_aspectContext terminal_aspect() throws RecognitionException {
		Terminal_aspectContext _localctx = new Terminal_aspectContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_terminal_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			name();
			setState(2469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(2467);
				match(TO);
				setState(2468);
				name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Terminal_declarationContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(VHDLParser.TERMINAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Terminal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterTerminal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitTerminal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitTerminal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Terminal_declarationContext terminal_declaration() throws RecognitionException {
		Terminal_declarationContext _localctx = new Terminal_declarationContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_terminal_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2471);
			match(TERMINAL);
			setState(2472);
			identifier_list();
			setState(2473);
			match(COLON);
			setState(2474);
			subnature_indication();
			setState(2475);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Through_aspectContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode THROUGH() { return getToken(VHDLParser.THROUGH, 0); }
		public Tolerance_aspectContext tolerance_aspect() {
			return getRuleContext(Tolerance_aspectContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Through_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_through_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterThrough_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitThrough_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitThrough_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Through_aspectContext through_aspect() throws RecognitionException {
		Through_aspectContext _localctx = new Through_aspectContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_through_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			identifier_list();
			setState(2479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOLERANCE) {
				{
				setState(2478);
				tolerance_aspect();
				}
			}

			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(2481);
				match(VARASGN);
				setState(2482);
				expression();
				}
			}

			setState(2485);
			match(THROUGH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Timeout_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VHDLParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Timeout_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeout_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterTimeout_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitTimeout_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitTimeout_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timeout_clauseContext timeout_clause() throws RecognitionException {
		Timeout_clauseContext _localctx = new Timeout_clauseContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_timeout_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2487);
			match(FOR);
			setState(2488);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tolerance_aspectContext extends ParserRuleContext {
		public TerminalNode TOLERANCE() { return getToken(VHDLParser.TOLERANCE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tolerance_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tolerance_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterTolerance_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitTolerance_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitTolerance_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tolerance_aspectContext tolerance_aspect() throws RecognitionException {
		Tolerance_aspectContext _localctx = new Tolerance_aspectContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_tolerance_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			match(TOLERANCE);
			setState(2491);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_declarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(VHDLParser.TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Type_definitionContext type_definition() {
			return getRuleContext(Type_definitionContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitType_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitType_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			match(TYPE);
			setState(2494);
			identifier();
			setState(2497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2495);
				match(IS);
				setState(2496);
				type_definition();
				}
			}

			setState(2499);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_definitionContext extends ParserRuleContext {
		public Scalar_type_definitionContext scalar_type_definition() {
			return getRuleContext(Scalar_type_definitionContext.class,0);
		}
		public Composite_type_definitionContext composite_type_definition() {
			return getRuleContext(Composite_type_definitionContext.class,0);
		}
		public Access_type_definitionContext access_type_definition() {
			return getRuleContext(Access_type_definitionContext.class,0);
		}
		public File_type_definitionContext file_type_definition() {
			return getRuleContext(File_type_definitionContext.class,0);
		}
		public Type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterType_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitType_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitType_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_definitionContext type_definition() throws RecognitionException {
		Type_definitionContext _localctx = new Type_definitionContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_type_definition);
		try {
			setState(2505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANGE:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2501);
				scalar_type_definition();
				}
				break;
			case ARRAY:
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2502);
				composite_type_definition();
				}
				break;
			case ACCESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2503);
				access_type_definition();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2504);
				file_type_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unconstrained_array_definitionContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(VHDLParser.ARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public List<Index_subtype_definitionContext> index_subtype_definition() {
			return getRuleContexts(Index_subtype_definitionContext.class);
		}
		public Index_subtype_definitionContext index_subtype_definition(int i) {
			return getRuleContext(Index_subtype_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode OF() { return getToken(VHDLParser.OF, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Unconstrained_array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconstrained_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterUnconstrained_array_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitUnconstrained_array_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitUnconstrained_array_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconstrained_array_definitionContext unconstrained_array_definition() throws RecognitionException {
		Unconstrained_array_definitionContext _localctx = new Unconstrained_array_definitionContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_unconstrained_array_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2507);
			match(ARRAY);
			setState(2508);
			match(LPAREN);
			setState(2509);
			index_subtype_definition();
			setState(2514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2510);
				match(COMMA);
				setState(2511);
				index_subtype_definition();
				}
				}
				setState(2516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2517);
			match(RPAREN);
			setState(2518);
			match(OF);
			setState(2519);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unconstrained_nature_definitionContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(VHDLParser.ARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(VHDLParser.LPAREN, 0); }
		public List<Index_subtype_definitionContext> index_subtype_definition() {
			return getRuleContexts(Index_subtype_definitionContext.class);
		}
		public Index_subtype_definitionContext index_subtype_definition(int i) {
			return getRuleContext(Index_subtype_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VHDLParser.RPAREN, 0); }
		public TerminalNode OF() { return getToken(VHDLParser.OF, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Unconstrained_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconstrained_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterUnconstrained_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitUnconstrained_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitUnconstrained_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconstrained_nature_definitionContext unconstrained_nature_definition() throws RecognitionException {
		Unconstrained_nature_definitionContext _localctx = new Unconstrained_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_unconstrained_nature_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			match(ARRAY);
			setState(2522);
			match(LPAREN);
			setState(2523);
			index_subtype_definition();
			setState(2528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2524);
				match(COMMA);
				setState(2525);
				index_subtype_definition();
				}
				}
				setState(2530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2531);
			match(RPAREN);
			setState(2532);
			match(OF);
			setState(2533);
			subnature_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Use_clauseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(VHDLParser.USE, 0); }
		public List<Selected_nameContext> selected_name() {
			return getRuleContexts(Selected_nameContext.class);
		}
		public Selected_nameContext selected_name(int i) {
			return getRuleContext(Selected_nameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Use_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterUse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitUse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitUse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_clauseContext use_clause() throws RecognitionException {
		Use_clauseContext _localctx = new Use_clauseContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_use_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2535);
			match(USE);
			setState(2536);
			selected_name();
			setState(2541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2537);
				match(COMMA);
				setState(2538);
				selected_name();
				}
				}
				setState(2543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2544);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_assignment_statementContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Variable_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterVariable_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitVariable_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitVariable_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignment_statementContext variable_assignment_statement() throws RecognitionException {
		Variable_assignment_statementContext _localctx = new Variable_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_variable_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2546);
				label_colon();
				}
				break;
			}
			setState(2549);
			target();
			setState(2550);
			match(VARASGN);
			setState(2551);
			expression();
			setState(2552);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(VHDLParser.VARIABLE, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public TerminalNode SHARED() { return getToken(VHDLParser.SHARED, 0); }
		public TerminalNode VARASGN() { return getToken(VHDLParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARED) {
				{
				setState(2554);
				match(SHARED);
				}
			}

			setState(2557);
			match(VARIABLE);
			setState(2558);
			identifier_list();
			setState(2559);
			match(COLON);
			setState(2560);
			subtype_indication();
			setState(2563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(2561);
				match(VARASGN);
				setState(2562);
				expression();
				}
			}

			setState(2565);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Wait_statementContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(VHDLParser.WAIT, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Sensitivity_clauseContext sensitivity_clause() {
			return getRuleContext(Sensitivity_clauseContext.class,0);
		}
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Timeout_clauseContext timeout_clause() {
			return getRuleContext(Timeout_clauseContext.class,0);
		}
		public Wait_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wait_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterWait_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitWait_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitWait_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wait_statementContext wait_statement() throws RecognitionException {
		Wait_statementContext _localctx = new Wait_statementContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_wait_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER || _la==EXTENDED_IDENTIFIER) {
				{
				setState(2567);
				label_colon();
				}
			}

			setState(2570);
			match(WAIT);
			setState(2572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2571);
				sensitivity_clause();
				}
			}

			setState(2575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNTIL) {
				{
				setState(2574);
				condition_clause();
				}
			}

			setState(2578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(2577);
				timeout_clause();
				}
			}

			setState(2580);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WaveformContext extends ParserRuleContext {
		public List<Waveform_elementContext> waveform_element() {
			return getRuleContexts(Waveform_elementContext.class);
		}
		public Waveform_elementContext waveform_element(int i) {
			return getRuleContext(Waveform_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public TerminalNode UNAFFECTED() { return getToken(VHDLParser.UNAFFECTED, 0); }
		public WaveformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waveform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterWaveform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitWaveform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitWaveform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaveformContext waveform() throws RecognitionException {
		WaveformContext _localctx = new WaveformContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_waveform);
		int _la;
		try {
			setState(2591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
			case NEW:
			case NOT:
			case NULL_:
			case BASE_LITERAL:
			case BIT_STRING_LITERAL:
			case REAL_LITERAL:
			case BASIC_IDENTIFIER:
			case EXTENDED_IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case LPAREN:
			case PLUS:
			case MINUS:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2582);
				waveform_element();
				setState(2587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2583);
					match(COMMA);
					setState(2584);
					waveform_element();
					}
					}
					setState(2589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case UNAFFECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2590);
				match(UNAFFECTED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Waveform_elementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AFTER() { return getToken(VHDLParser.AFTER, 0); }
		public Waveform_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waveform_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).enterWaveform_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLParserListener ) ((VHDLParserListener)listener).exitWaveform_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLParserVisitor ) return ((VHDLParserVisitor<? extends T>)visitor).visitWaveform_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Waveform_elementContext waveform_element() throws RecognitionException {
		Waveform_elementContext _localctx = new Waveform_elementContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_waveform_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
			expression();
			setState(2596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER) {
				{
				setState(2594);
				match(AFTER);
				setState(2595);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u00a3\u0a27\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007"+
		"\u00c8\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007"+
		"\u00cb\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007"+
		"\u00ce\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007"+
		"\u00d1\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007"+
		"\u00d4\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007"+
		"\u00d7\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0002\u00da\u0007"+
		"\u00da\u0002\u00db\u0007\u00db\u0002\u00dc\u0007\u00dc\u0002\u00dd\u0007"+
		"\u00dd\u0002\u00de\u0007\u00de\u0002\u00df\u0007\u00df\u0002\u00e0\u0007"+
		"\u00e0\u0002\u00e1\u0007\u00e1\u0002\u00e2\u0007\u00e2\u0002\u00e3\u0007"+
		"\u00e3\u0002\u00e4\u0007\u00e4\u0002\u00e5\u0007\u00e5\u0002\u00e6\u0007"+
		"\u00e6\u0002\u00e7\u0007\u00e7\u0002\u00e8\u0007\u00e8\u0002\u00e9\u0007"+
		"\u00e9\u0002\u00ea\u0007\u00ea\u0002\u00eb\u0007\u00eb\u0002\u00ec\u0007"+
		"\u00ec\u0002\u00ed\u0007\u00ed\u0002\u00ee\u0007\u00ee\u0002\u00ef\u0007"+
		"\u00ef\u0002\u00f0\u0007\u00f0\u0002\u00f1\u0007\u00f1\u0002\u00f2\u0007"+
		"\u00f2\u0002\u00f3\u0007\u00f3\u0002\u00f4\u0007\u00f4\u0002\u00f5\u0007"+
		"\u00f5\u0002\u00f6\u0007\u00f6\u0002\u00f7\u0007\u00f7\u0002\u00f8\u0007"+
		"\u00f8\u0002\u00f9\u0007\u00f9\u0002\u00fa\u0007\u00fa\u0002\u00fb\u0007"+
		"\u00fb\u0002\u00fc\u0007\u00fc\u0002\u00fd\u0007\u00fd\u0002\u00fe\u0007"+
		"\u00fe\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0206\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u020a\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0210\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u021a\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0222\b\u0007\n\u0007\f\u0007\u0225\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u022d\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0232\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u0239"+
		"\b\t\u0001\n\u0001\n\u0003\n\u023d\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0242\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u024e\b\f\u0001\f\u0003\f\u0251"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0005\r\u0256\b\r\n\r\f\r\u0259\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u025e\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0262\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0266"+
		"\b\u000e\u0001\u000e\u0003\u000e\u0269\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0270\b\u000e\u0001\u000f"+
		"\u0005\u000f\u0273\b\u000f\n\u000f\f\u000f\u0276\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u027a\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u027e"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0284"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0288\b\u0012\u0001\u0013"+
		"\u0003\u0013\u028b\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0293\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u029a\b\u0015\n\u0015"+
		"\f\u0015\u029d\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u02ab\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u02ba\b\u001a\u0001\u001a\u0003\u001a\u02bd\b\u001a\u0001\u001a\u0003"+
		"\u001a\u02c0\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u02c5"+
		"\b\u001b\n\u001b\f\u001b\u02c8\t\u001b\u0001\u001b\u0005\u001b\u02cb\b"+
		"\u001b\n\u001b\f\u001b\u02ce\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u02ea\b\u001c\u0001\u001d\u0005\u001d\u02ed\b\u001d\n\u001d\f\u001d\u02f0"+
		"\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02f6"+
		"\b\u001e\u0003\u001e\u02f8\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u02fe\b\u001e\u0003\u001e\u0300\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0307"+
		"\b\u001f\u0001\u001f\u0003\u001f\u030a\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0312\b \u0001 \u0003 \u0315\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u031e\b \u0001 \u0001 \u0001!\u0005"+
		"!\u0323\b!\n!\f!\u0326\t!\u0001\"\u0001\"\u0003\"\u032a\b\"\u0001\"\u0003"+
		"\"\u032d\b\"\u0001\"\u0001\"\u0001\"\u0001#\u0003#\u0333\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u033c\b$\n$\f$\u033f\t$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0003&\u0346\b&\u0001&\u0001&\u0003&\u034a"+
		"\b&\u0001&\u0001&\u0003&\u034e\b&\u0001&\u0001&\u0001\'\u0003\'\u0353"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0004\'\u0359\b\'\u000b\'\f\'\u035a"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u0360\b\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0003)\u036d\b)\u0001"+
		"*\u0001*\u0001*\u0005*\u0372\b*\n*\f*\u0375\t*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u037c\b+\u0001+\u0003+\u037f\b+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0003,\u0388\b,\u0001,\u0003,\u038b\b,\u0001,\u0003"+
		",\u038e\b,\u0001,\u0001,\u0001,\u0003,\u0393\b,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0003-\u039a\b-\u0001-\u0003-\u039d\b-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0003/\u03a7\b/\u00010\u00010\u00030\u03ab"+
		"\b0\u00011\u00031\u03ae\b1\u00011\u00031\u03b1\b1\u00011\u00011\u0001"+
		"1\u00012\u00032\u03b7\b2\u00012\u00012\u00032\u03bb\b2\u00012\u00032\u03be"+
		"\b2\u00012\u00012\u00032\u03c2\b2\u00012\u00012\u00013\u00033\u03c7\b"+
		"3\u00013\u00033\u03ca\b3\u00013\u00013\u00013\u00014\u00034\u03d0\b4\u0001"+
		"4\u00034\u03d3\b4\u00014\u00014\u00034\u03d7\b4\u00015\u00015\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u00018\u00038\u03e9\b8\u00038\u03eb\b8\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00039\u03f6\b9\u00019\u00039\u03f9"+
		"\b9\u00019\u00019\u0001:\u0001:\u0001:\u0003:\u0400\b:\u0001;\u0005;\u0403"+
		"\b;\n;\f;\u0406\t;\u0001<\u0001<\u0003<\u040a\b<\u0001=\u0001=\u0001="+
		"\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0417"+
		"\b>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001A\u0001A\u0003A\u0427\bA\u0001B\u0005B\u042a\bB\n"+
		"B\fB\u042d\tB\u0001C\u0001C\u0003C\u0431\bC\u0001D\u0001D\u0001D\u0003"+
		"D\u0436\bD\u0001D\u0003D\u0439\bD\u0001E\u0005E\u043c\bE\nE\fE\u043f\t"+
		"E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001G\u0001G\u0003G\u0448\bG\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0003"+
		"J\u0454\bJ\u0001K\u0001K\u0001K\u0003K\u0459\bK\u0001K\u0001K\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0003O\u046c\bO\u0001O\u0001O\u0001O\u0003O\u0471"+
		"\bO\u0001P\u0001P\u0001Q\u0001Q\u0003Q\u0477\bQ\u0001R\u0001R\u0001R\u0005"+
		"R\u047c\bR\nR\fR\u047f\tR\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0003S\u0488\bS\u0001S\u0001S\u0003S\u048c\bS\u0001S\u0003S\u048f\b"+
		"S\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0003T\u04a7\bT\u0001U\u0005U\u04aa\bU\nU\fU\u04ad\tU"+
		"\u0001V\u0001V\u0003V\u04b1\bV\u0001W\u0003W\u04b4\bW\u0001W\u0003W\u04b7"+
		"\bW\u0001X\u0001X\u0001X\u0005X\u04bc\bX\nX\fX\u04bf\tX\u0001X\u0001X"+
		"\u0003X\u04c3\bX\u0001Y\u0001Y\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0003"+
		"Z\u04cc\bZ\u0001[\u0005[\u04cf\b[\n[\f[\u04d2\t[\u0001\\\u0001\\\u0001"+
		"\\\u0003\\\u04d7\b\\\u0001]\u0001]\u0003]\u04db\b]\u0001^\u0001^\u0001"+
		"^\u0001^\u0005^\u04e1\b^\n^\f^\u04e4\t^\u0001^\u0001^\u0001_\u0003_\u04e9"+
		"\b_\u0001_\u0001_\u0003_\u04ed\b_\u0001_\u0001_\u0003_\u04f1\b_\u0001"+
		"_\u0001_\u0001`\u0001`\u0001`\u0001`\u0005`\u04f9\b`\n`\f`\u04fc\t`\u0001"+
		"a\u0001a\u0001a\u0003a\u0501\ba\u0001a\u0001a\u0001a\u0001a\u0003a\u0507"+
		"\ba\u0001b\u0001b\u0001b\u0001b\u0001b\u0003b\u050e\bb\u0001b\u0001b\u0001"+
		"c\u0001c\u0001d\u0001d\u0003d\u0516\bd\u0001d\u0001d\u0001d\u0001e\u0001"+
		"e\u0001e\u0001e\u0001f\u0001f\u0001g\u0001g\u0001g\u0001g\u0001g\u0001"+
		"g\u0003g\u0527\bg\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0003h\u052f"+
		"\bh\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0005i\u0537\bi\ni\fi\u053a"+
		"\ti\u0001i\u0003i\u053d\bi\u0001i\u0005i\u0540\bi\ni\fi\u0543\ti\u0001"+
		"i\u0001i\u0001i\u0003i\u0548\bi\u0001i\u0001i\u0001j\u0001j\u0001j\u0001"+
		"j\u0003j\u0550\bj\u0001k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001l\u0001"+
		"l\u0001l\u0005l\u055b\bl\nl\fl\u055e\tl\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0001n\u0001n\u0003n\u0568\bn\u0001o\u0001o\u0001o\u0005o\u056d"+
		"\bo\no\fo\u0570\to\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001r\u0001"+
		"r\u0001r\u0001r\u0001s\u0001s\u0001t\u0001t\u0001t\u0005t\u058b\bt\nt"+
		"\ft\u058e\tt\u0001u\u0003u\u0591\bu\u0001u\u0001u\u0001u\u0001u\u0001"+
		"u\u0001u\u0001u\u0001u\u0001u\u0005u\u059c\bu\nu\fu\u059f\tu\u0001u\u0001"+
		"u\u0003u\u05a3\bu\u0001u\u0001u\u0001u\u0003u\u05a8\bu\u0001u\u0001u\u0001"+
		"v\u0001v\u0001v\u0001v\u0005v\u05b0\bv\nv\fv\u05b3\tv\u0001v\u0001v\u0001"+
		"w\u0001w\u0003w\u05b9\bw\u0001x\u0001x\u0001x\u0001x\u0001y\u0003y\u05c0"+
		"\by\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0003y\u05c9\by\u0001"+
		"y\u0001y\u0003y\u05cd\by\u0001z\u0001z\u0001z\u0005z\u05d2\bz\nz\fz\u05d5"+
		"\tz\u0001z\u0001z\u0003z\u05d9\bz\u0001{\u0003{\u05dc\b{\u0001{\u0001"+
		"{\u0001{\u0003{\u05e1\b{\u0001{\u0001{\u0001{\u0003{\u05e6\b{\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0003|\u05ee\b|\u0001}\u0001}\u0001~\u0001"+
		"~\u0001~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0005\u007f"+
		"\u05fa\b\u007f\n\u007f\f\u007f\u05fd\t\u007f\u0001\u0080\u0001\u0080\u0001"+
		"\u0080\u0005\u0080\u0602\b\u0080\n\u0080\f\u0080\u0605\t\u0080\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0005\u0081\u060a\b\u0081\n\u0081\f\u0081\u060d"+
		"\t\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u0613"+
		"\b\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u0618\b\u0082"+
		"\u0001\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u061d\b\u0083\u0001\u0083"+
		"\u0001\u0083\u0003\u0083\u0621\b\u0083\u0001\u0083\u0001\u0083\u0003\u0083"+
		"\u0625\b\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084"+
		"\u062b\b\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u062f\b\u0084\u0001"+
		"\u0084\u0001\u0084\u0003\u0084\u0633\b\u0084\u0001\u0085\u0001\u0085\u0001"+
		"\u0085\u0001\u0085\u0001\u0085\u0001\u0086\u0003\u0086\u063b\b\u0086\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u0640\b\u0086\u0001\u0086\u0001"+
		"\u0086\u0001\u0086\u0003\u0086\u0645\b\u0086\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0003\u0087\u064b\b\u0087\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u008a\u0001"+
		"\u008a\u0003\u008a\u0656\b\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0003\u008b\u065d\b\u008b\u0001\u008c\u0001\u008c\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u0664\b\u008d\n\u008d\f\u008d"+
		"\u0667\t\u008d\u0001\u008e\u0001\u008e\u0001\u008f\u0003\u008f\u066c\b"+
		"\u008f\u0001\u008f\u0003\u008f\u066f\b\u008f\u0001\u008f\u0001\u008f\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0676\b\u008f\u0001\u008f\u0001"+
		"\u008f\u0001\u0090\u0001\u0090\u0001\u0091\u0001\u0091\u0001\u0092\u0001"+
		"\u0092\u0003\u0092\u0680\b\u0092\u0001\u0092\u0005\u0092\u0683\b\u0092"+
		"\n\u0092\f\u0092\u0686\t\u0092\u0001\u0093\u0001\u0093\u0001\u0093\u0001"+
		"\u0093\u0003\u0093\u068c\b\u0093\u0001\u0094\u0001\u0094\u0001\u0094\u0005"+
		"\u0094\u0691\b\u0094\n\u0094\f\u0094\u0694\t\u0094\u0001\u0095\u0001\u0095"+
		"\u0004\u0095\u0698\b\u0095\u000b\u0095\f\u0095\u0699\u0001\u0096\u0001"+
		"\u0096\u0001\u0096\u0001\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0001"+
		"\u0097\u0001\u0098\u0003\u0098\u06a5\b\u0098\u0001\u0098\u0001\u0098\u0001"+
		"\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0003\u0098\u06ad\b\u0098\u0001"+
		"\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001"+
		"\u009a\u0001\u009a\u0003\u009a\u06b7\b\u009a\u0001\u009b\u0001\u009b\u0001"+
		"\u009b\u0001\u009b\u0001\u009c\u0003\u009c\u06be\b\u009c\u0001\u009c\u0001"+
		"\u009c\u0003\u009c\u06c2\b\u009c\u0001\u009c\u0001\u009c\u0003\u009c\u06c6"+
		"\b\u009c\u0001\u009c\u0001\u009c\u0001\u009d\u0001\u009d\u0003\u009d\u06cc"+
		"\b\u009d\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001"+
		"\u009e\u0003\u009e\u06d4\b\u009e\u0001\u009f\u0003\u009f\u06d7\b\u009f"+
		"\u0001\u009f\u0003\u009f\u06da\b\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a0"+
		"\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0003\u00a0"+
		"\u06e4\b\u00a0\u0001\u00a0\u0003\u00a0\u06e7\b\u00a0\u0001\u00a0\u0001"+
		"\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001"+
		"\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0003"+
		"\u00a1\u06f6\b\u00a1\u0001\u00a2\u0005\u00a2\u06f9\b\u00a2\n\u00a2\f\u00a2"+
		"\u06fc\t\u00a2\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a3"+
		"\u0001\u00a3\u0003\u00a3\u0704\b\u00a3\u0001\u00a3\u0003\u00a3\u0707\b"+
		"\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001"+
		"\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001"+
		"\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001"+
		"\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0003\u00a4\u071e\b\u00a4\u0001"+
		"\u00a5\u0005\u00a5\u0721\b\u00a5\n\u00a5\f\u00a5\u0724\t\u00a5\u0001\u00a6"+
		"\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a7"+
		"\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0005\u00a8\u0731\b\u00a8"+
		"\n\u00a8\f\u00a8\u0734\t\u00a8\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0003"+
		"\u00a8\u0739\b\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001"+
		"\u00a9\u0001\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00ab\u0001\u00ab\u0001"+
		"\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0001"+
		"\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001"+
		"\u00ac\u0003\u00ac\u0752\b\u00ac\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003"+
		"\u00ad\u0757\b\u00ad\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001"+
		"\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001"+
		"\u00ae\u0001\u00ae\u0003\u00ae\u0765\b\u00ae\u0001\u00af\u0005\u00af\u0768"+
		"\b\u00af\n\u00af\f\u00af\u076b\t\u00af\u0001\u00b0\u0005\u00b0\u076e\b"+
		"\u00b0\n\u00b0\f\u00b0\u0771\t\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b1"+
		"\u0001\u00b1\u0001\u00b1\u0003\u00b1\u0778\b\u00b1\u0001\u00b2\u0003\u00b2"+
		"\u077b\b\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b3\u0001\u00b3"+
		"\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3"+
		"\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0003\u00b3"+
		"\u078d\b\u00b3\u0001\u00b4\u0005\u00b4\u0790\b\u00b4\n\u00b4\f\u00b4\u0793"+
		"\t\u00b4\u0001\u00b5\u0003\u00b5\u0796\b\u00b5\u0001\u00b5\u0003\u00b5"+
		"\u0799\b\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5"+
		"\u0003\u00b5\u07a0\b\u00b5\u0001\u00b5\u0003\u00b5\u07a3\b\u00b5\u0001"+
		"\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0003\u00b5\u07aa"+
		"\b\u00b5\u0001\u00b5\u0001\u00b5\u0003\u00b5\u07ae\b\u00b5\u0001\u00b5"+
		"\u0001\u00b5\u0001\u00b6\u0005\u00b6\u07b3\b\u00b6\n\u00b6\f\u00b6\u07b6"+
		"\t\u00b6\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0001"+
		"\u00b7\u0001\u00b7\u0003\u00b7\u07bf\b\u00b7\u0001\u00b8\u0001\u00b8\u0001"+
		"\u00b8\u0003\u00b8\u07c4\b\u00b8\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0005"+
		"\u00b9\u07c9\b\u00b9\n\u00b9\f\u00b9\u07cc\t\u00b9\u0001\u00b9\u0001\u00b9"+
		"\u0003\u00b9\u07d0\b\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba"+
		"\u0001\u00bb\u0001\u00bb\u0003\u00bb\u07d8\b\u00bb\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bc\u0003\u00bc\u07de\b\u00bc\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0001\u00be\u0001\u00be\u0004\u00be\u07e5\b\u00be\u000b\u00be"+
		"\f\u00be\u07e6\u0001\u00be\u0001\u00be\u0001\u00be\u0003\u00be\u07ec\b"+
		"\u00be\u0001\u00bf\u0001\u00bf\u0004\u00bf\u07f0\b\u00bf\u000b\u00bf\f"+
		"\u00bf\u07f1\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf\u07f7\b\u00bf"+
		"\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0\u07fd\b\u00c0"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c2\u0003\u00c2\u0802\b\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0003\u00c2\u0808\b\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c3\u0003\u00c3\u080d\b\u00c3\u0001\u00c3\u0001\u00c3"+
		"\u0003\u00c3\u0811\b\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c4\u0001\u00c4"+
		"\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0003\u00c5\u081f\b\u00c5\u0001\u00c6\u0001\u00c6"+
		"\u0003\u00c6\u0823\b\u00c6\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8"+
		"\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c9\u0001\u00c9"+
		"\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9"+
		"\u0005\u00c9\u083b\b\u00c9\n\u00c9\f\u00c9\u083e\t\u00c9\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0005\u00cb\u0846"+
		"\b\u00cb\n\u00cb\f\u00cb\u0849\t\u00cb\u0001\u00cc\u0005\u00cc\u084c\b"+
		"\u00cc\n\u00cc\f\u00cc\u084f\t\u00cc\u0001\u00cd\u0001\u00cd\u0001\u00cd"+
		"\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd"+
		"\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0003\u00cd\u085d\b\u00cd\u0001\u00cd"+
		"\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0003\u00cd\u0863\b\u00cd\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0869\b\u00ce\u0001\u00cf"+
		"\u0001\u00cf\u0001\u00d0\u0003\u00d0\u086e\b\u00d0\u0001\u00d0\u0001\u00d0"+
		"\u0001\u00d0\u0003\u00d0\u0873\b\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0"+
		"\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0003\u00d1"+
		"\u087d\b\u00d1\u0001\u00d1\u0001\u00d1\u0003\u00d1\u0881\b\u00d1\u0001"+
		"\u00d1\u0001\u00d1\u0001\u00d2\u0001\u00d2\u0001\u00d3\u0001\u00d3\u0001"+
		"\u00d3\u0005\u00d3\u088a\b\u00d3\n\u00d3\f\u00d3\u088d\t\u00d3\u0001\u00d3"+
		"\u0001\u00d3\u0003\u00d3\u0891\b\u00d3\u0001\u00d4\u0001\u00d4\u0001\u00d4"+
		"\u0001\u00d4\u0005\u00d4\u0897\b\u00d4\n\u00d4\f\u00d4\u089a\t\u00d4\u0003"+
		"\u00d4\u089c\b\u00d4\u0001\u00d4\u0001\u00d4\u0003\u00d4\u08a0\b\u00d4"+
		"\u0001\u00d4\u0001\u00d4\u0001\u00d5\u0003\u00d5\u08a5\b\u00d5\u0001\u00d5"+
		"\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0005\u00d5\u08ab\b\u00d5\n\u00d5"+
		"\f\u00d5\u08ae\t\u00d5\u0001\u00d6\u0003\u00d6\u08b1\b\u00d6\u0001\u00d6"+
		"\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0003\u00d6\u08b7\b\u00d6\u0001\u00d6"+
		"\u0001\u00d6\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7"+
		"\u0001\u00d8\u0003\u00d8\u08c1\b\u00d8\u0001\u00d8\u0001\u00d8\u0001\u00d8"+
		"\u0001\u00d8\u0004\u00d8\u08c7\b\u00d8\u000b\u00d8\f\u00d8\u08c8\u0001"+
		"\u00d8\u0001\u00d8\u0001\u00d8\u0003\u00d8\u08ce\b\u00d8\u0001\u00d8\u0001"+
		"\u00d8\u0001\u00d9\u0003\u00d9\u08d3\b\u00d9\u0001\u00d9\u0001\u00d9\u0001"+
		"\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001"+
		"\u00d9\u0005\u00d9\u08de\b\u00d9\n\u00d9\f\u00d9\u08e1\t\u00d9\u0001\u00d9"+
		"\u0001\u00d9\u0003\u00d9\u08e5\b\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9"+
		"\u0003\u00d9\u08ea\b\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00da\u0003\u00da"+
		"\u08ef\b\u00da\u0001\u00da\u0001\u00da\u0003\u00da\u08f3\b\u00da\u0001"+
		"\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0003"+
		"\u00da\u08fb\b\u00da\u0001\u00da\u0001\u00da\u0001\u00db\u0001\u00db\u0001"+
		"\u00db\u0001\u00db\u0001\u00db\u0003\u00db\u0904\b\u00db\u0001\u00db\u0001"+
		"\u00db\u0003\u00db\u0908\b\u00db\u0001\u00dc\u0005\u00dc\u090b\b\u00dc"+
		"\n\u00dc\f\u00dc\u090e\t\u00dc\u0001\u00dd\u0001\u00dd\u0001\u00dd\u0001"+
		"\u00dd\u0001\u00dd\u0001\u00dd\u0001\u00dd\u0003\u00dd\u0917\b\u00dd\u0001"+
		"\u00de\u0001\u00de\u0001\u00de\u0001\u00de\u0001\u00de\u0001\u00de\u0001"+
		"\u00de\u0001\u00df\u0001\u00df\u0001\u00df\u0001\u00df\u0001\u00df\u0001"+
		"\u00df\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001\u00e0\u0001"+
		"\u00e0\u0001\u00e1\u0001\u00e1\u0003\u00e1\u092e\b\u00e1\u0001\u00e1\u0001"+
		"\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0003\u00e1\u0936"+
		"\b\u00e1\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0003\u00e2\u093f\b\u00e2\u0001\u00e2\u0003\u00e2\u0942"+
		"\b\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001"+
		"\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0001"+
		"\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0001"+
		"\u00e4\u0003\u00e4\u0956\b\u00e4\u0001\u00e5\u0005\u00e5\u0959\b\u00e5"+
		"\n\u00e5\f\u00e5\u095c\t\u00e5\u0001\u00e6\u0001\u00e6\u0001\u00e7\u0001"+
		"\u00e7\u0003\u00e7\u0962\b\u00e7\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0001"+
		"\u00e8\u0001\u00e8\u0001\u00e8\u0003\u00e8\u096a\b\u00e8\u0001\u00e9\u0003"+
		"\u00e9\u096d\b\u00e9\u0001\u00e9\u0001\u00e9\u0001\u00e9\u0001\u00e9\u0001"+
		"\u00e9\u0001\u00e9\u0003\u00e9\u0975\b\u00e9\u0001\u00e9\u0001\u00e9\u0001"+
		"\u00e9\u0001\u00ea\u0005\u00ea\u097b\b\u00ea\n\u00ea\f\u00ea\u097e\t\u00ea"+
		"\u0001\u00eb\u0001\u00eb\u0001\u00eb\u0001\u00eb\u0001\u00eb\u0001\u00eb"+
		"\u0001\u00ec\u0001\u00ec\u0003\u00ec\u0988\b\u00ec\u0001\u00ec\u0003\u00ec"+
		"\u098b\b\u00ec\u0001\u00ec\u0003\u00ec\u098e\b\u00ec\u0001\u00ed\u0001"+
		"\u00ed\u0001\u00ed\u0001\u00ed\u0003\u00ed\u0994\b\u00ed\u0001\u00ee\u0001"+
		"\u00ee\u0003\u00ee\u0998\b\u00ee\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001"+
		"\u00ef\u0005\u00ef\u099e\b\u00ef\n\u00ef\f\u00ef\u09a1\t\u00ef\u0001\u00f0"+
		"\u0001\u00f0\u0001\u00f0\u0003\u00f0\u09a6\b\u00f0\u0001\u00f1\u0001\u00f1"+
		"\u0001\u00f1\u0001\u00f1\u0001\u00f1\u0001\u00f1\u0001\u00f2\u0001\u00f2"+
		"\u0003\u00f2\u09b0\b\u00f2\u0001\u00f2\u0001\u00f2\u0003\u00f2\u09b4\b"+
		"\u00f2\u0001\u00f2\u0001\u00f2\u0001\u00f3\u0001\u00f3\u0001\u00f3\u0001"+
		"\u00f4\u0001\u00f4\u0001\u00f4\u0001\u00f5\u0001\u00f5\u0001\u00f5\u0001"+
		"\u00f5\u0003\u00f5\u09c2\b\u00f5\u0001\u00f5\u0001\u00f5\u0001\u00f6\u0001"+
		"\u00f6\u0001\u00f6\u0001\u00f6\u0003\u00f6\u09ca\b\u00f6\u0001\u00f7\u0001"+
		"\u00f7\u0001\u00f7\u0001\u00f7\u0001\u00f7\u0005\u00f7\u09d1\b\u00f7\n"+
		"\u00f7\f\u00f7\u09d4\t\u00f7\u0001\u00f7\u0001\u00f7\u0001\u00f7\u0001"+
		"\u00f7\u0001\u00f8\u0001\u00f8\u0001\u00f8\u0001\u00f8\u0001\u00f8\u0005"+
		"\u00f8\u09df\b\u00f8\n\u00f8\f\u00f8\u09e2\t\u00f8\u0001\u00f8\u0001\u00f8"+
		"\u0001\u00f8\u0001\u00f8\u0001\u00f9\u0001\u00f9\u0001\u00f9\u0001\u00f9"+
		"\u0005\u00f9\u09ec\b\u00f9\n\u00f9\f\u00f9\u09ef\t\u00f9\u0001\u00f9\u0001"+
		"\u00f9\u0001\u00fa\u0003\u00fa\u09f4\b\u00fa\u0001\u00fa\u0001\u00fa\u0001"+
		"\u00fa\u0001\u00fa\u0001\u00fa\u0001\u00fb\u0003\u00fb\u09fc\b\u00fb\u0001"+
		"\u00fb\u0001\u00fb\u0001\u00fb\u0001\u00fb\u0001\u00fb\u0001\u00fb\u0003"+
		"\u00fb\u0a04\b\u00fb\u0001\u00fb\u0001\u00fb\u0001\u00fc\u0003\u00fc\u0a09"+
		"\b\u00fc\u0001\u00fc\u0001\u00fc\u0003\u00fc\u0a0d\b\u00fc\u0001\u00fc"+
		"\u0003\u00fc\u0a10\b\u00fc\u0001\u00fc\u0003\u00fc\u0a13\b\u00fc\u0001"+
		"\u00fc\u0001\u00fc\u0001\u00fd\u0001\u00fd\u0001\u00fd\u0005\u00fd\u0a1a"+
		"\b\u00fd\n\u00fd\f\u00fd\u0a1d\t\u00fd\u0001\u00fd\u0003\u00fd\u0a20\b"+
		"\u00fd\u0001\u00fe\u0001\u00fe\u0001\u00fe\u0003\u00fe\u0a25\b\u00fe\u0001"+
		"\u00fe\u0000\u0000\u00ff\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0"+
		"\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8"+
		"\u01fa\u01fc\u0000\u000f\u0003\u0000ppuu\u009f\u009f\u0002\u0000\u008d"+
		"\u008d\u0095\u0096\u0002\u0000\u0017\u0017aa\u0011\u0000\b\b\u0013\u0015"+
		"\u0019\u0019\u001d\u001d\u001f\u001f\"\"**..33@@DDGGVV\\^ddffii\u0001"+
		"\u0000vw\u0002\u0000&&??\u0005\u0000\u0007\u00072277==no\u0005\u0000\u0010"+
		"\u0010&&((--??\u0003\u000011KK\u0093\u0094\u0003\u0000\u0084\u0085\u0087"+
		"\u0087\u0097\u0099\u0003\u0000QRWXZ[\u0002\u0000\u0011\u0011NN\u0001\u0000"+
		"\u0095\u0096\u0002\u0000\u001f\u001fDD\u0002\u0000%%FF\u0aed\u0000\u01fe"+
		"\u0001\u0000\u0000\u0000\u0002\u0200\u0001\u0000\u0000\u0000\u0004\u0203"+
		"\u0001\u0000\u0000\u0000\u0006\u020f\u0001\u0000\u0000\u0000\b\u0211\u0001"+
		"\u0000\u0000\u0000\n\u0219\u0001\u0000\u0000\u0000\f\u021b\u0001\u0000"+
		"\u0000\u0000\u000e\u021d\u0001\u0000\u0000\u0000\u0010\u0228\u0001\u0000"+
		"\u0000\u0000\u0012\u0238\u0001\u0000\u0000\u0000\u0014\u023c\u0001\u0000"+
		"\u0000\u0000\u0016\u023e\u0001\u0000\u0000\u0000\u0018\u0243\u0001\u0000"+
		"\u0000\u0000\u001a\u0257\u0001\u0000\u0000\u0000\u001c\u026f\u0001\u0000"+
		"\u0000\u0000\u001e\u0274\u0001\u0000\u0000\u0000 \u0279\u0001\u0000\u0000"+
		"\u0000\"\u027d\u0001\u0000\u0000\u0000$\u027f\u0001\u0000\u0000\u0000"+
		"&\u028a\u0001\u0000\u0000\u0000(\u0292\u0001\u0000\u0000\u0000*\u0296"+
		"\u0001\u0000\u0000\u0000,\u029e\u0001\u0000\u0000\u0000.\u02aa\u0001\u0000"+
		"\u0000\u00000\u02ac\u0001\u0000\u0000\u00002\u02b4\u0001\u0000\u0000\u0000"+
		"4\u02b9\u0001\u0000\u0000\u00006\u02c1\u0001\u0000\u0000\u00008\u02e9"+
		"\u0001\u0000\u0000\u0000:\u02ee\u0001\u0000\u0000\u0000<\u02f7\u0001\u0000"+
		"\u0000\u0000>\u0309\u0001\u0000\u0000\u0000@\u030b\u0001\u0000\u0000\u0000"+
		"B\u0324\u0001\u0000\u0000\u0000D\u0327\u0001\u0000\u0000\u0000F\u0332"+
		"\u0001\u0000\u0000\u0000H\u0338\u0001\u0000\u0000\u0000J\u0340\u0001\u0000"+
		"\u0000\u0000L\u0345\u0001\u0000\u0000\u0000N\u0352\u0001\u0000\u0000\u0000"+
		"P\u0363\u0001\u0000\u0000\u0000R\u036c\u0001\u0000\u0000\u0000T\u036e"+
		"\u0001\u0000\u0000\u0000V\u0376\u0001\u0000\u0000\u0000X\u0384\u0001\u0000"+
		"\u0000\u0000Z\u0396\u0001\u0000\u0000\u0000\\\u03a0\u0001\u0000\u0000"+
		"\u0000^\u03a6\u0001\u0000\u0000\u0000`\u03aa\u0001\u0000\u0000\u0000b"+
		"\u03ad\u0001\u0000\u0000\u0000d\u03b6\u0001\u0000\u0000\u0000f\u03c6\u0001"+
		"\u0000\u0000\u0000h\u03cf\u0001\u0000\u0000\u0000j\u03d8\u0001\u0000\u0000"+
		"\u0000l\u03da\u0001\u0000\u0000\u0000n\u03dd\u0001\u0000\u0000\u0000p"+
		"\u03e3\u0001\u0000\u0000\u0000r\u03ec\u0001\u0000\u0000\u0000t\u03ff\u0001"+
		"\u0000\u0000\u0000v\u0404\u0001\u0000\u0000\u0000x\u0409\u0001\u0000\u0000"+
		"\u0000z\u040b\u0001\u0000\u0000\u0000|\u0410\u0001\u0000\u0000\u0000~"+
		"\u041a\u0001\u0000\u0000\u0000\u0080\u041f\u0001\u0000\u0000\u0000\u0082"+
		"\u0426\u0001\u0000\u0000\u0000\u0084\u042b\u0001\u0000\u0000\u0000\u0086"+
		"\u0430\u0001\u0000\u0000\u0000\u0088\u0438\u0001\u0000\u0000\u0000\u008a"+
		"\u043d\u0001\u0000\u0000\u0000\u008c\u0442\u0001\u0000\u0000\u0000\u008e"+
		"\u0447\u0001\u0000\u0000\u0000\u0090\u0449\u0001\u0000\u0000\u0000\u0092"+
		"\u044b\u0001\u0000\u0000\u0000\u0094\u0453\u0001\u0000\u0000\u0000\u0096"+
		"\u0458\u0001\u0000\u0000\u0000\u0098\u045c\u0001\u0000\u0000\u0000\u009a"+
		"\u0461\u0001\u0000\u0000\u0000\u009c\u0463\u0001\u0000\u0000\u0000\u009e"+
		"\u0470\u0001\u0000\u0000\u0000\u00a0\u0472\u0001\u0000\u0000\u0000\u00a2"+
		"\u0474\u0001\u0000\u0000\u0000\u00a4\u0478\u0001\u0000\u0000\u0000\u00a6"+
		"\u0480\u0001\u0000\u0000\u0000\u00a8\u04a6\u0001\u0000\u0000\u0000\u00aa"+
		"\u04ab\u0001\u0000\u0000\u0000\u00ac\u04ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u04b3\u0001\u0000\u0000\u0000\u00b0\u04c2\u0001\u0000\u0000\u0000\u00b2"+
		"\u04c4\u0001\u0000\u0000\u0000\u00b4\u04cb\u0001\u0000\u0000\u0000\u00b6"+
		"\u04d0\u0001\u0000\u0000\u0000\u00b8\u04d6\u0001\u0000\u0000\u0000\u00ba"+
		"\u04da\u0001\u0000\u0000\u0000\u00bc\u04dc\u0001\u0000\u0000\u0000\u00be"+
		"\u04e8\u0001\u0000\u0000\u0000\u00c0\u04f4\u0001\u0000\u0000\u0000\u00c2"+
		"\u0506\u0001\u0000\u0000\u0000\u00c4\u0508\u0001\u0000\u0000\u0000\u00c6"+
		"\u0511\u0001\u0000\u0000\u0000\u00c8\u0515\u0001\u0000\u0000\u0000\u00ca"+
		"\u051a\u0001\u0000\u0000\u0000\u00cc\u051e\u0001\u0000\u0000\u0000\u00ce"+
		"\u0526\u0001\u0000\u0000\u0000\u00d0\u0528\u0001\u0000\u0000\u0000\u00d2"+
		"\u0532\u0001\u0000\u0000\u0000\u00d4\u054f\u0001\u0000\u0000\u0000\u00d6"+
		"\u0551\u0001\u0000\u0000\u0000\u00d8\u0557\u0001\u0000\u0000\u0000\u00da"+
		"\u055f\u0001\u0000\u0000\u0000\u00dc\u0567\u0001\u0000\u0000\u0000\u00de"+
		"\u0569\u0001\u0000\u0000\u0000\u00e0\u0571\u0001\u0000\u0000\u0000\u00e2"+
		"\u0579\u0001\u0000\u0000\u0000\u00e4\u0581\u0001\u0000\u0000\u0000\u00e6"+
		"\u0585\u0001\u0000\u0000\u0000\u00e8\u0587\u0001\u0000\u0000\u0000\u00ea"+
		"\u0590\u0001\u0000\u0000\u0000\u00ec\u05ab\u0001\u0000\u0000\u0000\u00ee"+
		"\u05b8\u0001\u0000\u0000\u0000\u00f0\u05ba\u0001\u0000\u0000\u0000\u00f2"+
		"\u05cc\u0001\u0000\u0000\u0000\u00f4\u05d8\u0001\u0000\u0000\u0000\u00f6"+
		"\u05db\u0001\u0000\u0000\u0000\u00f8\u05ed\u0001\u0000\u0000\u0000\u00fa"+
		"\u05ef\u0001\u0000\u0000\u0000\u00fc\u05f1\u0001\u0000\u0000\u0000\u00fe"+
		"\u05f6\u0001\u0000\u0000\u0000\u0100\u05fe\u0001\u0000\u0000\u0000\u0102"+
		"\u0606\u0001\u0000\u0000\u0000\u0104\u060e\u0001\u0000\u0000\u0000\u0106"+
		"\u0619\u0001\u0000\u0000\u0000\u0108\u0626\u0001\u0000\u0000\u0000\u010a"+
		"\u0634\u0001\u0000\u0000\u0000\u010c\u063a\u0001\u0000\u0000\u0000\u010e"+
		"\u064a\u0001\u0000\u0000\u0000\u0110\u064c\u0001\u0000\u0000\u0000\u0112"+
		"\u064f\u0001\u0000\u0000\u0000\u0114\u0655\u0001\u0000\u0000\u0000\u0116"+
		"\u065c\u0001\u0000\u0000\u0000\u0118\u065e\u0001\u0000\u0000\u0000\u011a"+
		"\u0660\u0001\u0000\u0000\u0000\u011c\u0668\u0001\u0000\u0000\u0000\u011e"+
		"\u066b\u0001\u0000\u0000\u0000\u0120\u0679\u0001\u0000\u0000\u0000\u0122"+
		"\u067b\u0001\u0000\u0000\u0000\u0124\u067f\u0001\u0000\u0000\u0000\u0126"+
		"\u068b\u0001\u0000\u0000\u0000\u0128\u068d\u0001\u0000\u0000\u0000\u012a"+
		"\u0697\u0001\u0000\u0000\u0000\u012c\u069b\u0001\u0000\u0000\u0000\u012e"+
		"\u069f\u0001\u0000\u0000\u0000\u0130\u06a4\u0001\u0000\u0000\u0000\u0132"+
		"\u06ae\u0001\u0000\u0000\u0000\u0134\u06b6\u0001\u0000\u0000\u0000\u0136"+
		"\u06b8\u0001\u0000\u0000\u0000\u0138\u06bd\u0001\u0000\u0000\u0000\u013a"+
		"\u06cb\u0001\u0000\u0000\u0000\u013c\u06d3\u0001\u0000\u0000\u0000\u013e"+
		"\u06d6\u0001\u0000\u0000\u0000\u0140\u06db\u0001\u0000\u0000\u0000\u0142"+
		"\u06f5\u0001\u0000\u0000\u0000\u0144\u06fa\u0001\u0000\u0000\u0000\u0146"+
		"\u06fd\u0001\u0000\u0000\u0000\u0148\u071d\u0001\u0000\u0000\u0000\u014a"+
		"\u0722\u0001\u0000\u0000\u0000\u014c\u0725\u0001\u0000\u0000\u0000\u014e"+
		"\u0729\u0001\u0000\u0000\u0000\u0150\u072c\u0001\u0000\u0000\u0000\u0152"+
		"\u073a\u0001\u0000\u0000\u0000\u0154\u0740\u0001\u0000\u0000\u0000\u0156"+
		"\u0742\u0001\u0000\u0000\u0000\u0158\u0751\u0001\u0000\u0000\u0000\u015a"+
		"\u0756\u0001\u0000\u0000\u0000\u015c\u0764\u0001\u0000\u0000\u0000\u015e"+
		"\u0769\u0001\u0000\u0000\u0000\u0160\u076f\u0001\u0000\u0000\u0000\u0162"+
		"\u0772\u0001\u0000\u0000\u0000\u0164\u077a\u0001\u0000\u0000\u0000\u0166"+
		"\u078c\u0001\u0000\u0000\u0000\u0168\u0791\u0001\u0000\u0000\u0000\u016a"+
		"\u0795\u0001\u0000\u0000\u0000\u016c\u07b4\u0001\u0000\u0000\u0000\u016e"+
		"\u07b7\u0001\u0000\u0000\u0000\u0170\u07c3\u0001\u0000\u0000\u0000\u0172"+
		"\u07cf\u0001\u0000\u0000\u0000\u0174\u07d1\u0001\u0000\u0000\u0000\u0176"+
		"\u07d7\u0001\u0000\u0000\u0000\u0178\u07d9\u0001\u0000\u0000\u0000\u017a"+
		"\u07df\u0001\u0000\u0000\u0000\u017c\u07e2\u0001\u0000\u0000\u0000\u017e"+
		"\u07ed\u0001\u0000\u0000\u0000\u0180\u07f8\u0001\u0000\u0000\u0000\u0182"+
		"\u07fe\u0001\u0000\u0000\u0000\u0184\u0801\u0001\u0000\u0000\u0000\u0186"+
		"\u080c\u0001\u0000\u0000\u0000\u0188\u0814\u0001\u0000\u0000\u0000\u018a"+
		"\u081e\u0001\u0000\u0000\u0000\u018c\u0822\u0001\u0000\u0000\u0000\u018e"+
		"\u0824\u0001\u0000\u0000\u0000\u0190\u0829\u0001\u0000\u0000\u0000\u0192"+
		"\u0832\u0001\u0000\u0000\u0000\u0194\u083f\u0001\u0000\u0000\u0000\u0196"+
		"\u0842\u0001\u0000\u0000\u0000\u0198\u084d\u0001\u0000\u0000\u0000\u019a"+
		"\u0862\u0001\u0000\u0000\u0000\u019c\u0864\u0001\u0000\u0000\u0000\u019e"+
		"\u086a\u0001\u0000\u0000\u0000\u01a0\u086d\u0001\u0000\u0000\u0000\u01a2"+
		"\u0877\u0001\u0000\u0000\u0000\u01a4\u0884\u0001\u0000\u0000\u0000\u01a6"+
		"\u0890\u0001\u0000\u0000\u0000\u01a8\u0892\u0001\u0000\u0000\u0000\u01aa"+
		"\u08a4\u0001\u0000\u0000\u0000\u01ac\u08b0\u0001\u0000\u0000\u0000\u01ae"+
		"\u08ba\u0001\u0000\u0000\u0000\u01b0\u08c0\u0001\u0000\u0000\u0000\u01b2"+
		"\u08d2\u0001\u0000\u0000\u0000\u01b4\u08ee\u0001\u0000\u0000\u0000\u01b6"+
		"\u0907\u0001\u0000\u0000\u0000\u01b8\u090c\u0001\u0000\u0000\u0000\u01ba"+
		"\u0916\u0001\u0000\u0000\u0000\u01bc\u0918\u0001\u0000\u0000\u0000\u01be"+
		"\u091f\u0001\u0000\u0000\u0000\u01c0\u0925\u0001\u0000\u0000\u0000\u01c2"+
		"\u092b\u0001\u0000\u0000\u0000\u01c4\u0937\u0001\u0000\u0000\u0000\u01c6"+
		"\u0945\u0001\u0000\u0000\u0000\u01c8\u0955\u0001\u0000\u0000\u0000\u01ca"+
		"\u095a\u0001\u0000\u0000\u0000\u01cc\u095d\u0001\u0000\u0000\u0000\u01ce"+
		"\u0961\u0001\u0000\u0000\u0000\u01d0\u0963\u0001\u0000\u0000\u0000\u01d2"+
		"\u096c\u0001\u0000\u0000\u0000\u01d4\u097c\u0001\u0000\u0000\u0000\u01d6"+
		"\u097f\u0001\u0000\u0000\u0000\u01d8\u0985\u0001\u0000\u0000\u0000\u01da"+
		"\u0993\u0001\u0000\u0000\u0000\u01dc\u0997\u0001\u0000\u0000\u0000\u01de"+
		"\u0999\u0001\u0000\u0000\u0000\u01e0\u09a2\u0001\u0000\u0000\u0000\u01e2"+
		"\u09a7\u0001\u0000\u0000\u0000\u01e4\u09ad\u0001\u0000\u0000\u0000\u01e6"+
		"\u09b7\u0001\u0000\u0000\u0000\u01e8\u09ba\u0001\u0000\u0000\u0000\u01ea"+
		"\u09bd\u0001\u0000\u0000\u0000\u01ec\u09c9\u0001\u0000\u0000\u0000\u01ee"+
		"\u09cb\u0001\u0000\u0000\u0000\u01f0\u09d9\u0001\u0000\u0000\u0000\u01f2"+
		"\u09e7\u0001\u0000\u0000\u0000\u01f4\u09f3\u0001\u0000\u0000\u0000\u01f6"+
		"\u09fb\u0001\u0000\u0000\u0000\u01f8\u0a08\u0001\u0000\u0000\u0000\u01fa"+
		"\u0a1f\u0001\u0000\u0000\u0000\u01fc\u0a21\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0007\u0000\u0000\u0000\u01ff\u0001\u0001\u0000\u0000\u0000\u0200"+
		"\u0201\u0005\u0002\u0000\u0000\u0201\u0202\u0003\u01d8\u00ec\u0000\u0202"+
		"\u0003\u0001\u0000\u0000\u0000\u0203\u0205\u0003\u00e8t\u0000\u0204\u0206"+
		"\u0003\u01e8\u00f4\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0001\u0000\u0000\u0000\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0208"+
		"\u0005\u0088\u0000\u0000\u0208\u020a\u0003\u00c0`\u0000\u0209\u0207\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0005\u0003\u0000\u0000\u020c\u0005\u0001"+
		"\u0000\u0000\u0000\u020d\u0210\u0003\u00c0`\u0000\u020e\u0210\u0005<\u0000"+
		"\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u020e\u0001\u0000\u0000"+
		"\u0000\u0210\u0007\u0001\u0000\u0000\u0000\u0211\u0212\u0003*\u0015\u0000"+
		"\u0212\t\u0001\u0000\u0000\u0000\u0213\u0214\u0003\u0124\u0092\u0000\u0214"+
		"\u0215\u0005\u008e\u0000\u0000\u0215\u0216\u0003\u0006\u0003\u0000\u0216"+
		"\u0217\u0005\u008f\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218"+
		"\u021a\u0003\u0006\u0003\u0000\u0219\u0213\u0001\u0000\u0000\u0000\u0219"+
		"\u0218\u0001\u0000\u0000\u0000\u021a\u000b\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0007\u0001\u0000\u0000\u021c\r\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0005\u008e\u0000\u0000\u021e\u0223\u0003\u0096K\u0000\u021f\u0220\u0005"+
		"\u008c\u0000\u0000\u0220\u0222\u0003\u0096K\u0000\u0221\u021f\u0001\u0000"+
		"\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000"+
		"\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001\u0000"+
		"\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0227\u0005\u008f"+
		"\u0000\u0000\u0227\u000f\u0001\u0000\u0000\u0000\u0228\u0229\u0005\u0005"+
		"\u0000\u0000\u0229\u022c\u0003\u0012\t\u0000\u022a\u022b\u0005\u0092\u0000"+
		"\u0000\u022b\u022d\u0003\u0014\n\u0000\u022c\u022a\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0005)\u0000\u0000\u022f\u0231\u0003\u0124\u0092\u0000\u0230"+
		"\u0232\u0003\u01a8\u00d4\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0231"+
		"\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233"+
		"\u0234\u0005\u008b\u0000\u0000\u0234\u0011\u0001\u0000\u0000\u0000\u0235"+
		"\u0239\u0003\u00e6s\u0000\u0236\u0239\u0005\u007f\u0000\u0000\u0237\u0239"+
		"\u0005\u0080\u0000\u0000\u0238\u0235\u0001\u0000\u0000\u0000\u0238\u0236"+
		"\u0001\u0000\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u0013"+
		"\u0001\u0000\u0000\u0000\u023a\u023d\u0003\u01c2\u00e1\u0000\u023b\u023d"+
		"\u0003\u01d8\u00ec\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023b"+
		"\u0001\u0000\u0000\u0000\u023d\u0015\u0001\u0000\u0000\u0000\u023e\u0241"+
		"\u00054\u0000\u0000\u023f\u0242\u0003\u016e\u00b7\u0000\u0240\u0242\u0003"+
		"\u01d8\u00ec\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0240\u0001"+
		"\u0000\u0000\u0000\u0242\u0017\u0001\u0000\u0000\u0000\u0243\u0244\u0005"+
		"\b\u0000\u0000\u0244\u0245\u0003\u00e6s\u0000\u0245\u0246\u0005:\u0000"+
		"\u0000\u0246\u0247\u0003\u00e6s\u0000\u0247\u0248\u0005)\u0000\u0000\u0248"+
		"\u0249\u0003\u001a\r\u0000\u0249\u024a\u0005\f\u0000\u0000\u024a\u024b"+
		"\u0003\u001e\u000f\u0000\u024b\u024d\u0005\u0018\u0000\u0000\u024c\u024e"+
		"\u0005\b\u0000\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001"+
		"\u0000\u0000\u0000\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u0251\u0003"+
		"\u00e6s\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0005\u008b"+
		"\u0000\u0000\u0253\u0019\u0001\u0000\u0000\u0000\u0254\u0256\u00038\u001c"+
		"\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256\u0259\u0001\u0000\u0000"+
		"\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000"+
		"\u0000\u0258\u001b\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000"+
		"\u0000\u025a\u0270\u0003@ \u0000\u025b\u0270\u0003\u016a\u00b5\u0000\u025c"+
		"\u025e\u0003\u0110\u0088\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"+
		"\u0270\u0003f3\u0000\u0260\u0262\u0003\u0110\u0088\u0000\u0261\u0260\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0263\u0001"+
		"\u0000\u0000\u0000\u0263\u0270\u0003b1\u0000\u0264\u0266\u0003\u0110\u0088"+
		"\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000"+
		"\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0269\u0005B\u0000\u0000"+
		"\u0268\u0267\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u0270\u0003h4\u0000\u026b\u0270"+
		"\u0003Z-\u0000\u026c\u0270\u0003\u00d2i\u0000\u026d\u0270\u0003d2\u0000"+
		"\u026e\u0270\u0003\u01b6\u00db\u0000\u026f\u025a\u0001\u0000\u0000\u0000"+
		"\u026f\u025b\u0001\u0000\u0000\u0000\u026f\u025d\u0001\u0000\u0000\u0000"+
		"\u026f\u0261\u0001\u0000\u0000\u0000\u026f\u0265\u0001\u0000\u0000\u0000"+
		"\u026f\u026b\u0001\u0000\u0000\u0000\u026f\u026c\u0001\u0000\u0000\u0000"+
		"\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u026e\u0001\u0000\u0000\u0000"+
		"\u0270\u001d\u0001\u0000\u0000\u0000\u0271\u0273\u0003\u001c\u000e\u0000"+
		"\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0276\u0001\u0000\u0000\u0000"+
		"\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000"+
		"\u0275\u001f\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000"+
		"\u0277\u027a\u0003\u01f0\u00f8\u0000\u0278\u027a\u0003\u0080@\u0000\u0279"+
		"\u0277\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a"+
		"!\u0001\u0000\u0000\u0000\u027b\u027e\u0003\u01ee\u00f7\u0000\u027c\u027e"+
		"\u0003~?\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d\u027c\u0001\u0000"+
		"\u0000\u0000\u027e#\u0001\u0000\u0000\u0000\u027f\u0280\u0005\n\u0000"+
		"\u0000\u0280\u0283\u0003j5\u0000\u0281\u0282\u0005O\u0000\u0000\u0282"+
		"\u0284\u0003\u00c0`\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0283\u0284"+
		"\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u0005T\u0000\u0000\u0286\u0288\u0003\u00c0`\u0000\u0287\u0285\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288%\u0001\u0000\u0000"+
		"\u0000\u0289\u028b\u0003\u0110\u0088\u0000\u028a\u0289\u0001\u0000\u0000"+
		"\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000"+
		"\u0000\u028c\u028d\u0003$\u0012\u0000\u028d\u028e\u0005\u008b\u0000\u0000"+
		"\u028e\'\u0001\u0000\u0000\u0000\u028f\u0290\u0003\u00ceg\u0000\u0290"+
		"\u0291\u0005\u0086\u0000\u0000\u0291\u0293\u0001\u0000\u0000\u0000\u0292"+
		"\u028f\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293"+
		"\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0003\n\u0005\u0000\u0295)"+
		"\u0001\u0000\u0000\u0000\u0296\u029b\u0003(\u0014\u0000\u0297\u0298\u0005"+
		"\u008c\u0000\u0000\u0298\u029a\u0003(\u0014\u0000\u0299\u0297\u0001\u0000"+
		"\u0000\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c+\u0001\u0000\u0000"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u029f\u0005\u000b\u0000"+
		"\u0000\u029f\u02a0\u0003\u0110\u0088\u0000\u02a0\u02a1\u0003\u0124\u0092"+
		"\u0000\u02a1\u02a2\u0005\u008b\u0000\u0000\u02a2-\u0001\u0000\u0000\u0000"+
		"\u02a3\u02ab\u0003\u00e6s\u0000\u02a4\u02ab\u0005H\u0000\u0000\u02a5\u02ab"+
		"\u0005I\u0000\u0000\u02a6\u02ab\u0005\u0003\u0000\u0000\u02a7\u02ab\u0005"+
		"`\u0000\u0000\u02a8\u02ab\u0005M\u0000\u0000\u02a9\u02ab\u0005b\u0000"+
		"\u0000\u02aa\u02a3\u0001\u0000\u0000\u0000\u02aa\u02a4\u0001\u0000\u0000"+
		"\u0000\u02aa\u02a5\u0001\u0000\u0000\u0000\u02aa\u02a6\u0001\u0000\u0000"+
		"\u0000\u02aa\u02a7\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000"+
		"\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02ab/\u0001\u0000\u0000\u0000"+
		"\u02ac\u02ad\u0005\u000b\u0000\u0000\u02ad\u02ae\u0003.\u0017\u0000\u02ae"+
		"\u02af\u0005:\u0000\u0000\u02af\u02b0\u0003\u00b2Y\u0000\u02b0\u02b1\u0005"+
		")\u0000\u0000\u02b1\u02b2\u0003\u00c0`\u0000\u02b2\u02b3\u0005\u008b\u0000"+
		"\u0000\u02b31\u0001\u0000\u0000\u0000\u02b4\u02b5\u0003\u00e6s\u0000\u02b5"+
		"\u02b6\u0005\u008b\u0000\u0000\u02b63\u0001\u0000\u0000\u0000\u02b7\u02b8"+
		"\u0005h\u0000\u0000\u02b8\u02ba\u0003\u009eO\u0000\u02b9\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bc\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bd\u0003\u00dam\u0000\u02bc\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02bf\u0001\u0000\u0000"+
		"\u0000\u02be\u02c0\u0003\u0156\u00ab\u0000\u02bf\u02be\u0001\u0000\u0000"+
		"\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c05\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0005\u001e\u0000\u0000\u02c2\u02c6\u0003>\u001f\u0000\u02c3"+
		"\u02c5\u0003\u01f2\u00f9\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c8\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c7\u02cc\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c9\u02cb\u0003x<\u0000\u02ca\u02c9\u0001"+
		"\u0000\u0000\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001"+
		"\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02cf\u0001"+
		"\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005"+
		"\u0018\u0000\u0000\u02d0\u02d1\u0005\u001e\u0000\u0000\u02d1\u02d2\u0005"+
		"\u008b\u0000\u0000\u02d27\u0001\u0000\u0000\u0000\u02d3\u02ea\u0003\u01c6"+
		"\u00e3\u0000\u02d4\u02ea\u0003\u01c4\u00e2\u0000\u02d5\u02ea\u0003\u01ea"+
		"\u00f5\u0000\u02d6\u02ea\u0003\u01d6\u00eb\u0000\u02d7\u02ea\u0003|>\u0000"+
		"\u02d8\u02ea\u0003\u01a2\u00d1\u0000\u02d9\u02ea\u0003\u01f6\u00fb\u0000"+
		"\u02da\u02ea\u0003\u00c4b\u0000\u02db\u02ea\u0003\u0010\b\u0000\u02dc"+
		"\u02ea\u0003X,\u0000\u02dd\u02ea\u0003,\u0016\u0000\u02de\u02ea\u0003"+
		"0\u0018\u0000\u02df\u02ea\u0003z=\u0000\u02e0\u02ea\u0003\u0092I\u0000"+
		"\u02e1\u02ea\u0003\u01be\u00df\u0000\u02e2\u02ea\u0003\u01f2\u00f9\u0000"+
		"\u02e3\u02ea\u0003\u00e2q\u0000\u02e4\u02ea\u0003\u00e0p\u0000\u02e5\u02ea"+
		"\u0003\u0132\u0099\u0000\u02e6\u02ea\u0003\u01c0\u00e0\u0000\u02e7\u02ea"+
		"\u0003\u0170\u00b8\u0000\u02e8\u02ea\u0003\u01e2\u00f1\u0000\u02e9\u02d3"+
		"\u0001\u0000\u0000\u0000\u02e9\u02d4\u0001\u0000\u0000\u0000\u02e9\u02d5"+
		"\u0001\u0000\u0000\u0000\u02e9\u02d6\u0001\u0000\u0000\u0000\u02e9\u02d7"+
		"\u0001\u0000\u0000\u0000\u02e9\u02d8\u0001\u0000\u0000\u0000\u02e9\u02d9"+
		"\u0001\u0000\u0000\u0000\u02e9\u02da\u0001\u0000\u0000\u0000\u02e9\u02db"+
		"\u0001\u0000\u0000\u0000\u02e9\u02dc\u0001\u0000\u0000\u0000\u02e9\u02dd"+
		"\u0001\u0000\u0000\u0000\u02e9\u02de\u0001\u0000\u0000\u0000\u02e9\u02df"+
		"\u0001\u0000\u0000\u0000\u02e9\u02e0\u0001\u0000\u0000\u0000\u02e9\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e9\u02e2\u0001\u0000\u0000\u0000\u02e9\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e9\u02e4\u0001\u0000\u0000\u0000\u02e9\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e9\u02e6\u0001\u0000\u0000\u0000\u02e9\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02ea9\u0001"+
		"\u0000\u0000\u0000\u02eb\u02ed\u00038\u001c\u0000\u02ec\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef;\u0001\u0000\u0000"+
		"\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f1\u02f5\u0003\u00d6k\u0000"+
		"\u02f2\u02f3\u0003\u00dam\u0000\u02f3\u02f4\u0005\u008b\u0000\u0000\u02f4"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f5\u02f2\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f1\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8"+
		"\u02ff\u0001\u0000\u0000\u0000\u02f9\u02fd\u0003\u0152\u00a9\u0000\u02fa"+
		"\u02fb\u0003\u0156\u00ab\u0000\u02fb\u02fc\u0005\u008b\u0000\u0000\u02fc"+
		"\u02fe\u0001\u0000\u0000\u0000\u02fd\u02fa\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fe\u0001\u0000\u0000\u0000\u02fe\u0300\u0001\u0000\u0000\u0000\u02ff"+
		"\u02f9\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300"+
		"=\u0001\u0000\u0000\u0000\u0301\u0306\u0003\u00e6s\u0000\u0302\u0303\u0005"+
		"\u008e\u0000\u0000\u0303\u0304\u0003\u00eew\u0000\u0304\u0305\u0005\u008f"+
		"\u0000\u0000\u0305\u0307\u0001\u0000\u0000\u0000\u0306\u0302\u0001\u0000"+
		"\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000"+
		"\u0000\u0000\u0308\u030a\u0003\u0124\u0092\u0000\u0309\u0301\u0001\u0000"+
		"\u0000\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u030a?\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0003\u0110\u0088\u0000\u030c\u0311\u0005\r\u0000\u0000"+
		"\u030d\u030e\u0005\u008e\u0000\u0000\u030e\u030f\u0003\u00c0`\u0000\u030f"+
		"\u0310\u0005\u008f\u0000\u0000\u0310\u0312\u0001\u0000\u0000\u0000\u0311"+
		"\u030d\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312"+
		"\u0314\u0001\u0000\u0000\u0000\u0313\u0315\u0005)\u0000\u0000\u0314\u0313"+
		"\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316"+
		"\u0001\u0000\u0000\u0000\u0316\u0317\u0003<\u001e\u0000\u0317\u0318\u0003"+
		":\u001d\u0000\u0318\u0319\u0005\f\u0000\u0000\u0319\u031a\u0003B!\u0000"+
		"\u031a\u031b\u0005\u0018\u0000\u0000\u031b\u031d\u0005\r\u0000\u0000\u031c"+
		"\u031e\u0003\u00e6s\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031d\u031e"+
		"\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0320"+
		"\u0005\u008b\u0000\u0000\u0320A\u0001\u0000\u0000\u0000\u0321\u0323\u0003"+
		"\u001c\u000e\u0000\u0322\u0321\u0001\u0000\u0000\u0000\u0323\u0326\u0001"+
		"\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0324\u0325\u0001"+
		"\u0000\u0000\u0000\u0325C\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000"+
		"\u0000\u0000\u0327\u0329\u0005G\u0000\u0000\u0328\u032a\u0003\u0004\u0002"+
		"\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000"+
		"\u0000\u032a\u032c\u0001\u0000\u0000\u0000\u032b\u032d\u0003\u01e4\u00f2"+
		"\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032f\u0003\u01e0\u00f0"+
		"\u0000\u032f\u0330\u0005\u008b\u0000\u0000\u0330E\u0001\u0000\u0000\u0000"+
		"\u0331\u0333\u0003J%\u0000\u0332\u0331\u0001\u0000\u0000\u0000\u0332\u0333"+
		"\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0335"+
		"\u0003\u0124\u0092\u0000\u0335\u0336\u0005\u0086\u0000\u0000\u0336\u0337"+
		"\u0003\u00c0`\u0000\u0337G\u0001\u0000\u0000\u0000\u0338\u033d\u0003F"+
		"#\u0000\u0339\u033a\u0005\u008c\u0000\u0000\u033a\u033c\u0003F#\u0000"+
		"\u033b\u0339\u0001\u0000\u0000\u0000\u033c\u033f\u0001\u0000\u0000\u0000"+
		"\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000"+
		"\u033eI\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u0340"+
		"\u0341\u0005\u001e\u0000\u0000\u0341\u0342\u0003\u0124\u0092\u0000\u0342"+
		"\u0343\u0005h\u0000\u0000\u0343K\u0001\u0000\u0000\u0000\u0344\u0346\u0003"+
		"\u0110\u0088\u0000\u0345\u0344\u0001\u0000\u0000\u0000\u0345\u0346\u0001"+
		"\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0349\u0005"+
		"\u000f\u0000\u0000\u0348\u034a\u0003H$\u0000\u0349\u0348\u0001\u0000\u0000"+
		"\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000"+
		"\u0000\u034b\u034c\u0005l\u0000\u0000\u034c\u034e\u0003j5\u0000\u034d"+
		"\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e"+
		"\u034f\u0001\u0000\u0000\u0000\u034f\u0350\u0005\u008b\u0000\u0000\u0350"+
		"M\u0001\u0000\u0000\u0000\u0351\u0353\u0003\u0110\u0088\u0000\u0352\u0351"+
		"\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0354"+
		"\u0001\u0000\u0000\u0000\u0354\u0355\u0005\u0012\u0000\u0000\u0355\u0356"+
		"\u0003\u00c0`\u0000\u0356\u0358\u0005)\u0000\u0000\u0357\u0359\u0003P"+
		"(\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000"+
		"\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000"+
		"\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035d\u0005\u0018\u0000"+
		"\u0000\u035d\u035f\u0005\u0012\u0000\u0000\u035e\u0360\u0003\u00e6s\u0000"+
		"\u035f\u035e\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000"+
		"\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0362\u0005\u008b\u0000\u0000"+
		"\u0362O\u0001\u0000\u0000\u0000\u0363\u0364\u0005l\u0000\u0000\u0364\u0365"+
		"\u0003T*\u0000\u0365\u0366\u0005\u0086\u0000\u0000\u0366\u0367\u0003\u0198"+
		"\u00cc\u0000\u0367Q\u0001\u0000\u0000\u0000\u0368\u036d\u0003\u00e6s\u0000"+
		"\u0369\u036d\u0003\u0094J\u0000\u036a\u036d\u0003\u01aa\u00d5\u0000\u036b"+
		"\u036d\u0005>\u0000\u0000\u036c\u0368\u0001\u0000\u0000\u0000\u036c\u0369"+
		"\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036c\u036b"+
		"\u0001\u0000\u0000\u0000\u036dS\u0001\u0000\u0000\u0000\u036e\u0373\u0003"+
		"R)\u0000\u036f\u0370\u0005\u009a\u0000\u0000\u0370\u0372\u0003R)\u0000"+
		"\u0371\u036f\u0001\u0000\u0000\u0000\u0372\u0375\u0001\u0000\u0000\u0000"+
		"\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000"+
		"\u0374U\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0376"+
		"\u0377\u0005\u001e\u0000\u0000\u0377\u037b\u0003\\.\u0000\u0378\u0379"+
		"\u00034\u001a\u0000\u0379\u037a\u0005\u008b\u0000\u0000\u037a\u037c\u0001"+
		"\u0000\u0000\u0000\u037b\u0378\u0001\u0000\u0000\u0000\u037b\u037c\u0001"+
		"\u0000\u0000\u0000\u037c\u037e\u0001\u0000\u0000\u0000\u037d\u037f\u0003"+
		"6\u001b\u0000\u037e\u037d\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0381\u0005\u0018"+
		"\u0000\u0000\u0381\u0382\u0005\u001e\u0000\u0000\u0382\u0383\u0005\u008b"+
		"\u0000\u0000\u0383W\u0001\u0000\u0000\u0000\u0384\u0385\u0005\u0013\u0000"+
		"\u0000\u0385\u0387\u0003\u00e6s\u0000\u0386\u0388\u0005)\u0000\u0000\u0387"+
		"\u0386\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388"+
		"\u038a\u0001\u0000\u0000\u0000\u0389\u038b\u0003\u00d6k\u0000\u038a\u0389"+
		"\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038d"+
		"\u0001\u0000\u0000\u0000\u038c\u038e\u0003\u0152\u00a9\u0000\u038d\u038c"+
		"\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u038f"+
		"\u0001\u0000\u0000\u0000\u038f\u0390\u0005\u0018\u0000\u0000\u0390\u0392"+
		"\u0005\u0013\u0000\u0000\u0391\u0393\u0003\u00e6s\u0000\u0392\u0391\u0001"+
		"\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u0394\u0001"+
		"\u0000\u0000\u0000\u0394\u0395\u0005\u008b\u0000\u0000\u0395Y\u0001\u0000"+
		"\u0000\u0000\u0396\u0397\u0003\u0110\u0088\u0000\u0397\u0399\u0003\u00f2"+
		"y\u0000\u0398\u039a\u0003\u00dam\u0000\u0399\u0398\u0001\u0000\u0000\u0000"+
		"\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u039c\u0001\u0000\u0000\u0000"+
		"\u039b\u039d\u0003\u0156\u00ab\u0000\u039c\u039b\u0001\u0000\u0000\u0000"+
		"\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000"+
		"\u039e\u039f\u0005\u008b\u0000\u0000\u039f[\u0001\u0000\u0000\u0000\u03a0"+
		"\u03a1\u0003\u00f4z\u0000\u03a1\u03a2\u0005\u0092\u0000\u0000\u03a2\u03a3"+
		"\u0003\u0124\u0092\u0000\u03a3]\u0001\u0000\u0000\u0000\u03a4\u03a7\u0003"+
		" \u0010\u0000\u03a5\u03a7\u0003\u017c\u00be\u0000\u03a6\u03a4\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a7_\u0001\u0000\u0000"+
		"\u0000\u03a8\u03ab\u0003\"\u0011\u0000\u03a9\u03ab\u0003\u017e\u00bf\u0000"+
		"\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03a9\u0001\u0000\u0000\u0000"+
		"\u03aba\u0001\u0000\u0000\u0000\u03ac\u03ae\u0003\u0110\u0088\u0000\u03ad"+
		"\u03ac\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae"+
		"\u03b0\u0001\u0000\u0000\u0000\u03af\u03b1\u0005B\u0000\u0000\u03b0\u03af"+
		"\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b2"+
		"\u0001\u0000\u0000\u0000\u03b2\u03b3\u0003$\u0012\u0000\u03b3\u03b4\u0005"+
		"\u008b\u0000\u0000\u03b4c\u0001\u0000\u0000\u0000\u03b5\u03b7\u0003\u0110"+
		"\u0088\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03ba\u0005\u000f"+
		"\u0000\u0000\u03b9\u03bb\u0003H$\u0000\u03ba\u03b9\u0001\u0000\u0000\u0000"+
		"\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bc\u03be\u0003\u0194\u00ca\u0000\u03bd\u03bc\u0001\u0000\u0000\u0000"+
		"\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03c1\u0001\u0000\u0000\u0000"+
		"\u03bf\u03c0\u0005l\u0000\u0000\u03c0\u03c2\u0003j5\u0000\u03c1\u03bf"+
		"\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c3"+
		"\u0001\u0000\u0000\u0000\u03c3\u03c4\u0005\u008b\u0000\u0000\u03c4e\u0001"+
		"\u0000\u0000\u0000\u03c5\u03c7\u0003\u0110\u0088\u0000\u03c6\u03c5\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c9\u0001"+
		"\u0000\u0000\u0000\u03c8\u03ca\u0005B\u0000\u0000\u03c9\u03c8\u0001\u0000"+
		"\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000"+
		"\u0000\u0000\u03cb\u03cc\u0003\u0162\u00b1\u0000\u03cc\u03cd\u0005\u008b"+
		"\u0000\u0000\u03cdg\u0001\u0000\u0000\u0000\u03ce\u03d0\u0003\u0110\u0088"+
		"\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000"+
		"\u0000\u03d0\u03d2\u0001\u0000\u0000\u0000\u03d1\u03d3\u0005B\u0000\u0000"+
		"\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000"+
		"\u03d3\u03d6\u0001\u0000\u0000\u0000\u03d4\u03d7\u0003n7\u0000\u03d5\u03d7"+
		"\u0003\u0190\u00c8\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d5"+
		"\u0001\u0000\u0000\u0000\u03d7i\u0001\u0000\u0000\u0000\u03d8\u03d9\u0003"+
		"\u00c0`\u0000\u03d9k\u0001\u0000\u0000\u0000\u03da\u03db\u0005g\u0000"+
		"\u0000\u03db\u03dc\u0003j5\u0000\u03dcm\u0001\u0000\u0000\u0000\u03dd"+
		"\u03de\u0003\u01dc\u00ee\u0000\u03de\u03df\u0005\u0084\u0000\u0000\u03df"+
		"\u03e0\u0003\u013e\u009f\u0000\u03e0\u03e1\u0003p8\u0000\u03e1\u03e2\u0005"+
		"\u008b\u0000\u0000\u03e2o\u0001\u0000\u0000\u0000\u03e3\u03ea\u0003\u01fa"+
		"\u00fd\u0000\u03e4\u03e5\u0005l\u0000\u0000\u03e5\u03e8\u0003j5\u0000"+
		"\u03e6\u03e7\u0005\u001a\u0000\u0000\u03e7\u03e9\u0003p8\u0000\u03e8\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9\u03eb"+
		"\u0001\u0000\u0000\u0000\u03ea\u03e4\u0001\u0000\u0000\u0000\u03ea\u03eb"+
		"\u0001\u0000\u0000\u0000\u03ebq\u0001\u0000\u0000\u0000\u03ec\u03ed\u0005"+
		"\u0014\u0000\u0000\u03ed\u03ee\u0003\u00e6s\u0000\u03ee\u03ef\u0005:\u0000"+
		"\u0000\u03ef\u03f0\u0003\u0124\u0092\u0000\u03f0\u03f1\u0005)\u0000\u0000"+
		"\u03f1\u03f2\u0003v;\u0000\u03f2\u03f3\u00036\u001b\u0000\u03f3\u03f5"+
		"\u0005\u0018\u0000\u0000\u03f4\u03f6\u0005\u0014\u0000\u0000\u03f5\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f8"+
		"\u0001\u0000\u0000\u0000\u03f7\u03f9\u0003\u00e6s\u0000\u03f8\u03f7\u0001"+
		"\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001"+
		"\u0000\u0000\u0000\u03fa\u03fb\u0005\u008b\u0000\u0000\u03fbs\u0001\u0000"+
		"\u0000\u0000\u03fc\u0400\u0003\u01f2\u00f9\u0000\u03fd\u0400\u00030\u0018"+
		"\u0000\u03fe\u0400\u0003\u00e0p\u0000\u03ff\u03fc\u0001\u0000\u0000\u0000"+
		"\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u03fe\u0001\u0000\u0000\u0000"+
		"\u0400u\u0001\u0000\u0000\u0000\u0401\u0403\u0003t:\u0000\u0402\u0401"+
		"\u0001\u0000\u0000\u0000\u0403\u0406\u0001\u0000\u0000\u0000\u0404\u0402"+
		"\u0001\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405w\u0001"+
		"\u0000\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0407\u040a\u0003"+
		"6\u001b\u0000\u0408\u040a\u0003V+\u0000\u0409\u0407\u0001\u0000\u0000"+
		"\u0000\u0409\u0408\u0001\u0000\u0000\u0000\u040ay\u0001\u0000\u0000\u0000"+
		"\u040b\u040c\u0005\u001e\u0000\u0000\u040c\u040d\u0003\\.\u0000\u040d"+
		"\u040e\u00034\u001a\u0000\u040e\u040f\u0005\u008b\u0000\u0000\u040f{\u0001"+
		"\u0000\u0000\u0000\u0410\u0411\u0005\u0015\u0000\u0000\u0411\u0412\u0003"+
		"\u00e8t\u0000\u0412\u0413\u0005\u0092\u0000\u0000\u0413\u0416\u0003\u01d8"+
		"\u00ec\u0000\u0414\u0415\u0005\u0088\u0000\u0000\u0415\u0417\u0003\u00c0"+
		"`\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000"+
		"\u0000\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u0419\u0005\u008b\u0000"+
		"\u0000\u0419}\u0001\u0000\u0000\u0000\u041a\u041b\u0005\t\u0000\u0000"+
		"\u041b\u041c\u0003\u00ecv\u0000\u041c\u041d\u0005:\u0000\u0000\u041d\u041e"+
		"\u0003\u01d8\u00ec\u0000\u041e\u007f\u0001\u0000\u0000\u0000\u041f\u0420"+
		"\u0005\t\u0000\u0000\u0420\u0421\u0003\u00ecv\u0000\u0421\u0422\u0005"+
		":\u0000\u0000\u0422\u0423\u0003\u01c2\u00e1\u0000\u0423\u0081\u0001\u0000"+
		"\u0000\u0000\u0424\u0427\u0003\u017a\u00bd\u0000\u0425\u0427\u0003\u00ec"+
		"v\u0000\u0426\u0424\u0001\u0000\u0000\u0000\u0426\u0425\u0001\u0000\u0000"+
		"\u0000\u0427\u0083\u0001\u0000\u0000\u0000\u0428\u042a\u0003\u0086C\u0000"+
		"\u0429\u0428\u0001\u0000\u0000\u0000\u042a\u042d\u0001\u0000\u0000\u0000"+
		"\u042b\u0429\u0001\u0000\u0000\u0000\u042b\u042c\u0001\u0000\u0000\u0000"+
		"\u042c\u0085\u0001\u0000\u0000\u0000\u042d\u042b\u0001\u0000\u0000\u0000"+
		"\u042e\u0431\u0003\u0112\u0089\u0000\u042f\u0431\u0003\u01f2\u00f9\u0000"+
		"\u0430\u042e\u0001\u0000\u0000\u0000\u0430\u042f\u0001\u0000\u0000\u0000"+
		"\u0431\u0087\u0001\u0000\u0000\u0000\u0432\u0439\u0005c\u0000\u0000\u0433"+
		"\u0434\u0005J\u0000\u0000\u0434\u0436\u0003\u00c0`\u0000\u0435\u0433\u0001"+
		"\u0000\u0000\u0000\u0435\u0436\u0001\u0000\u0000\u0000\u0436\u0437\u0001"+
		"\u0000\u0000\u0000\u0437\u0439\u0005\'\u0000\u0000\u0438\u0432\u0001\u0000"+
		"\u0000\u0000\u0438\u0435\u0001\u0000\u0000\u0000\u0439\u0089\u0001\u0000"+
		"\u0000\u0000\u043a\u043c\u0003\u008cF\u0000\u043b\u043a\u0001\u0000\u0000"+
		"\u0000\u043c\u043f\u0001\u0000\u0000\u0000\u043d\u043b\u0001\u0000\u0000"+
		"\u0000\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u0440\u0001\u0000\u0000"+
		"\u0000\u043f\u043d\u0001\u0000\u0000\u0000\u0440\u0441\u0005\u0000\u0000"+
		"\u0001\u0441\u008b\u0001\u0000\u0000\u0000\u0442\u0443\u0003\u0084B\u0000"+
		"\u0443\u0444\u0003\u0114\u008a\u0000\u0444\u008d\u0001\u0000\u0000\u0000"+
		"\u0445\u0448\u0003\u00e6s\u0000\u0446\u0448\u0005\u0080\u0000\u0000\u0447"+
		"\u0445\u0001\u0000\u0000\u0000\u0447\u0446\u0001\u0000\u0000\u0000\u0448"+
		"\u008f\u0001\u0000\u0000\u0000\u0449\u044a\u0007\u0002\u0000\u0000\u044a"+
		"\u0091\u0001\u0000\u0000\u0000\u044b\u044c\u0005\u0016\u0000\u0000\u044c"+
		"\u044d\u0003\u00e4r\u0000\u044d\u044e\u0005\u0004\u0000\u0000\u044e\u044f"+
		"\u0003\u00c0`\u0000\u044f\u0450\u0005\u008b\u0000\u0000\u0450\u0093\u0001"+
		"\u0000\u0000\u0000\u0451\u0454\u0003\u0176\u00bb\u0000\u0452\u0454\u0003"+
		"\u01d8\u00ec\u0000\u0453\u0451\u0001\u0000\u0000\u0000\u0453\u0452\u0001"+
		"\u0000\u0000\u0000\u0454\u0095\u0001\u0000\u0000\u0000\u0455\u0456\u0003"+
		"T*\u0000\u0456\u0457\u0005\u0086\u0000\u0000\u0457\u0459\u0001\u0000\u0000"+
		"\u0000\u0458\u0455\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000"+
		"\u0000\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u045b\u0003\u00c0`\u0000"+
		"\u045b\u0097\u0001\u0000\u0000\u0000\u045c\u045d\u0003\u00e8t\u0000\u045d"+
		"\u045e\u0005\u0092\u0000\u0000\u045e\u045f\u0003\u009cN\u0000\u045f\u0460"+
		"\u0005\u008b\u0000\u0000\u0460\u0099\u0001\u0000\u0000\u0000\u0461\u0462"+
		"\u0003\u01c2\u00e1\u0000\u0462\u009b\u0001\u0000\u0000\u0000\u0463\u0464"+
		"\u0003\u01d8\u00ec\u0000\u0464\u009d\u0001\u0000\u0000\u0000\u0465\u0466"+
		"\u0005\u0019\u0000\u0000\u0466\u046b\u0003\u0124\u0092\u0000\u0467\u0468"+
		"\u0005\u008e\u0000\u0000\u0468\u0469\u0003\u00e6s\u0000\u0469\u046a\u0005"+
		"\u008f\u0000\u0000\u046a\u046c\u0001\u0000\u0000\u0000\u046b\u0467\u0001"+
		"\u0000\u0000\u0000\u046b\u046c\u0001\u0000\u0000\u0000\u046c\u0471\u0001"+
		"\u0000\u0000\u0000\u046d\u046e\u0005\u0014\u0000\u0000\u046e\u0471\u0003"+
		"\u0124\u0092\u0000\u046f\u0471\u0005<\u0000\u0000\u0470\u0465\u0001\u0000"+
		"\u0000\u0000\u0470\u046d\u0001\u0000\u0000\u0000\u0470\u046f\u0001\u0000"+
		"\u0000\u0000\u0471\u009f\u0001\u0000\u0000\u0000\u0472\u0473\u0007\u0003"+
		"\u0000\u0000\u0473\u00a1\u0001\u0000\u0000\u0000\u0474\u0476\u0003\u00a0"+
		"P\u0000\u0475\u0477\u0005\u0089\u0000\u0000\u0476\u0475\u0001\u0000\u0000"+
		"\u0000\u0476\u0477\u0001\u0000\u0000\u0000\u0477\u00a3\u0001\u0000\u0000"+
		"\u0000\u0478\u047d\u0003\u00a2Q\u0000\u0479\u047a\u0005\u008c\u0000\u0000"+
		"\u047a\u047c\u0003\u00a2Q\u0000\u047b\u0479\u0001\u0000\u0000\u0000\u047c"+
		"\u047f\u0001\u0000\u0000\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047d"+
		"\u047e\u0001\u0000\u0000\u0000\u047e\u00a5\u0001\u0000\u0000\u0000\u047f"+
		"\u047d\u0001\u0000\u0000\u0000\u0480\u0481\u0005\u0019\u0000\u0000\u0481"+
		"\u0482\u0003\u00e6s\u0000\u0482\u0483\u0005)\u0000\u0000\u0483\u0484\u0003"+
		"\u00aeW\u0000\u0484\u0487\u0003\u00aaU\u0000\u0485\u0486\u0005\f\u0000"+
		"\u0000\u0486\u0488\u0003\u00b6[\u0000\u0487\u0485\u0001\u0000\u0000\u0000"+
		"\u0487\u0488\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000"+
		"\u0489\u048b\u0005\u0018\u0000\u0000\u048a\u048c\u0005\u0019\u0000\u0000"+
		"\u048b\u048a\u0001\u0000\u0000\u0000\u048b\u048c\u0001\u0000\u0000\u0000"+
		"\u048c\u048e\u0001\u0000\u0000\u0000\u048d\u048f\u0003\u00e6s\u0000\u048e"+
		"\u048d\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000\u0000\u048f"+
		"\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0005\u008b\u0000\u0000\u0491"+
		"\u00a7\u0001\u0000\u0000\u0000\u0492\u04a7\u0003\u01c6\u00e3\u0000\u0493"+
		"\u04a7\u0003\u01c4\u00e2\u0000\u0494\u04a7\u0003\u01ea\u00f5\u0000\u0495"+
		"\u04a7\u0003\u01d6\u00eb\u0000\u0496\u04a7\u0003|>\u0000\u0497\u04a7\u0003"+
		"\u01a2\u00d1\u0000\u0498\u04a7\u0003\u01f6\u00fb\u0000\u0499\u04a7\u0003"+
		"\u00c4b\u0000\u049a\u04a7\u0003\u0010\b\u0000\u049b\u04a7\u0003,\u0016"+
		"\u0000\u049c\u04a7\u00030\u0018\u0000\u049d\u04a7\u0003\u0092I\u0000\u049e"+
		"\u04a7\u0003\u01be\u00df\u0000\u049f\u04a7\u0003\u01f2\u00f9\u0000\u04a0"+
		"\u04a7\u0003\u00e2q\u0000\u04a1\u04a7\u0003\u00e0p\u0000\u04a2\u04a7\u0003"+
		"\u0132\u0099\u0000\u04a3\u04a7\u0003\u01c0\u00e0\u0000\u04a4\u04a7\u0003"+
		"\u0170\u00b8\u0000\u04a5\u04a7\u0003\u01e2\u00f1\u0000\u04a6\u0492\u0001"+
		"\u0000\u0000\u0000\u04a6\u0493\u0001\u0000\u0000\u0000\u04a6\u0494\u0001"+
		"\u0000\u0000\u0000\u04a6\u0495\u0001\u0000\u0000\u0000\u04a6\u0496\u0001"+
		"\u0000\u0000\u0000\u04a6\u0497\u0001\u0000\u0000\u0000\u04a6\u0498\u0001"+
		"\u0000\u0000\u0000\u04a6\u0499\u0001\u0000\u0000\u0000\u04a6\u049a\u0001"+
		"\u0000\u0000\u0000\u04a6\u049b\u0001\u0000\u0000\u0000\u04a6\u049c\u0001"+
		"\u0000\u0000\u0000\u04a6\u049d\u0001\u0000\u0000\u0000\u04a6\u049e\u0001"+
		"\u0000\u0000\u0000\u04a6\u049f\u0001\u0000\u0000\u0000\u04a6\u04a0\u0001"+
		"\u0000\u0000\u0000\u04a6\u04a1\u0001\u0000\u0000\u0000\u04a6\u04a2\u0001"+
		"\u0000\u0000\u0000\u04a6\u04a3\u0001\u0000\u0000\u0000\u04a6\u04a4\u0001"+
		"\u0000\u0000\u0000\u04a6\u04a5\u0001\u0000\u0000\u0000\u04a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u04a8\u04aa\u0003\u00a8T\u0000\u04a9\u04a8\u0001\u0000"+
		"\u0000\u0000\u04aa\u04ad\u0001\u0000\u0000\u0000\u04ab\u04a9\u0001\u0000"+
		"\u0000\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ae\u04b0\u0003\u00b8"+
		"\\\u0000\u04af\u04b1\u0003\u01a8\u00d4\u0000\u04b0\u04af\u0001\u0000\u0000"+
		"\u0000\u04b0\u04b1\u0001\u0000\u0000\u0000\u04b1\u00ad\u0001\u0000\u0000"+
		"\u0000\u04b2\u04b4\u0003\u00d6k\u0000\u04b3\u04b2\u0001\u0000\u0000\u0000"+
		"\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b6\u0001\u0000\u0000\u0000"+
		"\u04b5\u04b7\u0003\u0152\u00a9\u0000\u04b6\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b6\u04b7\u0001\u0000\u0000\u0000\u04b7\u00af\u0001\u0000\u0000\u0000"+
		"\u04b8\u04bd\u0003\u00acV\u0000\u04b9\u04ba\u0005\u008c\u0000\u0000\u04ba"+
		"\u04bc\u0003\u00acV\u0000\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bc\u04bf"+
		"\u0001\u0000\u0000\u0000\u04bd\u04bb\u0001\u0000\u0000\u0000\u04bd\u04be"+
		"\u0001\u0000\u0000\u0000\u04be\u04c3\u0001\u0000\u0000\u0000\u04bf\u04bd"+
		"\u0001\u0000\u0000\u0000\u04c0\u04c3\u0005>\u0000\u0000\u04c1\u04c3\u0005"+
		"\u0006\u0000\u0000\u04c2\u04b8\u0001\u0000\u0000\u0000\u04c2\u04c0\u0001"+
		"\u0000\u0000\u0000\u04c2\u04c1\u0001\u0000\u0000\u0000\u04c3\u00b1\u0001"+
		"\u0000\u0000\u0000\u04c4\u04c5\u0003\u00b0X\u0000\u04c5\u04c6\u0005\u0092"+
		"\u0000\u0000\u04c6\u04c7\u0003\u00a0P\u0000\u04c7\u00b3\u0001\u0000\u0000"+
		"\u0000\u04c8\u04cc\u0003b1\u0000\u04c9\u04cc\u0003\u016a\u00b5\u0000\u04ca"+
		"\u04cc\u0003f3\u0000\u04cb\u04c8\u0001\u0000\u0000\u0000\u04cb\u04c9\u0001"+
		"\u0000\u0000\u0000\u04cb\u04ca\u0001\u0000\u0000\u0000\u04cc\u00b5\u0001"+
		"\u0000\u0000\u0000\u04cd\u04cf\u0003\u00b4Z\u0000\u04ce\u04cd\u0001\u0000"+
		"\u0000\u0000\u04cf\u04d2\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001\u0000"+
		"\u0000\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u00b7\u0001\u0000"+
		"\u0000\u0000\u04d2\u04d0\u0001\u0000\u0000\u0000\u04d3\u04d7\u0003\u00e6"+
		"s\u0000\u04d4\u04d7\u0005\u007f\u0000\u0000\u04d5\u04d7\u0005\u0080\u0000"+
		"\u0000\u04d6\u04d3\u0001\u0000\u0000\u0000\u04d6\u04d4\u0001\u0000\u0000"+
		"\u0000\u04d6\u04d5\u0001\u0000\u0000\u0000\u04d7\u00b9\u0001\u0000\u0000"+
		"\u0000\u04d8\u04db\u0003\u00e6s\u0000\u04d9\u04db\u0005\u007f\u0000\u0000"+
		"\u04da\u04d8\u0001\u0000\u0000\u0000\u04da\u04d9\u0001\u0000\u0000\u0000"+
		"\u04db\u00bb\u0001\u0000\u0000\u0000\u04dc\u04dd\u0005\u008e\u0000\u0000"+
		"\u04dd\u04e2\u0003\u00ba]\u0000\u04de\u04df\u0005\u008c\u0000\u0000\u04df"+
		"\u04e1\u0003\u00ba]\u0000\u04e0\u04de\u0001\u0000\u0000\u0000\u04e1\u04e4"+
		"\u0001\u0000\u0000\u0000\u04e2\u04e0\u0001\u0000\u0000\u0000\u04e2\u04e3"+
		"\u0001\u0000\u0000\u0000\u04e3\u04e5\u0001\u0000\u0000\u0000\u04e4\u04e2"+
		"\u0001\u0000\u0000\u0000\u04e5\u04e6\u0005\u008f\u0000\u0000\u04e6\u00bd"+
		"\u0001\u0000\u0000\u0000\u04e7\u04e9\u0003\u0110\u0088\u0000\u04e8\u04e7"+
		"\u0001\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000\u04e9\u04ea"+
		"\u0001\u0000\u0000\u0000\u04ea\u04ec\u0005\u001c\u0000\u0000\u04eb\u04ed"+
		"\u0003\u00e6s\u0000\u04ec\u04eb\u0001\u0000\u0000\u0000\u04ec\u04ed\u0001"+
		"\u0000\u0000\u0000\u04ed\u04f0\u0001\u0000\u0000\u0000\u04ee\u04ef\u0005"+
		"l\u0000\u0000\u04ef\u04f1\u0003j5\u0000\u04f0\u04ee\u0001\u0000\u0000"+
		"\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1\u04f2\u0001\u0000\u0000"+
		"\u0000\u04f2\u04f3\u0005\u008b\u0000\u0000\u04f3\u00bf\u0001\u0000\u0000"+
		"\u0000\u04f4\u04fa\u0003\u0180\u00c0\u0000\u04f5\u04f6\u0003\u011c\u008e"+
		"\u0000\u04f6\u04f7\u0003\u0180\u00c0\u0000\u04f7\u04f9\u0001\u0000\u0000"+
		"\u0000\u04f8\u04f5\u0001\u0000\u0000\u0000\u04f9\u04fc\u0001\u0000\u0000"+
		"\u0000\u04fa\u04f8\u0001\u0000\u0000\u0000\u04fa\u04fb\u0001\u0000\u0000"+
		"\u0000\u04fb\u00c1\u0001\u0000\u0000\u0000\u04fc\u04fa\u0001\u0000\u0000"+
		"\u0000\u04fd\u0500\u0003\u0158\u00ac\u0000\u04fe\u04ff\u0005\u0082\u0000"+
		"\u0000\u04ff\u0501\u0003\u0158\u00ac\u0000\u0500\u04fe\u0001\u0000\u0000"+
		"\u0000\u0500\u0501\u0001\u0000\u0000\u0000\u0501\u0507\u0001\u0000\u0000"+
		"\u0000\u0502\u0503\u0005\u0001\u0000\u0000\u0503\u0507\u0003\u0158\u00ac"+
		"\u0000\u0504\u0505\u00058\u0000\u0000\u0505\u0507\u0003\u0158\u00ac\u0000"+
		"\u0506\u04fd\u0001\u0000\u0000\u0000\u0506\u0502\u0001\u0000\u0000\u0000"+
		"\u0506\u0504\u0001\u0000\u0000\u0000\u0507\u00c3\u0001\u0000\u0000\u0000"+
		"\u0508\u0509\u0005\u001d\u0000\u0000\u0509\u050a\u0003\u00e8t\u0000\u050a"+
		"\u050b\u0005\u0092\u0000\u0000\u050b\u050d\u0003\u01d8\u00ec\u0000\u050c"+
		"\u050e\u0003\u00c8d\u0000\u050d\u050c\u0001\u0000\u0000\u0000\u050d\u050e"+
		"\u0001\u0000\u0000\u0000\u050e\u050f\u0001\u0000\u0000\u0000\u050f\u0510"+
		"\u0005\u008b\u0000\u0000\u0510\u00c5\u0001\u0000\u0000\u0000\u0511\u0512"+
		"\u0003\u00c0`\u0000\u0512\u00c7\u0001\u0000\u0000\u0000\u0513\u0514\u0005"+
		"<\u0000\u0000\u0514\u0516\u0003\u00c0`\u0000\u0515\u0513\u0001\u0000\u0000"+
		"\u0000\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0517\u0001\u0000\u0000"+
		"\u0000\u0517\u0518\u0005)\u0000\u0000\u0518\u0519\u0003\u00c6c\u0000\u0519"+
		"\u00c9\u0001\u0000\u0000\u0000\u051a\u051b\u0005\u001d\u0000\u0000\u051b"+
		"\u051c\u0005:\u0000\u0000\u051c\u051d\u0003\u01d8\u00ec\u0000\u051d\u00cb"+
		"\u0001\u0000\u0000\u0000\u051e\u051f\u0003\u0102\u0081\u0000\u051f\u00cd"+
		"\u0001\u0000\u0000\u0000\u0520\u0527\u0003\u00e6s\u0000\u0521\u0522\u0003"+
		"\u00e6s\u0000\u0522\u0523\u0005\u008e\u0000\u0000\u0523\u0524\u0003\u0178"+
		"\u00bc\u0000\u0524\u0525\u0005\u008f\u0000\u0000\u0525\u0527\u0001\u0000"+
		"\u0000\u0000\u0526\u0520\u0001\u0000\u0000\u0000\u0526\u0521\u0001\u0000"+
		"\u0000\u0000\u0527\u00cf\u0001\u0000\u0000\u0000\u0528\u0529\u0005G\u0000"+
		"\u0000\u0529\u052a\u0003\u00e8t\u0000\u052a\u052b\u0005\u0092\u0000\u0000"+
		"\u052b\u052e\u0003\u01d8\u00ec\u0000\u052c\u052d\u0005\u0088\u0000\u0000"+
		"\u052d\u052f\u0003\u00c0`\u0000\u052e\u052c\u0001\u0000\u0000\u0000\u052e"+
		"\u052f\u0001\u0000\u0000\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530"+
		"\u0531\u0005\u008b\u0000\u0000\u0531\u00d1\u0001\u0000\u0000\u0000\u0532"+
		"\u0533\u0003\u0110\u0088\u0000\u0533\u0534\u0003\u00d4j\u0000\u0534\u053c"+
		"\u0005 \u0000\u0000\u0535\u0537\u00038\u001c\u0000\u0536\u0535\u0001\u0000"+
		"\u0000\u0000\u0537\u053a\u0001\u0000\u0000\u0000\u0538\u0536\u0001\u0000"+
		"\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539\u053b\u0001\u0000"+
		"\u0000\u0000\u053a\u0538\u0001\u0000\u0000\u0000\u053b\u053d\u0005\f\u0000"+
		"\u0000\u053c\u0538\u0001\u0000\u0000\u0000\u053c\u053d\u0001\u0000\u0000"+
		"\u0000\u053d\u0541\u0001\u0000\u0000\u0000\u053e\u0540\u0003\u001c\u000e"+
		"\u0000\u053f\u053e\u0001\u0000\u0000\u0000\u0540\u0543\u0001\u0000\u0000"+
		"\u0000\u0541\u053f\u0001\u0000\u0000\u0000\u0541\u0542\u0001\u0000\u0000"+
		"\u0000\u0542\u0544\u0001\u0000\u0000\u0000\u0543\u0541\u0001\u0000\u0000"+
		"\u0000\u0544\u0545\u0005\u0018\u0000\u0000\u0545\u0547\u0005 \u0000\u0000"+
		"\u0546\u0548\u0003\u00e6s\u0000\u0547\u0546\u0001\u0000\u0000\u0000\u0547"+
		"\u0548\u0001\u0000\u0000\u0000\u0548\u0549\u0001\u0000\u0000\u0000\u0549"+
		"\u054a\u0005\u008b\u0000\u0000\u054a\u00d3\u0001\u0000\u0000\u0000\u054b"+
		"\u054c\u0005\u001e\u0000\u0000\u054c\u0550\u0003\u014c\u00a6\u0000\u054d"+
		"\u054e\u0005$\u0000\u0000\u054e\u0550\u0003j5\u0000\u054f\u054b\u0001"+
		"\u0000\u0000\u0000\u054f\u054d\u0001\u0000\u0000\u0000\u0550\u00d5\u0001"+
		"\u0000\u0000\u0000\u0551\u0552\u0005!\u0000\u0000\u0552\u0553\u0005\u008e"+
		"\u0000\u0000\u0553\u0554\u0003\u00d8l\u0000\u0554\u0555\u0005\u008f\u0000"+
		"\u0000\u0555\u0556\u0005\u008b\u0000\u0000\u0556\u00d7\u0001\u0000\u0000"+
		"\u0000\u0557\u055c\u0003\u00f6{\u0000\u0558\u0559\u0005\u008b\u0000\u0000"+
		"\u0559\u055b\u0003\u00f6{\u0000\u055a\u0558\u0001\u0000\u0000\u0000\u055b"+
		"\u055e\u0001\u0000\u0000\u0000\u055c\u055a\u0001\u0000\u0000\u0000\u055c"+
		"\u055d\u0001\u0000\u0000\u0000\u055d\u00d9\u0001\u0000\u0000\u0000\u055e"+
		"\u055c\u0001\u0000\u0000\u0000\u055f\u0560\u0005!\u0000\u0000\u0560\u0561"+
		"\u00050\u0000\u0000\u0561\u0562\u0005\u008e\u0000\u0000\u0562\u0563\u0003"+
		"*\u0015\u0000\u0563\u0564\u0005\u008f\u0000\u0000\u0564\u00db\u0001\u0000"+
		"\u0000\u0000\u0565\u0568\u0003\u0124\u0092\u0000\u0566\u0568\u0005\u007f"+
		"\u0000\u0000\u0567\u0565\u0001\u0000\u0000\u0000\u0567\u0566\u0001\u0000"+
		"\u0000\u0000\u0568\u00dd\u0001\u0000\u0000\u0000\u0569\u056e\u0003\u00dc"+
		"n\u0000\u056a\u056b\u0005\u008c\u0000\u0000\u056b\u056d\u0003\u00dcn\u0000"+
		"\u056c\u056a\u0001\u0000\u0000\u0000\u056d\u0570\u0001\u0000\u0000\u0000"+
		"\u056e\u056c\u0001\u0000\u0000\u0000\u056e\u056f\u0001\u0000\u0000\u0000"+
		"\u056f\u00df\u0001\u0000\u0000\u0000\u0570\u056e\u0001\u0000\u0000\u0000"+
		"\u0571\u0572\u0005\"\u0000\u0000\u0572\u0573\u0003\u0110\u0088\u0000\u0573"+
		"\u0574\u0003\u0124\u0092\u0000\u0574\u0575\u0005\u008e\u0000\u0000\u0575"+
		"\u0576\u0003\u00deo\u0000\u0576\u0577\u0005\u008f\u0000\u0000\u0577\u0578"+
		"\u0005\u008b\u0000\u0000\u0578\u00e1\u0001\u0000\u0000\u0000\u0579\u057a"+
		"\u0005\"\u0000\u0000\u057a\u057b\u0003\u00e6s\u0000\u057b\u057c\u0005"+
		")\u0000\u0000\u057c\u057d\u0005\u008e\u0000\u0000\u057d\u057e\u0003\u00a4"+
		"R\u0000\u057e\u057f\u0005\u008f\u0000\u0000\u057f\u0580\u0005\u008b\u0000"+
		"\u0000\u0580\u00e3\u0001\u0000\u0000\u0000\u0581\u0582\u0003\u01a6\u00d3"+
		"\u0000\u0582\u0583\u0005\u0092\u0000\u0000\u0583\u0584\u0003\u0124\u0092"+
		"\u0000\u0584\u00e5\u0001\u0000\u0000\u0000\u0585\u0586\u0007\u0004\u0000"+
		"\u0000\u0586\u00e7\u0001\u0000\u0000\u0000\u0587\u058c\u0003\u00e6s\u0000"+
		"\u0588\u0589\u0005\u008c\u0000\u0000\u0589\u058b\u0003\u00e6s\u0000\u058a"+
		"\u0588\u0001\u0000\u0000\u0000\u058b\u058e\u0001\u0000\u0000\u0000\u058c"+
		"\u058a\u0001\u0000\u0000\u0000\u058c\u058d\u0001\u0000\u0000\u0000\u058d"+
		"\u00e9\u0001\u0000\u0000\u0000\u058e\u058c\u0001\u0000\u0000\u0000\u058f"+
		"\u0591\u0003\u0110\u0088\u0000\u0590\u058f\u0001\u0000\u0000\u0000\u0590"+
		"\u0591\u0001\u0000\u0000\u0000\u0591\u0592\u0001\u0000\u0000\u0000\u0592"+
		"\u0593\u0005$\u0000\u0000\u0593\u0594\u0003j5\u0000\u0594\u0595\u0005"+
		"_\u0000\u0000\u0595\u059d\u0003\u0198\u00cc\u0000\u0596\u0597\u0005\u001b"+
		"\u0000\u0000\u0597\u0598\u0003j5\u0000\u0598\u0599\u0005_\u0000\u0000"+
		"\u0599\u059a\u0003\u0198\u00cc\u0000\u059a\u059c\u0001\u0000\u0000\u0000"+
		"\u059b\u0596\u0001\u0000\u0000\u0000\u059c\u059f\u0001\u0000\u0000\u0000"+
		"\u059d\u059b\u0001\u0000\u0000\u0000\u059d\u059e\u0001\u0000\u0000\u0000"+
		"\u059e\u05a2\u0001\u0000\u0000\u0000\u059f\u059d\u0001\u0000\u0000\u0000"+
		"\u05a0\u05a1\u0005\u001a\u0000\u0000\u05a1\u05a3\u0003\u0198\u00cc\u0000"+
		"\u05a2\u05a0\u0001\u0000\u0000\u0000\u05a2\u05a3\u0001\u0000\u0000\u0000"+
		"\u05a3\u05a4\u0001\u0000\u0000\u0000\u05a4\u05a5\u0005\u0018\u0000\u0000"+
		"\u05a5\u05a7\u0005$\u0000\u0000\u05a6\u05a8\u0003\u00e6s\u0000\u05a7\u05a6"+
		"\u0001\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u05a9"+
		"\u0001\u0000\u0000\u0000\u05a9\u05aa\u0005\u008b\u0000\u0000\u05aa\u00eb"+
		"\u0001\u0000\u0000\u0000\u05ab\u05ac\u0005\u008e\u0000\u0000\u05ac\u05b1"+
		"\u0003\u0094J\u0000\u05ad\u05ae\u0005\u008c\u0000\u0000\u05ae\u05b0\u0003"+
		"\u0094J\u0000\u05af\u05ad\u0001\u0000\u0000\u0000\u05b0\u05b3\u0001\u0000"+
		"\u0000\u0000\u05b1\u05af\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000"+
		"\u0000\u0000\u05b2\u05b4\u0001\u0000\u0000\u0000\u05b3\u05b1\u0001\u0000"+
		"\u0000\u0000\u05b4\u05b5\u0005\u008f\u0000\u0000\u05b5\u00ed\u0001\u0000"+
		"\u0000\u0000\u05b6\u05b9\u0003\u0094J\u0000\u05b7\u05b9\u0003\u00c0`\u0000"+
		"\u05b8\u05b6\u0001\u0000\u0000\u0000\u05b8\u05b7\u0001\u0000\u0000\u0000"+
		"\u05b9\u00ef\u0001\u0000\u0000\u0000\u05ba\u05bb\u0003\u0124\u0092\u0000"+
		"\u05bb\u05bc\u0005H\u0000\u0000\u05bc\u05bd\u0005\u0089\u0000\u0000\u05bd"+
		"\u00f1\u0001\u0000\u0000\u0000\u05be\u05c0\u0005\u0013\u0000\u0000\u05bf"+
		"\u05be\u0001\u0000\u0000\u0000\u05bf\u05c0\u0001\u0000\u0000\u0000\u05c0"+
		"\u05c1\u0001\u0000\u0000\u0000\u05c1\u05cd\u0003\u0124\u0092\u0000\u05c2"+
		"\u05c3\u0005\u0019\u0000\u0000\u05c3\u05c8\u0003\u0124\u0092\u0000\u05c4"+
		"\u05c5\u0005\u008e\u0000\u0000\u05c5\u05c6\u0003\u00e6s\u0000\u05c6\u05c7"+
		"\u0005\u008f\u0000\u0000\u05c7\u05c9\u0001\u0000\u0000\u0000\u05c8\u05c4"+
		"\u0001\u0000\u0000\u0000\u05c8\u05c9\u0001\u0000\u0000\u0000\u05c9\u05cd"+
		"\u0001\u0000\u0000\u0000\u05ca\u05cb\u0005\u0014\u0000\u0000\u05cb\u05cd"+
		"\u0003\u0124\u0092\u0000\u05cc\u05bf\u0001\u0000\u0000\u0000\u05cc\u05c2"+
		"\u0001\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000\u0000\u0000\u05cd\u00f3"+
		"\u0001\u0000\u0000\u0000\u05ce\u05d3\u0003\u00e6s\u0000\u05cf\u05d0\u0005"+
		"\u008c\u0000\u0000\u05d0\u05d2\u0003\u00e6s\u0000\u05d1\u05cf\u0001\u0000"+
		"\u0000\u0000\u05d2\u05d5\u0001\u0000\u0000\u0000\u05d3\u05d1\u0001\u0000"+
		"\u0000\u0000\u05d3\u05d4\u0001\u0000\u0000\u0000\u05d4\u05d9\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d3\u0001\u0000\u0000\u0000\u05d6\u05d9\u0005>\u0000"+
		"\u0000\u05d7\u05d9\u0005\u0006\u0000\u0000\u05d8\u05ce\u0001\u0000\u0000"+
		"\u0000\u05d8\u05d6\u0001\u0000\u0000\u0000\u05d8\u05d7\u0001\u0000\u0000"+
		"\u0000\u05d9\u00f5\u0001\u0000\u0000\u0000\u05da\u05dc\u0005\u0015\u0000"+
		"\u0000\u05db\u05da\u0001\u0000\u0000\u0000\u05db\u05dc\u0001\u0000\u0000"+
		"\u0000\u05dc\u05dd\u0001\u0000\u0000\u0000\u05dd\u05de\u0003\u00e8t\u0000"+
		"\u05de\u05e0\u0005\u0092\u0000\u0000\u05df\u05e1\u0005&\u0000\u0000\u05e0"+
		"\u05df\u0001\u0000\u0000\u0000\u05e0\u05e1\u0001\u0000\u0000\u0000\u05e1"+
		"\u05e2\u0001\u0000\u0000\u0000\u05e2\u05e5\u0003\u01d8\u00ec\u0000\u05e3"+
		"\u05e4\u0005\u0088\u0000\u0000\u05e4\u05e6\u0003\u00c0`\u0000\u05e5\u05e3"+
		"\u0001\u0000\u0000\u0000\u05e5\u05e6\u0001\u0000\u0000\u0000\u05e6\u00f7"+
		"\u0001\u0000\u0000\u0000\u05e7\u05ee\u0003\u00f6{\u0000\u05e8\u05ee\u0003"+
		"\u0108\u0084\u0000\u05e9\u05ee\u0003\u010c\u0086\u0000\u05ea\u05ee\u0003"+
		"\u00fc~\u0000\u05eb\u05ee\u0003\u010a\u0085\u0000\u05ec\u05ee\u0003\u0104"+
		"\u0082\u0000\u05ed\u05e7\u0001\u0000\u0000\u0000\u05ed\u05e8\u0001\u0000"+
		"\u0000\u0000\u05ed\u05e9\u0001\u0000\u0000\u0000\u05ed\u05ea\u0001\u0000"+
		"\u0000\u0000\u05ed\u05eb\u0001\u0000\u0000\u0000\u05ed\u05ec\u0001\u0000"+
		"\u0000\u0000\u05ee\u00f9\u0001\u0000\u0000\u0000\u05ef\u05f0\u0003\u00f8"+
		"|\u0000\u05f0\u00fb\u0001\u0000\u0000\u0000\u05f1\u05f2\u0005\u001d\u0000"+
		"\u0000\u05f2\u05f3\u0003\u00e8t\u0000\u05f3\u05f4\u0005\u0092\u0000\u0000"+
		"\u05f4\u05f5\u0003\u01d8\u00ec\u0000\u05f5\u00fd\u0001\u0000\u0000\u0000"+
		"\u05f6\u05fb\u0003\u0108\u0084\u0000\u05f7\u05f8\u0005\u008b\u0000\u0000"+
		"\u05f8\u05fa\u0003\u0108\u0084\u0000\u05f9\u05f7\u0001\u0000\u0000\u0000"+
		"\u05fa\u05fd\u0001\u0000\u0000\u0000\u05fb\u05f9\u0001\u0000\u0000\u0000"+
		"\u05fb\u05fc\u0001\u0000\u0000\u0000\u05fc\u00ff\u0001\u0000\u0000\u0000"+
		"\u05fd\u05fb\u0001\u0000\u0000\u0000\u05fe\u0603\u0003\u0106\u0083\u0000"+
		"\u05ff\u0600\u0005\u008b\u0000\u0000\u0600\u0602\u0003\u0106\u0083\u0000"+
		"\u0601\u05ff\u0001\u0000\u0000\u0000\u0602\u0605\u0001\u0000\u0000\u0000"+
		"\u0603\u0601\u0001\u0000\u0000\u0000\u0603\u0604\u0001\u0000\u0000\u0000"+
		"\u0604\u0101\u0001\u0000\u0000\u0000\u0605\u0603\u0001\u0000\u0000\u0000"+
		"\u0606\u060b\u0003\u00fa}\u0000\u0607\u0608\u0005\u008b\u0000\u0000\u0608"+
		"\u060a\u0003\u00fa}\u0000\u0609\u0607\u0001\u0000\u0000\u0000\u060a\u060d"+
		"\u0001\u0000\u0000\u0000\u060b\u0609\u0001\u0000\u0000\u0000\u060b\u060c"+
		"\u0001\u0000\u0000\u0000\u060c\u0103\u0001\u0000\u0000\u0000\u060d\u060b"+
		"\u0001\u0000\u0000\u0000\u060e\u060f\u0005G\u0000\u0000\u060f\u0610\u0003"+
		"\u00e8t\u0000\u0610\u0612\u0005\u0092\u0000\u0000\u0611\u0613\u0007\u0005"+
		"\u0000\u0000\u0612\u0611\u0001\u0000\u0000\u0000\u0612\u0613\u0001\u0000"+
		"\u0000\u0000\u0613\u0614\u0001\u0000\u0000\u0000\u0614\u0617\u0003\u01d8"+
		"\u00ec\u0000\u0615\u0616\u0005\u0088\u0000\u0000\u0616\u0618\u0003\u00c0"+
		"`\u0000\u0617\u0615\u0001\u0000\u0000\u0000\u0617\u0618\u0001\u0000\u0000"+
		"\u0000\u0618\u0105\u0001\u0000\u0000\u0000\u0619\u061a\u0003\u00e8t\u0000"+
		"\u061a\u061c\u0005\u0092\u0000\u0000\u061b\u061d\u0003\u0120\u0090\u0000"+
		"\u061c\u061b\u0001\u0000\u0000\u0000\u061c\u061d\u0001\u0000\u0000\u0000"+
		"\u061d\u061e\u0001\u0000\u0000\u0000\u061e\u0620\u0003\u01d8\u00ec\u0000"+
		"\u061f\u0621\u0005\u0011\u0000\u0000\u0620\u061f\u0001\u0000\u0000\u0000"+
		"\u0620\u0621\u0001\u0000\u0000\u0000\u0621\u0624\u0001\u0000\u0000\u0000"+
		"\u0622\u0623\u0005\u0088\u0000\u0000\u0623\u0625\u0003\u00c0`\u0000\u0624"+
		"\u0622\u0001\u0000\u0000\u0000\u0624\u0625\u0001\u0000\u0000\u0000\u0625"+
		"\u0107\u0001\u0000\u0000\u0000\u0626\u0627\u0005V\u0000\u0000\u0627\u0628"+
		"\u0003\u00e8t\u0000\u0628\u062a\u0005\u0092\u0000\u0000\u0629\u062b\u0003"+
		"\u0120\u0090\u0000\u062a\u0629\u0001\u0000\u0000\u0000\u062a\u062b\u0001"+
		"\u0000\u0000\u0000\u062b\u062c\u0001\u0000\u0000\u0000\u062c\u062e\u0003"+
		"\u01d8\u00ec\u0000\u062d\u062f\u0005\u0011\u0000\u0000\u062e\u062d\u0001"+
		"\u0000\u0000\u0000\u062e\u062f\u0001\u0000\u0000\u0000\u062f\u0632\u0001"+
		"\u0000\u0000\u0000\u0630\u0631\u0005\u0088\u0000\u0000\u0631\u0633\u0003"+
		"\u00c0`\u0000\u0632\u0630\u0001\u0000\u0000\u0000\u0632\u0633\u0001\u0000"+
		"\u0000\u0000\u0633\u0109\u0001\u0000\u0000\u0000\u0634\u0635\u0005^\u0000"+
		"\u0000\u0635\u0636\u0003\u00e8t\u0000\u0636\u0637\u0005\u0092\u0000\u0000"+
		"\u0637\u0638\u0003\u01c2\u00e1\u0000\u0638\u010b\u0001\u0000\u0000\u0000"+
		"\u0639\u063b\u0005i\u0000\u0000\u063a\u0639\u0001\u0000\u0000\u0000\u063a"+
		"\u063b\u0001\u0000\u0000\u0000\u063b\u063c\u0001\u0000\u0000\u0000\u063c"+
		"\u063d\u0003\u00e8t\u0000\u063d\u063f\u0005\u0092\u0000\u0000\u063e\u0640"+
		"\u0003\u0120\u0090\u0000\u063f\u063e\u0001\u0000\u0000\u0000\u063f\u0640"+
		"\u0001\u0000\u0000\u0000\u0640\u0641\u0001\u0000\u0000\u0000\u0641\u0644"+
		"\u0003\u01d8\u00ec\u0000\u0642\u0643\u0005\u0088\u0000\u0000\u0643\u0645"+
		"\u0003\u00c0`\u0000\u0644\u0642\u0001\u0000\u0000\u0000\u0644\u0645\u0001"+
		"\u0000\u0000\u0000\u0645\u010d\u0001\u0000\u0000\u0000\u0646\u0647\u0005"+
		"m\u0000\u0000\u0647\u064b\u0003j5\u0000\u0648\u0649\u0005\u001e\u0000"+
		"\u0000\u0649\u064b\u0003\u014c\u00a6\u0000\u064a\u0646\u0001\u0000\u0000"+
		"\u0000\u064a\u0648\u0001\u0000\u0000\u0000\u064b\u010f\u0001\u0000\u0000"+
		"\u0000\u064c\u064d\u0003\u00e6s\u0000\u064d\u064e\u0005\u0092\u0000\u0000"+
		"\u064e\u0111\u0001\u0000\u0000\u0000\u064f\u0650\u0005+\u0000\u0000\u0650"+
		"\u0651\u0003\u011a\u008d\u0000\u0651\u0652\u0005\u008b\u0000\u0000\u0652"+
		"\u0113\u0001\u0000\u0000\u0000\u0653\u0656\u0003\u018c\u00c6\u0000\u0654"+
		"\u0656\u0003\u015a\u00ad\u0000\u0655\u0653\u0001\u0000\u0000\u0000\u0655"+
		"\u0654\u0001\u0000\u0000\u0000\u0656\u0115\u0001\u0000\u0000\u0000\u0657"+
		"\u065d\u00059\u0000\u0000\u0658\u065d\u0005q\u0000\u0000\u0659\u065d\u0005"+
		"\u0080\u0000\u0000\u065a\u065d\u0003\u00ba]\u0000\u065b\u065d\u0003\u013a"+
		"\u009d\u0000\u065c\u0657\u0001\u0000\u0000\u0000\u065c\u0658\u0001\u0000"+
		"\u0000\u0000\u065c\u0659\u0001\u0000\u0000\u0000\u065c\u065a\u0001\u0000"+
		"\u0000\u0000\u065c\u065b\u0001\u0000\u0000\u0000\u065d\u0117\u0001\u0000"+
		"\u0000\u0000\u065e\u065f\u0003\u00e6s\u0000\u065f\u0119\u0001\u0000\u0000"+
		"\u0000\u0660\u0665\u0003\u0118\u008c\u0000\u0661\u0662\u0005\u008c\u0000"+
		"\u0000\u0662\u0664\u0003\u0118\u008c\u0000\u0663\u0661\u0001\u0000\u0000"+
		"\u0000\u0664\u0667\u0001\u0000\u0000\u0000\u0665\u0663\u0001\u0000\u0000"+
		"\u0000\u0665\u0666\u0001\u0000\u0000\u0000\u0666\u011b\u0001\u0000\u0000"+
		"\u0000\u0667\u0665\u0001\u0000\u0000\u0000\u0668\u0669\u0007\u0006\u0000"+
		"\u0000\u0669\u011d\u0001\u0000\u0000\u0000\u066a\u066c\u0003\u0110\u0088"+
		"\u0000\u066b\u066a\u0001\u0000\u0000\u0000\u066b\u066c\u0001\u0000\u0000"+
		"\u0000\u066c\u066e\u0001\u0000\u0000\u0000\u066d\u066f\u0003\u010e\u0087"+
		"\u0000\u066e\u066d\u0001\u0000\u0000\u0000\u066e\u066f\u0001\u0000\u0000"+
		"\u0000\u066f\u0670\u0001\u0000\u0000\u0000\u0670\u0671\u0005/\u0000\u0000"+
		"\u0671\u0672\u0003\u0198\u00cc\u0000\u0672\u0673\u0005\u0018\u0000\u0000"+
		"\u0673\u0675\u0005/\u0000\u0000\u0674\u0676\u0003\u00e6s\u0000\u0675\u0674"+
		"\u0001\u0000\u0000\u0000\u0675\u0676\u0001\u0000\u0000\u0000\u0676\u0677"+
		"\u0001\u0000\u0000\u0000\u0677\u0678\u0005\u008b\u0000\u0000\u0678\u011f"+
		"\u0001\u0000\u0000\u0000\u0679\u067a\u0007\u0007\u0000\u0000\u067a\u0121"+
		"\u0001\u0000\u0000\u0000\u067b\u067c\u0007\b\u0000\u0000\u067c\u0123\u0001"+
		"\u0000\u0000\u0000\u067d\u0680\u0003\u00e6s\u0000\u067e\u0680\u0005\u0080"+
		"\u0000\u0000\u067f\u067d\u0001\u0000\u0000\u0000\u067f\u067e\u0001\u0000"+
		"\u0000\u0000\u0680\u0684\u0001\u0000\u0000\u0000\u0681\u0683\u0003\u0126"+
		"\u0093\u0000\u0682\u0681\u0001\u0000\u0000\u0000\u0683\u0686\u0001\u0000"+
		"\u0000\u0000\u0684\u0682\u0001\u0000\u0000\u0000\u0684\u0685\u0001\u0000"+
		"\u0000\u0000\u0685\u0125\u0001\u0000\u0000\u0000\u0686\u0684\u0001\u0000"+
		"\u0000\u0000\u0687\u068c\u0003\u012a\u0095\u0000\u0688\u068c\u0003\u012c"+
		"\u0096\u0000\u0689\u068c\u0003\u012e\u0097\u0000\u068a\u068c\u0003\u0130"+
		"\u0098\u0000\u068b\u0687\u0001\u0000\u0000\u0000\u068b\u0688\u0001\u0000"+
		"\u0000\u0000\u068b\u0689\u0001\u0000\u0000\u0000\u068b\u068a\u0001\u0000"+
		"\u0000\u0000\u068c\u0127\u0001\u0000\u0000\u0000\u068d\u0692\u0003\u00e6"+
		"s\u0000\u068e\u068f\u0005\u009b\u0000\u0000\u068f\u0691\u0003\u01da\u00ed"+
		"\u0000\u0690\u068e\u0001\u0000\u0000\u0000\u0691\u0694\u0001\u0000\u0000"+
		"\u0000\u0692\u0690\u0001\u0000\u0000\u0000\u0692\u0693\u0001\u0000\u0000"+
		"\u0000\u0693\u0129\u0001\u0000\u0000\u0000\u0694\u0692\u0001\u0000\u0000"+
		"\u0000\u0695\u0696\u0005\u009b\u0000\u0000\u0696\u0698\u0003\u01da\u00ed"+
		"\u0000\u0697\u0695\u0001\u0000\u0000\u0000\u0698\u0699\u0001\u0000\u0000"+
		"\u0000\u0699\u0697\u0001\u0000\u0000\u0000\u0699\u069a\u0001\u0000\u0000"+
		"\u0000\u069a\u012b\u0001\u0000\u0000\u0000\u069b\u069c\u0005\u008e\u0000"+
		"\u0000\u069c\u069d\u0003\b\u0004\u0000\u069d\u069e\u0005\u008f\u0000\u0000"+
		"\u069e\u012d\u0001\u0000\u0000\u0000\u069f\u06a0\u0005\u008e\u0000\u0000"+
		"\u06a0\u06a1\u0003\u0094J\u0000\u06a1\u06a2\u0005\u008f\u0000\u0000\u06a2"+
		"\u012f\u0001\u0000\u0000\u0000\u06a3\u06a5\u0003\u01a8\u00d4\u0000\u06a4"+
		"\u06a3\u0001\u0000\u0000\u0000\u06a4\u06a5\u0001\u0000\u0000\u0000\u06a5"+
		"\u06a6\u0001\u0000\u0000\u0000\u06a6\u06a7\u0005\u00a3\u0000\u0000\u06a7"+
		"\u06ac\u0003.\u0017\u0000\u06a8\u06a9\u0005\u008e\u0000\u0000\u06a9\u06aa"+
		"\u0003\u00c0`\u0000\u06aa\u06ab\u0005\u008f\u0000\u0000\u06ab\u06ad\u0001"+
		"\u0000\u0000\u0000\u06ac\u06a8\u0001\u0000\u0000\u0000\u06ac\u06ad\u0001"+
		"\u0000\u0000\u0000\u06ad\u0131\u0001\u0000\u0000\u0000\u06ae\u06af\u0005"+
		"3\u0000\u0000\u06af\u06b0\u0003\u00e6s\u0000\u06b0\u06b1\u0005)\u0000"+
		"\u0000\u06b1\u06b2\u0003\u0134\u009a\u0000\u06b2\u06b3\u0005\u008b\u0000"+
		"\u0000\u06b3\u0133\u0001\u0000\u0000\u0000\u06b4\u06b7\u0003\u0188\u00c4"+
		"\u0000\u06b5\u06b7\u0003^/\u0000\u06b6\u06b4\u0001\u0000\u0000\u0000\u06b6"+
		"\u06b5\u0001\u0000\u0000\u0000\u06b7\u0135\u0001\u0000\u0000\u0000\u06b8"+
		"\u06b9\u0003\u00e8t\u0000\u06b9\u06ba\u0005\u0092\u0000\u0000\u06ba\u06bb"+
		"\u0003\u009aM\u0000\u06bb\u0137\u0001\u0000\u0000\u0000\u06bc\u06be\u0003"+
		"\u0110\u0088\u0000\u06bd\u06bc\u0001\u0000\u0000\u0000\u06bd\u06be\u0001"+
		"\u0000\u0000\u0000\u06be\u06bf\u0001\u0000\u0000\u0000\u06bf\u06c1\u0005"+
		"5\u0000\u0000\u06c0\u06c2\u0003\u00e6s\u0000\u06c1\u06c0\u0001\u0000\u0000"+
		"\u0000\u06c1\u06c2\u0001\u0000\u0000\u0000\u06c2\u06c5\u0001\u0000\u0000"+
		"\u0000\u06c3\u06c4\u0005l\u0000\u0000\u06c4\u06c6\u0003j5\u0000\u06c5"+
		"\u06c3\u0001\u0000\u0000\u0000\u06c5\u06c6\u0001\u0000\u0000\u0000\u06c6"+
		"\u06c7\u0001\u0000\u0000\u0000\u06c7\u06c8\u0005\u008b\u0000\u0000\u06c8"+
		"\u0139\u0001\u0000\u0000\u0000\u06c9\u06cc\u0003\u0000\u0000\u0000\u06ca"+
		"\u06cc\u0003\u014e\u00a7\u0000\u06cb\u06c9\u0001\u0000\u0000\u0000\u06cb"+
		"\u06ca\u0001\u0000\u0000\u0000\u06cc\u013b\u0001\u0000\u0000\u0000\u06cd"+
		"\u06d4\u0003|>\u0000\u06ce\u06d4\u0003\u01a2\u00d1\u0000\u06cf\u06d4\u0003"+
		"\u01f6\u00fb\u0000\u06d0\u06d4\u0003\u00c4b\u0000\u06d1\u06d4\u0003\u01e2"+
		"\u00f1\u0000\u06d2\u06d4\u0003\u0170\u00b8\u0000\u06d3\u06cd\u0001\u0000"+
		"\u0000\u0000\u06d3\u06ce\u0001\u0000\u0000\u0000\u06d3\u06cf\u0001\u0000"+
		"\u0000\u0000\u06d3\u06d0\u0001\u0000\u0000\u0000\u06d3\u06d1\u0001\u0000"+
		"\u0000\u0000\u06d3\u06d2\u0001\u0000\u0000\u0000\u06d4\u013d\u0001\u0000"+
		"\u0000\u0000\u06d5\u06d7\u0005#\u0000\u0000\u06d6\u06d5\u0001\u0000\u0000"+
		"\u0000\u06d6\u06d7\u0001\u0000\u0000\u0000\u06d7\u06d9\u0001\u0000\u0000"+
		"\u0000\u06d8\u06da\u0003\u0088D\u0000\u06d9\u06d8\u0001\u0000\u0000\u0000"+
		"\u06d9\u06da\u0001\u0000\u0000\u0000\u06da\u013f\u0001\u0000\u0000\u0000"+
		"\u06db\u06dc\u0005@\u0000\u0000\u06dc\u06dd\u0005\u000e\u0000\u0000\u06dd"+
		"\u06de\u0003\u00e6s\u0000\u06de\u06df\u0005)\u0000\u0000\u06df\u06e0\u0003"+
		"\u0144\u00a2\u0000\u06e0\u06e3\u0005\u0018\u0000\u0000\u06e1\u06e2\u0005"+
		"@\u0000\u0000\u06e2\u06e4\u0005\u000e\u0000\u0000\u06e3\u06e1\u0001\u0000"+
		"\u0000\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000\u06e4\u06e6\u0001\u0000"+
		"\u0000\u0000\u06e5\u06e7\u0003\u00e6s\u0000\u06e6\u06e5\u0001\u0000\u0000"+
		"\u0000\u06e6\u06e7\u0001\u0000\u0000\u0000\u06e7\u06e8\u0001\u0000\u0000"+
		"\u0000\u06e8\u06e9\u0005\u008b\u0000\u0000\u06e9\u0141\u0001\u0000\u0000"+
		"\u0000\u06ea\u06f6\u0003\u01c6\u00e3\u0000\u06eb\u06f6\u0003\u01c4\u00e2"+
		"\u0000\u06ec\u06f6\u0003\u01ea\u00f5\u0000\u06ed\u06f6\u0003\u01d6\u00eb"+
		"\u0000\u06ee\u06f6\u0003|>\u0000\u06ef\u06f6\u0003\u01f6\u00fb\u0000\u06f0"+
		"\u06f6\u0003\u00c4b\u0000\u06f1\u06f6\u0003\u0010\b\u0000\u06f2\u06f6"+
		"\u0003\u01f2\u00f9\u0000\u06f3\u06f6\u0003\u00e2q\u0000\u06f4\u06f6\u0003"+
		"\u00e0p\u0000\u06f5\u06ea\u0001\u0000\u0000\u0000\u06f5\u06eb\u0001\u0000"+
		"\u0000\u0000\u06f5\u06ec\u0001\u0000\u0000\u0000\u06f5\u06ed\u0001\u0000"+
		"\u0000\u0000\u06f5\u06ee\u0001\u0000\u0000\u0000\u06f5\u06ef\u0001\u0000"+
		"\u0000\u0000\u06f5\u06f0\u0001\u0000\u0000\u0000\u06f5\u06f1\u0001\u0000"+
		"\u0000\u0000\u06f5\u06f2\u0001\u0000\u0000\u0000\u06f5\u06f3\u0001\u0000"+
		"\u0000\u0000\u06f5\u06f4\u0001\u0000\u0000\u0000\u06f6\u0143\u0001\u0000"+
		"\u0000\u0000\u06f7\u06f9\u0003\u0142\u00a1\u0000\u06f8\u06f7\u0001\u0000"+
		"\u0000\u0000\u06f9\u06fc\u0001\u0000\u0000\u0000\u06fa\u06f8\u0001\u0000"+
		"\u0000\u0000\u06fa\u06fb\u0001\u0000\u0000\u0000\u06fb\u0145\u0001\u0000"+
		"\u0000\u0000\u06fc\u06fa\u0001\u0000\u0000\u0000\u06fd\u06fe\u0005@\u0000"+
		"\u0000\u06fe\u06ff\u0003\u00e6s\u0000\u06ff\u0700\u0005)\u0000\u0000\u0700"+
		"\u0701\u0003\u014a\u00a5\u0000\u0701\u0703\u0005\u0018\u0000\u0000\u0702"+
		"\u0704\u0005@\u0000\u0000\u0703\u0702\u0001\u0000\u0000\u0000\u0703\u0704"+
		"\u0001\u0000\u0000\u0000\u0704\u0706\u0001\u0000\u0000\u0000\u0705\u0707"+
		"\u0003\u00e6s\u0000\u0706\u0705\u0001\u0000\u0000\u0000\u0706\u0707\u0001"+
		"\u0000\u0000\u0000\u0707\u0708\u0001\u0000\u0000\u0000\u0708\u0709\u0005"+
		"\u008b\u0000\u0000\u0709\u0147\u0001\u0000\u0000\u0000\u070a\u071e\u0003"+
		"\u01c6\u00e3\u0000\u070b\u071e\u0003\u01c4\u00e2\u0000\u070c\u071e\u0003"+
		"\u01ea\u00f5\u0000\u070d\u071e\u0003\u01d6\u00eb\u0000\u070e\u071e\u0003"+
		"|>\u0000\u070f\u071e\u0003\u01a2\u00d1\u0000\u0710\u071e\u0003\u01f6\u00fb"+
		"\u0000\u0711\u071e\u0003\u00c4b\u0000\u0712\u071e\u0003\u0010\b\u0000"+
		"\u0713\u071e\u0003X,\u0000\u0714\u071e\u0003,\u0016\u0000\u0715\u071e"+
		"\u00030\u0018\u0000\u0716\u071e\u0003\u0092I\u0000\u0717\u071e\u0003\u01f2"+
		"\u00f9\u0000\u0718\u071e\u0003\u00e2q\u0000\u0719\u071e\u0003\u00e0p\u0000"+
		"\u071a\u071e\u0003\u0132\u0099\u0000\u071b\u071e\u0003\u01c0\u00e0\u0000"+
		"\u071c\u071e\u0003\u01e2\u00f1\u0000\u071d\u070a\u0001\u0000\u0000\u0000"+
		"\u071d\u070b\u0001\u0000\u0000\u0000\u071d\u070c\u0001\u0000\u0000\u0000"+
		"\u071d\u070d\u0001\u0000\u0000\u0000\u071d\u070e\u0001\u0000\u0000\u0000"+
		"\u071d\u070f\u0001\u0000\u0000\u0000\u071d\u0710\u0001\u0000\u0000\u0000"+
		"\u071d\u0711\u0001\u0000\u0000\u0000\u071d\u0712\u0001\u0000\u0000\u0000"+
		"\u071d\u0713\u0001\u0000\u0000\u0000\u071d\u0714\u0001\u0000\u0000\u0000"+
		"\u071d\u0715\u0001\u0000\u0000\u0000\u071d\u0716\u0001\u0000\u0000\u0000"+
		"\u071d\u0717\u0001\u0000\u0000\u0000\u071d\u0718\u0001\u0000\u0000\u0000"+
		"\u071d\u0719\u0001\u0000\u0000\u0000\u071d\u071a\u0001\u0000\u0000\u0000"+
		"\u071d\u071b\u0001\u0000\u0000\u0000\u071d\u071c\u0001\u0000\u0000\u0000"+
		"\u071e\u0149\u0001\u0000\u0000\u0000\u071f\u0721\u0003\u0148\u00a4\u0000"+
		"\u0720\u071f\u0001\u0000\u0000\u0000\u0721\u0724\u0001\u0000\u0000\u0000"+
		"\u0722\u0720\u0001\u0000\u0000\u0000\u0722\u0723\u0001\u0000\u0000\u0000"+
		"\u0723\u014b\u0001\u0000\u0000\u0000\u0724\u0722\u0001\u0000\u0000\u0000"+
		"\u0725\u0726\u0003\u00e6s\u0000\u0726\u0727\u0005&\u0000\u0000\u0727\u0728"+
		"\u0003\u0094J\u0000\u0728\u014d\u0001\u0000\u0000\u0000\u0729\u072a\u0003"+
		"\u0000\u0000\u0000\u072a\u072b\u0003\u00e6s\u0000\u072b\u014f\u0001\u0000"+
		"\u0000\u0000\u072c\u072d\u0003\u017a\u00bd\u0000\u072d\u072e\u0005f\u0000"+
		"\u0000\u072e\u0732\u00032\u0019\u0000\u072f\u0731\u0003\u018e\u00c7\u0000"+
		"\u0730\u072f\u0001\u0000\u0000\u0000\u0731\u0734\u0001\u0000\u0000\u0000"+
		"\u0732\u0730\u0001\u0000\u0000\u0000\u0732\u0733\u0001\u0000\u0000\u0000"+
		"\u0733\u0735\u0001\u0000\u0000\u0000\u0734\u0732\u0001\u0000\u0000\u0000"+
		"\u0735\u0736\u0005\u0018\u0000\u0000\u0736\u0738\u0005f\u0000\u0000\u0737"+
		"\u0739\u0003\u00e6s\u0000\u0738\u0737\u0001\u0000\u0000\u0000\u0738\u0739"+
		"\u0001\u0000\u0000\u0000\u0739\u0151\u0001\u0000\u0000\u0000\u073a\u073b"+
		"\u0005A\u0000\u0000\u073b\u073c\u0005\u008e\u0000\u0000\u073c\u073d\u0003"+
		"\u0154\u00aa\u0000\u073d\u073e\u0005\u008f\u0000\u0000\u073e\u073f\u0005"+
		"\u008b\u0000\u0000\u073f\u0153\u0001\u0000\u0000\u0000\u0740\u0741\u0003"+
		"\u0100\u0080\u0000\u0741\u0155\u0001\u0000\u0000\u0000\u0742\u0743\u0005"+
		"A\u0000\u0000\u0743\u0744\u00050\u0000\u0000\u0744\u0745\u0005\u008e\u0000"+
		"\u0000\u0745\u0746\u0003*\u0015\u0000\u0746\u0747\u0005\u008f\u0000\u0000"+
		"\u0747\u0157\u0001\u0000\u0000\u0000\u0748\u0752\u0003\u0116\u008b\u0000"+
		"\u0749\u0752\u0003\u016e\u00b7\u0000\u074a\u074b\u0005\u008e\u0000\u0000"+
		"\u074b\u074c\u0003\u00c0`\u0000\u074c\u074d\u0005\u008f\u0000\u0000\u074d"+
		"\u0752\u0001\u0000\u0000\u0000\u074e\u0752\u0003\u0016\u000b\u0000\u074f"+
		"\u0752\u0003\u000e\u0007\u0000\u0750\u0752\u0003\u0124\u0092\u0000\u0751"+
		"\u0748\u0001\u0000\u0000\u0000\u0751\u0749\u0001\u0000\u0000\u0000\u0751"+
		"\u074a\u0001\u0000\u0000\u0000\u0751\u074e\u0001\u0000\u0000\u0000\u0751"+
		"\u074f\u0001\u0000\u0000\u0000\u0751\u0750\u0001\u0000\u0000\u0000\u0752"+
		"\u0159\u0001\u0000\u0000\u0000\u0753\u0757\u0003\u00a6S\u0000\u0754\u0757"+
		"\u0003r9\u0000\u0755\u0757\u0003\u0146\u00a3\u0000\u0756\u0753\u0001\u0000"+
		"\u0000\u0000\u0756\u0754\u0001\u0000\u0000\u0000\u0756\u0755\u0001\u0000"+
		"\u0000\u0000\u0757\u015b\u0001\u0000\u0000\u0000\u0758\u0765\u0003\u01c6"+
		"\u00e3\u0000\u0759\u0765\u0003\u01c4\u00e2\u0000\u075a\u0765\u0003\u01ea"+
		"\u00f5\u0000\u075b\u0765\u0003\u01d6\u00eb\u0000\u075c\u0765\u0003|>\u0000"+
		"\u075d\u0765\u0003\u01f6\u00fb\u0000\u075e\u0765\u0003\u0010\b\u0000\u075f"+
		"\u0765\u0003,\u0016\u0000\u0760\u0765\u00030\u0018\u0000\u0761\u0765\u0003"+
		"\u01f2\u00f9\u0000\u0762\u0765\u0003\u00e2q\u0000\u0763\u0765\u0003\u00e0"+
		"p\u0000\u0764\u0758\u0001\u0000\u0000\u0000\u0764\u0759\u0001\u0000\u0000"+
		"\u0000\u0764\u075a\u0001\u0000\u0000\u0000\u0764\u075b\u0001\u0000\u0000"+
		"\u0000\u0764\u075c\u0001\u0000\u0000\u0000\u0764\u075d\u0001\u0000\u0000"+
		"\u0000\u0764\u075e\u0001\u0000\u0000\u0000\u0764\u075f\u0001\u0000\u0000"+
		"\u0000\u0764\u0760\u0001\u0000\u0000\u0000\u0764\u0761\u0001\u0000\u0000"+
		"\u0000\u0764\u0762\u0001\u0000\u0000\u0000\u0764\u0763\u0001\u0000\u0000"+
		"\u0000\u0765\u015d\u0001\u0000\u0000\u0000\u0766\u0768\u0003\u015c\u00ae"+
		"\u0000\u0767\u0766\u0001\u0000\u0000\u0000\u0768\u076b\u0001\u0000\u0000"+
		"\u0000\u0769\u0767\u0001\u0000\u0000\u0000\u0769\u076a\u0001\u0000\u0000"+
		"\u0000\u076a\u015f\u0001\u0000\u0000\u0000\u076b\u0769\u0001\u0000\u0000"+
		"\u0000\u076c\u076e\u0003\u019a\u00cd\u0000\u076d\u076c\u0001\u0000\u0000"+
		"\u0000\u076e\u0771\u0001\u0000\u0000\u0000\u076f\u076d\u0001\u0000\u0000"+
		"\u0000\u076f\u0770\u0001\u0000\u0000\u0000\u0770\u0161\u0001\u0000\u0000"+
		"\u0000\u0771\u076f\u0001\u0000\u0000\u0000\u0772\u0777\u0003\u0128\u0094"+
		"\u0000\u0773\u0774\u0005\u008e\u0000\u0000\u0774\u0775\u0003\b\u0004\u0000"+
		"\u0775\u0776\u0005\u008f\u0000\u0000\u0776\u0778\u0001\u0000\u0000\u0000"+
		"\u0777\u0773\u0001\u0000\u0000\u0000\u0777\u0778\u0001\u0000\u0000\u0000"+
		"\u0778\u0163\u0001\u0000\u0000\u0000\u0779\u077b\u0003\u0110\u0088\u0000"+
		"\u077a\u0779\u0001\u0000\u0000\u0000\u077a\u077b\u0001\u0000\u0000\u0000"+
		"\u077b\u077c\u0001\u0000\u0000\u0000\u077c\u077d\u0003\u0162\u00b1\u0000"+
		"\u077d\u077e\u0005\u008b\u0000\u0000\u077e\u0165\u0001\u0000\u0000\u0000"+
		"\u077f\u078d\u0003\u01c6\u00e3\u0000\u0780\u078d\u0003\u01c4\u00e2\u0000"+
		"\u0781\u078d\u0003\u01ea\u00f5\u0000\u0782\u078d\u0003\u01d6\u00eb\u0000"+
		"\u0783\u078d\u0003|>\u0000\u0784\u078d\u0003\u01f6\u00fb\u0000\u0785\u078d"+
		"\u0003\u00c4b\u0000\u0786\u078d\u0003\u0010\b\u0000\u0787\u078d\u0003"+
		",\u0016\u0000\u0788\u078d\u00030\u0018\u0000\u0789\u078d\u0003\u01f2\u00f9"+
		"\u0000\u078a\u078d\u0003\u00e2q\u0000\u078b\u078d\u0003\u00e0p\u0000\u078c"+
		"\u077f\u0001\u0000\u0000\u0000\u078c\u0780\u0001\u0000\u0000\u0000\u078c"+
		"\u0781\u0001\u0000\u0000\u0000\u078c\u0782\u0001\u0000\u0000\u0000\u078c"+
		"\u0783\u0001\u0000\u0000\u0000\u078c\u0784\u0001\u0000\u0000\u0000\u078c"+
		"\u0785\u0001\u0000\u0000\u0000\u078c\u0786\u0001\u0000\u0000\u0000\u078c"+
		"\u0787\u0001\u0000\u0000\u0000\u078c\u0788\u0001\u0000\u0000\u0000\u078c"+
		"\u0789\u0001\u0000\u0000\u0000\u078c\u078a\u0001\u0000\u0000\u0000\u078c"+
		"\u078b\u0001\u0000\u0000\u0000\u078d\u0167\u0001\u0000\u0000\u0000\u078e"+
		"\u0790\u0003\u0166\u00b3\u0000\u078f\u078e\u0001\u0000\u0000\u0000\u0790"+
		"\u0793\u0001\u0000\u0000\u0000\u0791\u078f\u0001\u0000\u0000\u0000\u0791"+
		"\u0792\u0001\u0000\u0000\u0000\u0792\u0169\u0001\u0000\u0000\u0000\u0793"+
		"\u0791\u0001\u0000\u0000\u0000\u0794\u0796\u0003\u0110\u0088\u0000\u0795"+
		"\u0794\u0001\u0000\u0000\u0000\u0795\u0796\u0001\u0000\u0000\u0000\u0796"+
		"\u0798\u0001\u0000\u0000\u0000\u0797\u0799\u0005B\u0000\u0000\u0798\u0797"+
		"\u0001\u0000\u0000\u0000\u0798\u0799\u0001\u0000\u0000\u0000\u0799\u079a"+
		"\u0001\u0000\u0000\u0000\u079a\u079f\u0005C\u0000\u0000\u079b\u079c\u0005"+
		"\u008e\u0000\u0000\u079c\u079d\u0003\u0196\u00cb\u0000\u079d\u079e\u0005"+
		"\u008f\u0000\u0000\u079e\u07a0\u0001\u0000\u0000\u0000\u079f\u079b\u0001"+
		"\u0000\u0000\u0000\u079f\u07a0\u0001\u0000\u0000\u0000\u07a0\u07a2\u0001"+
		"\u0000\u0000\u0000\u07a1\u07a3\u0005)\u0000\u0000\u07a2\u07a1\u0001\u0000"+
		"\u0000\u0000\u07a2\u07a3\u0001\u0000\u0000\u0000\u07a3\u07a4\u0001\u0000"+
		"\u0000\u0000\u07a4\u07a5\u0003\u0168\u00b4\u0000\u07a5\u07a6\u0005\f\u0000"+
		"\u0000\u07a6\u07a7\u0003\u016c\u00b6\u0000\u07a7\u07a9\u0005\u0018\u0000"+
		"\u0000\u07a8\u07aa\u0005B\u0000\u0000\u07a9\u07a8\u0001\u0000\u0000\u0000"+
		"\u07a9\u07aa\u0001\u0000\u0000\u0000\u07aa\u07ab\u0001\u0000\u0000\u0000"+
		"\u07ab\u07ad\u0005C\u0000\u0000\u07ac\u07ae\u0003\u00e6s\u0000\u07ad\u07ac"+
		"\u0001\u0000\u0000\u0000\u07ad\u07ae\u0001\u0000\u0000\u0000\u07ae\u07af"+
		"\u0001\u0000\u0000\u0000\u07af\u07b0\u0005\u008b\u0000\u0000\u07b0\u016b"+
		"\u0001\u0000\u0000\u0000\u07b1\u07b3\u0003\u019a\u00cd\u0000\u07b2\u07b1"+
		"\u0001\u0000\u0000\u0000\u07b3\u07b6\u0001\u0000\u0000\u0000\u07b4\u07b2"+
		"\u0001\u0000\u0000\u0000\u07b4\u07b5\u0001\u0000\u0000\u0000\u07b5\u016d"+
		"\u0001\u0000\u0000\u0000\u07b6\u07b4\u0001\u0000\u0000\u0000\u07b7\u07b8"+
		"\u0003\u01d8\u00ec\u0000\u07b8\u07be\u0005\u00a3\u0000\u0000\u07b9\u07bf"+
		"\u0003\u000e\u0007\u0000\u07ba\u07bb\u0005\u008e\u0000\u0000\u07bb\u07bc"+
		"\u0003\u00c0`\u0000\u07bc\u07bd\u0005\u008f\u0000\u0000\u07bd\u07bf\u0001"+
		"\u0000\u0000\u0000\u07be\u07b9\u0001\u0000\u0000\u0000\u07be\u07ba\u0001"+
		"\u0000\u0000\u0000\u07bf\u016f\u0001\u0000\u0000\u0000\u07c0\u07c4\u0003"+
		"\u00d0h\u0000\u07c1\u07c4\u0003D\"\u0000\u07c2\u07c4\u0003\u01bc\u00de"+
		"\u0000\u07c3\u07c0\u0001\u0000\u0000\u0000\u07c3\u07c1\u0001\u0000\u0000"+
		"\u0000\u07c3\u07c2\u0001\u0000\u0000\u0000\u07c4\u0171\u0001\u0000\u0000"+
		"\u0000\u07c5\u07ca\u0003\u0124\u0092\u0000\u07c6\u07c7\u0005\u008c\u0000"+
		"\u0000\u07c7\u07c9\u0003\u0124\u0092\u0000\u07c8\u07c6\u0001\u0000\u0000"+
		"\u0000\u07c9\u07cc\u0001\u0000\u0000\u0000\u07ca\u07c8\u0001\u0000\u0000"+
		"\u0000\u07ca\u07cb\u0001\u0000\u0000\u0000\u07cb\u07d0\u0001\u0000\u0000"+
		"\u0000\u07cc\u07ca\u0001\u0000\u0000\u0000\u07cd\u07d0\u0005>\u0000\u0000"+
		"\u07ce\u07d0\u0005\u0006\u0000\u0000\u07cf\u07c5\u0001\u0000\u0000\u0000"+
		"\u07cf\u07cd\u0001\u0000\u0000\u0000\u07cf\u07ce\u0001\u0000\u0000\u0000"+
		"\u07d0\u0173\u0001\u0000\u0000\u0000\u07d1\u07d2\u0003\u0172\u00b9\u0000"+
		"\u07d2\u07d3\u0005\u0092\u0000\u0000\u07d3\u07d4\u0003\u0124\u0092\u0000"+
		"\u07d4\u0175\u0001\u0000\u0000\u0000\u07d5\u07d8\u0003\u0178\u00bc\u0000"+
		"\u07d6\u07d8\u0003\u0124\u0092\u0000\u07d7\u07d5\u0001\u0000\u0000\u0000"+
		"\u07d7\u07d6\u0001\u0000\u0000\u0000\u07d8\u0177\u0001\u0000\u0000\u0000"+
		"\u07d9\u07dd\u0003\u01aa\u00d5\u0000\u07da\u07db\u0003\u0090H\u0000\u07db"+
		"\u07dc\u0003\u01aa\u00d5\u0000\u07dc\u07de\u0001\u0000\u0000\u0000\u07dd"+
		"\u07da\u0001\u0000\u0000\u0000\u07dd\u07de\u0001\u0000\u0000\u0000\u07de"+
		"\u0179\u0001\u0000\u0000\u0000\u07df\u07e0\u0005H\u0000\u0000\u07e0\u07e1"+
		"\u0003\u0176\u00bb\u0000\u07e1\u017b\u0001\u0000\u0000\u0000\u07e2\u07e4"+
		"\u0005L\u0000\u0000\u07e3\u07e5\u0003\u0136\u009b\u0000\u07e4\u07e3\u0001"+
		"\u0000\u0000\u0000\u07e5\u07e6\u0001\u0000\u0000\u0000\u07e6\u07e4\u0001"+
		"\u0000\u0000\u0000\u07e6\u07e7\u0001\u0000\u0000\u0000\u07e7\u07e8\u0001"+
		"\u0000\u0000\u0000\u07e8\u07e9\u0005\u0018\u0000\u0000\u07e9\u07eb\u0005"+
		"L\u0000\u0000\u07ea\u07ec\u0003\u00e6s\u0000\u07eb\u07ea\u0001\u0000\u0000"+
		"\u0000\u07eb\u07ec\u0001\u0000\u0000\u0000\u07ec\u017d\u0001\u0000\u0000"+
		"\u0000\u07ed\u07ef\u0005L\u0000\u0000\u07ee\u07f0\u0003\u0098L\u0000\u07ef"+
		"\u07ee\u0001\u0000\u0000\u0000\u07f0\u07f1\u0001\u0000\u0000\u0000\u07f1"+
		"\u07ef\u0001\u0000\u0000\u0000\u07f1\u07f2\u0001\u0000\u0000\u0000\u07f2"+
		"\u07f3\u0001\u0000\u0000\u0000\u07f3\u07f4\u0005\u0018\u0000\u0000\u07f4"+
		"\u07f6\u0005L\u0000\u0000\u07f5\u07f7\u0003\u00e6s\u0000\u07f6\u07f5\u0001"+
		"\u0000\u0000\u0000\u07f6\u07f7\u0001\u0000\u0000\u0000\u07f7\u017f\u0001"+
		"\u0000\u0000\u0000\u07f8\u07fc\u0003\u019c\u00ce\u0000\u07f9\u07fa\u0003"+
		"\u0182\u00c1\u0000\u07fa\u07fb\u0003\u019c\u00ce\u0000\u07fb\u07fd\u0001"+
		"\u0000\u0000\u0000\u07fc\u07f9\u0001\u0000\u0000\u0000\u07fc\u07fd\u0001"+
		"\u0000\u0000\u0000\u07fd\u0181\u0001\u0000\u0000\u0000\u07fe\u07ff\u0007"+
		"\t\u0000\u0000\u07ff\u0183\u0001\u0000\u0000\u0000\u0800\u0802\u0003\u0110"+
		"\u0088\u0000\u0801\u0800\u0001\u0000\u0000\u0000\u0801\u0802\u0001\u0000"+
		"\u0000\u0000\u0802\u0803\u0001\u0000\u0000\u0000\u0803\u0804\u0005O\u0000"+
		"\u0000\u0804\u0807\u0003\u00c0`\u0000\u0805\u0806\u0005T\u0000\u0000\u0806"+
		"\u0808\u0003\u00c0`\u0000\u0807\u0805\u0001\u0000\u0000\u0000\u0807\u0808"+
		"\u0001\u0000\u0000\u0000\u0808\u0809\u0001\u0000\u0000\u0000\u0809\u080a"+
		"\u0005\u008b\u0000\u0000\u080a\u0185\u0001\u0000\u0000\u0000\u080b\u080d"+
		"\u0003\u0110\u0088\u0000\u080c\u080b\u0001\u0000\u0000\u0000\u080c\u080d"+
		"\u0001\u0000\u0000\u0000\u080d\u080e\u0001\u0000\u0000\u0000\u080e\u0810"+
		"\u0005P\u0000\u0000\u080f\u0811\u0003\u00c0`\u0000\u0810\u080f\u0001\u0000"+
		"\u0000\u0000\u0810\u0811\u0001\u0000\u0000\u0000\u0811\u0812\u0001\u0000"+
		"\u0000\u0000\u0812\u0813\u0005\u008b\u0000\u0000\u0813\u0187\u0001\u0000"+
		"\u0000\u0000\u0814\u0815\u0003\u0124\u0092\u0000\u0815\u0816\u0005\u0003"+
		"\u0000\u0000\u0816\u0817\u0003\u0124\u0092\u0000\u0817\u0818\u0005`\u0000"+
		"\u0000\u0818\u0819\u0003\u0124\u0092\u0000\u0819\u081a\u0005M\u0000\u0000"+
		"\u081a\u0189\u0001\u0000\u0000\u0000\u081b\u081f\u0003\u0150\u00a8\u0000"+
		"\u081c\u081f\u0003\u00bc^\u0000\u081d\u081f\u0003\u017a\u00bd\u0000\u081e"+
		"\u081b\u0001\u0000\u0000\u0000\u081e\u081c\u0001\u0000\u0000\u0000\u081e"+
		"\u081d\u0001\u0000\u0000\u0000\u081f\u018b\u0001\u0000\u0000\u0000\u0820"+
		"\u0823\u0003\u0018\f\u0000\u0821\u0823\u0003\u0140\u00a0\u0000\u0822\u0820"+
		"\u0001\u0000\u0000\u0000\u0822\u0821\u0001\u0000\u0000\u0000\u0823\u018d"+
		"\u0001\u0000\u0000\u0000\u0824\u0825\u0003\u00e6s\u0000\u0825\u0826\u0005"+
		"\u0099\u0000\u0000\u0826\u0827\u0003\u014e\u00a7\u0000\u0827\u0828\u0005"+
		"\u008b\u0000\u0000\u0828\u018f\u0001\u0000\u0000\u0000\u0829\u082a\u0005"+
		"k\u0000\u0000\u082a\u082b\u0003\u00c0`\u0000\u082b\u082c\u0005S\u0000"+
		"\u0000\u082c\u082d\u0003\u01dc\u00ee\u0000\u082d\u082e\u0005\u0084\u0000"+
		"\u0000\u082e\u082f\u0003\u013e\u009f\u0000\u082f\u0830\u0003\u0192\u00c9"+
		"\u0000\u0830\u0831\u0005\u008b\u0000\u0000\u0831\u0191\u0001\u0000\u0000"+
		"\u0000\u0832\u0833\u0003\u01fa\u00fd\u0000\u0833\u0834\u0005l\u0000\u0000"+
		"\u0834\u083c\u0003T*\u0000\u0835\u0836\u0005\u008c\u0000\u0000\u0836\u0837"+
		"\u0003\u01fa\u00fd\u0000\u0837\u0838\u0005l\u0000\u0000\u0838\u0839\u0003"+
		"T*\u0000\u0839\u083b\u0001\u0000\u0000\u0000\u083a\u0835\u0001\u0000\u0000"+
		"\u0000\u083b\u083e\u0001\u0000\u0000\u0000\u083c\u083a\u0001\u0000\u0000"+
		"\u0000\u083c\u083d\u0001\u0000\u0000\u0000\u083d\u0193\u0001\u0000\u0000"+
		"\u0000\u083e\u083c\u0001\u0000\u0000\u0000\u083f\u0840\u0005;\u0000\u0000"+
		"\u0840\u0841\u0003\u0196\u00cb\u0000\u0841\u0195\u0001\u0000\u0000\u0000"+
		"\u0842\u0847\u0003\u0124\u0092\u0000\u0843\u0844\u0005\u008c\u0000\u0000"+
		"\u0844\u0846\u0003\u0124\u0092\u0000\u0845\u0843\u0001\u0000\u0000\u0000"+
		"\u0846\u0849\u0001\u0000\u0000\u0000\u0847\u0845\u0001\u0000\u0000\u0000"+
		"\u0847\u0848\u0001\u0000\u0000\u0000\u0848\u0197\u0001\u0000\u0000\u0000"+
		"\u0849\u0847\u0001\u0000\u0000\u0000\u084a\u084c\u0003\u019a\u00cd\u0000"+
		"\u084b\u084a\u0001\u0000\u0000\u0000\u084c\u084f\u0001\u0000\u0000\u0000"+
		"\u084d\u084b\u0001\u0000\u0000\u0000\u084d\u084e\u0001\u0000\u0000\u0000"+
		"\u084e\u0199\u0001\u0000\u0000\u0000\u084f\u084d\u0001\u0000\u0000\u0000"+
		"\u0850\u0863\u0003\u01f8\u00fc\u0000\u0851\u0863\u0003&\u0013\u0000\u0852"+
		"\u0863\u0003\u0184\u00c2\u0000\u0853\u0863\u0003\u01a0\u00d0\u0000\u0854"+
		"\u0863\u0003\u01f4\u00fa\u0000\u0855\u0863\u0003\u00eau\u0000\u0856\u0863"+
		"\u0003N\'\u0000\u0857\u0863\u0003\u011e\u008f\u0000\u0858\u0863\u0003"+
		"\u0138\u009c\u0000\u0859\u0863\u0003\u00be_\u0000\u085a\u0863\u0003\u0186"+
		"\u00c3\u0000\u085b\u085d\u0003\u0110\u0088\u0000\u085c\u085b\u0001\u0000"+
		"\u0000\u0000\u085c\u085d\u0001\u0000\u0000\u0000\u085d\u085e\u0001\u0000"+
		"\u0000\u0000\u085e\u085f\u00059\u0000\u0000\u085f\u0863\u0005\u008b\u0000"+
		"\u0000\u0860\u0863\u0003L&\u0000\u0861\u0863\u0003\u0164\u00b2\u0000\u0862"+
		"\u0850\u0001\u0000\u0000\u0000\u0862\u0851\u0001\u0000\u0000\u0000\u0862"+
		"\u0852\u0001\u0000\u0000\u0000\u0862\u0853\u0001\u0000\u0000\u0000\u0862"+
		"\u0854\u0001\u0000\u0000\u0000\u0862\u0855\u0001\u0000\u0000\u0000\u0862"+
		"\u0856\u0001\u0000\u0000\u0000\u0862\u0857\u0001\u0000\u0000\u0000\u0862"+
		"\u0858\u0001\u0000\u0000\u0000\u0862\u0859\u0001\u0000\u0000\u0000\u0862"+
		"\u085a\u0001\u0000\u0000\u0000\u0862\u085c\u0001\u0000\u0000\u0000\u0862"+
		"\u0860\u0001\u0000\u0000\u0000\u0862\u0861\u0001\u0000\u0000\u0000\u0863"+
		"\u019b\u0001\u0000\u0000\u0000\u0864\u0868\u0003\u01aa\u00d5\u0000\u0865"+
		"\u0866\u0003\u019e\u00cf\u0000\u0866\u0867\u0003\u01aa\u00d5\u0000\u0867"+
		"\u0869\u0001\u0000\u0000\u0000\u0868\u0865\u0001\u0000\u0000\u0000\u0868"+
		"\u0869\u0001\u0000\u0000\u0000\u0869\u019d\u0001\u0000\u0000\u0000\u086a"+
		"\u086b\u0007\n\u0000\u0000\u086b\u019f\u0001\u0000\u0000\u0000\u086c\u086e"+
		"\u0003\u0110\u0088\u0000\u086d\u086c\u0001\u0000\u0000\u0000\u086d\u086e"+
		"\u0001\u0000\u0000\u0000\u086e\u086f\u0001\u0000\u0000\u0000\u086f\u0870"+
		"\u0003\u01dc\u00ee\u0000\u0870\u0872\u0005\u0084\u0000\u0000\u0871\u0873"+
		"\u0003\u0088D\u0000\u0872\u0871\u0001\u0000\u0000\u0000\u0872\u0873\u0001"+
		"\u0000\u0000\u0000\u0873\u0874\u0001\u0000\u0000\u0000\u0874\u0875\u0003"+
		"\u01fa\u00fd\u0000\u0875\u0876\u0005\u008b\u0000\u0000\u0876\u01a1\u0001"+
		"\u0000\u0000\u0000\u0877\u0878\u0005V\u0000\u0000\u0878\u0879\u0003\u00e8"+
		"t\u0000\u0879\u087a\u0005\u0092\u0000\u0000\u087a\u087c\u0003\u01d8\u00ec"+
		"\u0000\u087b\u087d\u0003\u01a4\u00d2\u0000\u087c\u087b\u0001\u0000\u0000"+
		"\u0000\u087c\u087d\u0001\u0000\u0000\u0000\u087d\u0880\u0001\u0000\u0000"+
		"\u0000\u087e\u087f\u0005\u0088\u0000\u0000\u087f\u0881\u0003\u00c0`\u0000"+
		"\u0880\u087e\u0001\u0000\u0000\u0000\u0880\u0881\u0001\u0000\u0000\u0000"+
		"\u0881\u0882\u0001\u0000\u0000\u0000\u0882\u0883\u0005\u008b\u0000\u0000"+
		"\u0883\u01a3\u0001\u0000\u0000\u0000\u0884\u0885\u0007\u000b\u0000\u0000"+
		"\u0885\u01a5\u0001\u0000\u0000\u0000\u0886\u088b\u0003\u0124\u0092\u0000"+
		"\u0887\u0888\u0005\u008c\u0000\u0000\u0888\u088a\u0003\u0124\u0092\u0000"+
		"\u0889\u0887\u0001\u0000\u0000\u0000\u088a\u088d\u0001\u0000\u0000\u0000"+
		"\u088b\u0889\u0001\u0000\u0000\u0000\u088b\u088c\u0001\u0000\u0000\u0000"+
		"\u088c\u0891\u0001\u0000\u0000\u0000\u088d\u088b\u0001\u0000\u0000\u0000"+
		"\u088e\u0891\u0005>\u0000\u0000\u088f\u0891\u0005\u0006\u0000\u0000\u0890"+
		"\u0886\u0001\u0000\u0000\u0000\u0890\u088e\u0001\u0000\u0000\u0000\u0890"+
		"\u088f\u0001\u0000\u0000\u0000\u0891\u01a7\u0001\u0000\u0000\u0000\u0892"+
		"\u089b\u0005\u0090\u0000\u0000\u0893\u0898\u0003\u0124\u0092\u0000\u0894"+
		"\u0895\u0005\u008c\u0000\u0000\u0895\u0897\u0003\u0124\u0092\u0000\u0896"+
		"\u0894\u0001\u0000\u0000\u0000\u0897\u089a\u0001\u0000\u0000\u0000\u0898"+
		"\u0896\u0001\u0000\u0000\u0000\u0898\u0899\u0001\u0000\u0000\u0000\u0899"+
		"\u089c\u0001\u0000\u0000\u0000\u089a\u0898\u0001\u0000\u0000\u0000\u089b"+
		"\u0893\u0001\u0000\u0000\u0000\u089b\u089c\u0001\u0000\u0000\u0000\u089c"+
		"\u089f\u0001\u0000\u0000\u0000\u089d\u089e\u0005P\u0000\u0000\u089e\u08a0"+
		"\u0003\u0124\u0092\u0000\u089f\u089d\u0001\u0000\u0000\u0000\u089f\u08a0"+
		"\u0001\u0000\u0000\u0000\u08a0\u08a1\u0001\u0000\u0000\u0000\u08a1\u08a2"+
		"\u0005\u0091\u0000\u0000\u08a2\u01a9\u0001\u0000\u0000\u0000\u08a3\u08a5"+
		"\u0007\f\u0000\u0000\u08a4\u08a3\u0001\u0000\u0000\u0000\u08a4\u08a5\u0001"+
		"\u0000\u0000\u0000\u08a5\u08a6\u0001\u0000\u0000\u0000\u08a6\u08ac\u0003"+
		"\u01de\u00ef\u0000\u08a7\u08a8\u0003\f\u0006\u0000\u08a8\u08a9\u0003\u01de"+
		"\u00ef\u0000\u08a9\u08ab\u0001\u0000\u0000\u0000\u08aa\u08a7\u0001\u0000"+
		"\u0000\u0000\u08ab\u08ae\u0001\u0000\u0000\u0000\u08ac\u08aa\u0001\u0000"+
		"\u0000\u0000\u08ac\u08ad\u0001\u0000\u0000\u0000\u08ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u08ae\u08ac\u0001\u0000\u0000\u0000\u08af\u08b1\u0003\u0110"+
		"\u0088\u0000\u08b0\u08af\u0001\u0000\u0000\u0000\u08b0\u08b1\u0001\u0000"+
		"\u0000\u0000\u08b1\u08b2\u0001\u0000\u0000\u0000\u08b2\u08b3\u0003\u01aa"+
		"\u00d5\u0000\u08b3\u08b4\u0005\u0083\u0000\u0000\u08b4\u08b6\u0003\u01aa"+
		"\u00d5\u0000\u08b5\u08b7\u0003\u01e8\u00f4\u0000\u08b6\u08b5\u0001\u0000"+
		"\u0000\u0000\u08b6\u08b7\u0001\u0000\u0000\u0000\u08b7\u08b8\u0001\u0000"+
		"\u0000\u0000\u08b8\u08b9\u0005\u008b\u0000\u0000\u08b9\u01ad\u0001\u0000"+
		"\u0000\u0000\u08ba\u08bb\u0005l\u0000\u0000\u08bb\u08bc\u0003T*\u0000"+
		"\u08bc\u08bd\u0005\u0086\u0000\u0000\u08bd\u08be\u0003\u01b8\u00dc\u0000"+
		"\u08be\u01af\u0001\u0000\u0000\u0000\u08bf\u08c1\u0003\u0110\u0088\u0000"+
		"\u08c0\u08bf\u0001\u0000\u0000\u0000\u08c0\u08c1\u0001\u0000\u0000\u0000"+
		"\u08c1\u08c2\u0001\u0000\u0000\u0000\u08c2\u08c3\u0005\u0012\u0000\u0000"+
		"\u08c3\u08c4\u0003\u00c0`\u0000\u08c4\u08c6\u0005h\u0000\u0000\u08c5\u08c7"+
		"\u0003\u01ae\u00d7\u0000\u08c6\u08c5\u0001\u0000\u0000\u0000\u08c7\u08c8"+
		"\u0001\u0000\u0000\u0000\u08c8\u08c6\u0001\u0000\u0000\u0000\u08c8\u08c9"+
		"\u0001\u0000\u0000\u0000\u08c9\u08ca\u0001\u0000\u0000\u0000\u08ca\u08cb"+
		"\u0005\u0018\u0000\u0000\u08cb\u08cd\u0005\u0012\u0000\u0000\u08cc\u08ce"+
		"\u0003\u00e6s\u0000\u08cd\u08cc\u0001\u0000\u0000\u0000\u08cd\u08ce\u0001"+
		"\u0000\u0000\u0000\u08ce\u08cf\u0001\u0000\u0000\u0000\u08cf\u08d0\u0005"+
		"\u008b\u0000\u0000\u08d0\u01b1\u0001\u0000\u0000\u0000\u08d1\u08d3\u0003"+
		"\u0110\u0088\u0000\u08d2\u08d1\u0001\u0000\u0000\u0000\u08d2\u08d3\u0001"+
		"\u0000\u0000\u0000\u08d3\u08d4\u0001\u0000\u0000\u0000\u08d4\u08d5\u0005"+
		"$\u0000\u0000\u08d5\u08d6\u0003j5\u0000\u08d6\u08d7\u0005h\u0000\u0000"+
		"\u08d7\u08df\u0003\u01b8\u00dc\u0000\u08d8\u08d9\u0005\u001b\u0000\u0000"+
		"\u08d9\u08da\u0003j5\u0000\u08da\u08db\u0005h\u0000\u0000\u08db\u08dc"+
		"\u0003\u01b8\u00dc\u0000\u08dc\u08de\u0001\u0000\u0000\u0000\u08dd\u08d8"+
		"\u0001\u0000\u0000\u0000\u08de\u08e1\u0001\u0000\u0000\u0000\u08df\u08dd"+
		"\u0001\u0000\u0000\u0000\u08df\u08e0\u0001\u0000\u0000\u0000\u08e0\u08e4"+
		"\u0001\u0000\u0000\u0000\u08e1\u08df\u0001\u0000\u0000\u0000\u08e2\u08e3"+
		"\u0005\u001a\u0000\u0000\u08e3\u08e5\u0003\u01b8\u00dc\u0000\u08e4\u08e2"+
		"\u0001\u0000\u0000\u0000\u08e4\u08e5\u0001\u0000\u0000\u0000\u08e5\u08e6"+
		"\u0001\u0000\u0000\u0000\u08e6\u08e7\u0005\u0018\u0000\u0000\u08e7\u08e9"+
		"\u0005h\u0000\u0000\u08e8\u08ea\u0003\u00e6s\u0000\u08e9\u08e8\u0001\u0000"+
		"\u0000\u0000\u08e9\u08ea\u0001\u0000\u0000\u0000\u08ea\u08eb\u0001\u0000"+
		"\u0000\u0000\u08eb\u08ec\u0005\u008b\u0000\u0000\u08ec\u01b3\u0001\u0000"+
		"\u0000\u0000\u08ed\u08ef\u0003\u0110\u0088\u0000\u08ee\u08ed\u0001\u0000"+
		"\u0000\u0000\u08ee\u08ef\u0001\u0000\u0000\u0000\u08ef\u08f0\u0001\u0000"+
		"\u0000\u0000\u08f0\u08f2\u0005E\u0000\u0000\u08f1\u08f3\u0005)\u0000\u0000"+
		"\u08f2\u08f1\u0001\u0000\u0000\u0000\u08f2\u08f3\u0001\u0000\u0000\u0000"+
		"\u08f3\u08f4\u0001\u0000\u0000\u0000\u08f4\u08f5\u0003\u015e\u00af\u0000"+
		"\u08f5\u08f6\u0005\f\u0000\u0000\u08f6\u08f7\u0003\u0160\u00b0\u0000\u08f7"+
		"\u08f8\u0005\u0018\u0000\u0000\u08f8\u08fa\u0005E\u0000\u0000\u08f9\u08fb"+
		"\u0003\u00e6s\u0000\u08fa\u08f9\u0001\u0000\u0000\u0000\u08fa\u08fb\u0001"+
		"\u0000\u0000\u0000\u08fb\u08fc\u0001\u0000\u0000\u0000\u08fc\u08fd\u0005"+
		"\u008b\u0000\u0000\u08fd\u01b5\u0001\u0000\u0000\u0000\u08fe\u0908\u0003"+
		"\u01ac\u00d6\u0000\u08ff\u0908\u0003\u01b2\u00d9\u0000\u0900\u0908\u0003"+
		"\u01b0\u00d8\u0000\u0901\u0908\u0003\u01b4\u00da\u0000\u0902\u0904\u0003"+
		"\u0110\u0088\u0000\u0903\u0902\u0001\u0000\u0000\u0000\u0903\u0904\u0001"+
		"\u0000\u0000\u0000\u0904\u0905\u0001\u0000\u0000\u0000\u0905\u0906\u0005"+
		"9\u0000\u0000\u0906\u0908\u0005\u008b\u0000\u0000\u0907\u08fe\u0001\u0000"+
		"\u0000\u0000\u0907\u08ff\u0001\u0000\u0000\u0000\u0907\u0900\u0001\u0000"+
		"\u0000\u0000\u0907\u0901\u0001\u0000\u0000\u0000\u0907\u0903\u0001\u0000"+
		"\u0000\u0000\u0908\u01b7\u0001\u0000\u0000\u0000\u0909\u090b\u0003\u01b6"+
		"\u00db\u0000\u090a\u0909\u0001\u0000\u0000\u0000\u090b\u090e\u0001\u0000"+
		"\u0000\u0000\u090c\u090a\u0001\u0000\u0000\u0000\u090c\u090d\u0001\u0000"+
		"\u0000\u0000\u090d\u01b9\u0001\u0000\u0000\u0000\u090e\u090c\u0001\u0000"+
		"\u0000\u0000\u090f\u0910\u0005Y\u0000\u0000\u0910\u0911\u0003\u01aa\u00d5"+
		"\u0000\u0911\u0912\u0005\u008c\u0000\u0000\u0912\u0913\u0003\u01aa\u00d5"+
		"\u0000\u0913\u0917\u0001\u0000\u0000\u0000\u0914\u0915\u00056\u0000\u0000"+
		"\u0915\u0917\u0003\u01aa\u00d5\u0000\u0916\u090f\u0001\u0000\u0000\u0000"+
		"\u0916\u0914\u0001\u0000\u0000\u0000\u0917\u01bb\u0001\u0000\u0000\u0000"+
		"\u0918\u0919\u0005G\u0000\u0000\u0919\u091a\u0003\u00e8t\u0000\u091a\u091b"+
		"\u0005\u0092\u0000\u0000\u091b\u091c\u0003\u01d8\u00ec\u0000\u091c\u091d"+
		"\u0003\u01ba\u00dd\u0000\u091d\u091e\u0005\u008b\u0000\u0000\u091e\u01bd"+
		"\u0001\u0000\u0000\u0000\u091f\u0920\u0005,\u0000\u0000\u0920\u0921\u0003"+
		"\u0174\u00ba\u0000\u0921\u0922\u0005k\u0000\u0000\u0922\u0923\u0003\u00c0"+
		"`\u0000\u0923\u0924\u0005\u008b\u0000\u0000\u0924\u01bf\u0001\u0000\u0000"+
		"\u0000\u0925\u0926\u0005\\\u0000\u0000\u0926\u0927\u0003\u00e6s\u0000"+
		"\u0927\u0928\u0005)\u0000\u0000\u0928\u0929\u0003\u01c2\u00e1\u0000\u0929"+
		"\u092a\u0005\u008b\u0000\u0000\u092a\u01c1\u0001\u0000\u0000\u0000\u092b"+
		"\u092d\u0003\u0124\u0092\u0000\u092c\u092e\u0003\u00ecv\u0000\u092d\u092c"+
		"\u0001\u0000\u0000\u0000\u092d\u092e\u0001\u0000\u0000\u0000\u092e\u0935"+
		"\u0001\u0000\u0000\u0000\u092f\u0930\u0005b\u0000\u0000\u0930\u0931\u0003"+
		"\u00c0`\u0000\u0931\u0932\u0005\u0003\u0000\u0000\u0932\u0933\u0003\u00c0"+
		"`\u0000\u0933\u0934\u0005`\u0000\u0000\u0934\u0936\u0001\u0000\u0000\u0000"+
		"\u0935\u092f\u0001\u0000\u0000\u0000\u0935\u0936\u0001\u0000\u0000\u0000"+
		"\u0936\u01c3\u0001\u0000\u0000\u0000\u0937\u0938\u0003\u01ce\u00e7\u0000"+
		"\u0938\u0939\u0005)\u0000\u0000\u0939\u093a\u0003\u01ca\u00e5\u0000\u093a"+
		"\u093b\u0005\f\u0000\u0000\u093b\u093c\u0003\u01d4\u00ea\u0000\u093c\u093e"+
		"\u0005\u0018\u0000\u0000\u093d\u093f\u0003\u01cc\u00e6\u0000\u093e\u093d"+
		"\u0001\u0000\u0000\u0000\u093e\u093f\u0001\u0000\u0000\u0000\u093f\u0941"+
		"\u0001\u0000\u0000\u0000\u0940\u0942\u0003\u008eG\u0000\u0941\u0940\u0001"+
		"\u0000\u0000\u0000\u0941\u0942\u0001\u0000\u0000\u0000\u0942\u0943\u0001"+
		"\u0000\u0000\u0000\u0943\u0944\u0005\u008b\u0000\u0000\u0944\u01c5\u0001"+
		"\u0000\u0000\u0000\u0945\u0946\u0003\u01ce\u00e7\u0000\u0946\u0947\u0005"+
		"\u008b\u0000\u0000\u0947\u01c7\u0001\u0000\u0000\u0000\u0948\u0956\u0003"+
		"\u01c6\u00e3\u0000\u0949\u0956\u0003\u01c4\u00e2\u0000\u094a\u0956\u0003"+
		"\u01ea\u00f5\u0000\u094b\u0956\u0003\u01d6\u00eb\u0000\u094c\u0956\u0003"+
		"|>\u0000\u094d\u0956\u0003\u01f6\u00fb\u0000\u094e\u0956\u0003\u00c4b"+
		"\u0000\u094f\u0956\u0003\u0010\b\u0000\u0950\u0956\u0003,\u0016\u0000"+
		"\u0951\u0956\u00030\u0018\u0000\u0952\u0956\u0003\u01f2\u00f9\u0000\u0953"+
		"\u0956\u0003\u00e2q\u0000\u0954\u0956\u0003\u00e0p\u0000\u0955\u0948\u0001"+
		"\u0000\u0000\u0000\u0955\u0949\u0001\u0000\u0000\u0000\u0955\u094a\u0001"+
		"\u0000\u0000\u0000\u0955\u094b\u0001\u0000\u0000\u0000\u0955\u094c\u0001"+
		"\u0000\u0000\u0000\u0955\u094d\u0001\u0000\u0000\u0000\u0955\u094e\u0001"+
		"\u0000\u0000\u0000\u0955\u094f\u0001\u0000\u0000\u0000\u0955\u0950\u0001"+
		"\u0000\u0000\u0000\u0955\u0951\u0001\u0000\u0000\u0000\u0955\u0952\u0001"+
		"\u0000\u0000\u0000\u0955\u0953\u0001\u0000\u0000\u0000\u0955\u0954\u0001"+
		"\u0000\u0000\u0000\u0956\u01c9\u0001\u0000\u0000\u0000\u0957\u0959\u0003"+
		"\u01c8\u00e4\u0000\u0958\u0957\u0001\u0000\u0000\u0000\u0959\u095c\u0001"+
		"\u0000\u0000\u0000\u095a\u0958\u0001\u0000\u0000\u0000\u095a\u095b\u0001"+
		"\u0000\u0000\u0000\u095b\u01cb\u0001\u0000\u0000\u0000\u095c\u095a\u0001"+
		"\u0000\u0000\u0000\u095d\u095e\u0007\r\u0000\u0000\u095e\u01cd\u0001\u0000"+
		"\u0000\u0000\u095f\u0962\u0003\u01d0\u00e8\u0000\u0960\u0962\u0003\u01d2"+
		"\u00e9\u0000\u0961\u095f\u0001\u0000\u0000\u0000\u0961\u0960\u0001\u0000"+
		"\u0000\u0000\u0962\u01cf\u0001\u0000\u0000\u0000\u0963\u0964\u0005D\u0000"+
		"\u0000\u0964\u0969\u0003\u008eG\u0000\u0965\u0966\u0005\u008e\u0000\u0000"+
		"\u0966\u0967\u0003\u00ccf\u0000\u0967\u0968\u0005\u008f\u0000\u0000\u0968"+
		"\u096a\u0001\u0000\u0000\u0000\u0969\u0965\u0001\u0000\u0000\u0000\u0969"+
		"\u096a\u0001\u0000\u0000\u0000\u096a\u01d1\u0001\u0000\u0000\u0000\u096b"+
		"\u096d\u0007\u000e\u0000\u0000\u096c\u096b\u0001\u0000\u0000\u0000\u096c"+
		"\u096d\u0001\u0000\u0000\u0000\u096d\u096e\u0001\u0000\u0000\u0000\u096e"+
		"\u096f\u0005\u001f\u0000\u0000\u096f\u0974\u0003\u008eG\u0000\u0970\u0971"+
		"\u0005\u008e\u0000\u0000\u0971\u0972\u0003\u00ccf\u0000\u0972\u0973\u0005"+
		"\u008f\u0000\u0000\u0973\u0975\u0001\u0000\u0000\u0000\u0974\u0970\u0001"+
		"\u0000\u0000\u0000\u0974\u0975\u0001\u0000\u0000\u0000\u0975\u0976\u0001"+
		"\u0000\u0000\u0000\u0976\u0977\u0005P\u0000\u0000\u0977\u0978\u0003\u01d8"+
		"\u00ec\u0000\u0978\u01d3\u0001\u0000\u0000\u0000\u0979\u097b\u0003\u019a"+
		"\u00cd\u0000\u097a\u0979\u0001\u0000\u0000\u0000\u097b\u097e\u0001\u0000"+
		"\u0000\u0000\u097c\u097a\u0001\u0000\u0000\u0000\u097c\u097d\u0001\u0000"+
		"\u0000\u0000\u097d\u01d5\u0001\u0000\u0000\u0000\u097e\u097c\u0001\u0000"+
		"\u0000\u0000\u097f\u0980\u0005]\u0000\u0000\u0980\u0981\u0003\u00e6s\u0000"+
		"\u0981\u0982\u0005)\u0000\u0000\u0982\u0983\u0003\u01d8\u00ec\u0000\u0983"+
		"\u0984\u0005\u008b\u0000\u0000\u0984\u01d7\u0001\u0000\u0000\u0000\u0985"+
		"\u0987\u0003\u0128\u0094\u0000\u0986\u0988\u0003\u0128\u0094\u0000\u0987"+
		"\u0986\u0001\u0000\u0000\u0000\u0987\u0988\u0001\u0000\u0000\u0000\u0988"+
		"\u098a\u0001\u0000\u0000\u0000\u0989\u098b\u0003\u0082A\u0000\u098a\u0989"+
		"\u0001\u0000\u0000\u0000\u098a\u098b\u0001\u0000\u0000\u0000\u098b\u098d"+
		"\u0001\u0000\u0000\u0000\u098c\u098e\u0003\u01e8\u00f4\u0000\u098d\u098c"+
		"\u0001\u0000\u0000\u0000\u098d\u098e\u0001\u0000\u0000\u0000\u098e\u01d9"+
		"\u0001\u0000\u0000\u0000\u098f\u0994\u0003\u00e6s\u0000\u0990\u0994\u0005"+
		"\u007f\u0000\u0000\u0991\u0994\u0005\u0080\u0000\u0000\u0992\u0994\u0005"+
		"\u0006\u0000\u0000\u0993\u098f\u0001\u0000\u0000\u0000\u0993\u0990\u0001"+
		"\u0000\u0000\u0000\u0993\u0991\u0001\u0000\u0000\u0000\u0993\u0992\u0001"+
		"\u0000\u0000\u0000\u0994\u01db\u0001\u0000\u0000\u0000\u0995\u0998\u0003"+
		"\u0124\u0092\u0000\u0996\u0998\u0003\u000e\u0007\u0000\u0997\u0995\u0001"+
		"\u0000\u0000\u0000\u0997\u0996\u0001\u0000\u0000\u0000\u0998\u01dd\u0001"+
		"\u0000\u0000\u0000\u0999\u099f\u0003\u00c2a\u0000\u099a\u099b\u0003\u0122"+
		"\u0091\u0000\u099b\u099c\u0003\u00c2a\u0000\u099c\u099e\u0001\u0000\u0000"+
		"\u0000\u099d\u099a\u0001\u0000\u0000\u0000\u099e\u09a1\u0001\u0000\u0000"+
		"\u0000\u099f\u099d\u0001\u0000\u0000\u0000\u099f\u09a0\u0001\u0000\u0000"+
		"\u0000\u09a0\u01df\u0001\u0000\u0000\u0000\u09a1\u099f\u0001\u0000\u0000"+
		"\u0000\u09a2\u09a5\u0003\u0124\u0092\u0000\u09a3\u09a4\u0005a\u0000\u0000"+
		"\u09a4\u09a6\u0003\u0124\u0092\u0000\u09a5\u09a3\u0001";
	private static final String _serializedATNSegment1 =
		"\u0000\u0000\u0000\u09a5\u09a6\u0001\u0000\u0000\u0000\u09a6\u01e1\u0001"+
		"\u0000\u0000\u0000\u09a7\u09a8\u0005^\u0000\u0000\u09a8\u09a9\u0003\u00e8"+
		"t\u0000\u09a9\u09aa\u0005\u0092\u0000\u0000\u09aa\u09ab\u0003\u01c2\u00e1"+
		"\u0000\u09ab\u09ac\u0005\u008b\u0000\u0000\u09ac\u01e3\u0001\u0000\u0000"+
		"\u0000\u09ad\u09af\u0003\u00e8t\u0000\u09ae\u09b0\u0003\u01e8\u00f4\u0000"+
		"\u09af\u09ae\u0001\u0000\u0000\u0000\u09af\u09b0\u0001\u0000\u0000\u0000"+
		"\u09b0\u09b3\u0001\u0000\u0000\u0000\u09b1\u09b2\u0005\u0088\u0000\u0000"+
		"\u09b2\u09b4\u0003\u00c0`\u0000\u09b3\u09b1\u0001\u0000\u0000\u0000\u09b3"+
		"\u09b4\u0001\u0000\u0000\u0000\u09b4\u09b5\u0001\u0000\u0000\u0000\u09b5"+
		"\u09b6\u0005`\u0000\u0000\u09b6\u01e5\u0001\u0000\u0000\u0000\u09b7\u09b8"+
		"\u0005\u001e\u0000\u0000\u09b8\u09b9\u0003\u00c0`\u0000\u09b9\u01e7\u0001"+
		"\u0000\u0000\u0000\u09ba\u09bb\u0005b\u0000\u0000\u09bb\u09bc\u0003\u00c0"+
		"`\u0000\u09bc\u01e9\u0001\u0000\u0000\u0000\u09bd\u09be\u0005d\u0000\u0000"+
		"\u09be\u09c1\u0003\u00e6s\u0000\u09bf\u09c0\u0005)\u0000\u0000\u09c0\u09c2"+
		"\u0003\u01ec\u00f6\u0000\u09c1\u09bf\u0001\u0000\u0000\u0000\u09c1\u09c2"+
		"\u0001\u0000\u0000\u0000\u09c2\u09c3\u0001\u0000\u0000\u0000\u09c3\u09c4"+
		"\u0005\u008b\u0000\u0000\u09c4\u01eb\u0001\u0000\u0000\u0000\u09c5\u09ca"+
		"\u0003\u018a\u00c5\u0000\u09c6\u09ca\u0003`0\u0000\u09c7\u09ca\u0003\u0002"+
		"\u0001\u0000\u09c8\u09ca\u0003\u00cae\u0000\u09c9\u09c5\u0001\u0000\u0000"+
		"\u0000\u09c9\u09c6\u0001\u0000\u0000\u0000\u09c9\u09c7\u0001\u0000\u0000"+
		"\u0000\u09c9\u09c8\u0001\u0000\u0000\u0000\u09ca\u01ed\u0001\u0000\u0000"+
		"\u0000\u09cb\u09cc\u0005\t\u0000\u0000\u09cc\u09cd\u0005\u008e\u0000\u0000"+
		"\u09cd\u09d2\u0003\u00f0x\u0000\u09ce\u09cf\u0005\u008c\u0000\u0000\u09cf"+
		"\u09d1\u0003\u00f0x\u0000\u09d0\u09ce\u0001\u0000\u0000\u0000\u09d1\u09d4"+
		"\u0001\u0000\u0000\u0000\u09d2\u09d0\u0001\u0000\u0000\u0000\u09d2\u09d3"+
		"\u0001\u0000\u0000\u0000\u09d3\u09d5\u0001\u0000\u0000\u0000\u09d4\u09d2"+
		"\u0001\u0000\u0000\u0000\u09d5\u09d6\u0005\u008f\u0000\u0000\u09d6\u09d7"+
		"\u0005:\u0000\u0000\u09d7\u09d8\u0003\u01d8\u00ec\u0000\u09d8\u01ef\u0001"+
		"\u0000\u0000\u0000\u09d9\u09da\u0005\t\u0000\u0000\u09da\u09db\u0005\u008e"+
		"\u0000\u0000\u09db\u09e0\u0003\u00f0x\u0000\u09dc\u09dd\u0005\u008c\u0000"+
		"\u0000\u09dd\u09df\u0003\u00f0x\u0000\u09de\u09dc\u0001\u0000\u0000\u0000"+
		"\u09df\u09e2\u0001\u0000\u0000\u0000\u09e0\u09de\u0001\u0000\u0000\u0000"+
		"\u09e0\u09e1\u0001\u0000\u0000\u0000\u09e1\u09e3\u0001\u0000\u0000\u0000"+
		"\u09e2\u09e0\u0001\u0000\u0000\u0000\u09e3\u09e4\u0005\u008f\u0000\u0000"+
		"\u09e4\u09e5\u0005:\u0000\u0000\u09e5\u09e6\u0003\u01c2\u00e1\u0000\u09e6"+
		"\u01f1\u0001\u0000\u0000\u0000\u09e7\u09e8\u0005h\u0000\u0000\u09e8\u09ed"+
		"\u0003\u0128\u0094\u0000\u09e9\u09ea\u0005\u008c\u0000\u0000\u09ea\u09ec"+
		"\u0003\u0128\u0094\u0000\u09eb\u09e9\u0001\u0000\u0000\u0000\u09ec\u09ef"+
		"\u0001\u0000\u0000\u0000\u09ed\u09eb\u0001\u0000\u0000\u0000\u09ed\u09ee"+
		"\u0001\u0000\u0000\u0000\u09ee\u09f0\u0001\u0000\u0000\u0000\u09ef\u09ed"+
		"\u0001\u0000\u0000\u0000\u09f0\u09f1\u0005\u008b\u0000\u0000\u09f1\u01f3"+
		"\u0001\u0000\u0000\u0000\u09f2\u09f4\u0003\u0110\u0088\u0000\u09f3\u09f2"+
		"\u0001\u0000\u0000\u0000\u09f3\u09f4\u0001\u0000\u0000\u0000\u09f4\u09f5"+
		"\u0001\u0000\u0000\u0000\u09f5\u09f6\u0003\u01dc\u00ee\u0000\u09f6\u09f7"+
		"\u0005\u0088\u0000\u0000\u09f7\u09f8\u0003\u00c0`\u0000\u09f8\u09f9\u0005"+
		"\u008b\u0000\u0000\u09f9\u01f5\u0001\u0000\u0000\u0000\u09fa\u09fc\u0005"+
		"U\u0000\u0000\u09fb\u09fa\u0001\u0000\u0000\u0000\u09fb\u09fc\u0001\u0000"+
		"\u0000\u0000\u09fc\u09fd\u0001\u0000\u0000\u0000\u09fd\u09fe\u0005i\u0000"+
		"\u0000\u09fe\u09ff\u0003\u00e8t\u0000\u09ff\u0a00\u0005\u0092\u0000\u0000"+
		"\u0a00\u0a03\u0003\u01d8\u00ec\u0000\u0a01\u0a02\u0005\u0088\u0000\u0000"+
		"\u0a02\u0a04\u0003\u00c0`\u0000\u0a03\u0a01\u0001\u0000\u0000\u0000\u0a03"+
		"\u0a04\u0001\u0000\u0000\u0000\u0a04\u0a05\u0001\u0000\u0000\u0000\u0a05"+
		"\u0a06\u0005\u008b\u0000\u0000\u0a06\u01f7\u0001\u0000\u0000\u0000\u0a07"+
		"\u0a09\u0003\u0110\u0088\u0000\u0a08\u0a07\u0001\u0000\u0000\u0000\u0a08"+
		"\u0a09\u0001\u0000\u0000\u0000\u0a09\u0a0a\u0001\u0000\u0000\u0000\u0a0a"+
		"\u0a0c\u0005j\u0000\u0000\u0a0b\u0a0d\u0003\u0194\u00ca\u0000\u0a0c\u0a0b"+
		"\u0001\u0000\u0000\u0000\u0a0c\u0a0d\u0001\u0000\u0000\u0000\u0a0d\u0a0f"+
		"\u0001\u0000\u0000\u0000\u0a0e\u0a10\u0003l6\u0000\u0a0f\u0a0e\u0001\u0000"+
		"\u0000\u0000\u0a0f\u0a10\u0001\u0000\u0000\u0000\u0a10\u0a12\u0001\u0000"+
		"\u0000\u0000\u0a11\u0a13\u0003\u01e6\u00f3\u0000\u0a12\u0a11\u0001\u0000"+
		"\u0000\u0000\u0a12\u0a13\u0001\u0000\u0000\u0000\u0a13\u0a14\u0001\u0000"+
		"\u0000\u0000\u0a14\u0a15\u0005\u008b\u0000\u0000\u0a15\u01f9\u0001\u0000"+
		"\u0000\u0000\u0a16\u0a1b\u0003\u01fc\u00fe\u0000\u0a17\u0a18\u0005\u008c"+
		"\u0000\u0000\u0a18\u0a1a\u0003\u01fc\u00fe\u0000\u0a19\u0a17\u0001\u0000"+
		"\u0000\u0000\u0a1a\u0a1d\u0001\u0000\u0000\u0000\u0a1b\u0a19\u0001\u0000"+
		"\u0000\u0000\u0a1b\u0a1c\u0001\u0000\u0000\u0000\u0a1c\u0a20\u0001\u0000"+
		"\u0000\u0000\u0a1d\u0a1b\u0001\u0000\u0000\u0000\u0a1e\u0a20\u0005e\u0000"+
		"\u0000\u0a1f\u0a16\u0001\u0000\u0000\u0000\u0a1f\u0a1e\u0001\u0000\u0000"+
		"\u0000\u0a20\u01fb\u0001\u0000\u0000\u0000\u0a21\u0a24\u0003\u00c0`\u0000"+
		"\u0a22\u0a23\u0005\u0004\u0000\u0000\u0a23\u0a25\u0003\u00c0`\u0000\u0a24"+
		"\u0a22\u0001\u0000\u0000\u0000\u0a24\u0a25\u0001\u0000\u0000\u0000\u0a25"+
		"\u01fd\u0001\u0000\u0000\u0000\u0126\u0205\u0209\u020f\u0219\u0223\u022c"+
		"\u0231\u0238\u023c\u0241\u024d\u0250\u0257\u025d\u0261\u0265\u0268\u026f"+
		"\u0274\u0279\u027d\u0283\u0287\u028a\u0292\u029b\u02aa\u02b9\u02bc\u02bf"+
		"\u02c6\u02cc\u02e9\u02ee\u02f5\u02f7\u02fd\u02ff\u0306\u0309\u0311\u0314"+
		"\u031d\u0324\u0329\u032c\u0332\u033d\u0345\u0349\u034d\u0352\u035a\u035f"+
		"\u036c\u0373\u037b\u037e\u0387\u038a\u038d\u0392\u0399\u039c\u03a6\u03aa"+
		"\u03ad\u03b0\u03b6\u03ba\u03bd\u03c1\u03c6\u03c9\u03cf\u03d2\u03d6\u03e8"+
		"\u03ea\u03f5\u03f8\u03ff\u0404\u0409\u0416\u0426\u042b\u0430\u0435\u0438"+
		"\u043d\u0447\u0453\u0458\u046b\u0470\u0476\u047d\u0487\u048b\u048e\u04a6"+
		"\u04ab\u04b0\u04b3\u04b6\u04bd\u04c2\u04cb\u04d0\u04d6\u04da\u04e2\u04e8"+
		"\u04ec\u04f0\u04fa\u0500\u0506\u050d\u0515\u0526\u052e\u0538\u053c\u0541"+
		"\u0547\u054f\u055c\u0567\u056e\u058c\u0590\u059d\u05a2\u05a7\u05b1\u05b8"+
		"\u05bf\u05c8\u05cc\u05d3\u05d8\u05db\u05e0\u05e5\u05ed\u05fb\u0603\u060b"+
		"\u0612\u0617\u061c\u0620\u0624\u062a\u062e\u0632\u063a\u063f\u0644\u064a"+
		"\u0655\u065c\u0665\u066b\u066e\u0675\u067f\u0684\u068b\u0692\u0699\u06a4"+
		"\u06ac\u06b6\u06bd\u06c1\u06c5\u06cb\u06d3\u06d6\u06d9\u06e3\u06e6\u06f5"+
		"\u06fa\u0703\u0706\u071d\u0722\u0732\u0738\u0751\u0756\u0764\u0769\u076f"+
		"\u0777\u077a\u078c\u0791\u0795\u0798\u079f\u07a2\u07a9\u07ad\u07b4\u07be"+
		"\u07c3\u07ca\u07cf\u07d7\u07dd\u07e6\u07eb\u07f1\u07f6\u07fc\u0801\u0807"+
		"\u080c\u0810\u081e\u0822\u083c\u0847\u084d\u085c\u0862\u0868\u086d\u0872"+
		"\u087c\u0880\u088b\u0890\u0898\u089b\u089f\u08a4\u08ac\u08b0\u08b6\u08c0"+
		"\u08c8\u08cd\u08d2\u08df\u08e4\u08e9\u08ee\u08f2\u08fa\u0903\u0907\u090c"+
		"\u0916\u092d\u0935\u093e\u0941\u0955\u095a\u0961\u0969\u096c\u0974\u097c"+
		"\u0987\u098a\u098d\u0993\u0997\u099f\u09a5\u09af\u09b3\u09c1\u09c9\u09d2"+
		"\u09e0\u09ed\u09f3\u09fb\u0a03\u0a08\u0a0c\u0a0f\u0a12\u0a1b\u0a1f\u0a24";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}