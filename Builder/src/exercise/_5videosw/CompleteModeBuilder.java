package exercise._5videosw;

public class CompleteModeBuilder extends ModeBuilder {

	@Override
	public void buildMenu() {
		// TODO Auto-generated method stub
		this.mode.setMenu("[完整]菜单");
	}

	@Override
	public void buildPlaylist() {
		// TODO Auto-generated method stub
		this.mode.setPlaylist("[完整]播放列表");
	}

	@Override
	public void buildMainwindow() {
		// TODO Auto-generated method stub
		this.mode.setMainwindow("[完整]主窗口");
	}

	@Override
	public void buidScroll() {
		// TODO Auto-generated method stub
		this.mode.setScroll("[完整]滚动条");
	}

	@Override
	public void buildFavlist() {
		// TODO Auto-generated method stub
		this.mode.setFavlist("[完整]收藏列表");
	}

}
