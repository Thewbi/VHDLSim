package de.vhdlsim;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Alias_declarationContext;
import de.vhdl.grammar.VHDLParser.Architecture_bodyContext;
import de.vhdl.grammar.VHDLParser.Case_statementContext;
import de.vhdl.grammar.VHDLParser.Component_declarationContext;
import de.vhdl.grammar.VHDLParser.Component_instantiation_statementContext;
import de.vhdl.grammar.VHDLParser.Concurrent_signal_assignment_statementContext;
import de.vhdl.grammar.VHDLParser.Conditional_signal_assignmentContext;
import de.vhdl.grammar.VHDLParser.Configuration_declarationContext;
import de.vhdl.grammar.VHDLParser.Constant_declarationContext;
import de.vhdl.grammar.VHDLParser.Design_fileContext;
import de.vhdl.grammar.VHDLParser.Entity_declarationContext;
import de.vhdl.grammar.VHDLParser.Enumeration_type_definitionContext;
import de.vhdl.grammar.VHDLParser.ExpressionContext;
import de.vhdl.grammar.VHDLParser.Function_specificationContext;
import de.vhdl.grammar.VHDLParser.If_statementContext;
import de.vhdl.grammar.VHDLParser.Instantiated_unitContext;
import de.vhdl.grammar.VHDLParser.Name_partContext;
import de.vhdl.grammar.VHDLParser.Physical_literalContext;
import de.vhdl.grammar.VHDLParser.Port_map_aspectContext;
import de.vhdl.grammar.VHDLParser.Process_statementContext;
import de.vhdl.grammar.VHDLParser.Range_constraintContext;
import de.vhdl.grammar.VHDLParser.Record_type_definitionContext;
import de.vhdl.grammar.VHDLParser.Selected_signal_assignmentContext;
import de.vhdl.grammar.VHDLParser.Signal_assignment_statementContext;
import de.vhdl.grammar.VHDLParser.Signal_declarationContext;
import de.vhdl.grammar.VHDLParser.Simple_expressionContext;
import de.vhdl.grammar.VHDLParser.Subprogram_bodyContext;
import de.vhdl.grammar.VHDLParser.Subprogram_declarative_itemContext;
import de.vhdl.grammar.VHDLParser.Type_declarationContext;
import de.vhdl.grammar.VHDLParser.Type_definitionContext;
import de.vhdl.grammar.VHDLParser.Wait_statementContext;
import de.vhdl.grammar.VHDLParser.Waveform_elementContext;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.PhysicalUnit;

/**
 * Use this generator to generate your testbenches:
 * https://vhdl.lapinoo.net/testbench/
 *
 * To test the grammar use http://lab.antlr.org/
 * top level element of the grammar is design_file
 *
 */
public class App {

    // private static final boolean OUTPUT_AST = true;
    private static final boolean OUTPUT_AST = false;

    private final static String PATH = "src/test/resources/vhdl_samples/";

