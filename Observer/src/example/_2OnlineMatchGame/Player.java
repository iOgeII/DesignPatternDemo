package example._2OnlineMatchGame;

public class Player implements Observer {

	private String name;
	
	public Player(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("坚持住，"+name+"来救你！");
	}

	// 注意这里是观察者状态变了，框架里是目标状态变了
	@Override
	public void beAttacked(AllyControlCenter acc) {
		// TODO Auto-generated method stub
		System.out.println(name+"被攻击！");
		acc.notifyObserver(name);
	}

}
