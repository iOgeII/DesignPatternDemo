package example._3OAdaoLog;

public class UserDAO implements AbstractUserDAO {

	@Override
	public Boolean findUserById(String userId) {
		// TODO Auto-generated method stub
		if(userId.equalsIgnoreCase("张无忌")) {
			System.out.println("查询ID为"+userId+"的信息成功！");
			return true;
		}
		else {
			System.out.println("查询ID为"+userId+"的信息失败！");
			return false;
		}
	}
	

	
}
