package example._1framework;

// ��������
public class AdapterClass extends Adaptee implements Target {

	@Override
	public void request() {
		// TODO Auto-generated method stub

		System.out.println("��������������...");
		super.specificRequest();
	}

}
