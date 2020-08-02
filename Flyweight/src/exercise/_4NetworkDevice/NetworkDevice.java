package exercise._4NetworkDevice;

public abstract class NetworkDevice {

	public abstract String getDevice();
	public void Connect(Computer c) {
		System.out.println("连接到设备："+this.getDevice()+"，端口号："+c.getPort());
	}
}
