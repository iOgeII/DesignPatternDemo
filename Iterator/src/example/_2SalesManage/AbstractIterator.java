package example._2SalesManage;

public interface AbstractIterator {

	public void next();					// ������һԪ��
	public boolean isLast();			// �ж��Ƿ�Ϊ���һ��Ԫ��
	public void previous();				// ������һԪ��
	public boolean isFirst();			// �ж��Ƿ�Ϊ��һ��Ԫ��
	public Object getNextItem();		// ��ȡ��һԪ��
	public Object getPreviousItem();	// ��ȡ��һԪ��
	
}
