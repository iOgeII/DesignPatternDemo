package exercise._7MediaPlayer;

import exercise._7MediaPlayer.apis.MediaPlayerAPI;

public class MediaPlayerWindow implements MainWindow {

	private MediaPlayerAPI mpAPI = new MediaPlayerAPI();
	
	public void fullScreen() {
		mpAPI.fullScreen();
	}
	
}
