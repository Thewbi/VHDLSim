package de.vhdlsim;

import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.Component;
import de.vhdlmodel.ComponentInstantiationStatement;
import de.vhdlmodel.Configuration;
import de.vhdlmodel.Entity;
import de.vhdlmodel.FunctionCall;
import de.vhdlmodel.FunctionImplementation;
import de.vhdlmodel.FunctionSpecification;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.Name;
import de.vhdlmodel.Range;
import de.vhdlmodel.Record;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.TypeDeclaration;
import de.vhdlmodel.WaveFormElement;

public class ASTOutputListenerCallbackAdapter implements ASTOutputListenerCallback {

    @Override
    public void architecture(Architecture architecture) {
    }

    @Override
    public void entity(Entity entity) {
    }

    @Override
    public void component(Component component) {
    }

    @Override
    public void process(Stmt stmt) {
    }

    @Override
    public void ifStmt(Stmt stmt) {
    }

    @Override
    public void signal(Signal signal) {
    }

    @Override
    public void signalAssignment(AssignmentStmt assignmentStmt) {
    }

    @Override
    public void caseStmt(Stmt stmt) {
    }

    @Override
    public void record(Record record) {
    }

    @Override
    public void functionSpecification(FunctionSpecification functionSpecification) {
    }

    @Override
    public void functionImplementation(FunctionImplementation functionImplementation) {
    }

    @Override
    public void functionCall(FunctionCall lastFunctionCall) {
    }

     @Override
    public void variableAssignment(AssignmentStmt assignmentStmt) {
    }

    @Override
    public void expression(ModelNode<?> expr) {
    }

    @Override
    public void typeDeclaration(TypeDeclaration typeDeclaration) {
    }

    @Override
    public void enumDataTypeDeclaration(TypeDeclaration typeDeclaration) {
    }

    @Override
    public void configuration(Configuration configuration) {
    }

    @Override
    public void componentInstantiationStatement(ComponentInstantiationStatement componentInstantiationStatement) {
    }

    @Override
    public void selectedSignalAssignment(Stmt stmt) {
    }

    @Override
    public void waveFormElement(WaveFormElement waveFormElement) {
    }

    @Override
    public void range(Range range) {
    }

    @Override
    public void name(Name name) {
    }

}
