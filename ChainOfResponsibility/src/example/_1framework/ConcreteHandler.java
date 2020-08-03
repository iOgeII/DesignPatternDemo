package example._1framework;

public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest(String request) {
		// TODO Auto-generated method stub
		// 如果满足请求条件
		if(request.contains("a")) {
			// 处理请求
		}
		else {
			this.successor.handleRequest(request);
		}
	}

}
