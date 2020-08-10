package example._1framework;

import java.util.ArrayList;

public abstract class Subject {

	// ����һ���۲��߼������ڴ洢���й۲��߶���
	protected ArrayList<Observer> observers = new ArrayList<Observer>();
	
	// ע�᷽����������۲��߼���������һ���۲���
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	// ע�����������ڴӹ۲��߼�����ɾ��һ���۲���
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	// ��������֪ͨ����
	// ����Cannot override the final method from Object
	public abstract void notifyX();
	
}
