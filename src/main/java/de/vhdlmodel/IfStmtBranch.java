package de.vhdlmodel;

public class IfStmtBranch extends Stmt {

    public ModelNode<?> exprRoot;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("if-stmt-branch\n");

        indent++;
        if (exprRoot != null) {
            stringBuffer.append(exprRoot.toString(indent)).append("\n");
        }

        // statements
        int index = 0;
        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));

            if (index < children.size() - 1) {
                stringBuffer.append("\n");
            }

            index++;
        }

        return stringBuffer.toString();
    }
}
