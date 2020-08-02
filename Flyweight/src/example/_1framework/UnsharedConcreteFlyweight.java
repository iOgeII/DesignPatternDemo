package example._1framework;

public class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void operation(String extrinsicState) {
		// TODO Auto-generated method stub
		// →实现业务方法
		System.out.println("非共享享元外部状态："+extrinsicState);
	}

}
