package exercise._6EncryptSession;

public class ReverseEncryption extends AdvancedEncryption {

	public ReverseEncryption(Encryption encryption) {
		super(encryption);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void EncryptData() {
		// TODO Auto-generated method stub
		super.EncryptData();
		this.ReverseEncryptData();
	}
	
	public void ReverseEncryptData() {
		// TODO Auto-generated method stub
		System.out.print("---ÄæÏòÊä³ö¼ÓÃÜ");
	}

}
