package exercise._7MediaPlayer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainWindow mainWindow;
		PlayerList playerList;
		
		PlayerFactory playerFactory = (PlayerFactory)XMLUtil.getBean();
		
		mainWindow = playerFactory.createMainWindow();
		playerList = playerFactory.createPlayerList();
		
		// �������ʵ�ָ���������෽��
		
		System.out.println("ȫ����");
		mainWindow.fullScreen();
		System.out.println("�۵������б�");
		playerList.foldList();
		System.out.println("�����б�����");
		playerList.sortList();
		
	}

}
