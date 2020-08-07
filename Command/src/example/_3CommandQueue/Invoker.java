package example._3CommandQueue;

public class Invoker {

	private CommandQueue commandQueue;
	
	// 构造注入
	public Invoker(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}
	
	// 设值注入
	public void setCommand(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}
	
	// 业务方法，用于调用命令类 execute()方法
	public void call() {
		commandQueue.execute();
	}
}
