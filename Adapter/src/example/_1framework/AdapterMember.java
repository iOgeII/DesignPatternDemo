package example._1framework;

public class AdapterMember implements Target {

	// ά��һ�������߶��������
	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("����������������...");
		// ת������
		adaptee.specificRequest();
	}
	
	
}
