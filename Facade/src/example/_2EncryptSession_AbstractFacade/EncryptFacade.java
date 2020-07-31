package example._2EncryptSession_AbstractFacade;

public class EncryptFacade extends AbstractEncryptFacade {

	private FileReader reader;
	private CipherMachine cipher;
	private FileWriter writer;
	
	public EncryptFacade() {
		reader = new FileReader();
		cipher = new CipherMachine();
		writer = new FileWriter();
	}
	
	@Override
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
	}
}
