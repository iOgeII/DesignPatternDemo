package exercise._4CalculatorAdvance;

import java.util.ArrayList;

public abstract class AbstractCommand {

	protected int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	// 声明命令执行方法 execute()
	public abstract int execute(int value);
	// 声明撤销方法 undo()
	public abstract int undo();
	
	
}
