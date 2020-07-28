package example._2toycar;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarController cc = (CarController)XMLUtil.getBean();
		cc.move();
		cc.phonate();
		cc.twinkle();
	}

}
