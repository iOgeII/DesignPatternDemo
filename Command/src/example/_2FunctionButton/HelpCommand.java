package example._2FunctionButton;

public class HelpCommand extends Command {

	private DisplayHelpClass dhObj;
	
	public HelpCommand() {
		// TODO Auto-generated constructor stub
		this.dhObj = new DisplayHelpClass();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		dhObj.display();
	}

}
