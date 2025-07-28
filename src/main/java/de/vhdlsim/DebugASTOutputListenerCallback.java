package de.vhdlsim;

import java.util.HashMap;
import java.util.Map;

import de.vhdlmodel.Architecture;
import de.vhdlmodel.AssignmentStmt;
import de.vhdlmodel.Component;
import de.vhdlmodel.ComponentInstantiationStatement;
import de.vhdlmodel.Configuration;
import de.vhdlmodel.Entity;
import de.vhdlmodel.FunctionImplementation;
import de.vhdlmodel.FunctionSpecification;
import de.vhdlmodel.ModelNode;
import de.vhdlmodel.PhysicalUnit;
import de.vhdlmodel.Record;
import de.vhdlmodel.SelectedSignalAssignment;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.TypeDeclaration;

public class DebugASTOutputListenerCallback implements ASTOutputListenerCallback {

    private static final int INDENT = 0;

    public Map<String, PhysicalUnit> units;

    @Override
    public void architecture(final Architecture architecture) {
        //System.out.println(architecture.toString(INDENT));
    }

    @Override
    public void entity(final Entity entity) {
        //System.out.println(entity.toString(INDENT));
    }

    @Override
    public void component(final Component component) {
        //System.out.println(component.toString(INDENT));
    }

    @Override
    public void process(final Stmt stmt) {
        //System.out.println(stmt.toString(INDENT));
    }

    @Override
    public void ifStmt(final Stmt stmt) {
        //System.out.println(stmt.toString(INDENT));
    }

    @Override
    public void signal(final Signal signal) {
        //System.out.println(signal.toString(INDENT));
    }

    @Override
    public void signalAssignment(final AssignmentStmt assignmentStmt) {
        //System.out.println(assignmentStmt.toString(INDENT));
    }

    @Override
    public void variableAssignment(AssignmentStmt assignmentStmt) {
        //System.out.println(assignmentStmt.toString(INDENT));
    }

    @Override
    public void caseStmt(final Stmt stmt) {
        //System.out.println(stmt.toString(INDENT));
    }

    @Override
    public void record(Record record) {
        //System.out.println(record.toString(INDENT));
    }

    @Override
    public void functionSpecification(FunctionSpecification functionSpecification) {
        //System.out.println(functionSpecification.toString(INDENT));
    }

    @Override
    public void functionImplementation(FunctionImplementation functionImplementation) {
        //System.out.println(functionImplementation.toString(INDENT));
    }

    @Override
    public void expression(ModelNode<?> expr) {
        //System.out.println(expr.toString(INDENT));
    }

    @Override
    public void typeDeclaration(TypeDeclaration typeDeclaration) {
        //System.out.println(typeDeclaration.toString(INDENT));

        // check if a physical unit has been declared
        PhysicalUnit physicalUnit = typeDeclaration.physicalUnit;
        if (physicalUnit != null) {

            if (units.containsKey(physicalUnit.name)) {
                throw new RuntimeException("Duplicate entry of physical unit: '" + physicalUnit.name + "'");
            }

            // insert the unit into the external storage of all physcial units
            units.put(physicalUnit.name, physicalUnit);
        }
    }

    @Override
    public void enumDataTypeDeclaration(TypeDeclaration typeDeclaration) {
        //System.out.println(typeDeclaration.toString(INDENT));
    }

    @Override
    public void configuration(Configuration configuration) {
        //System.out.println(configuration.toString(INDENT));
    }

    @Override
    public void componentInstantiationStatement(ComponentInstantiationStatement componentInstantiationStatement) {
        //System.out.println(componentInstantiationStatement.toString(INDENT));
    }

    @Override
    public void selectedSignalAssignment(Stmt stmt) {
        System.out.println(stmt.toString(INDENT));
    }

}