    public static void main(String[] args) throws IOException {

        boolean print = false;
        // boolean print = true;

        // boolean convertToAST = false;
        boolean convertToAST = true;

        Map<String, PhysicalUnit> units = new HashMap<>();

        DebugASTOutputListenerCallback astOutputListenerCallback = new DebugASTOutputListenerCallback();
        astOutputListenerCallback.units = units;

        // ASTOutputListener astOutputListener = new ASTOutputListener();
        ASTOutputListener astOutputListener = new ASTOutputListener();
        astOutputListener.units = units;
        astOutputListener.astOutputListenerCallback = astOutputListenerCallback;

        // top level element of the grammar is design_file

        // @formatter:off

        // TODO:
        // testAliasDeclaration(astOutputListener, print, convertToAST, PATH + "alias.vhd");
        // testPhysicalUnits(astOutputListener, print, convertToAST, PATH + "physical_units.vhd");
        // testRangeConstraint(astOutputListener, print, convertToAST, PATH + "range_constraint.vhd");

        //
        // Type Declaration
        //

        // testTypeDeclaration(astOutputListener, print, convertToAST, PATH + "type_declaration_1.vhd");
        // testTypeDeclaration(astOutputListener, print, convertToAST, PATH + "type_declaration_array.vhd");

        //
        // Constant
        //

        // testConstantDeclaration(astOutputListener, print, convertToAST, PATH + "constant_1.vhd");

        //
        // Signal Declaration
        //

        // testSignalDeclaration(astOutputListener, print, convertToAST, PATH + "signal_declaration_1.vhd");
        // testSignalDeclaration(astOutputListener, print, convertToAST, PATH + "signal_declaration_2.vhd");
        // testSignalDeclaration(astOutputListener, print, convertToAST, PATH + "signal_declaration_3.vhd");
        // testSignalDeclaration(astOutputListener, print, convertToAST, PATH + "signal_declaration_4.vhd");
        // testSignalDeclaration(astOutputListener, print, convertToAST, PATH + "signal_declaration_vector.vhd");

        //
        // Expression
        //

        // testExpression(astOutputListener, print, convertToAST, PATH + "expression.vhd");
        // testSimpleExpression(astOutputListener, print, convertToAST, PATH + "expression_with_function_call.vhd");

        //
        // Signal Assignment Statement (signal_assignment_statement)
        //

        // testAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment_1.vhd");
        // testAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment_2.vhd");
        // TODO: next
        // testAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment_4.vhd");
        // testAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment_logical.vhd");

        //
        // Concurrent Signal Assignment
        //

        // testConcurrentSignalAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment_function_call.vhd");

        //
        // Selected Signal Assignment
        //

        // TODO
        // testSelectedSignalAssignment(astOutputListener, print, convertToAST, PATH + "selected_signal_assignment_1.vhd");

        //
        // Conditional Signal Assignment
        //
        // https://www.sigasi.com/tech/signal-assignments-vhdl-withselect-whenelse-and-case/
        //

        // testConditionalSignalAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment_when_else_1.vhd");
        // testConditionalSignalAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment_when_else_2.vhd");
        // testConditionalSignalAssignment(astOutputListener, print, convertToAST, PATH + "signal_assignment_3.vhd");

        //
        // If statements (if_statement)
        //

        // testIf(astOutputListener, print, convertToAST, PATH + "if.vhd");
        // testIf(astOutputListener, print, convertToAST, PATH + "if_2.vhd");
        // testIf(astOutputListener, print, convertToAST, PATH + "if_3.vhd");
        // testIf(astOutputListener, print, convertToAST, PATH + "elsif.vhd");
        // testIf(astOutputListener, print, convertToAST, PATH + "if_with_element_access.vhd");
        // testIf(astOutputListener, print, convertToAST, PATH + "if_complex_expression.vhd");
        // testIf(astOutputListener, print, convertToAST, PATH + "if_with_function_predicate.vhd");
        // testIf(astOutputListener, print, convertToAST, PATH + "if_with_expression.vhd");
        // testIf(astOutputListener, print, convertToAST, PATH + "if_with_nested_function_call.vhd");

        //
        // Enum
        //

        // testEnum(astOutputListener, print, convertToAST, PATH + "enum.vhd");

        //
        // Configuration
        //

        // testConfiguration(astOutputListener, print, convertToAST, PATH + "configuration.vhd");

        //
        // Function Specification, Implementation and Function Call
        //

        // TODO: formal parameter is not parsed!
        // testFunctionSpecification(astOutputListener, print, convertToAST, PATH + "function.vhd");
        // testFunctionCall(astOutputListener, print, convertToAST, PATH + "function_call.vhd");
        // testFunctionSpecification(astOutputListener, print, convertToAST, PATH + "function_specification.vhd");
        // TODO unit test
        // testFunctionImplementation(astOutputListener, print, convertToAST, PATH + "function_implementation.vhd");

        //
        // Subprogram
        //

        // testSubprogramBody(astOutputListener, print, convertToAST, PATH + "function.vhd");
        // testSubprogramBody(astOutputListener, print, convertToAST, PATH + "function.vhd");
        // testSubprogramBody(astOutputListener, print, convertToAST, PATH + "function_definition_1.vhd");

        //
        // Case
        //

        // testCase(astOutputListener, print, convertToAST, PATH + "case_1.vhd");
        // testCase(astOutputListener, print, convertToAST, PATH + "case_2.vhd");

        //
        // Process
        //

        // TODO: continue here. Need to process case first!
        // testProcess(astOutputListener, print, convertToAST, PATH + "process_1.vhd");
        // testProcess(astOutputListener, print, convertToAST, PATH + "process_2.vhd");
        // testProcess(astOutputListener, print, convertToAST, PATH + "process_3.vhd");
        // testProcess(astOutputListener, print, convertToAST, PATH + "process_4.vhd");

        // testWaveformElement(astOutputListener, print, convertToAST, PATH + "waveform_element.vhd");

        //
        // Component
        //

        // testComponent(astOutputListener, print, convertToAST, PATH + "component.vhd");

        //
        // Record
        //

        // testRecord(astOutputListener, print, convertToAST, PATH + "record.vhd");

        //
        // WaitStatement
        //

        // testWaitStatement(astOutputListener, print, convertToAST, PATH + "wait_for_time_unit_statement.vhd");

        //
        // Entity and Architecture (entity_declaration)
        //

        // testEntityDeclaration(astOutputListener, print, convertToAST, PATH + "entity.vhd");
        // testEntityDeclaration(astOutputListener, print, convertToAST, PATH + "entity_generic.vhd");
        // testEntityDeclaration(astOutputListener, print, convertToAST, PATH + "P6502/ALU.vhd");

        // // and-gate
        // //https://circuitdigest.com/microcontroller-projects/implementation-of-basic-logic-gates-using-vhdl-in-modelsim
        // testEntityAndArchitecture(astOutputListener, print, convertToAST, PATH + "and_gate.vhd");
        // testEntityAndArchitecture(astOutputListener, print, convertToAST, PATH + "multiplexer.vhd");
        // testEntityAndArchitecture(astOutputListener, print, convertToAST, PATH + "thermostat_example.vhd");
        // https://circuitdigest.com/microcontroller-projects/implementation-of-basic-logic-gates-using-vhdl-in-modelsim

        // testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture.vhd");
        // // TODO: implement port map
        // testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture_with_signal.vhd");
        // testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture_with_generate.vhd");
        // testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture_with_process_with_if.vhd");
        // // TODO: finish the entity Declaration statement and port map processing here
        // testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture_testbench.vhd");
        // testArchitecture(astOutputListener, print, convertToAST, PATH + "architecture_example_1.vhd");

        //
        // Entity Instantiation
        //

        // component_instantiation_statement
        // testEntityInstantiation(astOutputListener, print, convertToAST, PATH + "entity_instantiation_1.vhd");
        // testEntityInstantiation(astOutputListener, print, convertToAST, PATH + "entity_instantiation_2.vhd");
        // testEntityInstantiation(astOutputListener, print, convertToAST, PATH + "entity_instantiation_3.vhd");
        // testEntityInstantiation(astOutputListener, print, convertToAST, PATH + "entity_instantiation_4.vhd");

        // testPortMap(astOutputListener, print, convertToAST, PATH + "port_map.vhd");

        // testInstantiatedUnit(astOutputListener, print, convertToAST, PATH + "instantiated_unit.vhd");

        //
        // Design File
        //

        // testDesignFile(astOutputListener, print, convertToAST, PATH + "neorv32_boot_rom.vhd");
        // testDesignFile(astOutputListener, print, convertToAST, "C:/Users/lapto/dev/VHDL/neorv32/rtl/core/neorv32_cpu_cp_shifter.vhd");
        // testDesignFile(astOutputListener, print, convertToAST, "C:/Users/lapto/dev/VHDL/neorv32/rtl/core/neorv32_cpu_control.vhd");
        // testDesignFile(astOutputListener, print, convertToAST, "C:/Users/lapto/dev/VHDL/neorv32/rtl/core/neorv32_cpu_cp_cfu.vhd");
        // testDesignFile(astOutputListener, print, convertToAST, "C:/Users/lapto/dev/VHDL/neorv32/rtl/core/neorv32_cpu_cp_muldiv.vhd");
        // testDesignFile(astOutputListener, print, convertToAST, PATH + "P6502/ALU.vhd");
        // testDesignFile(astOutputListener, print, convertToAST, PATH + "P6502/P6502_pkg.vhd");
        // testDesignFile(astOutputListener, print, convertToAST, PATH + "P6502/FlipFlopD_sr.vhd");
        testDesignFile(astOutputListener, print, convertToAST, PATH + "matrix_mult/fpga4student/matrix_multiplier.vhd");

        //
        // Testbench
        //

        // testDesignFile(astOutputListener, print, convertToAST, PATH + "/testbench_tutorial/mini_dds.vhd");

        // @formatter:on

        // if (OUTPUT_AST) {
        //     // DEBUG output the AST from the stmt inside the astOutputListener
        //     int indent = 0;

        //     if (astOutputListener.stmt != null) {
        //         System.out.println(astOutputListener.stmt.toString(indent));
        //     }

        //     if (!astOutputListener.stack.empty()) {
        //         ModelNode<?> modelNode = astOutputListener.stack.pop();
        //         System.out.println(modelNode.toString(indent));
        //     }
        // }

        // if (astOutputListener.stmt != null) {
        //     throw new RuntimeException("listener is not keeping house correctly!");
        // }

        // https://www.mikrocontroller.net/articles/VHDL_Testbench
    }

