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
		
		// 动态创建代理对象，用于代理一个AbstractUserDAO类型的真实主题对象
		proxy = (AbstractUserDAO)Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[] {AbstractUserDAO.class}, handler);
		// 调用对象的业务方法
		proxy.findUserById("张无忌");
		
		AbstractDocumentDAO documentDAO = new DocumentDAO();
		handler = new DAOLogHandler(documentDAO);
		AbstractDocumentDAO proxy2 = null;
		
		// 动态创建代理对象，用于代理一个AbstractUserDAO类型的真实主题对象
		proxy2 = (AbstractDocumentDAO)Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[] {AbstractDocumentDAO.class}, handler);
		// 调用对象的业务方法
		proxy2.deleteDocumentById("D002");
		
	}

}
