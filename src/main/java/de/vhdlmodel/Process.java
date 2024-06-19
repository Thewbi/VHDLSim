package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class Process extends Stmt {

    public List<ModelNode<String>> sensitivityList = new ArrayList<>();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("Process: ").append(name).append("\n");

        indent++;
        for (ModelNode<?> signal : sensitivityList) {
            for (int i = 0; i < indent; i++) {
                stringBuffer.append("  ");
            }
            stringBuffer.append("Signal: ").append(signal.name).append("\n");
        }
        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }
    
}
