package exercise._3CalculatorMulDivMod;

public class ExpressionNode extends AbstractNode {
	
	private AbstractNode left;
	private AbstractNode right;
	private AbstractNode operator;

	public ExpressionNode(AbstractNode left, AbstractNode right, AbstractNode operator) {
		super();
		this.left = left;
		this.right = right;
		this.operator = operator;
	}

	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		double leftResult = Double.valueOf(left.interpret());
		double rightResult = Double.valueOf(right.interpret());
		if(operator.interpret().equalsIgnoreCase("*")) {
			return Double.toString(leftResult*rightResult);
		}
		else if (operator.interpret().equalsIgnoreCase("/")) {
			return Double.toString(leftResult/rightResult);
		}
		else if (operator.interpret().equalsIgnoreCase("%")) {
			return Double.toString(((int)leftResult) % ((int)rightResult));
		}
		else {
			return "不支持的运算："+operator.interpret();
		}
	}

}
