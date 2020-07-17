package exercise._5videosw;

public class MiniModeBuilder extends ModeBuilder {

	public boolean isMini() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void buildMenu() {
		// TODO Auto-generated method stub
		this.mode.setMenu("[精简]菜单");
	}

	@Override
	public void buildPlaylist() {
		// TODO Auto-generated method stub
		this.mode.setPlaylist("[精简]播放列表");
	}

	@Override
	public void buildMainwindow() {
		// TODO Auto-generated method stub
		this.mode.setMainwindow("[精简]主窗口");
	}

	@Override
	public void buidScroll() {
		// TODO Auto-generated method stub
		this.mode.setScroll("[精简]滚动条");
	}

	@Override
	public void buildFavlist() {
		// TODO Auto-generated method stub
		this.mode.setFavlist("[精简]收藏列表");
	}
	
}
