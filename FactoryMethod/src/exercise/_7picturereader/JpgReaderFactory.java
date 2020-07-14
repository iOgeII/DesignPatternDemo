package exercise._7picturereader;

public class JpgReaderFactory implements ImageReaderFactory {

	@Override
	public ImageReader getReader() {
		// TODO Auto-generated method stub
		return new JpgReader();
	}

}
