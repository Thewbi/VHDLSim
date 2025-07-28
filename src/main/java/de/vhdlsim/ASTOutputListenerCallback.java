package de.vhdlsim;

import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.Component;
import de.vhdlmodel.ComponentInstantiationStatement;
import de.vhdlmodel.Configuration;
import de.vhdlmodel.Entity;
import de.vhdlmodel.FunctionImplementation;
import de.vhdlmodel.FunctionSpecification;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.Record;
import de.vhdlmodel.SelectedSignalAssignment;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.TypeDeclaration;

public interface ASTOutputListenerCallback {

    void architecture(Architecture architecture);

    void entity(Entity entity);

    void component(Component component);

    void process(Stmt stmt);

    void ifStmt(Stmt stmt);

    void signal(Signal signal);

    void signalAssignment(AssignmentStmt assignmentStmt);

    void caseStmt(Stmt stmt);

    void record(Record record);

    void functionSpecification(FunctionSpecification functionSpecification);

    void variableAssignment(AssignmentStmt assignmentStmt);

    void functionImplementation(FunctionImplementation functionImplementation);

    void expression(ModelNode<?> expr);

    void typeDeclaration(TypeDeclaration typeDeclaration);

    void enumDataTypeDeclaration(TypeDeclaration typeDeclaration);

    void configuration(Configuration configuration);

    void componentInstantiationStatement(ComponentInstantiationStatement componentInstantiationStatement);

    void selectedSignalAssignment(Stmt stmt);

}
