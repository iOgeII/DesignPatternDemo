package exercise._6AnnouncementBoard;

public class OpenCommand extends Command {

	public OpenCommand(BoardFunction function) {
		super(function);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		function.open();
	}
	
}
