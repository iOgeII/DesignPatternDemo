package exercise._3CalculatorMulDivMod;

import java.util.HashMap;
import java.util.Stack;

public class ExpressionHandler {

	private AbstractNode node;
	
	public void parseInstruction(String instruction) {
		String words[] = instruction.split(" ");
		Stack<AbstractNode> stack = new Stack<AbstractNode>();
		AbstractNode left = null, right = null, operator = null;
		for(int i = 0; i < words.length; i++) {
			if(words[i].matches("[*/%]")) {
				left = stack.pop();
				operator = new OperatorNode(words[i]);
				right = new NumberNode(words[++i]);
				stack.push(new ExpressionNode(left, right, operator));
			}
			else {
				stack.push(new NumberNode(words[i]));
			}
		}
		node = stack.pop();
	}
	
	public String getResult() {
		return node.interpret();
	}
}
