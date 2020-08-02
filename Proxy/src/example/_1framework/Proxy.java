package example._1framework;

public class Proxy extends Subject {

	private RealSubject realSubject = new RealSubject();
	
	public void preRequest() {
		System.out.println("����׼��...");
	}
	
	public void postRequest() {
		System.out.println("�������");
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		preRequest();
		realSubject.request();
		postRequest();
	}

}
