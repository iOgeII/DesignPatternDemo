package example._2OnlineMatchGame;

public class ConcreteAllyControlCenter extends AllyControlCenter {
	
	public ConcreteAllyControlCenter(String allyName) {
		System.out.println(allyName+"ս���齨�ɹ�");
		System.out.println("--------------------");
		this.allyName = allyName;
	}

	@Override
	public void notifyObserver(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.allyName+"ս�ӽ���֪ͨ������"+name+"�⵽���˹�����");
		// �����۲��߼��ϣ����ó��Լ�֮����������ѵľ�Ԯ����
		for(Observer observer : players) {
			if (!observer.getName().equalsIgnoreCase(name)) {
				observer.help();
			}
		}
	}

}
