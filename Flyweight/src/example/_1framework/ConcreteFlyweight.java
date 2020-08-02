package example._1framework;

public class ConcreteFlyweight extends Flyweight {

	private String intrinsicState;
	
	public ConcreteFlyweight(String intrinsicState) {
		this.intrinsicState = intrinsicState;
	}
	
	// ���ⲿ״̬ extrinsicState ��ʹ��ʱ���ⲿ���ã�����������Ԫ������
	// ����ʹ��ͬһ������ÿ�ε���ʱҲ�ɴ��벻ͬ���ⲿ״̬
	@Override
	public void operation(String extrinsicState) {
		// TODO Auto-generated method stub
		// ʵ��ҵ�񷽷�
		System.out.println("������Ԫ�ⲿ״̬��"+extrinsicState);
	}

}
