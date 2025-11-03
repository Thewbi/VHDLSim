package de.vhdlmodel;

public class Signal extends ModelNode<String> {

    public SubtypeIndication type;

    public Range range;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Signal ").append(name)/*.append(" ").append(type) */.append("\n");

        indent++;

        if (type != null) {
            stringBuffer.append(type.toString(indent));
        }

        if (range != null) {
            stringBuffer.append(range.toString(indent));
        }

        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }

}
