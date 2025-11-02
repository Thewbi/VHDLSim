package de.vhdlmodel;

public class Expr extends Stmt {

    public boolean constantValue;

    public static final Expr TRUE = new Expr(true);

    public static final Expr FALSE = new Expr(false);

    /**
     * ctor
     */
    public Expr() {

    }

    /**
     * ctor for constants TRUE and FALSE
     * 
     * @param value
     */
    private Expr(boolean value) {
        constantValue = value;
    }

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        if (operator == null) {
            stringBuffer.append("Expr: ")/*.append(constantValue) */.append(value);
        } else {
            stringBuffer.append("Expr: ").append(operator);
        }
        stringBuffer.append("\n");

        indent++;

        int index = 0;
        for (ModelNode<?> child : children) {

            stringBuffer.append(child.toString(indent));

            index++;

            if (index < children.size()) {
                stringBuffer.append("\n");
            }
        }

        return stringBuffer.toString();
    }

}
