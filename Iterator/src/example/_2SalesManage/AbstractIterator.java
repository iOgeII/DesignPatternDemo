package example._2SalesManage;

public interface AbstractIterator {

	public void next();					// 移至下一元素
	public boolean isLast();			// 判断是否为最后一个元素
	public void previous();				// 移至上一元素
	public boolean isFirst();			// 判断是否为第一个元素
	public Object getNextItem();		// 获取下一元素
	public Object getPreviousItem();	// 获取上一元素
	
}
