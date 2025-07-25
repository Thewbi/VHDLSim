package de.vhdlsim;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.management.RuntimeErrorException;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.vhdl.grammar.VHDLLexer;
import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Abstract_literalContext;
import de.vhdl.grammar.VHDLParser.Association_elementContext;
import de.vhdl.grammar.VHDLParser.Association_listContext;
import de.vhdl.grammar.VHDLParser.DirectionContext;
import de.vhdl.grammar.VHDLParser.Enumeration_literalContext;
import de.vhdl.grammar.VHDLParser.ExpressionContext;
import de.vhdl.grammar.VHDLParser.IdentifierContext;
import de.vhdl.grammar.VHDLParser.Identifier_listContext;
import de.vhdl.grammar.VHDLParser.Instantiated_unitContext;
import de.vhdl.grammar.VHDLParser.Instantiation_listContext;
import de.vhdl.grammar.VHDLParser.NameContext;
import de.vhdl.grammar.VHDLParser.Name_partContext;
import de.vhdl.grammar.VHDLParser.Physical_literalContext;
import de.vhdl.grammar.VHDLParser.Selected_nameContext;
import de.vhdl.grammar.VHDLParser.Subtype_indicationContext;
import de.vhdl.grammar.VHDLParserBaseListener;
import de.vhdlmodel.ActualParameter;
import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.AssignmentType;
import de.vhdlmodel.CaseStmt;
import de.vhdlmodel.CaseStmtBranch;
import de.vhdlmodel.CharacterLiteral;
import de.vhdlmodel.Component;
import de.vhdlmodel.ComponentInstantiationStatement;
import de.vhdlmodel.Configuration;
import de.vhdlmodel.Entity;
import de.vhdlmodel.Expr;
import de.vhdlmodel.FunctionCall;
import de.vhdlmodel.FunctionCallActualParameter;
import de.vhdlmodel.FunctionImplementation;
import de.vhdlmodel.FunctionSpecification;
import de.vhdlmodel.IfStmt;
import de.vhdlmodel.IfStmtBranch;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.DummyNode;
import de.vhdlmodel.NumericLiteral;
import de.vhdlmodel.PhysicalUnit;
import de.vhdlmodel.Port;
import de.vhdlmodel.PortDirection;
import de.vhdlmodel.PortTarget;
import de.vhdlmodel.Relation;
import de.vhdlmodel.ReturnStatement;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.StringLiteral;
import de.vhdlmodel.SubPhysicalUnit;
import de.vhdlmodel.TypeDeclaration;
import de.vhdlmodel.TypeDeclarationType;
import de.vhdlmodel.Variable;
import de.vhdlmodel.WaitStatement;
import de.vhdlmodel.Process;
import de.vhdlmodel.Range;
import de.vhdlmodel.RangeDirection;
import de.vhdlmodel.Record;
import de.vhdlmodel.RecordField;

/**
 * Constructs an abstract syntac tree (AST) out of the parse tree (PT).
 *
 * In the resources folder, you will find .ast and .pt files.
 * .pt files contain the parse trees.
 * .ast files contain the abstract syntax trees.
 */
public class ASTOutputListener extends VHDLParserBaseListener {

    public Stmt stmt;

    public ModelNode<?> expr;

    public ASTOutputListenerCallback astOutputListenerCallback;

    public Stack<ModelNode<?>> stack = new Stack<>();

    private boolean case_statement_alternative_others;

    private String lastIdentifier;

    private FunctionCall lastFunctionCall;

    private boolean functionCall;

    private Process lastProcess;

    private boolean sensitivityList;

    private Entity entity;

    private Architecture architecture;

    private Component component;

    private PortTarget portTarget;

    private Record record;

    private PortDirection portDirection = PortDirection.UNKNOWN;

    private Range range;

    private String subtypeIndication;

    private FunctionSpecification functionSpecification;

    private FunctionImplementation functionImplementation;

    private ActualParameter actualParameter;

    private TypeDeclaration typeDeclaration;

    private Signal signal;

    private Configuration configuration;

    private ComponentInstantiationStatement componentInstantiationStatement;

    public Map<String, PhysicalUnit> units = null;

    private NumericLiteral physicalUnitValue = null;

    @Override
    public void enterWait_statement(VHDLParser.Wait_statementContext ctx) {
    }

    @Override
    public void exitWait_statement(VHDLParser.Wait_statementContext ctx) {
        System.out.println("a");

        WaitStatement waitStatement = new WaitStatement();
        waitStatement.numericLiteral = (NumericLiteral) stack.pop();

        stmt.children.add(waitStatement);
    }

    @Override
    public void enterComponent_instantiation_statement(VHDLParser.Component_instantiation_statementContext ctx) {

        componentInstantiationStatement = new ComponentInstantiationStatement();

        String identifier = ctx.label_colon().getText();
        componentInstantiationStatement.name = identifier.substring(0, identifier.length() - 1);

        Instantiated_unitContext instantiated_unitContext = ctx.instantiated_unit();
        NameContext nameContext = instantiated_unitContext.name();
        String name = nameContext.getText();

        String library = nameContext.getChild(0).getText();

        String entityType = nameContext.getChild(1).getText();

        String entityArchitecture = nameContext.getChild(2).getText();

        // TODO: insert component instantiation statement into the parent architecture
        if (architecture != null) {
            architecture.children.add(componentInstantiationStatement);
            componentInstantiationStatement.parent = architecture;
            stmt = componentInstantiationStatement;
        }
    }

    @Override
    public void exitComponent_instantiation_statement(VHDLParser.Component_instantiation_statementContext ctx) {

        astOutputListenerCallback.componentInstantiationStatement(componentInstantiationStatement);

        stmt = componentInstantiationStatement.parent;
        componentInstantiationStatement = null;
    }

    @Override
    public void enterPort_map_aspect(VHDLParser.Port_map_aspectContext ctx) {

        String portmap = ctx.getText();

        Association_listContext association_listContext = ctx.association_list();

        for (Association_elementContext association_elementContext : association_listContext.association_element()) {

            String assoc = association_elementContext.getText();
            System.out.println(assoc);

            // TODO: insert the portmap into the current componentInstantiationStatement
        }
    }

    @Override
    public void exitPort_map_aspect(VHDLParser.Port_map_aspectContext ctx) {
    }

