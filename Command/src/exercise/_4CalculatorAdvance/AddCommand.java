package exercise._4CalculatorAdvance;

public class AddCommand extends AbstractCommand {

	private Adder adder = new Adder();
//	private int value;
	
	// 实现抽象命令类中声明的execute()方法，调用加法类的加法操作
	@Override
	public int execute(int value) {
		// TODO Auto-generated method stub
		this.value = value;
		return adder.add(value);

	}

	// 实现抽象命令类中声明的undo()方法，通过加一个相反数来实现加法逆向操作
	@Override
	public int undo() {
		// TODO Auto-generated method stub
		return adder.add(-this.value);

	}

}
