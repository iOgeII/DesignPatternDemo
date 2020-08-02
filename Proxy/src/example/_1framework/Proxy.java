package example._1framework;

public class Proxy extends Subject {

	private RealSubject realSubject = new RealSubject();
	
	public void preRequest() {
		System.out.println("代理准备...");
	}
	
	public void postRequest() {
		System.out.println("代理结束");
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		preRequest();
		realSubject.request();
		postRequest();
	}

}
