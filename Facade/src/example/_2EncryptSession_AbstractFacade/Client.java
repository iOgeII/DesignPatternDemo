package example._2EncryptSession_AbstractFacade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEncryptFacade ef = (AbstractEncryptFacade)XMLUtil.getBean();
		ef.fileEncrypt("src//example//_2EncryptSession_AbstractFacade//src.txt", "src//example//_2EncryptSession_AbstractFacade//des.txt");
	}

}
