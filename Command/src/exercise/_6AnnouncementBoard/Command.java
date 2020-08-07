package exercise._6AnnouncementBoard;

public abstract class Command {

	protected BoardFunction function;
	
	public Command(BoardFunction function) {
		// TODO Auto-generated constructor stub
		this.function = function;
	}
	
	public abstract void execute();
}
