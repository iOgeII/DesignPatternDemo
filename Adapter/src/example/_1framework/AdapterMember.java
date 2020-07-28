package example._1framework;

public class AdapterMember implements Target {

	// 维持一个适配者对象的引用
	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("对象适配器适配中...");
		// 转发调用
		adaptee.specificRequest();
	}
	
	
}
