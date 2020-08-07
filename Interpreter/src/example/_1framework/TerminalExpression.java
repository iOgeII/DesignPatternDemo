package example._1framework;

public class TerminalExpression extends AbstractExpression {

	@Override
	public String interpret(Context ctx) {
		// TODO Auto-generated method stub
		// 终结符表达式的解释操作
		System.out.println("终结符！");
		return null;
	}

}
