package exercise._3CalculatorMulDivMod;

public class NumberNode extends AbstractNode {

	private String number;
	
	public NumberNode(String number) {
		this.number = number;
	}

	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return number;
	}

}
