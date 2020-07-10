package example._3userlogin;

/**
 * 简单工厂模式中的 ConcreteProductA
 * @author 香南鹤砚
 *
 */
public class JDBCUserDAO implements UserDAO {
	
	public JDBCUserDAO() {
		System.out.println("初始化JDBC驱动。");
	}

	@Override
	public void findUserById() {
		// TODO Auto-generated method stub
		System.out.println("使用JDBC驱动访问数据库。");
	}

}
