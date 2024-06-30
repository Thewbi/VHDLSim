package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class FunctionImplementation extends Stmt {

    public FunctionSpecification functionSpecification;

    public List<Variable> localVariables = new ArrayList<>();

    /**
     * This function is not allowed to return trailing newlines!
     * The rule for proper formatting is: Never append a newline to the end of the
     * final output! The parent will append newlines as it sees fit!
     */
    public String toString(int indent) {

        // TODO: still need to parse the return statement

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        // function name
        stringBuffer.append("FunctionImplementation: ").append(functionSpecification.name).append("\n");

        // output the function specification (prototype)
        indent++;
        stringBuffer.append(functionSpecification.toString(indent)).append("\n");

        // local variables
        for (Variable localVariable : localVariables) {
            stringBuffer.append(localVariable.toString(indent));
        }

        stringBuffer.append("\n");

        // statements
        for (ModelNode<?> stmt : children) {
            stringBuffer.append(stmt.toString(indent));
        }

        return stringBuffer.toString();
    }

}
