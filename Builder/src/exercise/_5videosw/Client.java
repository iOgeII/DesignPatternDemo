package exercise._5videosw;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModeBuilder mb = (ModeBuilder)XMLUtil.getBean();
		
		Mode mode;
		mode = mb.construct();
		
		System.out.println(mode.getMenu());
		System.out.println(mode.getPlaylist());
		System.out.println(mode.getMainwindow());
		System.out.println(mode.getScroll());
		System.out.println(mode.getFavlist());	
	}

}
