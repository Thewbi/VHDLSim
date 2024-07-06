package de.vhdlmodel;

public class FunctionCallActualParameter extends ModelNode<String> {

    /**
     * This function is not allowed to return trailing newlines!
     * The rule for proper formatting is: Never append a newline to the end of the
     * final output! The parent will append newlines as it sees fit!
     */
    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("ActualParameter: ").append(name);

        return stringBuffer.toString();
    }

}
