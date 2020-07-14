package exercise._7picturereader;

public class Client {

	public static void main(String[] args) {
		
		ImageReaderFactory irFactory;
		ImageReader reader;
		irFactory = (ImageReaderFactory)XMLUtil.getbean();
		reader = irFactory.getReader();
		reader.ReaderInfo();
	}
}
