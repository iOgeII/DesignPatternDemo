package example._2SalesManage;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {

	protected List<Object> objects = new ArrayList<Object>();
	
	public AbstractObjectList(List<Object> objects) {
		// TODO Auto-generated constructor stub
		this.objects = objects;
	}
	
	public void addObject(Object obj) {
		objects.add(obj);
	}
	
	public void removeObject(Object obj) {
		objects.remove(obj);
	}
	
	public List<Object> getObjects(){
		return this.objects;
	}
	
	// 声明创建迭代器的抽象工厂方法
	public abstract AbstractIterator createIterator();
}
