package example._1framework;

public class ConcreteFlyweight extends Flyweight {

	private String intrinsicState;
	
	public ConcreteFlyweight(String intrinsicState) {
		this.intrinsicState = intrinsicState;
	}
	
	// →外部状态 extrinsicState 在使用时由外部设置，不保存在享元对象中
	// →即使是同一个对象，每次调用时也可传入不同的外部状态
	@Override
	public void operation(String extrinsicState) {
		// TODO Auto-generated method stub
		// 实现业务方法
		System.out.println("共享享元外部状态："+extrinsicState);
	}

}
