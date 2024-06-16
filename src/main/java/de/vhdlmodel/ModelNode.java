package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class ModelNode<T> {

    public ModelNode parent;

    public List<ModelNode> children = new ArrayList<>();

    public String operator;

    public String name;

    public T value;

    public ModelNode() {
        name = "Unknown";
    }

    public ModelNode(String name) {
        this.name = name;
    }

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("ModelNode ").append(name).append("\n");

        indent++;
        for (ModelNode child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }

}
