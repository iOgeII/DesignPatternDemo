package example._2RobotController;

import java.util.Stack;

// ��������ָ��Ĺ����� ÿ��������һ���֣�ʶ�𵥴� ��and��
public class InstructionHandler {

	private AbstractNode node;
	
	public void handle(String instruction) {
		AbstractNode left = null, right = null;
		AbstractNode direction = null, action = null, distance = null;
		// ����һ��ջ���ڴ洢�����﷨��
		Stack<AbstractNode> stack = new Stack<AbstractNode>();
		
		// �Կո�ָ�ָ���ַ���
		String[] words = instruction.split(" ");
		for(int i = 0; i < words.length; i++) {
			// ����ջ����ָ�������� and��
			// ������3��������Ϊ3���ս�����ʽ������һ���򵥾��� SentenceNode����Ϊ and���ұ��ʽ
			// ջ�������ı��ʽΪ and����ʽ
			// ��� ��ϳ��� AndNode(left,right) ��ջ
			if(words[i].equalsIgnoreCase("and")) {
				// ����ջ�����ʽ��Ϊ����ʽ
				left = stack.pop();
				// ���ʶ��
				String word1 = words[++i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				// �����ұ��ʽ
				right = new SentenceNode(direction, action, distance);
				// �±��ʽ��ջ
				stack.push(new AndNode(left, right));
			}
			else {
				String word1 = words[i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				// �������ʽ
				left = new SentenceNode(direction, action, distance);
				// �±��ʽ��ջ
				stack.push(left);
			}
		}
		// ������ʽ�ķ������ڵ㵯��
		this.node = stack.pop();
	}
	
	public String output() {
		return node.interpret();
	}
}
