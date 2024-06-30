package de.vhdlsim;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.vhdl.grammar.VHDLParserBaseListener;

/**
 * Outputs the parse tree to the console.
 */
public class VHDLRawOutputListener extends VHDLParserBaseListener {

    private int indent;

    public StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        printIndent();
        String msg = ctx.getClass().getSimpleName() + " [" + ctx.getStart().getText() + "] " + ctx.hashCode();
        System.out.println(msg);
        stringBuilder.append(msg).append("\n");
        descend();
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        ascend();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        descend();
        printIndent();
        String msg = node.getText();
        System.out.println(msg);
        stringBuilder.append(msg).append("\n");
        ascend();
    }

    private void descend() {
        indent++;
    }

    private void ascend() {
        indent--;
    }

    private void printIndent() {
        for (int i = 0; i < indent; i++) {
            String msg = "  ";
            System.out.print(msg);
            stringBuilder.append(msg);
        }
    }

}
