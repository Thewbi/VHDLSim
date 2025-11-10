package de.vhdlsim;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.vhdl.grammar.VHDLParser;
import de.vhdl.grammar.VHDLParser.Enumeration_literalContext;
import de.vhdl.grammar.VHDLParser.IdentifierContext;
import de.vhdl.grammar.VHDLParser.Identifier_listContext;
import de.vhdl.grammar.VHDLParser.Instantiated_unitContext;
import de.vhdl.grammar.VHDLParser.Label_colonContext;
import de.vhdl.grammar.VHDLParser.NameContext;
import de.vhdl.grammar.VHDLParserBaseListener;
import de.vhdlmodel.Aggregate;
import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.AssignmentType;
import de.vhdlmodel.AssociationElement;
import de.vhdlmodel.CaseStmt;
import de.vhdlmodel.CaseStmtBranch;
import de.vhdlmodel.ComponentInstantiationStatement;
import de.vhdlmodel.ConditionalWaveforms;
import de.vhdlmodel.ConstantDeclaration;
import de.vhdlmodel.Entity;
import de.vhdlmodel.Expr;
import de.vhdlmodel.FunctionCall;
import de.vhdlmodel.GenerateStmt;
import de.vhdlmodel.GenericClause;
import de.vhdlmodel.Identifier;
import de.vhdlmodel.IfStmt;
import de.vhdlmodel.IfStmtBranch;
import de.vhdlmodel.InterfaceConstant;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.Name;
import de.vhdlmodel.PhysicalUnit;
import de.vhdlmodel.Port;
import de.vhdlmodel.PortDirection;
import de.vhdlmodel.PortTarget;
import de.vhdlmodel.Range;
import de.vhdlmodel.RangeDirection;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.Subprogram;
import de.vhdlmodel.SubprogramSpecification;
import de.vhdlmodel.SubprogramType;
import de.vhdlmodel.SubtypeIndication;
import de.vhdlmodel.TypeDeclaration;
import de.vhdlmodel.TypeDeclarationType;
import de.vhdlmodel.Process;

public class ASTOutputListener extends VHDLParserBaseListener {

    public ASTOutputListenerCallback astOutputListenerCallback;

    public Map<String, PhysicalUnit> units = null;

    public ModelNode<?> stmt;

    private String lastTerminal;

    //
    // Entity (Declaration and Architecture)
    //

    private Entity entity;

    private PortTarget portTarget;

    //
    // Signal
    //

    // private Signal signal;

    //
    // Range
    //

    // private Range range;

    //
    // Type Declaration
    //

    @Override
    public void enterType_declaration(VHDLParser.Type_declarationContext ctx) {

        TypeDeclaration typeDeclaration = new TypeDeclaration();
        typeDeclaration.name = ctx.identifier().getText();
        typeDeclaration.physicalUnit.name = ctx.identifier().getText();

        connectParentAndChild(typeDeclaration);
        descend(typeDeclaration);
    }

    @Override
    public void exitType_declaration(VHDLParser.Type_declarationContext ctx) {

        TypeDeclaration typeDeclaration = (TypeDeclaration) stmt;

        // typeDeclaration.range = range;

        astOutputListenerCallback.typeDeclaration(typeDeclaration);

        ascend();
    }

    @Override 
    public void enterConstant_declaration(VHDLParser.Constant_declarationContext ctx) {

        ConstantDeclaration constantDeclaration = new ConstantDeclaration();

        connectParentAndChild(constantDeclaration);
        descend(constantDeclaration);
    }
	
	@Override 
    public void exitConstant_declaration(VHDLParser.Constant_declarationContext ctx) {

        ConstantDeclaration constantDeclaration = (ConstantDeclaration) stmt;

        constantDeclaration.name = constantDeclaration.children.get(0).toString(0);
        constantDeclaration.type = (SubtypeIndication) constantDeclaration.children.get(1);

        constantDeclaration.children.remove(0);
        constantDeclaration.children.remove(0);

        astOutputListenerCallback.constantDeclaration(constantDeclaration);

        ascend();
    }

    @Override 
    public void enterAggregate(VHDLParser.AggregateContext ctx) { 

        Aggregate aggregate = new Aggregate();

        connectParentAndChild(aggregate);
        descend(aggregate);
    }
	
