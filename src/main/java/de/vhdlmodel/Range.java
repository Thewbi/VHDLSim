package de.vhdlmodel;

public class Range extends ModelNode<String> {

    public ModelNode<?> start;

    public ModelNode<?> end;

    public RangeDirection rangeDirection;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Range [\n").append(start.toString(indent + 1));

        if (rangeDirection != null) {
            for (int i = 0; i < indent + 1; i++) {
                stringBuffer.append("  ");
            }
            stringBuffer.append(rangeDirection).append("\n");
        }
        
        if (end != null) {
            stringBuffer.append(end.toString(indent + 1));
            for (int i = 0; i < indent ; i++) {
                stringBuffer.append("  ");
            }
        }
        stringBuffer.append("]\n");

        return stringBuffer.toString();
    }

}
