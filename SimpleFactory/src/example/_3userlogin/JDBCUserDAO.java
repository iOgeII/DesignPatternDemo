package example._3userlogin;

/**
 * �򵥹���ģʽ�е� ConcreteProductA
 * @author ���Ϻ���
 *
 */
public class JDBCUserDAO implements UserDAO {
	
	public JDBCUserDAO() {
		System.out.println("��ʼ��JDBC������");
	}

	@Override
	public void findUserById() {
		// TODO Auto-generated method stub
		System.out.println("ʹ��JDBC�����������ݿ⡣");
	}

}
