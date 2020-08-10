package example._2OnlineMatchGame;

import java.util.ArrayList;

public abstract class AllyControlCenter {

	// ս������
	protected String allyName;
	
	// ����һ���������ڴ洢ս�ӳ�Ա
	protected ArrayList<Observer> players = new ArrayList<Observer>();

	public String getAllyName() {
		return allyName;
	}

	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}
	
	// ע�᷽��
	public void join(Observer observer) {
		System.out.println(observer.getName()+"����"+this.allyName+"ս�ӣ�");
		players.add(observer);
	}
	
	// ע������
	public void quit(Observer observer) {
		System.out.println(observer.getName()+"�˳�"+this.allyName+"ս�ӣ�");
		players.remove(observer);
	}
	
	// ��������֪ͨ����
	public abstract void notifyObserver(String name);
}
