package exercise._3CalculatorMulDivMod;

public class OperatorNode extends AbstractNode {

	private String operator;
	
	public OperatorNode(String operator) {
		this.operator = operator;
	}

	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return operator;
	}

}
