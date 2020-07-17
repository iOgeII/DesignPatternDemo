package exercise._5videosw;

public class MemoryModeBuilder extends ModeBuilder {

	public boolean isMemory() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void buildMenu() {
		// TODO Auto-generated method stub
		this.mode.setMenu("[记忆]菜单");
	}

	@Override
	public void buildPlaylist() {
		// TODO Auto-generated method stub
		this.mode.setPlaylist("[记忆]播放列表");
	}

	@Override
	public void buildMainwindow() {
		// TODO Auto-generated method stub
		this.mode.setMainwindow("[记忆]主窗口");
	}

	@Override
	public void buidScroll() {
		// TODO Auto-generated method stub
		this.mode.setScroll("[记忆]滚动条");
	}

	@Override
	public void buildFavlist() {
		// TODO Auto-generated method stub
		this.mode.setFavlist("[记忆]收藏列表");
	}

}
