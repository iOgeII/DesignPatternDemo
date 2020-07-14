package exercise._7picturereader;

public class GifReaderFactory implements ImageReaderFactory {

	@Override
	public ImageReader getReader() {
		// TODO Auto-generated method stub
		return new GifReader();
	}

}
