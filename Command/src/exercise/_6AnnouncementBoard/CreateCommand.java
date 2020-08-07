package exercise._6AnnouncementBoard;

public class CreateCommand extends Command {

	public CreateCommand(BoardFunction function) {
		super(function);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		function.create();
	}

}
