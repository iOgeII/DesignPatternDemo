package exercise._5videosw;

public abstract class ModeBuilder {

	protected Mode mode = new Mode();
	
	public abstract void buildMenu();
	public abstract void buildPlaylist();
	public abstract void buildMainwindow();
	public abstract void buidScroll();
	public abstract void buildFavlist();
	
	public boolean isMini() {
		return false;
	}
	
	public boolean isMemory() {
		return false;
	}
	
	public Mode createMode() {
		return this.mode;
	}
	
	public Mode construct() {
		if(!this.isMini() && !this.isMemory()) {
			this.buildMenu();
		}
		if(!this.isMini()) {
			this.buildPlaylist();
			this.buildFavlist();
		}
		this.buildMainwindow();
		this.buidScroll();
		return this.mode;
		
	}
}
