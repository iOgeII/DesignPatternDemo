package exercise._4CalculatorAdvance;

import java.util.ArrayList;

public class CalculatorForm {

	private ArrayList<AbstractCommand> commands = new ArrayList<AbstractCommand>();
	private int currentCommand = 0;
	
	// ������������execute()����ִ������
	public void compute(AbstractCommand command,int value) {
		commands.add(currentCommand, command);
		currentCommand ++;
		int i = command.execute(value);
		System.out.println("ִ�����㣬������Ϊ��" + i);
	}
	
	// ������������undo()����ִ�г���
	public void undo() {
		int i = commands.get(currentCommand - 1).undo();
		currentCommand --;
		System.out.println("ִ�г�����������Ϊ��" + i);
	}
	
	// ������������redo()����ִ������
	public void redo() {
		AbstractCommand command = commands.get(currentCommand);
		int i = command.execute(command.getValue());
		System.out.println("ִ�г�����������Ϊ��" + i);
	}

}
