package example._3OAdaoLog;

public class UserDAO implements AbstractUserDAO {

	@Override
	public Boolean findUserById(String userId) {
		// TODO Auto-generated method stub
		if(userId.equalsIgnoreCase("���޼�")) {
			System.out.println("��ѯIDΪ"+userId+"����Ϣ�ɹ���");
			return true;
		}
		else {
			System.out.println("��ѯIDΪ"+userId+"����Ϣʧ�ܣ�");
			return false;
		}
	}
	

	
}
