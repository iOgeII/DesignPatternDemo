package example._1framework;

public class ConcreteSubject extends Subject {

	@Override
	public void notifyX() {
		// TODO Auto-generated method stub
		// �����۲��߼��ϣ�����ÿһ���۲��ߵ���Ӧ����
		for(Observer observer: observers) {
			observer.update();
		}
	}

}
