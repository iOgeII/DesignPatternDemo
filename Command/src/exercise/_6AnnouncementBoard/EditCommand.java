package exercise._6AnnouncementBoard;

public class EditCommand extends Command {

	public EditCommand(BoardFunction function) {
		super(function);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		function.edit();
	}

}
