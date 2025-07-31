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

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        int index = 0;

        if (signals.size() > 0) {

            stringBuffer.append("signals:\n");

            indent++;
        
            for (Signal signal : signals) {

                stringBuffer.append(signal.toString(indent));

                if (index < children.size() - 1) {
                    stringBuffer.append("\n");
                }

                index++;
            }

            indent--;

        }

        stringBuffer.append("\n");

        index = 0;
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
