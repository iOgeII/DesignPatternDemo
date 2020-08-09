package example._2SalesManage;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> products = new ArrayList<Object>();
		products.add("���콣");
		products.add("������");
		products.add("�ϳ���");
		products.add("��������");
		products.add("��ʮ���¾�");
	
		AbstractObjectList list;	// ����Ϊ����ۺ��� �б���
		AbstractIterator iterator;	// ����Ϊ�����������
		
		list = new ProductList(products);		// ����Ϊ����ۺ��� ��Ʒ�б���
		iterator = list.createIterator();		// ����Ϊ����������� ʹ�ù�����������������
		
		System.out.println("�������");
		while (!iterator.isLast()) {
			System.out.print(iterator.getNextItem()+",");
			iterator.next();
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("�������");
		while (!iterator.isFirst()) {
			System.out.print(iterator.getPreviousItem()+",");
			iterator.previous();
		}
		
	}

}