    @Override
    public void enterConfiguration_declaration(VHDLParser.Configuration_declarationContext ctx) {

        configuration = new Configuration();

        final String identifier = ctx.identifier().get(0).getText();
        final String name = ctx.name().getText();

        configuration.name = identifier;
        configuration.targetEntity = name;
    }

    @Override
    public void exitConfiguration_declaration(VHDLParser.Configuration_declarationContext ctx) {

        astOutputListenerCallback.configuration(configuration);
    }

    @Override
    public void enterBlock_specification(VHDLParser.Block_specificationContext ctx) {

        IdentifierContext identifierContext = ctx.identifier();
        final String identifier = identifierContext.getText();

        configuration.targetEntityArchitecture = identifier;
    }

    @Override
    public void exitBlock_specification(VHDLParser.Block_specificationContext ctx) {
    }

    @Override
    public void enterComponent_specification(VHDLParser.Component_specificationContext ctx) {

        Instantiation_listContext instantiation_listContext = ctx.instantiation_list();
        String instatiation = instantiation_listContext.getText();
        configuration.componentInstance = instatiation;

        final String identifier = ctx.name().getText();
        configuration.componentDeclaration = identifier;
    }

    @Override
    public void exitComponent_specification(VHDLParser.Component_specificationContext ctx) {
    }

    @Override
    public void enterEntity_aspect(VHDLParser.Entity_aspectContext ctx) {

        NameContext nameContext = ctx.name();

        Name_partContext namePartContext = nameContext.name_part(0);
        String namePart = namePartContext.getText();
        configuration.boundEntity = namePart;

        Name_partContext namePartContext2 = nameContext.name_part(1);
        String namePart2 = namePartContext2.getText();
        configuration.boundEntityArchitecture = namePart2;

        // String name = ctx.name().getText();
        // configuration.boundEntity = name;
    }

    @Override
    public void exitEntity_aspect(VHDLParser.Entity_aspectContext ctx) {
    }

    @Override
    public void enterType_declaration(VHDLParser.Type_declarationContext ctx) {

        typeDeclaration = new TypeDeclaration();
        typeDeclaration.name = ctx.identifier().getText();
        typeDeclaration.physicalUnit.name = ctx.identifier().getText();
    }

    @Override
    public void exitType_declaration(VHDLParser.Type_declarationContext ctx) {

        typeDeclaration.range = this.range;

        astOutputListenerCallback.typeDeclaration(typeDeclaration);

        typeDeclaration = null;
        range = null;
    }

    @Override
    public void enterBase_unit_declaration(VHDLParser.Base_unit_declarationContext ctx) {

        String unit = ctx.getText();

        final String unitTrimmed = unit.substring(0, unit.length() - 1);

        // typeDeclaration.physicalUnit.units.add(unitTrimmed);
        // typeDeclaration.physicalUnit.factors.add(1);

        final SubPhysicalUnit subPhysicalUnit = new SubPhysicalUnit();
        subPhysicalUnit.name = unitTrimmed;
        subPhysicalUnit.factor = 1;
        subPhysicalUnit.physicalUnit = typeDeclaration.physicalUnit;
        subPhysicalUnit.parent = null;

        typeDeclaration.physicalUnit.subPhysicalUnits.put(unitTrimmed, subPhysicalUnit);
    }

    @Override
    public void exitBase_unit_declaration(VHDLParser.Base_unit_declarationContext ctx) {
    }

    @Override
    public void enterSecondary_unit_declaration(VHDLParser.Secondary_unit_declarationContext ctx) {

        IdentifierContext identifierContext = ctx.identifier();
        // System.out.println(identifierContext.getText());

        Physical_literalContext physical_literalContext = ctx.physical_literal();
        Abstract_literalContext abstract_literalContext = physical_literalContext.abstract_literal();
        // System.out.println(abstract_literalContext.getText());

        IdentifierContext parentIdentifierContext = physical_literalContext.identifier();
        // System.out.println(parentIdentifierContext.getText());

        SubPhysicalUnit parent = typeDeclaration.physicalUnit.subPhysicalUnits.get(parentIdentifierContext.getText());

        if (null == parent) {
            throw new RuntimeException("Unknown parent of type: '" + parentIdentifierContext.getText() + "'");
        }

        final SubPhysicalUnit subPhysicalUnit = new SubPhysicalUnit();
        subPhysicalUnit.name = identifierContext.getText();
        subPhysicalUnit.factor = Integer.parseInt(abstract_literalContext.getText());
        subPhysicalUnit.physicalUnit = typeDeclaration.physicalUnit;
        subPhysicalUnit.parent = parent;

        typeDeclaration.physicalUnit.subPhysicalUnits.put(identifierContext.getText(), subPhysicalUnit);
    }

    @Override
    public void exitSecondary_unit_declaration(VHDLParser.Secondary_unit_declarationContext ctx) {
    }

    @Override
    public void enterPhysical_literal(VHDLParser.Physical_literalContext ctx) {

        // disinguish between type declaration and type usage.
        // type declaration is when there currently is a non-null typeDeclaration in
        // place
        // type usage is when the typeDeclaration field is null!
        if (typeDeclaration == null) {

            System.out.println(ctx.getText());

            final String value = ctx.abstract_literal().getText();
            final String unit = ctx.identifier().getText();

            physicalUnitValue = new NumericLiteral();
            physicalUnitValue.value = Integer.parseInt(value);

            // resolve the unit in string form into a physical unit type
            for (Map.Entry<String, PhysicalUnit> entry : units.entrySet()) {

                PhysicalUnit physicalUnit = entry.getValue();

                if (physicalUnit.subPhysicalUnits.containsKey(unit)) {
                    physicalUnitValue.physicalUnit = physicalUnit;
                    break;
                }
            }
        }
    }

    @Override
    public void exitPhysical_literal(VHDLParser.Physical_literalContext ctx) {

    }

    @Override
    public void enterEnumeration_type_definition(VHDLParser.Enumeration_type_definitionContext ctx) {

        typeDeclaration.typeDeclarationType = TypeDeclarationType.ENUM;

        for (Enumeration_literalContext enumeration_literalContext : ctx.enumeration_literal()) {

            typeDeclaration.enumValues.add(enumeration_literalContext.getText());
        }

        astOutputListenerCallback.enumDataTypeDeclaration(typeDeclaration);
        typeDeclaration = null;
    }

