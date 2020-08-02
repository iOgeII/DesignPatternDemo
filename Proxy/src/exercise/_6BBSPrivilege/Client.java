package exercise._6BBSPrivilege;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyBBS proxy = new ProxyBBS();
		proxy.showPrivilege("’≈»˝", ProxyBBS.Visitor);
		System.out.println("---------------");
		proxy.showPrivilege("¿Ó∆Ê", ProxyBBS.User);
	}

}
