package example._1framework;

public abstract class Handler {

	// ��ά�ֶԺ�̴����ߵ�����
	// protected�ؼ���ʹ������Ҳ���ԶԺ�̴����߽��в���
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(String request);
	
}
