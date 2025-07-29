package de.vhdlmodel;

public class NumericLiteral extends ModelNode<Integer> {

    /** NumericLiterals can have physical units */
    public PhysicalUnit physicalUnit;

    /** This is the actual unit withint the physical unit */
    public String physicalUnitOption;

    public String unit;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append(value); //.append("\n");

        return stringBuffer.toString();
    }

}
