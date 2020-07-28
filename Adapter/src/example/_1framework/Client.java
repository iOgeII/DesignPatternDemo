package example._1framework;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdapterClass ac = new AdapterClass();
		ac.request();
		System.out.println("---------------");
		AdapterMember am = new AdapterMember();
		am.request();
	}

}
