package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class Port extends ModelNode<String> {

    public List<String> identifierList = new ArrayList<>();

    public PortDirection portDirection = PortDirection.UNKNOWN;

    public String type;

    public String toString(int indent) {

        String indentString = "";
        for (int i = 0; i < indent; i++) {
            indentString += "  ";
        }

        StringBuffer stringBuffer = new StringBuffer();

        // stringBuffer
        //             .append(indentString)
        //             .append("Port ")
        //             .append("test").append(" ")
        //             .append(portDirection).append(" ")
        //             .append(type).append("\n");

        //     indent++;
        //     for (ModelNode<?> child : children) {
        //         stringBuffer.append(child.toString(indent));
        //     }
        //     indent--;

        for (String identifier : identifierList) {

            stringBuffer
                    .append(indentString)
                    .append("Port ")
                    .append(identifier).append(" ")
                    .append(portDirection).append(" ")
                    .append(type).append("\n");

            indent++;
            for (ModelNode<?> child : children) {
                stringBuffer.append(child.toString(indent));
            }
            indent--;
        }

        return stringBuffer.toString();
    }

}
