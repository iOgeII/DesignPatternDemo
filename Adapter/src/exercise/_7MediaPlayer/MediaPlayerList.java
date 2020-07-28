package exercise._7MediaPlayer;

import exercise._7MediaPlayer.apis.MediaPlayerAPI;

public class MediaPlayerList implements PlayerList {

	private MediaPlayerAPI mpAPI = new MediaPlayerAPI();
	
	public void foldList() {
		mpAPI.foldList();
	}

	@Override
	public void sortList() {
		// TODO Auto-generated method stub
		
	}

}
