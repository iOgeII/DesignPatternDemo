package exercise._4NetworkDevice;

public abstract class NetworkDevice {

	public abstract String getDevice();
	public void Connect(Computer c) {
		System.out.println("���ӵ��豸��"+this.getDevice()+"���˿ںţ�"+c.getPort());
	}
}
