package exercise._7MediaPlayer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainWindow mainWindow;
		PlayerList playerList;
		
		PlayerFactory playerFactory = (PlayerFactory)XMLUtil.getBean();
		
		mainWindow = playerFactory.createMainWindow();
		playerList = playerFactory.createPlayerList();
		
		// 反射机制实现父类调用子类方法
		
		System.out.println("全屏：");
		mainWindow.fullScreen();
		System.out.println("折叠播放列表：");
		playerList.foldList();
		System.out.println("播放列表排序：");
		playerList.sortList();
		
	}

}
