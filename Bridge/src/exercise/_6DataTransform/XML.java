package exercise._6DataTransform;

public class XML extends FileFormat {

	@Override
	public void transformData() {
		// TODO Auto-generated method stub
		db.getData();
		System.out.println("格式转换中...转换为.xml");
	}

}
