package de.vhdlmodel;

public class Subprogram extends ModelNode<Object> {

    public SubprogramSpecification subprogramSpecification;
    
    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("Subprogram\n");

        indent++;

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("Name: ").append(subprogramSpecification.subprogramName.toString(0));
        stringBuffer.append("\n");

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("Parameters\n");
        indent++;
        for (ModelNode<?> child : subprogramSpecification.children) {
            stringBuffer.append(child.toString(indent));
        }
        indent--;

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("Return-Type ").append(subprogramSpecification.returnType.toString(0));
        
        // if (exprRoot != null) {
        //     stringBuffer.append(exprRoot.toString(indent)).append("\n");
        // }

        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("Statements in Body\n");

        indent++;
        // statements
        int index = 0;
        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));

            if (index < children.size() - 1) {
                stringBuffer.append("\n");
            }

            index++;
        }
        indent--;

        return stringBuffer.toString();
    }
}