    private static ASTOutputListener testConstantDeclaration(ASTOutputListener astOutputListener, boolean print,
            boolean convertToAST, String testFile) throws IOException {

        final VHDLParser parser = processFile(testFile);
        final Constant_declarationContext constant_declarationContext = parser.constant_declaration();

        return traverseTree(astOutputListener, constant_declarationContext, print, convertToAST, testFile);
    }

    private static ASTOutputListener testTypeDeclaration(ASTOutputListener astOutputListener, boolean print,
            boolean convertToAST,
            String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Type_declarationContext type_declarationContext = parser.type_declaration();

        return traverseTree(astOutputListener, type_declarationContext, print, convertToAST, testFile);
    }

    private static ASTOutputListener testSubprogramBody(ASTOutputListener astOutputListener, boolean print,
            boolean convertToAST,
            String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Subprogram_bodyContext subprogram_body = parser.subprogram_body();

        return traverseTree(astOutputListener, subprogram_body, print, convertToAST, testFile);
    }

    private static ASTOutputListener testAliasDeclaration(ASTOutputListener astOutputListener, boolean print,
            boolean convertToAST,
            String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Alias_declarationContext root = parser.alias_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testWaveformElement(ASTOutputListener astOutputListener, boolean print,
            boolean convertToAST,
            String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Waveform_elementContext root = parser.waveform_element();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testFunctionCall(ASTOutputListener astOutputListener, boolean print,
            boolean convertToAST,
            String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Simple_expressionContext root = parser.simple_expression();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testConfiguration(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Configuration_declarationContext root = parser.configuration_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testExpression(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final ExpressionContext root = parser.expression();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testSimpleExpression(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Simple_expressionContext root = parser.simple_expression();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testSignalDeclaration(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Signal_declarationContext root = parser.signal_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testRangeConstraint(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Range_constraintContext root = parser.range_constraint();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testAssignment(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Signal_assignment_statementContext root = parser.signal_assignment_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testSelectedSignalAssignment(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Selected_signal_assignmentContext root = parser.selected_signal_assignment();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testConditionalSignalAssignment(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Conditional_signal_assignmentContext root = parser.conditional_signal_assignment();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testConcurrentSignalAssignment(ASTOutputListener astOutputListener, boolean print,
            boolean convertToAST, String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Concurrent_signal_assignment_statementContext root = parser.concurrent_signal_assignment_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testIf(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final If_statementContext root = parser.if_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testCase(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile) throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Case_statementContext root = parser.case_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testProcess(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Process_statementContext root = parser.process_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testEntityDeclaration(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Entity_declarationContext root = parser.entity_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    /**
     * A entity instantiation is a component instantiation statement
     */
    private static ASTOutputListener testEntityInstantiation(final ASTOutputListener astOutputListener,
            final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Component_instantiation_statementContext root = parser.component_instantiation_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testPortMap(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Port_map_aspectContext root = parser.port_map_aspect();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testInstantiatedUnit(final ASTOutputListener astOutputListener,
            final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Instantiated_unitContext root = parser.instantiated_unit();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testArchitecture(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Architecture_bodyContext root = parser.architecture_body();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testComponent(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Component_declarationContext root = parser.component_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testRecord(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Type_declarationContext root = parser.type_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testFunctionSpecification(final ASTOutputListener astOutputListener,
            final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Function_specificationContext root = parser.function_specification();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testFunctionImplementation(final ASTOutputListener astOutputListener,
            final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Subprogram_declarative_itemContext root = parser.subprogram_declarative_item();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testEntityAndArchitecture(final ASTOutputListener astOutputListener,
            final boolean print, final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Design_fileContext root = parser.design_file();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testEnum(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Type_declarationContext root = parser.type_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testDesignFile(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Design_fileContext root = parser.design_file();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    @SuppressWarnings("unused")
    private static ASTOutputListener testWaitStatement(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Wait_statementContext root = parser.wait_statement();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener testPhysicalUnits(final ASTOutputListener astOutputListener, final boolean print,
            final boolean convertToAST, final String testFile)
            throws IOException {
        final VHDLParser parser = processFile(testFile);
        final Type_declarationContext root = parser.type_declaration();

        return traverseTree(astOutputListener, root, print, convertToAST, testFile);
    }

    private static ASTOutputListener traverseTree(final ASTOutputListener astOutputListener,
            final ParseTree root, final boolean print, final boolean convertToAST,
            final String originalFilename)
            throws FileNotFoundException {

        if (print) {

            VHDLRawOutputListener printListener = new VHDLRawOutputListener();

            // create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(printListener, root);

            // exchange the extension from .vhd to .pt (pt == parse tree)
            int indexOfLastDot = originalFilename.lastIndexOf(".");
            String newFileName = originalFilename.substring(0, indexOfLastDot) + ".pt";

            try (PrintWriter out = new PrintWriter(newFileName)) {
                out.println(printListener.stringBuilder.toString());
            }
        }

        if (convertToAST) {

            System.out.println("");
            System.out.println("AST GENERATION:");

            // create a generic parse tree walker that can trigger callbacks
            final ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(astOutputListener, root);

            // DEBUG output the AST
            // int indent = 0;
            // for (ModelNode<?> stmt : astOutputListener.stmts) {
            // System.out.println(stmt.toString(indent));
            // }
            // System.out.println(astOutputListener.stmt.toString(indent));
        }

        return astOutputListener;
    }

    private static VHDLParser processFile(String testFile) throws IOException {

        System.out.println("Loading: \"" + testFile + "\"");

        final CharStream charStream = CharStreams.fromFileName(testFile);

        final VHDLLexer lexer = new VHDLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final VHDLParser parser = new VHDLParser(tokens);

        return parser;
    }
}
