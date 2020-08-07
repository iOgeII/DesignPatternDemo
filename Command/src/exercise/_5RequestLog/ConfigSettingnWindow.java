package exercise._5RequestLog;

import java.util.ArrayList;

public class ConfigSettingnWindow {

	private ArrayList<Command> commands = new ArrayList<Command>();
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void call(String args) {
		command.execute(args);
		commands.add(command);
	}
	
	public void save() {
		FileUtil.writeCommands(commands);
	}
	
	public void recover() {
		ArrayList list = FileUtil.readCommands();
		for (Object obj:list) {
			((Command)obj).execute();
		}
	}
}
