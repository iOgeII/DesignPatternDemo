package exercise._7MediaPlayer;

import exercise._7MediaPlayer.apis.RealPlayerAPI;

public class RealPlayerList implements PlayerList {

	private RealPlayerAPI rpAPI = new RealPlayerAPI();
	
	public void foldList() {
		rpAPI.foldList();
	}
	
	public void sortList() {
		rpAPI.sortList();
	}

}
