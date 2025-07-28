package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class SelectedSignalAssignment extends Stmt {

    public StringLiteral discriminator;

    public StringLiteral lhs;

    public List<FunctionCall> branches = new ArrayList<>();

    public List<Object> choices = new ArrayList<>();

    public void addChoice(Object value) {
        // this.value = value;
        choices.add(value);
    }

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();

        // indent
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("SelectedSignalAssignment ").append("\n");

        // indent
        for (int i = 0; i < (indent + 1); i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("LHS: ").append(lhs.value).append("\n");

        // indent
        for (int i = 0; i < (indent + 1); i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("DISCRIMINATOR: ").append(discriminator.value).append("\n");

        int branchIndex = 0;
        for (FunctionCall functionCall : branches) {
            // indent
            for (int i = 0; i < (indent + 1); i++) {
                stringBuffer.append("  ");
            }
            stringBuffer.append("BRANCH ").append(branchIndex + 1).append(": ").append(functionCall.name).append("[").append(functionCall.children.get(0).value).append("] value: ").append(choices.get(branchIndex)).append("\n");
            branchIndex++;
        }

        indent++;
        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }

}
