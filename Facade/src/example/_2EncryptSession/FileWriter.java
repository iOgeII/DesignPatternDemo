package example._2EncryptSession;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {

	public void write(String encryptStr, String fileNameDes) {
		System.out.println("保存密文，写入文件");
		try {
			FileOutputStream fos = new FileOutputStream(fileNameDes);
			fos.write(encryptStr.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("文件不存在！");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("文件操作错误！");
		}
	}
}
