package exercise._6BBSPrivilege;

public class RealBBS implements BBS {

	@Override
	public void showPrivilege(String name, int privilege) {
		// TODO Auto-generated method stub
		System.out.println(name+"，您有 发帖、修改个人信息、修改个人帖子 权限");
	}

}
