package example._2EncryptSession;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {

	public void write(String encryptStr, String fileNameDes) {
		System.out.println("�������ģ�д���ļ�");
		try {
			FileOutputStream fos = new FileOutputStream(fileNameDes);
			fos.write(encryptStr.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("�ļ������ڣ�");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("�ļ���������");
		}
	}
}
