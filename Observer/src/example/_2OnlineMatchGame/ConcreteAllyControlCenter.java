package example._2OnlineMatchGame;

public class ConcreteAllyControlCenter extends AllyControlCenter {
	
	public ConcreteAllyControlCenter(String allyName) {
		System.out.println(allyName+"战队组建成功");
		System.out.println("--------------------");
		this.allyName = allyName;
	}

	@Override
	public void notifyObserver(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.allyName+"战队紧急通知，盟友"+name+"遭到敌人攻击！");
		// 遍历观察者集合，调用除自己之外的所有盟友的救援方法
		for(Observer observer : players) {
			if (!observer.getName().equalsIgnoreCase(name)) {
				observer.help();
			}
		}
	}

}
