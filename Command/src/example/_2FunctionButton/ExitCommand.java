package example._2FunctionButton;

public class ExitCommand extends Command {

	private SystemExitClass seObj;

	public ExitCommand() {
		// TODO Auto-generated constructor stub
		this.seObj = new SystemExitClass();
	}
	
	// ����ִ�з�����������������ߵ�ҵ�񷽷�
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		seObj.exit();
	}

}
