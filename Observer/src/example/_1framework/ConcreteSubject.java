package example._1framework;

public class ConcreteSubject extends Subject {

	@Override
	public void notifyX() {
		// TODO Auto-generated method stub
		// 遍历观察者集合，调用每一个观察者的响应方法
		for(Observer observer: observers) {
			observer.update();
		}
	}

}
