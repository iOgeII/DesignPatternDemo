package example._2ImageMultiPlatform;

public abstract class Image {

	protected ImageImp imp;
	
	public void setImageImpl(ImageImp imp) {
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}
