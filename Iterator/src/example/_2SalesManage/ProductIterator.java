package example._2SalesManage;

import java.util.List;

public class ProductIterator implements AbstractIterator {

	private List<Object> products;
	private int cursor1;	// 游标记录正向遍历位置
	private int cursor2;	// 游标记录逆向遍历位置
	
	public ProductIterator(ProductList list) {
		// TODO Auto-generated constructor stub
		this.products = list.getObjects();
		cursor1 = 0;
		cursor2 = products.size() - 1;
	}
	
	@Override
	public void next() {
		// TODO Auto-generated method stub
		if (cursor1 < products.size()) {
			cursor1++;
		}
	}

	@Override
	public boolean isLast() {
		// TODO Auto-generated method stub
		return (cursor1==products.size());
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		if (cursor2 > -1) {
			cursor2 --;
		}
	}

	@Override
	public boolean isFirst() {
		// TODO Auto-generated method stub
		return (cursor2==-1);
	}

	@Override
	public Object getNextItem() {
		// TODO Auto-generated method stub
		return products.get(cursor1);
	}

	@Override
	public Object getPreviousItem() {
		// TODO Auto-generated method stub
		return products.get(cursor2);
	}

}
