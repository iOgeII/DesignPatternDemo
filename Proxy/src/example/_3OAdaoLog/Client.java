package example._3OAdaoLog;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvocationHandler handler = null;
		AbstractUserDAO userDAO = new UserDAO();
		handler = new DAOLogHandler(userDAO);
		AbstractUserDAO proxy = null;
		
		// ��̬��������������ڴ���һ��AbstractUserDAO���͵���ʵ�������
		proxy = (AbstractUserDAO)Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[] {AbstractUserDAO.class}, handler);
		// ���ö����ҵ�񷽷�
		proxy.findUserById("���޼�");
		
		AbstractDocumentDAO documentDAO = new DocumentDAO();
		handler = new DAOLogHandler(documentDAO);
		AbstractDocumentDAO proxy2 = null;
		
		// ��̬��������������ڴ���һ��AbstractUserDAO���͵���ʵ�������
		proxy2 = (AbstractDocumentDAO)Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[] {AbstractDocumentDAO.class}, handler);
		// ���ö����ҵ�񷽷�
		proxy2.deleteDocumentById("D002");
		
	}

}