    @Override
    public void exitEnumeration_type_definition(VHDLParser.Enumeration_type_definitionContext ctx) {
    }

    @Override
    public void enterPhysical_type_definition(VHDLParser.Physical_type_definitionContext ctx) {
        typeDeclaration.typeDeclarationType = TypeDeclarationType.PHYSICAL_TYPE;

    }

    @Override
    public void exitPhysical_type_definition(VHDLParser.Physical_type_definitionContext ctx) {
    }

    @Override
    public void enterReturn_statement(VHDLParser.Return_statementContext ctx) {
    }

    @Override
    public void exitReturn_statement(VHDLParser.Return_statementContext ctx) {
        // System.out.println(ctx);

        // ExpressionContext expressionContext = ctx.expression();

        ReturnStatement returnStatement = new ReturnStatement();
        returnStatement.expr = stackPop();

        stmt.children.add(returnStatement);
    }

    @Override
    public void enterVariable_declaration(VHDLParser.Variable_declarationContext ctx) {

        // mark start of this variable declaration on the expression stack
        // so that it is possible to extract the initializer expression in a convenient
        // way
        stackPushDummyNode();
    }

    @Override
    public void exitVariable_declaration(VHDLParser.Variable_declarationContext ctx) {

        //
        // Type
        //

        Subtype_indicationContext subtype_indicationContext = ctx.subtype_indication();
        final String localSubtypeIndication = subtype_indicationContext.getText();
        // System.out.println(localSubtypeIndication);

        //
        // Initializer expression
        //

        ModelNode<?> node = null;
        ModelNode<?> initializer = null;
        if (!stack.empty()) {
            do {

                node = stackPop();

                if (!(node instanceof DummyNode)) {
                    initializer = node;
                }

            } while (!(node instanceof DummyNode));
        }

        //
        // declared variable names
        //

        for (IdentifierContext identifierContext : ctx.identifier_list().identifier()) {

            String identifier = identifierContext.getText();
            // System.out.println(identifier);

            Variable localVariable = new Variable();
            functionImplementation.localVariables.add(localVariable);

            localVariable.name = identifier;
            localVariable.subtypeIndication = localSubtypeIndication;
            if (initializer != null) {
                localVariable.expression = initializer;
            }
        }

        // reset for next iteration
        portDirection = PortDirection.UNKNOWN;
        range = null;
        subtypeIndication = null;
        lastIdentifier = null;
    }

    @Override
    public void enterSubprogram_declarative_item(VHDLParser.Subprogram_declarative_itemContext ctx) {

    }

    @Override
    public void exitSubprogram_declarative_item(VHDLParser.Subprogram_declarative_itemContext ctx) {

    }

    @Override
    public void enterSubprogram_body(VHDLParser.Subprogram_bodyContext ctx) {
        functionImplementation = new FunctionImplementation();

        // the function implementation becomes the current statement so that any
        // statements
        // inside it's body are appended to the function implementation
        if (stmt != null) {
            stmt.children.add(functionImplementation);
            functionImplementation.parent = stmt;
        }
        stmt = functionImplementation;
    }

    @Override
    public void exitSubprogram_body(VHDLParser.Subprogram_bodyContext ctx) {
        astOutputListenerCallback.functionImplementation(functionImplementation);
        functionImplementation = null;
    }

    @Override
    public void enterFunction_specification(VHDLParser.Function_specificationContext ctx) {
        final String functionName = ctx.designator().getText();
        functionSpecification = new FunctionSpecification();
        functionSpecification.name = functionName;
    }

    @Override
    public void exitFunction_specification(VHDLParser.Function_specificationContext ctx) {

        // return value
        if (lastIdentifier != null) {
            functionSpecification.returnType = lastIdentifier;
        }

        // when parsing an implementation, there is always a complete specification
        // before the statements. Connect the specification to the implementation.
        if (functionImplementation != null) {
            functionImplementation.functionSpecification = functionSpecification;
        }

        // send object to callback
        astOutputListenerCallback.functionSpecification(functionSpecification);

        // reset
        functionSpecification = null;
        actualParameter = null;
    }

    @Override
    public void enterInterface_constant_declaration(VHDLParser.Interface_constant_declarationContext ctx) {
        // mark start of this interface on the stack
        // mark start of this interface parameter declaration on the expression stack
        // so that it is possible to extract the initializer expression in a convenient
        // way
        stackPushDummyNode();
    }

    @Override
    public void exitInterface_constant_declaration(VHDLParser.Interface_constant_declarationContext ctx) {
        processInterfaceDeclaration(ctx.identifier_list(), ctx.subtype_indication());

        actualParameter = null;
    }

    private void processInterfaceDeclaration(Identifier_listContext identifier_listContext,
            Subtype_indicationContext subtype_indicationContext) {

        // despite the name, this is used when parsing function declarations
        // for every parameter this is entered in a function declaration

        actualParameter = new ActualParameter();

        // assumption: place all actual parameters into a function specification
        functionSpecification.actualParameters.add(actualParameter);

        //
        // parameter name
        //

        final String parameterName = identifier_listContext.getText();
        actualParameter.name = parameterName;

        //
        // PortDirection
        //

        // // the IN token can be null or it can be present.
        // // when it is present, this is the signal mode (IN, OUT, INOUT, BUFFER,
        // LINKAGE) when the signal mode is OUT, INPUT, BUFFER or LINKAGE a specific
        // Signal_mode node will be part of the parse tree! Just for IN, there will
        // not be a Signal_mode but there will be a IN token!

        // by default, set the portDirection to IN because this is the default for
        // formal parameters
        // If a specific mode node is present in the tree, override the default there
        if (portDirection == PortDirection.UNKNOWN) {
            portDirection = PortDirection.IN;
        }
        actualParameter.direction = portDirection;

        //
        // datatype
        //

        actualParameter.subtypeIndication = subtypeIndication;
        if (range != null) {
            actualParameter.range = range;
        }

        //
        // Initializer value/expression
        //

        // place initializer expression into the actual parameter
        ModelNode<?> node = null;
        if (!stack.empty()) {
            do {

                node = stackPop();

                if (!(node instanceof DummyNode)) {
                    actualParameter.expression = node;
                }

            } while (!(node instanceof DummyNode));
        }

        // reset for next iteration
        portDirection = PortDirection.UNKNOWN;
        range = null;
        subtypeIndication = null;
        lastIdentifier = null;
    }

