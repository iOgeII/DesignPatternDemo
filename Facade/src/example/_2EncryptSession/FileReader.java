package example._2EncryptSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

	public String read(String fileNameSrc) {
		System.out.print("��ȡ�ļ�����ȡ���ģ�");
		StringBuffer sb = new StringBuffer();
		try {
			FileInputStream fis = new FileInputStream(fileNameSrc);
			int data;
			while((data = fis.read()) != -1) {
				sb = sb.append((char)data);
			}
			fis.close();
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("�ļ������ڣ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ���������");
		}
		return sb.toString();
	}
}
