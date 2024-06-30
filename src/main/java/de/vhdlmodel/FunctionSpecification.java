package de.vhdlmodel;

import java.util.ArrayList;
import java.util.List;

public class FunctionSpecification extends ModelNode<Object> {

    public List<ActualParameter> actualParameters = new ArrayList<>();

    public String returnType;

    /**
     * This function is not allowed to return trailing newlines!
     * The rule for proper formatting is: Never append a newline to the end of the
     * final output! The parent will append newlines as it sees fit!
     */
    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        
        // output the name
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("FunctionSpecification: '").append(name).append("' ").append("\n");

        // all formal parameters
        indent++;
        for (ActualParameter actualParameter : actualParameters) {
            String actualParameterAsString = actualParameter.toString(indent);
            stringBuffer.append(actualParameterAsString).append("\n");
        }

        // return type
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        stringBuffer.append("ReturnType: ").append(returnType).append(" ");//.append("\n");

        return stringBuffer.toString();
    }
    
}
