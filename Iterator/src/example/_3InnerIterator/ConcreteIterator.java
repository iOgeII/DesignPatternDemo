package example._3InnerIterator;

public class ConcreteIterator implements Iterator {
	
	// ά��һ���Ծۺ϶�������� ���ڷ��ʴ洢�ھۺ϶����е�����
	private ConcreteAggregate concreteAggregate;
	// ����һ���α� ���ڼ�¼��ǰ����λ��
	private int cursor;

	public ConcreteIterator(ConcreteAggregate concreteAggregate) {
		// TODO Auto-generated constructor stub
		this.concreteAggregate = concreteAggregate;
	}

	@Override
	public void first() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
