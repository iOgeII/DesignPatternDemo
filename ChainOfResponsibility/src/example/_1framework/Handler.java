package example._1framework;

public abstract class Handler {

	// →维持对后继处理者的引用
	// protected关键字使得子类也可以对后继处理者进行操作
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(String request);
	
}
