package exercise._3CalculatorMulDivMod;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionHandler handler = new ExpressionHandler();
		// ������ÿո�ָ���
		handler.parseInstruction("3 * 4 / 2 % 4");
		System.out.println(handler.getResult());
	}

}
