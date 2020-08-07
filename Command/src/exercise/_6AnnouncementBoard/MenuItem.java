package exercise._6AnnouncementBoard;

public class MenuItem {

	private Command command;
	
	public MenuItem(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}
}
