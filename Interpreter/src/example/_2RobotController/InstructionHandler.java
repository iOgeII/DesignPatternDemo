package example._2RobotController;

import java.util.Stack;

// 处理输入指令的工具类 每三个词语一划分，识别单词 “and”
public class InstructionHandler {

	private AbstractNode node;
	
	public void handle(String instruction) {
		AbstractNode left = null, right = null;
		AbstractNode direction = null, action = null, distance = null;
		// 声明一个栈用于存储抽象语法树
		Stack<AbstractNode> stack = new Stack<AbstractNode>();
		
		// 以空格分隔指令字符串
		String[] words = instruction.split(" ");
		for(int i = 0; i < words.length; i++) {
			// 采用栈处理指令，如果遇到 and：
			// 则将其后的3个单词作为3个终结符表达式，连成一个简单句子 SentenceNode，作为 and的右表达式
			// 栈顶弹出的表达式为 and左表达式
			// 最后将 组合出的 AndNode(left,right) 入栈
			if(words[i].equalsIgnoreCase("and")) {
				// 弹出栈顶表达式作为左表达式
				left = stack.pop();
				// 向后识别
				String word1 = words[++i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				// 构建右表达式
				right = new SentenceNode(direction, action, distance);
				// 新表达式入栈
				stack.push(new AndNode(left, right));
			}
			else {
				String word1 = words[i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				// 构建表达式
				left = new SentenceNode(direction, action, distance);
				// 新表达式入栈
				stack.push(left);
			}
		}
		// 整体表达式文法树根节点弹出
		this.node = stack.pop();
	}
	
	public String output() {
		return node.interpret();
	}
}
