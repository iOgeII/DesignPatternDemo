package exercise._5RequestLog;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileUtil {

	public static void writeCommands(ArrayList commands) {
		try {
			FileOutputStream fos = new FileOutputStream("config.log");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(commands);
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("±£¥Ê ß∞‹");
			e.printStackTrace();
		}
	}
	
	public static ArrayList readCommands() {
		try {
			FileInputStream fis = new FileInputStream("config.log");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList commands = (ArrayList)ois.readObject();
			ois.close();
			return commands;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("∂¡»° ß∞‹");
			e.printStackTrace();
			return null;
		}
	}
}
