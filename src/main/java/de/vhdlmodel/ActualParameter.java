package de.vhdlmodel;

public class ActualParameter {

    public String name;

    public PortDirection direction;

    public String subtype_indication;
    
    public Range range;

    public ModelNode<?> expression;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append(name).append(" ").append(direction).append(" ").append(subtype_indication);
        
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
