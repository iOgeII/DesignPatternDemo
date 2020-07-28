package exercise._7MediaPlayer;

import exercise._7MediaPlayer.apis.RealPlayerAPI;;

public class RealPlayerWindow implements MainWindow {

	private RealPlayerAPI rpAPI = new RealPlayerAPI();
	
	public void fullScreen() {
		rpAPI.fullScreen();
	}
}
