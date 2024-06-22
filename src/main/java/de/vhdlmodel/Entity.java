package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class Entity extends Stmt {

    public List<Port> ports = new ArrayList<>();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Entity ").append(name).append("\n");

        indent++;
        for (Port port : ports) {
            stringBuffer.append(port.toString(indent));
        }

        return stringBuffer.toString();

    }

}
