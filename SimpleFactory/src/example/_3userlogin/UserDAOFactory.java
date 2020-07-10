package example._3userlogin;

/**
 * 简单工厂模式中的 Factory
 * @author 香南鹤砚
 *
 */
public class UserDAOFactory {
	
	public static final int JDBC_arg = 1;
	public static final int Hibernate_arg = 2;
	
	public static UserDAO createUserDAO(int arg) {
		UserDAO userDAO;
		if(arg == JDBC_arg) {
			System.out.println("创建JDBC连接。");
			userDAO = new JDBCUserDAO();
		}
		else if(arg == Hibernate_arg) {
			System.out.println("创建Hibernate连接。");
			userDAO = new HibernateUserDAO();
		}
		else {
			userDAO = null;
		}
		return userDAO;
	}
}
