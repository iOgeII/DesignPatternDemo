package exercise._6OneTouchBackup;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackUp bu = new MMCBackUp();
		bu.oneTouchBackup();
		
		System.out.println("-----------");
		
		bu = new SDBackUp();
		bu.oneTouchBackup();
	}

}
