package example._2SalesManage;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> products = new ArrayList<Object>();
		products.add("倚天剑");
		products.add("屠龙刀");
		products.add("断肠草");
		products.add("葵花宝典");
		products.add("四十二章经");
	
		AbstractObjectList list;	// 声明为抽象聚合类 列表类
		AbstractIterator iterator;	// 声明为抽象迭代器类
		
		list = new ProductList(products);		// 定义为具体聚合类 商品列表类
		iterator = list.createIterator();		// 定义为具体迭代器类 使用工厂方法创建迭代器
		
		System.out.println("正向遍历");
		while (!iterator.isLast()) {
			System.out.print(iterator.getNextItem()+",");
			iterator.next();
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("逆向遍历");
		while (!iterator.isFirst()) {
			System.out.print(iterator.getPreviousItem()+",");
			iterator.previous();
		}
		
	}

}