	@Override 
    public void exitAggregate(VHDLParser.AggregateContext ctx) { 
        ascend();
    }

    @Override
    public void enterEnumeration_type_definition(VHDLParser.Enumeration_type_definitionContext ctx) {

        TypeDeclaration typeDeclaration = (TypeDeclaration) stmt;
        typeDeclaration.typeDeclarationType = TypeDeclarationType.ENUM;

        for (Enumeration_literalContext enumeration_literalContext : ctx.enumeration_literal()) {

            typeDeclaration.enumValues.add(enumeration_literalContext.getText());
        }

        astOutputListenerCallback.enumDataTypeDeclaration(typeDeclaration);
        // typeDeclaration = null;
    }

    @Override
    public void exitEnumeration_type_definition(VHDLParser.Enumeration_type_definitionContext ctx) {
    }

    @Override 
    public void enterConstrained_array_definition(VHDLParser.Constrained_array_definitionContext ctx) { 
        
        TypeDeclaration typeDeclaration = new TypeDeclaration();
        // typeDeclaration.name = ctx.identifier().getText();
        // typeDeclaration.physicalUnit.name = ctx.identifier().getText();

        connectParentAndChild(typeDeclaration);
        descend(typeDeclaration);
    }
	
    @Override 
    public void exitConstrained_array_definition(VHDLParser.Constrained_array_definitionContext ctx) {
        TypeDeclaration typeDeclaration = new TypeDeclaration();
        
        astOutputListenerCallback.typeDeclaration(typeDeclaration);

        ascend();
     }
	
    //
    // Assignment
    //

