package example._3CommandQueue;

import java.util.ArrayList;

public class CommandQueue {
	
	// ����һ���б����洢�������
	private ArrayList<Command> commands = new ArrayList<Command>();
	
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void removeCommand(Command command) {
		commands.remove(command);
	}
	
	// ѭ������ÿһ����������ҵ�񷽷�
	public void execute() {
		for (Object command:commands) {
			((Command)command).execute();
		}
	}
}
