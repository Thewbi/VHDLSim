package de.vhdlmodel;

public class Variable extends ModelNode<Object> {

    public String subtypeIndication;
    
    public ModelNode<?> expression;

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
        stringBuffer.append("LocalVariable: '").append(name).append("' type: ").append(subtypeIndication).append("\n");
        
        if (expression != null) {
            indent++;
            stringBuffer.append(expression.toString(indent));
        }

        // stringBuffer.append("\n");

        return stringBuffer.toString();
    }

}
