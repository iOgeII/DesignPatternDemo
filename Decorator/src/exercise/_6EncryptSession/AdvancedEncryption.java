package exercise._6EncryptSession;

public class AdvancedEncryption extends Encryption {

	private Encryption encryption;
	
	public AdvancedEncryption(Encryption encryption) {
		// TODO Auto-generated constructor stub
		this.encryption = encryption;
	}
	
	@Override
	public void EncryptData() {
		// TODO Auto-generated method stub
		encryption.EncryptData();
	}

}
