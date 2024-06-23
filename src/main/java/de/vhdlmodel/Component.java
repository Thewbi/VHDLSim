package de.vhdlmodel;

public class Component extends PortTarget {

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Component ").append(name).append("\n");

        indent++;
        for (Port port : ports) {
            stringBuffer.append(port.toString(indent));
        }

        return stringBuffer.toString();
    }

}
