package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class Architecture extends Stmt {

    public String architectureName;

    public String entityName;

    public List<Signal> signals = new ArrayList<>();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Architecture ").append(architectureName).append(" ").append(entityName).append("\n");

        indent++;
        int index = 0;
        for (ModelNode<?> stmt : children) {

            stringBuffer.append(stmt.toString(indent));

            if (index < children.size() - 1) {
                stringBuffer.append("\n");
            }

            index++;
        }

        return stringBuffer.toString();
    }

}
