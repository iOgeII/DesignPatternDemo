package example._1framework;

public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest(String request) {
		// TODO Auto-generated method stub
		// ���������������
		if(request.contains("a")) {
			// ��������
		}
		else {
			this.successor.handleRequest(request);
		}
	}

}
