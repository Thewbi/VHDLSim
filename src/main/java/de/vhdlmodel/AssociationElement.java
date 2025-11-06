package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class AssociationElement extends ModelNode<String> {

    public ModelNode<?> expr;
    
    public List<Identifier> identifiers = new ArrayList<>();

    public Name nameModelNode;

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("AssociationElement ");

        int counter = 0;
        StringBuilder identifiersStringBuilder = new StringBuilder();
        for (Identifier id : identifiers) {
            if (counter > 0) {
                identifiersStringBuilder.append(".");
            }
            identifiersStringBuilder.append(id.toString());
            counter++;
        }
        String i = identifiersStringBuilder.toString();

        StringBuilder rangeStringBuilder = new StringBuilder();

        if (nameModelNode != null) {

            for (ModelNode<?> child : nameModelNode.children) {

                if (child instanceof Identifier) {

                    Identifier id = (Identifier) child;
                    if (counter > 0) {
                        identifiersStringBuilder.append(".");
                    }
                    identifiersStringBuilder.append(id.value);
                    counter++;

                } else if (child instanceof Range) {

                    Range range = (Range) child;
                    rangeStringBuilder.append(range.toString(indent));

                }
            }
            String i2 = identifiersStringBuilder.toString();
            String i3 = rangeStringBuilder.toString();

            stringBuffer.append(i2);
            stringBuffer.append("\n").append(i3);
        }

        // String expressionAsString = expr.toString(0);
        //stringBuffer.append("AssociationElement ").append(name).append(" => ").append(expressionAsString).append("\n");
        
        // String nameAsString = nameModelNode.toString(indent);

        stringBuffer.append("\n");

        //
        // expr
        //
        if (expr != null) {
            stringBuffer.append(expr.toString(indent));
        }

        indent++;
        for (ModelNode<?> child : children) {
            stringBuffer.append(child.toString(indent));
        }

        return stringBuffer.toString();
    }
    
}
