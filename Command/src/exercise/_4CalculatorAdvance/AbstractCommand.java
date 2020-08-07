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
	
	// ��������ִ�з��� execute()
	public abstract int execute(int value);
	// ������������ undo()
	public abstract int undo();
	
	
}
