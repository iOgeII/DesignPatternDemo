package exercise._5RequestLog;

public class ModifyCommand extends Command {

	public ModifyCommand(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(String args) {
		// TODO Auto-generated method stub
		this.args = args;
		configOperator.modify(args);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		configOperator.modify(args);
	}


}
