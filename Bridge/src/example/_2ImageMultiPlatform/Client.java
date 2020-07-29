package example._2ImageMultiPlatform;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image;
		ImageImp imp;
		
		image = (Image)XMLUtil.getBean("image");
		imp = (ImageImp)XMLUtil.getBean("os");
		
		image.setImageImpl(imp);
		image.parseFile("½ôÄÇÂÞ");
	}

}
