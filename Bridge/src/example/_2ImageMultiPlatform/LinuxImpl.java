package example._2ImageMultiPlatform;

public class LinuxImpl implements ImageImp {

	@Override
	public void doPaint(Matrix m) {
		// TODO Auto-generated method stub
		// Linux系统的绘制函数绘制像素矩阵
		System.out.println("在Linux系统中显示图像！");
	}

}
