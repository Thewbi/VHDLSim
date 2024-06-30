package de.vhdlmodel;

public class ActualParameter {

    public String name;

    public PortDirection direction;

    public String subtypeIndication;
    
    public Range range;

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

        stringBuffer.append(name).append(" ").append(direction).append(" ").append(subtypeIndication);
        
        if (range != null) {
            stringBuffer.append(" ").append(range.toString(0));
        }

        indent++;
        if (expression != null) {
            stringBuffer.append(" ").append(expression.toString(indent));
        }

        return stringBuffer.toString();
    }
    
}
