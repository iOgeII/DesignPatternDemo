package example._3userlogin;

/**
 * �򵥹���ģʽ�е� Factory
 * @author ���Ϻ���
 *
 */
public class UserDAOFactory {
	
	public static final int JDBC_arg = 1;
	public static final int Hibernate_arg = 2;
	
	public static UserDAO createUserDAO(int arg) {
		UserDAO userDAO;
		if(arg == JDBC_arg) {
			System.out.println("����JDBC���ӡ�");
			userDAO = new JDBCUserDAO();
		}
		else if(arg == Hibernate_arg) {
			System.out.println("����Hibernate���ӡ�");
			userDAO = new HibernateUserDAO();
		}
		else {
			userDAO = null;
		}
		return userDAO;
	}
}
