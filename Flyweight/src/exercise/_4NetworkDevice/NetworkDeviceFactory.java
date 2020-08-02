package exercise._4NetworkDevice;

import java.util.Hashtable;

public class NetworkDeviceFactory {

	private static NetworkDeviceFactory instance = new NetworkDeviceFactory();
	private static Hashtable deviceTable;
	
	private NetworkDeviceFactory() {
		deviceTable = new Hashtable();
		NetworkDevice devSwitch,devHub;
		devSwitch = new Switch();
		devHub = new Hub();
		deviceTable.put("switch",devSwitch);
		deviceTable.put("hub",devHub);
	}
	
	public static NetworkDeviceFactory getInstance() {
		return instance;
	}
	
	public NetworkDevice getDevice(String key) {
		return (NetworkDevice)deviceTable.get(key);
	}
}
