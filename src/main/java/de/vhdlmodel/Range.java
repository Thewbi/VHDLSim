package de.vhdlmodel;

public class Range {

    public ModelNode<?> start;

    public ModelNode<?> end;

    public RangeDirection rangeDirection;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Range [").append(start.toString(0)).append(" ").append(rangeDirection).append(" ").append(end.toString(0)).append("]");

        return stringBuffer.toString();
    }
    
}
