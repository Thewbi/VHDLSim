package de.vhdlsim;

import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.Component;
import de.vhdlmodel.Configuration;
import de.vhdlmodel.Entity;
import de.vhdlmodel.FunctionImplementation;
import de.vhdlmodel.FunctionSpecification;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.Record;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.TypeDeclaration;

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
    public void variableAssignment(AssignmentStmt assignmentStmt) {
    }

    @Override
    public void functionImplementation(FunctionImplementation functionImplementation) {
    }

    @Override
    public void expression(ModelNode<?> expr) {
    }

    @Override
    public void enumDataTypeDeclaration(TypeDeclaration typeDeclaration) {
    }

    @Override
    public void configuration(Configuration configuration) {
    }

}