    @Override
    public void enterInterface_variable_declaration(VHDLParser.Interface_variable_declarationContext ctx) {

    }

    @Override
    public void exitInterface_variable_declaration(VHDLParser.Interface_variable_declarationContext ctx) {
        processInterfaceDeclaration(ctx.identifier_list(), ctx.subtype_indication());
    }

    @Override
    public void enterSignal_mode(VHDLParser.Signal_modeContext ctx) {
        // System.out.println(ctx.getText());

        String directionAsString = ctx.getText();
        portDirection = PortDirection.fromString(directionAsString);

        if (actualParameter != null) {
            actualParameter.direction = portDirection;
        }
    }

    @Override
    public void exitSignal_mode(VHDLParser.Signal_modeContext ctx) {
    }

    @Override
    public void enterSubtype_indication(VHDLParser.Subtype_indicationContext ctx) {

    }

    @Override
    public void exitSubtype_indication(VHDLParser.Subtype_indicationContext ctx) {
        // System.out.println(ctx.getText());

        StringBuffer stringBuffer = new StringBuffer();
        for (Selected_nameContext selected_nameContext : ctx.selected_name()) {
            // System.out.println(selected_nameContext.getText());
            stringBuffer.append(selected_nameContext.getText());
        }

        subtypeIndication = stringBuffer.toString();
    }

    @Override
    public void enterExplicit_range(VHDLParser.Explicit_rangeContext ctx) {

    }

    @Override
    public void exitExplicit_range(VHDLParser.Explicit_rangeContext ctx) {

        // range 0 to CounterVal(Minutes => 1) + 1;

        // for case statements there are ranges that only have a single child!?!?!?!
        if (ctx.children.size() == 1) {
            return;
        }

        range = new Range();

        // in case statements there can be ranges without a direction
        DirectionContext directionContext = ctx.direction();
        if (directionContext != null) {
            range.rangeDirection = RangeDirection.fromString(directionContext.getText());
        }

        ModelNode<?> modelNode = null;
        modelNode = stackPop();
        if (modelNode.children.size() > 0) {

            if (modelNode.operator.equals("-")) {

                Object obj = modelNode.children.get(0).value;
                Integer val = (Integer) obj;

                // range.start = new ModelNode<Integer>();
                // ((ModelNode<Integer>) range.start).value = val.intValue() * -1;

                NumericLiteral numericLiteral = new NumericLiteral();
                numericLiteral.value = val.intValue() * -1;
                range.end = numericLiteral;
            }
        } else {
            range.end = modelNode;
        }

        modelNode = stackPop();
        if (modelNode.children.size() > 0) {

            if (modelNode.operator.equals("-")) {

                Object obj = modelNode.children.get(0).value;
                Integer val = (Integer) obj;

                // range.start = new ModelNode<Integer>();
                // ((ModelNode<Integer>) range.start).value = val.intValue() * -1;

                NumericLiteral numericLiteral = new NumericLiteral();
                numericLiteral.value = val.intValue() * -1;
                range.start = numericLiteral;
            }
        } else {
            range.start = modelNode;
        }
    }

    @Override
    public void enterRecord_type_definition(VHDLParser.Record_type_definitionContext ctx) {
        record = new Record();
        record.name = ctx.identifier().getText();
    }

    @Override
    public void exitRecord_type_definition(VHDLParser.Record_type_definitionContext ctx) {
        astOutputListenerCallback.record(record);
        record = null;
    }

    @Override
    public void enterElement_declaration(VHDLParser.Element_declarationContext ctx) {
        final String name = ctx.identifier_list().getText();

        final String subtype = ctx.element_subtype_definition().getText();

        RecordField recordField = new RecordField();
        record.children.add(recordField);

        recordField.identifier = name;
        recordField.type = subtype;
    }

    @Override
    public void exitElement_declaration(VHDLParser.Element_declarationContext ctx) {
    }

    @Override
    public void enterSignal_declaration(VHDLParser.Signal_declarationContext ctx) {

        for (ParseTree parseTree : ctx.identifier_list().children) {

            if (!(parseTree instanceof IdentifierContext)) {
                continue;
            }

            IdentifierContext identifierContext = (IdentifierContext) parseTree;

            String identifier = identifierContext.getText();

            String type = ctx.subtype_indication().getText();

            signal = new Signal();

            if (architecture != null) {
                architecture.signals.add(signal);
            }

            signal.name = identifier;
            signal.type = type;

        }
    }

    @Override
    public void exitSignal_declaration(VHDLParser.Signal_declarationContext ctx) {

        signal.range = range;
        astOutputListenerCallback.signal(signal);
        signal = null;
    }

    @Override
    public void enterArchitecture_body(VHDLParser.Architecture_bodyContext ctx) {

        String architectureName = null;
        String entityName = null;

        // System.out.println(ctx.getText());

        ParseTree child1 = ctx.getChild(0); // ARCHITECTURE (TOKEN)
        ParseTree child2 = ctx.getChild(1); // architecture identifier
        architectureName = child2.getText();

        ParseTree child3 = ctx.getChild(2); // OF (TOKEN)
        ParseTree child4 = ctx.getChild(3); // entitiy identifier
        entityName = child4.getText();

        ParseTree child5 = ctx.getChild(4); // IS (TOKEN)

        ParseTree child6 = ctx.getChild(5); // architecture_declarative_part
        // System.out.println(child6.getText());

        ParseTree child7 = ctx.getChild(6); // BEGIN (TOKEN)
        // System.out.println(child7.getText());

        ParseTree child8 = ctx.getChild(7); // inner source code inside the architecture
        // System.out.println(child8.getText());

        ParseTree child9 = ctx.getChild(8); // END (TOKEN)
        // System.out.println(child9.getText());
        ParseTree child10 = ctx.getChild(9); // architecture identifier (see child 2)
        // System.out.println(child10.getText());
        ParseTree child11 = ctx.getChild(10); // semicolon (TOKEN)
        // System.out.println(child11.getText());

        architecture = new Architecture();
        if (stmt != null) {
            stmt.children.add(architecture);
            architecture.parent = stmt;
        }
        stmt = architecture;

        architecture.architectureName = architectureName;
        architecture.entityName = entityName;
    }

