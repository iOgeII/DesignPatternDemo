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
		System.out.println("���ס��"+name+"�����㣡");
	}

	// ע�������ǹ۲���״̬���ˣ��������Ŀ��״̬����
	@Override
	public void beAttacked(AllyControlCenter acc) {
		// TODO Auto-generated method stub
		System.out.println(name+"��������");
		acc.notifyObserver(name);
	}

}
