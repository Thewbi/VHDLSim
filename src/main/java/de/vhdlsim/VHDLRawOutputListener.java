package de.vhdlsim;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.vhdl.grammar.VHDLParserBaseListener;

/**
 * Outputs the parse tree to the console.
 */
public class VHDLRawOutputListener extends VHDLParserBaseListener {

    private int indent;

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        printIndent();
        System.out.println(ctx.getClass().getSimpleName() + " [" + ctx.getStart().getText() + "] " + ctx.hashCode());
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
        System.out.println(node.getText());
        // currentNode.setLabel("TERMINAL: " + node.getText());
        ascend();
    }

    private void descend() {
        indent++;

        // Node parent = getCurrentNode();
        // currentNode = createNode();
        // parent.getChildren().add(currentNode);
        // currentNode.setParentNode(parent);
    }

    private void ascend() {
        indent--;

        // if (currentNode != null) {
        // currentNode = currentNode.getParentNode();
        // }
    }

    private void printIndent() {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
    }

}
