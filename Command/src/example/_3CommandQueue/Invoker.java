package example._3CommandQueue;

public class Invoker {

	private CommandQueue commandQueue;
	
	// ����ע��
	public Invoker(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}
	
	// ��ֵע��
	public void setCommand(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}
	
	// ҵ�񷽷������ڵ��������� execute()����
	public void call() {
		commandQueue.execute();
	}
}
