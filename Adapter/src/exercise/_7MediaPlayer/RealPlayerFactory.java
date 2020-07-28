package exercise._7MediaPlayer;

public class RealPlayerFactory implements PlayerFactory {

	@Override
	public MainWindow createMainWindow() {
		// TODO Auto-generated method stub
		return new RealPlayerWindow();
	}

	@Override
	public PlayerList createPlayerList() {
		// TODO Auto-generated method stub
		return new RealPlayerList();
	}

}