    @Override
    public void exitArchitecture_body(VHDLParser.Architecture_bodyContext ctx) {

        astOutputListenerCallback.architecture(architecture);

        // Commenting out this line will leave the stmt alive for printing
        stmt = architecture.parent;
        architecture = null;
    }

    @Override
    public void enterEntity_declaration(VHDLParser.Entity_declarationContext ctx) {
        entity = new Entity();
        if (stmt != null) {
            stmt.children.add(entity);
            entity.parent = stmt;
        }
        stmt = entity;
        portTarget = entity;

        entity.name = ctx.identifier().get(0).getText();
    }

    @Override
    public void exitEntity_declaration(VHDLParser.Entity_declarationContext ctx) {

        astOutputListenerCallback.entity(entity);

        stmt = entity.parent;
        entity = null;
        portTarget = null;
    }

    @Override
    public void enterComponent_declaration(VHDLParser.Component_declarationContext ctx) {
        component = new Component();
        if (stmt != null) {
            stmt.children.add(component);
            component.parent = stmt;
        }
        stmt = component;
        portTarget = component;

        component.name = ctx.identifier().get(0).getText();
    }

    @Override
    public void exitComponent_declaration(VHDLParser.Component_declarationContext ctx) {
        stmt = component.parent;

        astOutputListenerCallback.component(component);

        component = null;
        portTarget = null;
    }

    @Override
    public void enterInterface_port_declaration(VHDLParser.Interface_port_declarationContext ctx) {

        String identifier = ctx.identifier_list().getChild(0).getText();

        String type = ctx.subtype_indication().getText();

        // port direction (in, out, inout)
        String mode = ctx.signal_mode().getText();

        Port port = new Port();
        portTarget.ports.add(port);

        port.name = identifier;
        port.type = type;
        port.portDirection = PortDirection.fromString(mode);
    }

    @Override
    public void enterSensitivity_list(VHDLParser.Sensitivity_listContext ctx) {
        sensitivityList = true;
    }

    @Override
    public void exitSensitivity_list(VHDLParser.Sensitivity_listContext ctx) {
        sensitivityList = false;
    }

    @Override
    public void enterAdding_operator(VHDLParser.Adding_operatorContext ctx) {
    }

    @Override
    public void exitAdding_operator(VHDLParser.Adding_operatorContext ctx) {

        Expr operatorModelNode = new Expr();

        switch (ctx.start.getType()) {

            case VHDLLexer.PLUS:
                operatorModelNode.value = "+";
                break;

            case VHDLLexer.MINUS:
                operatorModelNode.value = "-";
                break;
        }

        stackPush(operatorModelNode);
        // operatorStack.push(operatorModelNode);
    }

    @Override
    public void enterMultiplying_operator(VHDLParser.Multiplying_operatorContext ctx) {
    }

    @Override
    public void exitMultiplying_operator(VHDLParser.Multiplying_operatorContext ctx) {

        Expr operatorModelNode = new Expr();

        switch (ctx.start.getType()) {

            case VHDLLexer.MUL:
                operatorModelNode.value = "*";
                break;

            case VHDLLexer.DIV:
                operatorModelNode.value = "/";
                break;
        }

        stackPush(operatorModelNode);
    }

    @Override
    public void enterExpression(VHDLParser.ExpressionContext ctx) {

        // System.out.println(ctx.getText());

        // a dummy node is entered to mark the bottom of the stack where
        // the current expression stops. Without marking the end of the expression stack
        // it becomes excessively hard to visit expressions because the expression
        // element is used in so many contexts that it is not always clear how to
        // combine elements.
        stackPushDummyNode();
    }

    @Override
    public void exitExpression(VHDLParser.ExpressionContext ctx) {

        // System.out.println("ExitExpression " + ctx.hashCode());

        try {
            processExpression();
        } catch (Exception e) {

            // DEBUG for breakpoints
            System.out.println(ctx.getText());
            e.printStackTrace();

            throw e;
        }
    }

    @Override
    public void enterSimple_expression(VHDLParser.Simple_expressionContext ctx) {

        // a dummy node is entered to mark the bottom of the stack where
        // the current expression stops. Without marking the end of the expression stack
        // it becomes excessively hard to visit expressions because the expression
        // element is used in so many contexts that it is not always clear how to
        // combine elements.

        stackPushDummyNode();

        final String operand = ctx.getChild(0).getText();
        if (operand.equals("-")) {
            System.out.println("MInus");

            Expr operatorModelNode = new Expr();
            operatorModelNode.value = "-";

            stackPush(operatorModelNode);
        }
    }

