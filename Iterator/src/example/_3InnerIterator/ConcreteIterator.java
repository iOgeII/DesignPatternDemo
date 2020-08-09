package example._3InnerIterator;

public class ConcreteIterator implements Iterator {
	
	// 维持一个对聚合对象的引用 便于访问存储在聚合对象中的数据
	private ConcreteAggregate concreteAggregate;
	// 定义一个游标 用于记录当前访问位置
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
