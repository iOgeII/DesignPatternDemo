package example._3userlogin;

public class HibernateUserDAO implements UserDAO {

	public HibernateUserDAO() {
		System.out.println("��ʼ��Hibernate��");
	}

	@Override
	public void findUserById() {
		// TODO Auto-generated method stub
		System.out.println("ʹ��Hibernate�������ݿ⡣");
	}
}
