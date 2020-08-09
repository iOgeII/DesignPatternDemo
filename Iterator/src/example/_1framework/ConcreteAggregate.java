package example._1framework;

public class ConcreteAggregate implements Aggregate {

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

}
