package example._1framework;

// ÀàÊÊÅäÆ÷
public class AdapterClass extends Adaptee implements Target {

	@Override
	public void request() {
		// TODO Auto-generated method stub

		System.out.println("ÀàÊÊÅäÆ÷ÊÊÅäÖĞ...");
		super.specificRequest();
	}

}
