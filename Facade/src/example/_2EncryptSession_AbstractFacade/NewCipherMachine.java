package example._2EncryptSession_AbstractFacade;

public class NewCipherMachine {

	public String encrypt(String plainText) {
		System.out.print("���ݼ��ܣ�������תΪ���ģ�");
		String es = "";
		int key = 10; // ����Կ����λ����Ϊ10
		for(int i = 0; i < plainText.length(); i++) {
			char c = plainText.charAt(i);
			// ��Сд��λ
			if(c >= 'a' && c <= 'z') {
				c += key % 26;
				if(c > 'z') c-=26;
				if(c < 'a') c+=26;
			}
			// ����д��λ
			if(c >= 'A' && c <= 'Z') {
				c += key % 26;
				if(c > 'Z') c-=26;
				if(c < 'A') c+=26;
			}
			es += c;
		}
		System.out.println(es);
		return es;
	}
}
