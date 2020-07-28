package example._2toycar;

public abstract class CarController {

	public void move() {
		System.out.println("玩具汽车移动！");
	}
	
	// 声音提示
	public abstract void phonate();

	// 灯光闪烁
	public abstract void twinkle();
}
