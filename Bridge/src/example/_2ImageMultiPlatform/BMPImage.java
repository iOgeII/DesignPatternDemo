package example._2ImageMultiPlatform;

public class BMPImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		// ��ģ�����BMP�ļ������һ�����ؾ������m
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName+", ��ʽΪBMP.");
	}

}
