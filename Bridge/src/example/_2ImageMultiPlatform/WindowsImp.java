package example._2ImageMultiPlatform;

public class WindowsImp implements ImageImp {

	@Override
	public void doPaint(Matrix m) {
		// TODO Auto-generated method stub
		// Windows系统的绘制函数绘制像素矩阵
		System.out.println("在Windows系统中显示图像！");
	}

}
