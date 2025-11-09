package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class Signal extends ModelNode<String> {

    public SubtypeIndication type;

    public Range range;

    public List<Identifier> identifierList = new ArrayList<>();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Signal: ");

        int identifierCount = 0;
        for (Identifier identifier : identifierList) {
            if (identifierCount > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(identifier.value);
            identifierCount++;
        }
        stringBuffer.append("\n");

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
