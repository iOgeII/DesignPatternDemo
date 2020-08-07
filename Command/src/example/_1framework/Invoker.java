package example._1framework;

public class Invoker {

	private Command command;
	
	// ����ע��
	public Invoker(Command command) {
		this.command = command;
	}
	
	// ��ֵע��
	public void setCommand(Command command) {
		this.command = command;
	}
	
	// ҵ�񷽷������ڵ��������� execute()����
	public void call() {
		command.execute();
	}
}
