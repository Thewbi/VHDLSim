package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class FunctionSpecification extends ModelNode<Object> {

    public List<ActualParameter> actualParameters = new ArrayList<>();

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }

        stringBuffer.append("FunctionSpecification ").append(name).append(" ").append("\n");

        indent++;
        for (ActualParameter actualParameter : actualParameters) {
            stringBuffer.append(actualParameter.toString(indent)).append("\n");
        }

        return stringBuffer.toString();
    }
    
}
