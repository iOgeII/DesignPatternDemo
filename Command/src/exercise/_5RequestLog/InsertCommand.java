package exercise._5RequestLog;

public class InsertCommand extends Command {

	public InsertCommand(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(String args) {
		// TODO Auto-generated method stub
		this.args = args;
		configOperator.insert(args);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		configOperator.insert(args);
	}

}
