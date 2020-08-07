package exercise._4CalculatorAdvance;

import java.util.ArrayList;

public class CalculatorForm {

	private ArrayList<AbstractCommand> commands = new ArrayList<AbstractCommand>();
	private int currentCommand = 0;
	
	// 调用命令对象的execute()方法执行运算
	public void compute(AbstractCommand command,int value) {
		commands.add(currentCommand, command);
		currentCommand ++;
		int i = command.execute(value);
		System.out.println("执行运算，运算结果为：" + i);
	}
	
	// 调用命令对象的undo()方法执行撤销
	public void undo() {
		int i = commands.get(currentCommand - 1).undo();
		currentCommand --;
		System.out.println("执行撤销，运算结果为：" + i);
	}
	
	// 调用命令对象的redo()方法执行重做
	public void redo() {
		AbstractCommand command = commands.get(currentCommand);
		int i = command.execute(command.getValue());
		System.out.println("执行撤销，运算结果为：" + i);
	}

}
