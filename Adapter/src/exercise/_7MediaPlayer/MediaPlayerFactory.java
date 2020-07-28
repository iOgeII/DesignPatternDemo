package exercise._7MediaPlayer;

public class MediaPlayerFactory implements PlayerFactory {

	@Override
	public MainWindow createMainWindow() {
		// TODO Auto-generated method stub
		return new MediaPlayerWindow();
	}

	@Override
	public PlayerList createPlayerList() {
		// TODO Auto-generated method stub
		return new MediaPlayerList();
	}

}
