package example._2ImageMultiPlatform;

public class PNGImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		// ��ģ�����PNG�ļ������һ�����ؾ������m
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName+", ��ʽΪPNG.");
	}

}
