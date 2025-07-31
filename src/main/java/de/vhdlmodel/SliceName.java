package de.vhdlmodel;

public class SliceName extends ModelNode<String> {

    public Range range;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("SliceName ").append(range.toString(indent + 1)).append("\n");

        indent++;
        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }

}
