package de.vhdlmodel;

public class ConditionalWaveforms extends Stmt {
    
    public void addChoice(Object value) {
        this.value = value;
    }

    public String toString(int indent) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            stringBuffer.append("  ");
        }
        //stringBuffer.append("ConditionalWaveforms expr: ").append(((ModelNode) value).toString(0)).append("\n");
        stringBuffer.append("ConditionalWaveforms expr: ").append("\n");

        // indent++;
        // for (int i = 0; i < indent; i++) {
        //     stringBuffer.append("  ");
        // }
        // stringBuffer.append("alternatives:\n");

        indent++;

        // int index = 0;
        for (ModelNode<?> child : children) {

            stringBuffer.append(child.toString(indent + 1));

            // if (index < children.size() - 1) {
            //     stringBuffer.append("\n");
            // }

            // index++;
        }

        return stringBuffer.toString();
    }
}
