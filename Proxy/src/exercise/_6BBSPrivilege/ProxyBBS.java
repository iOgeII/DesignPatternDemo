package exercise._6BBSPrivilege;

public class ProxyBBS implements BBS {
	
	private RealBBS realBBS;
	private int privilege;
	
	public static int Visitor = 0;
	public static int User = 1;

	@Override
	public void showPrivilege(String name, int privilege) {
		// TODO Auto-generated method stub
		if(privilege == Visitor) {
			System.out.println(name+"，您是游客，访问受限");
		}
		else if(privilege == User){
			realBBS = new RealBBS();
			realBBS.showPrivilege(name, privilege);
		}
		else {
			System.out.println("无此类账户");
		}
	}

}
