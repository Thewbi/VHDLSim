package de.vhdlmodel;

public class Port extends ModelNode<String> {

    public String name;

    public PortDirection portDirection = PortDirection.UNKNOWN;

    public String type;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Port ").append(name).append(" ").append(portDirection).append(" ").append(type).append("\n");

        indent++;
        for (ModelNode child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();

    }

}