    @Override
    public void enterSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx) {

        // System.out.println(ctx.getText());

        AssignmentStmt assignmentStmt = new AssignmentStmt();
        assignmentStmt.assignmentType = AssignmentType.SIGNAL;

        // // lhs
        // ModelNode<String> lhsModelNode = new ModelNode<>();
        // lhsModelNode.name = ctx.getChild(0).getText();
        // assignmentStmt.lhs = lhsModelNode;

        connectParentAndChild(assignmentStmt);
        descend(assignmentStmt);
    }

    @Override
    public void exitSignal_assignment_statement(VHDLParser.Signal_assignment_statementContext ctx) {

        // System.out.println(ctx.getText());

        AssignmentStmt assignmentStmt = (AssignmentStmt) stmt;

        // lhs
        ModelNode<String> lhsModelNode = new ModelNode<>();
        lhsModelNode.name = ctx.getChild(0).getText();
        assignmentStmt.lhs = lhsModelNode;

        // rhs
        assignmentStmt.rhs = assignmentStmt.children.get(1);

        assignmentStmt.children.clear();

        // emit
        astOutputListenerCallback.signalAssignment(assignmentStmt);

        ascend();
    }

    @Override
    public void enterConditional_signal_assignment(VHDLParser.Conditional_signal_assignmentContext ctx) {

        AssignmentStmt assignmentStmt = new AssignmentStmt();
        assignmentStmt.assignmentType = AssignmentType.SIGNAL;

        // lhs
        ModelNode<String> lhsModelNode = new ModelNode<>();
        lhsModelNode.name = ctx.getChild(0).getText();
        assignmentStmt.lhs = lhsModelNode;

        connectParentAndChild(assignmentStmt);
        descend(assignmentStmt);
    }

    @Override
    public void exitConditional_signal_assignment(VHDLParser.Conditional_signal_assignmentContext ctx) {

        AssignmentStmt assignmentStmt = (AssignmentStmt) stmt;
        assignmentStmt.rhs = assignmentStmt.children.get(1);
        // assignmentStmt.children.remove(0);
        assignmentStmt.children.clear();

        // cannot clear because the assignment might contain conditional_waveform
        // children from a Conditional Signal Assignment (when / else)
        // https://www.sigasi.com/tech/signal-assignments-vhdl-withselect-whenelse-and-case/
        // assignmentStmt.children.clear();

        // emit
        astOutputListenerCallback.signalAssignment(assignmentStmt);

        ascend();
    }

    @Override
    public void enterConditional_waveforms(VHDLParser.Conditional_waveformsContext ctx) {

        // System.out.println(ctx.getClass().getName() + ": \"" + ctx.getText() + "\"");

        // if (ctx.children.size() > 1) {

        ConditionalWaveforms conditionalWaveforms = new ConditionalWaveforms();

        connectParentAndChild(conditionalWaveforms);
        descend(conditionalWaveforms);
        // }
    }

    @Override
    public void exitConditional_waveforms(VHDLParser.Conditional_waveformsContext ctx) {
        // if (ctx.children.size() > 1) {
        ascend();
        // }
    }

    //
    // Signal Declaration
    //

    @Override
    public void enterSignal_declaration(VHDLParser.Signal_declarationContext ctx) {

        Signal signal = new Signal();

        connectParentAndChild(signal);
        descend(signal);

        for (ParseTree parseTree : ctx.identifier_list().children) {

            if (!(parseTree instanceof IdentifierContext)) {
                continue;
            }

            IdentifierContext identifierContext = (IdentifierContext) parseTree;
            String identifier = identifierContext.getText();
            signal.name = identifier;

            // String type = ctx.subtype_indication().getText();
            // signal.type = type;

            // signal = new Signal();
            // if (architecture != null) {
            // architecture.signals.add(signal);
            // }
        }
    }

    @Override
    public void exitSignal_declaration(VHDLParser.Signal_declarationContext ctx) {

        Signal signal = (Signal) stmt;

        for (ModelNode<?> child : signal.children) {
            if (child instanceof Identifier) {
                signal.identifierList.add((Identifier) child);
            } else if (child instanceof SubtypeIndication) {
                signal.type = (SubtypeIndication) child;
            }
        }
        // signal.identifier = (Identifier) signal.children.get(0);
        // signal.type = (SubtypeIndication) signal.children.get(1);
        signal.children.clear();

        // emit
        astOutputListenerCallback.signal(signal);

        ascend();
    }

    //
    // Range
    //

    @Override
    public void enterExplicit_range(VHDLParser.Explicit_rangeContext ctx) {

        // if (stmt instanceof Range) {
        //     return;
        // }

        Range range = new Range();

        connectParentAndChild(range);
        descend(range);
    }

    @Override
    public void exitExplicit_range(VHDLParser.Explicit_rangeContext ctx) {

        // if (stmt instanceof Range) {
        //     return;
        // }

        Range range = (Range) stmt;

        range.start = range.children.get(0);

        if (range.children.size() > 1) {
            range.end = range.children.get(1);
        }

        // emit
        astOutputListenerCallback.range(range);

        ascend();
    }

    @Override 
    public void enterDiscrete_range(VHDLParser.Discrete_rangeContext ctx) {

        if (ctx.children.size() == 1) {
            return;
        }

        Range range = new Range();

        connectParentAndChild(range);
        descend(range);
    }
	
    @Override 
    public void exitDiscrete_range(VHDLParser.Discrete_rangeContext ctx) {

        if (ctx.children.size() == 1) {
            return;
        }

        Range range = (Range) stmt;

        range.start = range.children.get(0);

        if (range.children.size() > 1) {
            range.end = range.children.get(1);
        }

        // emit
        astOutputListenerCallback.range(range);

        ascend();
    }

    @Override
    public void enterDirection(VHDLParser.DirectionContext ctx) {

        Range range = (Range) stmt;
        range.rangeDirection = RangeDirection.fromString(ctx.getText());
    }

    @Override
    public void exitDirection(VHDLParser.DirectionContext ctx) {
    }

    //
    // Name (e.g. CounterVal(Minutes => 1))
    //

    @Override
    public void enterName(VHDLParser.NameContext ctx) {

        Name name = new Name();
        // name.name = ctx.identifier().getText();

        connectParentAndChild(name);
        descend(name);
    }

    @Override
    public void exitName(VHDLParser.NameContext ctx) {

        // System.out.println(ctx.getText());

        Name name = (Name) stmt;

        // emit
        astOutputListenerCallback.name(name);

        // System.out.println(name.toString(0));

        ascend();
    }

    @Override
    public void enterFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx) {

        // System.out.println(ctx.getClass().getName() + ": \"" + ctx.getText() + "\"");

        FunctionCall functionCall = new FunctionCall();

        connectParentAndChild(functionCall);
        descend(functionCall);
    }

    @Override
    public void exitFunction_call_or_indexed_name_part(VHDLParser.Function_call_or_indexed_name_partContext ctx) {

        // System.out.println(ctx.getClass().getName() + ": \"" + ctx.getText() + "\"");

        FunctionCall functionCall = (FunctionCall) stmt;
        functionCall.name = functionCall.parent.name;

        // emit
        astOutputListenerCallback.functionCall(functionCall);

        ascend();
    }

    @Override
    public void enterAssociation_element(VHDLParser.Association_elementContext ctx) {

        AssociationElement associationElement = new AssociationElement();
        // associationElement.name = ctx.getChild(0).getText();

        connectParentAndChild(associationElement);
        descend(associationElement);
    }

    @Override
    public void exitAssociation_element(VHDLParser.Association_elementContext ctx) {

        // System.out.println(ctx.getText());

        AssociationElement associationElement = (AssociationElement) stmt;

        for (ModelNode<?> child : stmt.children) {

            if (child instanceof Identifier) {
                associationElement.identifiers.add((Identifier) child);
            } else if (child instanceof Name) {
                associationElement.nameModelNode = (Name) child;
            } else if (child instanceof Expr) {
                associationElement.expr = (Expr) child;
            } else {
                throw new RuntimeException("Unknown type: " + child.getClass());
            }
        }

        stmt.children.clear();

        ascend();
    }

    @Override
    public void enterSubtype_indication(VHDLParser.Subtype_indicationContext ctx) {

        SubtypeIndication subtypeIndication = new SubtypeIndication();
        subtypeIndication.name = ctx.getChild(0).getText();

        connectParentAndChild(subtypeIndication);
        descend(subtypeIndication);
    }

    @Override
    public void exitSubtype_indication(VHDLParser.Subtype_indicationContext ctx) {
        // stmt.children.clear();
        ascend();
    }

    //
    // If Statement
    //

    @Override
    public void enterIf_statement(VHDLParser.If_statementContext ctx) {

        IfStmt ifStmt = new IfStmt();

        connectParentAndChild(ifStmt);
        descend(ifStmt);
    }

    @Override
    public void exitIf_statement(VHDLParser.If_statementContext ctx) {

        IfStmt ifStmt = (IfStmt) stmt;

        // emit
        astOutputListenerCallback.ifStmt(ifStmt);

        ascend();
    }

    //
    // Case Statement
    //

    @Override
    public void enterCase_statement(VHDLParser.Case_statementContext ctx) {

        CaseStmt caseStmt = new CaseStmt();

        // caseStmt.addChoice(ctx.expression().getText());

        connectParentAndChild(caseStmt);
        descend(caseStmt);
    }

    @Override
    public void exitCase_statement(VHDLParser.Case_statementContext ctx) {

        // // write the discriminator into the case-statement
        // stmt.value = stackPop();

        // // reset on exit
        // expr = null;

        CaseStmt caseStmt = (CaseStmt) stmt;

        caseStmt.addChoice(caseStmt.children.get(0));
        caseStmt.children.remove(0);

        astOutputListenerCallback.caseStmt((CaseStmt) stmt);

        ascend();
    }

    @Override
    public void enterCase_statement_alternative(VHDLParser.Case_statement_alternativeContext ctx) {

        CaseStmtBranch caseStmtBranch = new CaseStmtBranch();

        connectParentAndChild(caseStmtBranch);
        descend(caseStmtBranch);
    }

    @Override
    public void exitCase_statement_alternative(VHDLParser.Case_statement_alternativeContext ctx) {

        CaseStmtBranch caseStmtBranch = (CaseStmtBranch) stmt;

        if ((caseStmtBranch.children != null) && (caseStmtBranch.children.size() > 0)) {
            caseStmtBranch.value = caseStmtBranch.children.get(0);
            caseStmtBranch.children.remove(0);
        } else {
            // In the case of "when others => NULL;", there are no children in the when branch!
            System.out.println(ctx.getText());
        }

        ascend();
    }

    //
    // Subprogram (Function and Procedure)
    //

    @Override 
    public void enterSubprogram_body(VHDLParser.Subprogram_bodyContext ctx) {

        Subprogram subProgram = new Subprogram();

        connectParentAndChild(subProgram);
        descend(subProgram);
    }
	
    @Override 
    public void exitSubprogram_body(VHDLParser.Subprogram_bodyContext ctx) {

        Subprogram subprogram = (Subprogram) stmt;
        subprogram.subprogramSpecification = (SubprogramSpecification) subprogram.children.get(0);
        subprogram.children.remove(0);

        // last child is the function name again
        int size = subprogram.children.size();
        subprogram.children.remove(size - 1);

        astOutputListenerCallback.subprogram(subprogram);

        ascend();
    }

    @Override 
    public void enterSubprogram_specification(VHDLParser.Subprogram_specificationContext ctx) { 
        
    }
	
    @Override 
    public void exitSubprogram_specification(VHDLParser.Subprogram_specificationContext ctx) { 
        
    }

    @Override 
    public void enterFunction_specification(VHDLParser.Function_specificationContext ctx) { 

        SubprogramSpecification subprogramSpecification = new SubprogramSpecification();
        subprogramSpecification.subprogramType = SubprogramType.FUNCTION;

        connectParentAndChild(subprogramSpecification);
        descend(subprogramSpecification);
    }

	@Override 
    public void exitFunction_specification(VHDLParser.Function_specificationContext ctx) { 

        SubprogramSpecification subprogramSpecification = (SubprogramSpecification) stmt;

        // name
        subprogramSpecification.subprogramName = subprogramSpecification.children.get(0);
        subprogramSpecification.children.remove(0);

        // return value
        int size = subprogramSpecification.children.size();
        subprogramSpecification.returnType = subprogramSpecification.children.get(size - 1);
        subprogramSpecification.children.remove(size - 1);

        // astOutputListenerCallback.subprogram(subprogram);

        ascend();
    }

    //
    // Entity (Declaration and Architecture)
    //

    @Override
    public void enterEntity_declaration(VHDLParser.Entity_declarationContext ctx) {

        entity = new Entity();

        connectParentAndChild(entity);
        descend(entity);

        portTarget = entity;

        entity.name = ctx.identifier().get(0).getText();
    }

    @Override
    public void exitEntity_declaration(VHDLParser.Entity_declarationContext ctx) {

        astOutputListenerCallback.entity(entity);

        ascend();

        entity = null;
        portTarget = null;
    }

    @Override
    public void enterInterface_port_declaration(VHDLParser.Interface_port_declarationContext ctx) {

        Port port = new Port();
        portTarget.ports.add(port);

        String identifier = ctx.identifier_list().getChild(0).getText();
        port.name = identifier;

        String type = ctx.subtype_indication().getText();
        port.type = type;

        // port direction (in, out, inout)
        String mode = ctx.signal_mode().getText();
        port.portDirection = PortDirection.fromString(mode);

        connectParentAndChild(port);
        descend(port);
    }

    @Override
    public void exitInterface_port_declaration(VHDLParser.Interface_port_declarationContext ctx) {
        ascend();
    }

    @Override
    public void enterInterface_constant_declaration(VHDLParser.Interface_constant_declarationContext ctx) {

        InterfaceConstant interfaceConstant = new InterfaceConstant();

        if (portTarget != null) {
            portTarget.interfaceConstants.add(interfaceConstant);
        }

        // String identifier = ctx.identifier_list().getChild(0).getText();
        // interfaceConstant.name = identifier;

        // String type = ctx.subtype_indication().getText();
        // interfaceConstant.type = type;

        // // port direction (in, out, inout)
        // String mode = ctx.signal_mode().getText();
        // port.portDirection = PortDirection.fromString(mode);

        connectParentAndChild(interfaceConstant);
        descend(interfaceConstant);
    }

    @Override
    public void exitInterface_constant_declaration(VHDLParser.Interface_constant_declarationContext ctx) {

        // System.out.println(ctx.getText());

        InterfaceConstant interfaceConstant = (InterfaceConstant) stmt;
        interfaceConstant.name = ((ModelNode<String>) stmt.children.get(0)).value;
        interfaceConstant.type = ((SubtypeIndication) stmt.children.get(1)).name;

        // initial value is optional
        if (stmt.children.size() >= 3) {
            interfaceConstant.expr = (Expr) stmt.children.get(2);
        }

        stmt.children.clear();

        ascend();
    }

    @Override
    public void enterArchitecture_body(VHDLParser.Architecture_bodyContext ctx) {

        // System.out.println(ctx.getText());

        String architectureName = null;
        String entityName = null;

        // ParseTree child1 = ctx.getChild(0); // ARCHITECTURE (TOKEN)
        ParseTree child2 = ctx.getChild(1); // architecture identifier
        architectureName = child2.getText();

        // ParseTree child3 = ctx.getChild(2); // OF (TOKEN)
        ParseTree child4 = ctx.getChild(3); // entitiy identifier
        entityName = child4.getText();

        Architecture architecture = new Architecture();

        connectParentAndChild(architecture);
        descend(architecture);

        architecture.architectureName = architectureName;
        architecture.entityName = entityName;
    }

    @Override
    public void exitArchitecture_body(VHDLParser.Architecture_bodyContext ctx) {

        Architecture architecture = (Architecture) stmt;

        moveSignals(architecture);
        removeIdentifiers(architecture);

        astOutputListenerCallback.architecture(architecture);

        // Commenting out this line will leave the stmt alive for printing
        stmt = architecture.parent;
        architecture = null;
    }

    @Override
    public void enterGeneric_clause(VHDLParser.Generic_clauseContext ctx) {

        GenericClause genericClause = new GenericClause();

        connectParentAndChild(genericClause);
        descend(genericClause);
    }

    @Override
    public void exitGeneric_clause(VHDLParser.Generic_clauseContext ctx) {
        ascend();
    }

    @Override 
    public void enterGenerate_statement(VHDLParser.Generate_statementContext ctx) { 

        GenerateStmt generateStmt = new GenerateStmt();

        connectParentAndChild(generateStmt);
        descend(generateStmt);
    }
	
	@Override 
    public void exitGenerate_statement(VHDLParser.Generate_statementContext ctx) {

        GenerateStmt generateStmt = (GenerateStmt) stmt;

        generateStmt.identifier = ((Identifier) stmt.children.get(0)).value;

        // stmt.children.clear();

        ascend();
     }

    //
    // Entity Instantiation
    //

    @Override
    public void enterComponent_instantiation_statement(VHDLParser.Component_instantiation_statementContext ctx) {

        ComponentInstantiationStatement componentInstantiationStatement = new ComponentInstantiationStatement();

        String identifier = ctx.label_colon().getText();
        componentInstantiationStatement.name = identifier.substring(0, identifier.length() - 1);

        connectParentAndChild(componentInstantiationStatement);
        descend(componentInstantiationStatement);

        // Instantiated_unitContext instantiated_unitContext = ctx.instantiated_unit();
        // NameContext nameContext = instantiated_unitContext.name();
        // @SuppressWarnings("unused")
        // String name = nameContext.getText();
        // @SuppressWarnings("unused")
        // String library = nameContext.getChild(0).getText();
        // @SuppressWarnings("unused")
        // String entityType = nameContext.getChild(1).getText();
        // @SuppressWarnings("unused")
        // String entityArchitecture = nameContext.getChild(2).getText();

        // // insert component instantiation statement into the parent architecture
        // if (architecture != null) {
        // architecture.children.add(componentInstantiationStatement);
        // componentInstantiationStatement.parent = architecture;
        // stmt = componentInstantiationStatement;
        // }
    }

    @Override
    public void exitComponent_instantiation_statement(VHDLParser.Component_instantiation_statementContext ctx) {

        ComponentInstantiationStatement componentInstantiationStatement = (ComponentInstantiationStatement) stmt;

        moveAssociationElementsOnly(componentInstantiationStatement);

        componentInstantiationStatement.name = componentInstantiationStatement.children.get(0).value.toString();
        
        ModelNode<?> name = componentInstantiationStatement.children.get(1);
        for (ModelNode<?> child : name.children) {
            if (child instanceof Identifier) {
                componentInstantiationStatement.entity.add((Identifier) child);
            } else if (child instanceof FunctionCall) {
                FunctionCall functionCall = (FunctionCall) child;
                componentInstantiationStatement.architecture = functionCall.children.get(0).name;
            }
        }

        componentInstantiationStatement.children.clear();
        
        // emit
        astOutputListenerCallback.componentInstantiationStatement(componentInstantiationStatement);

        ascend();
    }

    //
    // Expression, Relation, Term
    //

    @Override
    public void enterExpression(VHDLParser.ExpressionContext ctx) {

        // System.out.println(ctx.getText());

        if (ctx.getChildCount() >= 3) {

            Expr expr = new Expr();
            expr.operator = ctx.getChild(1).getText();

            connectParentAndChild(expr);
            descend(expr);
        }
    }

    @Override
    public void exitExpression(VHDLParser.ExpressionContext ctx) {

        // System.out.println(ctx.getText());

        if (ctx.getChildCount() > 1) {
        // if (ctx.getChildCount() > 3) {

            Expr expr = (Expr) stmt;

            ascend();
        }
    }

    @Override
    public void enterSimple_expression(VHDLParser.Simple_expressionContext ctx) {

        // System.out.println(ctx.getText());

        if (ctx.getChildCount() == 1) {
            // Expr expr = new Expr();
            // expr.value = ctx.getText();
            // connectParentAndChild(expr);
        } else if (ctx.getChildCount() >= 3) {
            Expr expr = new Expr();
            expr.operator = ctx.getChild(1).getText();
            connectParentAndChild(expr);
            descend(expr);
        } else {
            throw new RuntimeException("Unknown child amount!");
        }
    }

    @Override
    public void exitSimple_expression(VHDLParser.Simple_expressionContext ctx) {
        if (ctx.getChildCount() >= 3) {
            // emit
            astOutputListenerCallback.expression(stmt);
            if (ctx.getChildCount() > 1) {
                ascend();
            }
        }
    }

    @Override
    public void enterRelation(VHDLParser.RelationContext ctx) {

        // System.out.println(ctx.getText());

        if (ctx.getChildCount() == 3) {
            Expr expr = new Expr();
            expr.operator = ctx.getChild(1).getText();
            connectParentAndChild(expr);
            descend(expr);
        }
    }

    @Override
    public void exitRelation(VHDLParser.RelationContext ctx) {
        if (ctx.getChildCount() > 1) {
            ascend();
        }
    }

    @Override
    public void enterTerm(VHDLParser.TermContext ctx) {

        // System.out.println(ctx.getText());

        if (ctx.getChildCount() == 3) {
            Expr expr = new Expr();
            expr.operator = ctx.getChild(1).getText();
            connectParentAndChild(expr);
            descend(expr);
        }
    }

    @Override
    public void exitTerm(VHDLParser.TermContext ctx) {
        if (ctx.getChildCount() > 1) {
            ascend();
        }
    }

    @Override
    public void enterFactor(VHDLParser.FactorContext ctx) {

        // System.out.println(ctx.getText());

        // factor -- not primary
        if (ctx.getChildCount() == 2) {

            String operator = ctx.getChild(0).getText();

            if (operator.equalsIgnoreCase("not")) {

                Expr expr = new Expr();
                expr.operator = operator;

                connectParentAndChild(expr);
                descend(expr);
            }
        }
    }

    @Override
    public void exitFactor(VHDLParser.FactorContext ctx) {
        if (ctx.getChildCount() == 2) {

            String operator = ctx.getChild(0).getText();

            if (operator.equalsIgnoreCase("not")) {
                ascend();
            }
        }
    }

    //
    // Process
    //

    @Override
    public void enterProcess_statement(VHDLParser.Process_statementContext ctx) {

        Process process = new Process();

        Label_colonContext label_colonContext = ctx.label_colon();
        if (label_colonContext != null) {
            process.name = label_colonContext.identifier().getText();
        }

        IdentifierContext identifierContext = ctx.identifier();
        if (identifierContext != null) {
            process.name = identifierContext.getText();
        }

        connectParentAndChild(process);
        descend(process);
    }

    @Override
    public void exitProcess_statement(VHDLParser.Process_statementContext ctx) {

        Process process = (Process) stmt;
        removeIdentifiers(process);

        astOutputListenerCallback.process(process);

        ascend();
    }

    //
    // Literal
    //

    @Override
    public void enterLiteral(VHDLParser.LiteralContext ctx) {
        Expr expr = new Expr();
        expr.value = ctx.getText();

        connectParentAndChild(expr);
    }

    @Override
    public void exitLiteral(VHDLParser.LiteralContext ctx) {
    }

    //
    // Identifier
    //

    @Override
    public void enterIdentifier(VHDLParser.IdentifierContext ctx) {

        Identifier identifier = new Identifier();
        identifier.value = ctx.getText();

        connectParentAndChild(identifier);
    }

    @Override
    public void exitIdentifier(VHDLParser.IdentifierContext ctx) {
    }

    //
    // Terminal
    //

    @Override
    public void visitTerminal(TerminalNode node) {

        // System.out.println(node.getText());

        if (node.getText().toLowerCase().equals("if")) {

            if ("end".equalsIgnoreCase(lastTerminal)) {

                ascend();

            } else {

                IfStmtBranch ifStmtBranch = new IfStmtBranch();

                // connect parent and child

                if (stmt instanceof IfStmt) {
                    IfStmt ifStmt = (IfStmt) stmt;
                    ifStmt.branches.add(ifStmtBranch);
                    ifStmtBranch.parent = ifStmt;

                    descend(ifStmtBranch);
                } else if (stmt instanceof GenerateStmt) {
                    GenerateStmt generateStmt = (GenerateStmt) stmt;
                    generateStmt.branches.add(ifStmtBranch);
                    ifStmtBranch.parent = generateStmt;

                    descend(ifStmtBranch);
                }
            }

        } else if (node.getText().toLowerCase().equals("elsif")) {

            if (stmt instanceof IfStmtBranch) {
                ascend();
            }

            if (stmt instanceof IfStmt) {

                IfStmtBranch ifStmtBranch = new IfStmtBranch();

                // connect parent and child
                IfStmt ifStmt = (IfStmt) stmt;
                ifStmt.branches.add(ifStmtBranch);
                ifStmtBranch.parent = ifStmt;

                // descend
                descend(ifStmtBranch);
            }

        } else if (node.getText().toLowerCase().equals("else")) {

            if (stmt instanceof IfStmtBranch) {
                ascend();
            }

            if (stmt instanceof IfStmt) {

                IfStmtBranch ifStmtBranch = new IfStmtBranch();

                Expr trueExpr = new Expr();
                trueExpr.value = "TRUE";
                ifStmtBranch.children.add(trueExpr);

                // connect parent and child
                IfStmt ifStmt = (IfStmt) stmt;
                ifStmt.branches.add(ifStmtBranch);
                ifStmtBranch.parent = ifStmt;

                // descend
                descend(ifStmtBranch);
            }

        } else if (node.getText().toLowerCase().equals("generate")) {

            if (stmt instanceof IfStmtBranch) {
                ascend();
            }
        }

        // remember the last terminal because the last 'if' in 'end if'
        // is detected by the preceding 'end' which will appear in lastTerminal
        lastTerminal = node.getText();
    }

    //
    // Utility
    //

    private void connectParentAndChild(ModelNode<?> newStmt) {
        if (stmt != null) {
            stmt.children.add(newStmt);
            newStmt.parent = stmt;
        }
    }

    private void descend(ModelNode<?> newStmt) {
        stmt = newStmt;
    }

    private void ascend() {
        stmt = stmt.parent;
    }

    private void moveSignals(Architecture architecture) {
        List<Signal> signals = new ArrayList<>();
        for (ModelNode<?> child : architecture.children) {
            if (child instanceof Signal) {
                signals.add((Signal) child);
            }
        }
        architecture.signals.addAll(signals);
        architecture.children.removeAll(signals);
    }

    private void removeIdentifiers(ModelNode<?> node) {
        List<Identifier> identifiers = new ArrayList<>();
        for (ModelNode<?> child : node.children) {
            if (child instanceof Identifier) {
                identifiers.add((Identifier) child);
            }
        }
        node.children.removeAll(identifiers);
    }

    private void keepAssociationElementsOnly(ModelNode<?> node) {
        List<Object> deleteList = new ArrayList<>();
        for (ModelNode<?> child : node.children) {
            if (!(child instanceof AssociationElement)) {
                deleteList.add(child);
            }
        }
        node.children.removeAll(deleteList);
    }

    private void moveAssociationElementsOnly(ComponentInstantiationStatement componentInstantiationStatement) {
        List<AssociationElement> tempList = new ArrayList<>();
        for (ModelNode<?> child : componentInstantiationStatement.children) {
            if (child instanceof AssociationElement) {
                tempList.add((AssociationElement) child);
            }
        }
        componentInstantiationStatement.portMap.addAll(tempList);
    }
}