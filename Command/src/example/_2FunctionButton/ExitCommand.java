package example._2FunctionButton;

public class ExitCommand extends Command {

	private SystemExitClass seObj;

	public ExitCommand() {
		// TODO Auto-generated constructor stub
		this.seObj = new SystemExitClass();
	}
	
	// 命令执行方法，调用请求接收者的业务方法
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		seObj.exit();
	}

}