    @Override
    public void exitSimple_expression(VHDLParser.Simple_expressionContext ctx) {
        try {
            processExpression();
        } catch (Exception e) {
            // DEBUG for breakpoints
            System.out.println(ctx.getText());
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void enterTerm(VHDLParser.TermContext ctx) {

        // a dummy node is entered to mark the bottom of the stack where
        // the current expression stops. Without marking the end of the expression stack
        // it becomes excessively hard to visit expressions because the expression
        // element is used in so many contexts that it is not always clear how to
        // combine elements.
        stackPushDummyNode();
    }

    @Override
    public void exitTerm(VHDLParser.TermContext ctx) {

        // // why is this here? This will be hit during case statements
        // if (ctx.children.size() == 1) {
        // return;
        // }

        processExpression();
    }

    @Override
    public void enterRelational_operator(VHDLParser.Relational_operatorContext ctx) {
    }

    @Override
    public void exitRelational_operator(VHDLParser.Relational_operatorContext ctx) {

        Expr operatorModelNode = new Expr();

        switch (ctx.start.getType()) {

            case VHDLLexer.EQ:
                TerminalNode eq = ctx.EQ();
                operatorModelNode.operator = eq.toString();
                break;

            case VHDLLexer.NEQ:
                TerminalNode neq = ctx.NEQ();
                operatorModelNode.operator = neq.toString();
                break;

            case VHDLLexer.GE:
                TerminalNode ge = ctx.GE();
                operatorModelNode.operator = ge.toString();
                break;

            case VHDLLexer.GREATERTHAN:
                TerminalNode gt = ctx.GREATERTHAN();
                operatorModelNode.operator = gt.toString();
                break;

            case VHDLLexer.LE:
                TerminalNode le = ctx.LE();
                operatorModelNode.operator = le.toString();
                break;

            case VHDLLexer.LOWERTHAN:
                TerminalNode lt = ctx.LOWERTHAN();
                operatorModelNode.operator = lt.toString();
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }

        stackPush(operatorModelNode);
    }

    @Override
    public void exitRelation(VHDLParser.RelationContext ctx) {

        // System.out.println("exit relation " + ctx);

        int operatorCount = ctx.children.size() / 2;

        if (operatorCount == 0) {

            // Do nothing, let exitExpression take care of this case

        } else {

            ModelNode<?> rhs = stackPop();
            ModelNode<String> operator = (ModelNode<String>) stackPop();
            ModelNode<?> lhs = stackPop();

            Relation localExpr = new Relation();
            stackPush(localExpr);

            localExpr.operator = operator.operator;
            localExpr.name = operator.operator;
            localExpr.value = operator.operator;

            lhs.parent = localExpr;
            rhs.parent = localExpr;
            localExpr.children.add(lhs);
            localExpr.children.add(rhs);
        }
    }

    @Override
    public void exitLogical_operator(VHDLParser.Logical_operatorContext ctx) {

        Expr operatorModelNode = new Expr();
        switch (ctx.start.getType()) {

            case VHDLLexer.AND:
                operatorModelNode.value = ctx.AND().toString();
                break;

            case VHDLParser.OR:
                operatorModelNode.value = ctx.OR().toString();
                break;

            case VHDLParser.NAND:
                operatorModelNode.value = ctx.NAND().toString();
                break;

            case VHDLParser.NOR:
                operatorModelNode.value = ctx.NOR().toString();
                break;

            case VHDLParser.XOR:
                operatorModelNode.value = ctx.XOR().toString();
                break;

            case VHDLParser.XNOR:
                operatorModelNode.value = ctx.XNOR().toString();
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }

        stackPush(operatorModelNode);
    }

    @Override
    public void exitIdentifier(VHDLParser.IdentifierContext ctx) {
        lastIdentifier = ctx.getText();
        if ((stmt != null) && (stmt instanceof Process) && sensitivityList) {

            ModelNode<String> signal = new ModelNode<>();
            signal.name = ctx.getText();
            lastProcess.sensitivityList.add(signal);
        }
    }

    @Override
    public void exitPrimary(VHDLParser.PrimaryContext ctx) {

        // System.out.println("exitPrimary: \"" + ctx.getText() + "\"");

        switch (ctx.start.getType()) {

            case VHDLParser.CHARACTER_LITERAL:
                // System.out.println("CHARACTER_LITERAL: \"" + ctx.getText() + "\"");
                CharacterLiteral characterLiteral = new CharacterLiteral();
                // characterLiteral.value = Integer.parseInt(ctx.getText().substring(1,
                // ctx.getText().length() - 1));
                characterLiteral.value = ctx.getText().substring(1, ctx.getText().length() - 1);
                stackPush(characterLiteral);
                break;

            case VHDLParser.NULL_:
                // System.out.println("NULL_: \"" + ctx.NULL_() + "\"");
                break;

            case VHDLParser.BIT_STRING_LITERAL:
                // System.out.println("BIT_STRING_LITERAL: \"" + ctx.BIT_STRING_LITERAL() +
                // "\"");
                break;

            case VHDLParser.STRING_LITERAL:
                // System.out.println("STRING_LITERAL: \"" + ctx.STRING_LITERAL() + "\"");
                StringLiteral stringLiteral = new StringLiteral();
                stringLiteral.value = ctx.getText();
                stackPush(stringLiteral);
                break;

            case VHDLParser.BASIC_IDENTIFIER:
                // System.out.println("BASIC_IDENTIFIER: \"" + ctx + "\"");
                StringLiteral basicStringLiteral = new StringLiteral();
                basicStringLiteral.value = ctx.getText();

                // A function call is wrapped inside a primary.
                // If there currently is a function call processed, do not add the
                // BASIC_IDENTIFIER for that function call!
                if (!functionCall) {
                    stackPush(basicStringLiteral);
                } else {
                    functionCall = false;
                }
                break;

            case VHDLParser.INTEGER:

                NumericLiteral numericLiteral = new NumericLiteral();

                // if (containsUnit(valueAsString)) {
                if (physicalUnitValue != null) {

                    // throw new RuntimeException("Look for the unit in the 'units' property. If it
                    // does not exist throw exception, else insert it into the NumericLiteral");

                    numericLiteral.physicalUnit = physicalUnitValue.physicalUnit;
                    numericLiteral.value = physicalUnitValue.value;

                    physicalUnitValue = null;

                } else {

                    String valueAsString = ctx.getText();
                    int value = Integer.parseInt(valueAsString);
                    numericLiteral.value = value;

                }

                stackPush(numericLiteral);
                break;

            case VHDLParser.LPAREN:
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }
    }

    private boolean containsUnit(final String unit) {

        if (units.isEmpty()) {
            return false;
        }

        for (Map.Entry<String, PhysicalUnit> physicalUnitEntry : units.entrySet()) {

            final String physicalUnitName = physicalUnitEntry.getKey();
            final PhysicalUnit physicalUnit = physicalUnitEntry.getValue();

            if (physicalUnit.subPhysicalUnits.containsKey(unit)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void exitTarget(VHDLParser.TargetContext ctx) {

        // System.out.println("exitTarget: \"" + ctx.getText() + "\"");

        switch (ctx.start.getType()) {

            case VHDLParser.CHARACTER_LITERAL:
                // System.out.println("CHARACTER_LITERAL: \"" + ctx.getText() + "\"");

                CharacterLiteral characterLiteral = new CharacterLiteral();
                // characterLiteral.value = Integer.parseInt(ctx.getText().substring(1,
                // ctx.getText().length() - 1));
                characterLiteral.value = ctx.getText().substring(1, ctx.getText().length() - 1);
                stackPush(characterLiteral);
                break;

            case VHDLParser.NULL_:
                // System.out.println("NULL_: \"" + ctx.NULL_() + "\"");
                break;

            case VHDLParser.BIT_STRING_LITERAL:
                // System.out.println("BIT_STRING_LITERAL: \"" + ctx.BIT_STRING_LITERAL() +
                // "\"");
                break;

            case VHDLParser.STRING_LITERAL:
                // System.out.println("STRING_LITERAL: \"" + ctx.STRING_LITERAL() + "\"");
                StringLiteral stringLiteral = new StringLiteral();
                stringLiteral.value = ctx.getText();
                stackPush(stringLiteral);
                break;

            case VHDLParser.BASIC_IDENTIFIER:
                // System.out.println("BASIC_IDENTIFIER: \"" + ctx + "\"");
                StringLiteral basicStringLiteral = new StringLiteral();
                basicStringLiteral.value = ctx.getText();
                stackPush(basicStringLiteral);
                break;

            case VHDLParser.LPAREN:
                break;

            default:
                throw new RuntimeException("Unknown type: " + ctx.start.getType());
        }
    }

    @Override
    public void enterCondition(VHDLParser.ConditionContext ctx) {

        if (stmt instanceof IfStmtBranch) {
            stmt = (Stmt) stmt.parent;
        }

        if (stmt instanceof IfStmt) {

            IfStmt ifStmt = (IfStmt) stmt;

            IfStmtBranch ifStmtBranch = new IfStmtBranch();
            ifStmt.branches.add(ifStmtBranch);
            ifStmtBranch.parent = ifStmt;

            stmt = ifStmtBranch;

            ifStmtBranch.exprRoot = new ModelNode<String>("exprRoot");
        }
    }

    @Override
    public void exitCondition(VHDLParser.ConditionContext ctx) {

        IfStmtBranch ifStmtBranch = (IfStmtBranch) stmt;

        expr = null;

        ModelNode<?> localExpr = stackPop();
        ifStmtBranch.exprRoot.children.add(localExpr);
    }

    @Override
    public void enterIf_statement(VHDLParser.If_statementContext ctx) {

        IfStmt ifStmt = new IfStmt();
        if (stmt != null) {
            stmt.children.add(ifStmt);
            ifStmt.parent = stmt;
        }
        stmt = ifStmt;
    }

    @Override
    public void exitIf_statement(VHDLParser.If_statementContext ctx) {

        // reset on exit
        expr = null;

        // DEBUG
        // stack.clear();

        astOutputListenerCallback.ifStmt(stmt);

        // stmt = stmt.parent == null ? stmt : stmt.parent;
        stmt = stmt.parent;
    }

    @Override
    public void enterSequential_statement(VHDLParser.Sequential_statementContext ctx) {
    }

    @Override
    public void exitSequential_statement(VHDLParser.Sequential_statementContext ctx) {

    }

    @Override
    public void enterSequence_of_statements(VHDLParser.Sequence_of_statementsContext ctx) {
    }

    @Override
    public void exitSequence_of_statements(VHDLParser.Sequence_of_statementsContext ctx) {

        if (stmt instanceof IfStmtBranch) {
            stmt = stmt.parent;
        }
    }

    @Override
    public void enterCase_statement(VHDLParser.Case_statementContext ctx) {

        CaseStmt caseStmt = new CaseStmt();
        if (stmt != null) {
            stmt.children.add(caseStmt);
            caseStmt.parent = stmt;
        }
        stmt = caseStmt;
    }

    @Override
    public void exitCase_statement(VHDLParser.Case_statementContext ctx) {

        // write the discriminator into the case-statement
        stmt.value = stackPop();

        // reset on exit
        expr = null;

        // DEBUG
        // stack.clear();

        astOutputListenerCallback.caseStmt(stmt);

        // stmt = stmt.parent == null ? stmt : stmt.parent;
        stmt = stmt.parent;
    }

    @Override
    public void enterSimultaneous_case_statement(VHDLParser.Simultaneous_case_statementContext ctx) {

        CaseStmt caseStmt = new CaseStmt();
        if (stmt != null) {
            stmt.children.add(caseStmt);
            caseStmt.parent = stmt;
        }
        stmt = caseStmt;
    }

    @Override
    public void exitSimultaneous_case_statement(VHDLParser.Simultaneous_case_statementContext ctx) {

        // write the discriminator into the case-statement
        stmt.value = stackPop();

        // reset on exit
        expr = null;

        // DEBUG
        // stack.clear();

        stmt = stmt.parent == null ? stmt : stmt.parent;
    }

    @Override
    public void enterChoice(VHDLParser.ChoiceContext ctx) {
    }

    @Override
    public void exitChoice(VHDLParser.ChoiceContext ctx) {

        // only if this is not the others case, retrieve the expression from the stack
        // The others case has no expression! It is like the else branch of an
        // if-statement which also has no expression
        if (!case_statement_alternative_others) {
            stmt.value = stackPop().value;
        }

        case_statement_alternative_others = false;
    }

    @Override
    public void enterCase_statement_alternative(VHDLParser.Case_statement_alternativeContext ctx) {

        CaseStmtBranch caseStmtBranch = new CaseStmtBranch();
        caseStmtBranch.parent = stmt;
        stmt.children.add(caseStmtBranch);
        stmt = caseStmtBranch;
    }

    @Override
    public void exitCase_statement_alternative(VHDLParser.Case_statement_alternativeContext ctx) {
        // stmt = stmt.parent == null ? stmt : stmt.parent;
        stmt = stmt.parent;
    }

    @Override
    public void enterFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx) {

        // Special case: an entity declaration contains the architecture to use inside
        // brackets that
        // Look like a function call. The grammar parse tree actually contains a
        // function call when
        // an entity is declared! The grammar is not very nice in that regard. It should
        // not use a
        // function call where there is none! Therefore, disable the function call
        // handling when there is
        // no function call!
        if (componentInstantiationStatement != null) {
            return;
        }

        FunctionCall localFunctionCall = new FunctionCall();
        localFunctionCall.name = lastIdentifier;

        lastFunctionCall = localFunctionCall;

        stackPush(localFunctionCall);
    }

    @Override
    public void exitFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx) {
        lastFunctionCall = null;
        functionCall = true;

        // stackPop();
    }

    @Override
    public void exitActual_part(VHDLParser.Actual_partContext ctx) {
        // System.out.println("Actual Parameter: \"" + ctx + "\"");

        if (lastFunctionCall != null) {
            // if (lastFunctionCall != null && actualParameter != null) {

            // this code was tested with and written for a function call with several actual
            // parameters

            FunctionCallActualParameter localActualParameter = new FunctionCallActualParameter();
            localActualParameter.name = lastIdentifier;
            localActualParameter.value = lastIdentifier;

            // take the value from the stack so that it is not falsely processed by the
            // expression handler
            stackPop();
            lastFunctionCall.children.add(localActualParameter);

            actualParameter = null;

        }
    }

    @Override
    public void enterProcess_statement(VHDLParser.Process_statementContext ctx) {

        Process process = new Process();
        IdentifierContext identifierContext = ctx.identifier();
        if (identifierContext != null) {
            process.name = ctx.identifier().getText();
        }

        lastProcess = process;

        if (stmt != null) {
            stmt.children.add(process);
            process.parent = stmt;
        }
        stmt = process;
    }

    @Override
    public void exitProcess_statement(VHDLParser.Process_statementContext ctx) {

        astOutputListenerCallback.process(stmt);

        stmt = stmt.parent;
    }

    @Override
    public void exitSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx) {
        processAssignmentStatement(AssignmentType.SIGNAL);
    }

    @Override
    public void enterConcurrent_signal_assignment_statement(
            VHDLParser.Concurrent_signal_assignment_statementContext ctx) {
    }

    @Override
    public void exitConcurrent_signal_assignment_statement(
            VHDLParser.Concurrent_signal_assignment_statementContext ctx) {
        processAssignmentStatement(AssignmentType.SIGNAL);
    }

    @Override
    public void enterVariable_assignment_statement(VHDLParser.Variable_assignment_statementContext ctx) {
    }

    @Override
    public void exitVariable_assignment_statement(VHDLParser.Variable_assignment_statementContext ctx) {
        processAssignmentStatement(AssignmentType.VARIABLE);
    }

    private void processAssignmentStatement(AssignmentType assignmentType) {

        AssignmentStmt assignmentStmt = new AssignmentStmt();
        assignmentStmt.assignmentType = assignmentType;

        ModelNode<?> rhs = stackPop();
        assignmentStmt.lhs = stackPop();
        assignmentStmt.rhs = rhs;

        switch (assignmentType) {

            case SIGNAL:
                this.astOutputListenerCallback.signalAssignment(assignmentStmt);
                break;

            case VARIABLE:
                this.astOutputListenerCallback.variableAssignment(assignmentStmt);
                break;

            default:
                throw new RuntimeException("Unkonwn option");
        }

        if (stmt != null) {
            stmt.children.add(assignmentStmt);
        } else {
            stmt = assignmentStmt;
        }
    }

    @Override
    public void enterSelected_signal_assignment(VHDLParser.Selected_signal_assignmentContext ctx) {
        throw new RuntimeException();
    }

    @Override
    public void exitSelected_signal_assignment(VHDLParser.Selected_signal_assignmentContext ctx) {
        throw new RuntimeException();
    }

    private void processExpression() {

        // erase all dummy nodes that are not located below a real value
        // These entries come about since the architecture selector of an entity
        // instantiation
        // (<ARCHITECTURE>) looks like the parameter part of a function and has been
        // handled
        // as such in the grammar. This makes the entire grammar complicated
        while ((!stack.empty()) && stack.peek() instanceof DummyNode) {
            stackPop();
        }
        if (stack.empty()) {
            return;
        }

        boolean done = false;
        while (!done) {

            // assumption: this contains the right hand side operand of an operator
            ModelNode<?> rhs = stackPop();

            // if (stack.peek() instanceof DummyNode) {
            if ((!stack.empty()) && stack.peek() instanceof DummyNode) {

                // remove dummy node
                stackPop();

                // done = true;
                stackPush(rhs);

                // continue;

                // abort evaluation
                break;
            }

            if (stack.isEmpty()) {
                stackPush(rhs);
                break;
            }

            // assumption: this contains the operator
            ModelNode<String> operator = (ModelNode<String>) stackPop();

            // assumption: this contains the left hand side operand of an operator
            ModelNode<?> lhs = stackPop();

            if (lhs instanceof DummyNode) {

                // operator with a single operand (unary operator)

                Expr localExpr = new Expr();
                stackPush(localExpr);

                localExpr.operator = operator.value;

                // if (operator.value.equalsIgnoreCase("-")) {
                // //localExpr.value = lhs.value * -1;

                // }

                localExpr.children.add(rhs);

                expr = localExpr;

            } else {

                // operator with two operands (binary operator)

                Expr localExpr = new Expr();
                stackPush(localExpr);

                localExpr.operator = operator.value;

                lhs.parent = localExpr;
                rhs.parent = localExpr;
                localExpr.children.add(lhs);
                localExpr.children.add(rhs);

                expr = localExpr;

            }

        }

        if (expr != null) {
            astOutputListenerCallback.expression(expr);
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {

        if (node.getText().toLowerCase().equals("else")) {

            if (stmt instanceof IfStmtBranch) {
                stmt = (Stmt) stmt.parent;
            }

            if (stmt instanceof IfStmt) {

                IfStmt ifStmt = (IfStmt) stmt;

                IfStmtBranch ifStmtBranch = new IfStmtBranch();
                ifStmt.branches.add(ifStmtBranch);
                ifStmtBranch.parent = ifStmt;

                stmt = ifStmtBranch;

                ifStmtBranch.exprRoot = new ModelNode("exprRoot");
                expr = ifStmtBranch.exprRoot;

                // the else branch has a condition of type true so it is always taken
                expr.children.add(Expr.TRUE);
            }

        } else if (node.getText().toLowerCase().equals("others")) {

            case_statement_alternative_others = true;

        }
    }

    private void stackPush(ModelNode<?> node) {
        // System.out.println("Push: " + node.name + " " + node.value);
        stack.push(node);

        outputStack();
    }

    private void stackPushDummyNode() {
        // if ((!stack.empty()) && (stack.peek() instanceof DummyNode)) {
        // return;
        // }
        stack.push(new DummyNode());

        outputStack();
    }

    private ModelNode<?> stackPop() {
        // System.out.println("Pop");

        if (stack.empty()) {
            System.out.println("Stack Is Empty");
        }

        try {

            ModelNode<?> modelNode = stack.pop();
            outputStack();
            return modelNode;
        } catch (java.util.EmptyStackException e) {

            // DEBUG allow the developer to set a breakpoint
            e.printStackTrace();
            throw e;
        }
    }

    private void outputStack() {

        if (true) {
            return;
        }

        System.out.println("STACK -----------------------------------------");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i).toString());
        }
        System.out.println("STACK -----------------------------------------");

    }
}
