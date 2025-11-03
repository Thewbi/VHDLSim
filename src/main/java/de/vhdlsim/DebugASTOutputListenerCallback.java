package de.vhdlsim;

import java.util.Map;

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
import de.vhdlmodel.PhysicalUnit;
import de.vhdlmodel.Range;
import de.vhdlmodel.Record;
import de.vhdlmodel.Signal;
import de.vhdlmodel.Stmt;
import de.vhdlmodel.TypeDeclaration;
import de.vhdlmodel.WaveFormElement;

public class DebugASTOutputListenerCallback implements ASTOutputListenerCallback {

    private static final int INDENT = 0;

    // private static final boolean PERFORM_DEBUG_OUTPUT = true;
    private static final boolean PERFORM_DEBUG_OUTPUT = false;

    private static final boolean PERFORM_DEBUG_OUTPUT_ARCHITECTURE = true;
    // private static final boolean PERFORM_DEBUG_OUTPUT_ARCHITECTURE = false;

    private static final boolean PERFORM_DEBUG_OUTPUT_ENTITY = true;
    // private static final boolean PERFORM_DEBUG_OUTPUT_ENTITY = false;

    // private static final boolean PERFORM_DEBUG_OUTPUT_PROCESS_STATEMENT = true;
    private static final boolean PERFORM_DEBUG_OUTPUT_PROCESS_STATEMENT = false;

    // private static final boolean PERFORM_DEBUG_OUTPUT_SIGNAL = true;
    private static final boolean PERFORM_DEBUG_OUTPUT_SIGNAL = false;

    public Map<String, PhysicalUnit> units;

    @Override
    public void architecture(final Architecture architecture) {
        if (PERFORM_DEBUG_OUTPUT || PERFORM_DEBUG_OUTPUT_ARCHITECTURE) {
            System.out.println(architecture.toString(INDENT));
        }
    }

    @Override
    public void entity(final Entity entity) {
        if (PERFORM_DEBUG_OUTPUT || PERFORM_DEBUG_OUTPUT_ENTITY) {
            System.out.println(entity.toString(INDENT));
        }
    }

    @Override
    public void component(final Component component) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(component.toString(INDENT));
        }
    }

    @Override
    public void process(final Stmt stmt) {
        if (PERFORM_DEBUG_OUTPUT || PERFORM_DEBUG_OUTPUT_PROCESS_STATEMENT) {
            System.out.println(stmt.toString(INDENT));
        }
    }

    @Override
    public void ifStmt(final Stmt stmt) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(stmt.toString(INDENT));
        }
    }

    @Override
    public void signal(final Signal signal) {
        if (PERFORM_DEBUG_OUTPUT || PERFORM_DEBUG_OUTPUT_SIGNAL) {
            System.out.println(signal.toString(INDENT));
        }
    }

    @Override
    public void signalAssignment(final AssignmentStmt assignmentStmt) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(assignmentStmt.toString(INDENT));
        }
    }

    @Override
    public void variableAssignment(AssignmentStmt assignmentStmt) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(assignmentStmt.toString(INDENT));
        }
    }

    @Override
    public void caseStmt(final Stmt stmt) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(stmt.toString(INDENT));
        }
    }

    @Override
    public void record(Record record) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(record.toString(INDENT));
        }
    }

    @Override
    public void functionSpecification(FunctionSpecification functionSpecification) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(functionSpecification.toString(INDENT));
        }
    }

    @Override
    public void functionImplementation(FunctionImplementation functionImplementation) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(functionImplementation.toString(INDENT));
        }
    }

    @Override
    public void functionCall(FunctionCall lastFunctionCall) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(lastFunctionCall.toString(INDENT));
        }
    }

    @Override
    public void expression(ModelNode<?> expr) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(expr.toString(INDENT));
        }
    }

    @Override
    public void typeDeclaration(TypeDeclaration typeDeclaration) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(typeDeclaration.toString(INDENT));
        }

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
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(typeDeclaration.toString(INDENT));
        }
    }

    @Override
    public void configuration(Configuration configuration) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(configuration.toString(INDENT));
        }
    }

    @Override
    public void componentInstantiationStatement(ComponentInstantiationStatement componentInstantiationStatement) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(componentInstantiationStatement.toString(INDENT));
        }
    }

    @Override
    public void selectedSignalAssignment(Stmt stmt) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(stmt.toString(INDENT));
        }
    }

    @Override
    public void waveFormElement(WaveFormElement waveFormElement) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(waveFormElement.toString(INDENT));
        }
    }

    @Override
    public void range(Range range) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(range.toString(INDENT));
        }
    }

    @Override
    public void name(Name name) {
        if (PERFORM_DEBUG_OUTPUT) {
            System.out.println(name.toString(INDENT));
        }
    }

}
