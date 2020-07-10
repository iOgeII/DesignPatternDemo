package example._3userlogin;

public class HibernateUserDAO implements UserDAO {

	public HibernateUserDAO() {
		System.out.println("初始化Hibernate。");
	}

	@Override
	public void findUserById() {
		// TODO Auto-generated method stub
		System.out.println("使用Hibernate访问数据库。");
	}
}
