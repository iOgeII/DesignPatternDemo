package example._2SalesManage;

import java.util.List;

public class ProductList extends AbstractObjectList {

	public ProductList(List<Object> objects) {
		super(objects);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractIterator createIterator() {
		// TODO Auto-generated method stub
		return new ProductIterator(this);
	}

}
