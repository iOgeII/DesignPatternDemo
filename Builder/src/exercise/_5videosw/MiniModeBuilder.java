package exercise._5videosw;

public class MiniModeBuilder extends ModeBuilder {

	public boolean isMini() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void buildMenu() {
		// TODO Auto-generated method stub
		this.mode.setMenu("[����]�˵�");
	}

	@Override
	public void buildPlaylist() {
		// TODO Auto-generated method stub
		this.mode.setPlaylist("[����]�����б�");
	}

	@Override
	public void buildMainwindow() {
		// TODO Auto-generated method stub
		this.mode.setMainwindow("[����]������");
	}

	@Override
	public void buidScroll() {
		// TODO Auto-generated method stub
		this.mode.setScroll("[����]������");
	}

	@Override
	public void buildFavlist() {
		// TODO Auto-generated method stub
		this.mode.setFavlist("[����]�ղ��б�");
	}
	
}
