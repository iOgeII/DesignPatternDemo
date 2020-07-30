package exercise._6EncryptSession;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encryption encryption, adEncryption1, adEncryption2;
		
		encryption = new MoveBitEncryption();
		encryption.EncryptData();
		System.out.println("");
		System.out.println("----------------");
		
		adEncryption1 = new ReverseEncryption(encryption);
		adEncryption1.EncryptData();
		System.out.println("");
		System.out.println("----------------");
		
		adEncryption2 = new MD5Encryption(adEncryption1);
		adEncryption2.EncryptData();
		System.out.println("");
		System.out.println("----------------");
		
	}

}
