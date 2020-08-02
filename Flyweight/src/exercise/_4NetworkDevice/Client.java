package exercise._4NetworkDevice;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetworkDeviceFactory ndf = NetworkDeviceFactory.getInstance();

		NetworkDevice switch1 = ndf.getDevice("switch");
		NetworkDevice switch2 = ndf.getDevice("switch");
		System.out.println("switch1==switch2:"+(switch1 == switch2));
		
		NetworkDevice hub1 = ndf.getDevice("hub");
		NetworkDevice hub2 = ndf.getDevice("hub");
		System.out.println("hub1==hub2:"+(hub1 == hub2));
		
		switch1.Connect(new Computer(8084));
		switch2.Connect(new Computer(8086));
		
		hub1.Connect(new Computer(11074));
		hub2.Connect(new Computer(11076));
	}

}
