package exercise._8dbconnpool;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConnectionPool dbPool = DBConnectionPool.getDBConnectionPool();
		DBConnectionPool dbPool2 = DBConnectionPool.getDBConnectionPool();
		System.out.println("�������ӳ������Ƿ�Ϊͬһ��ʵ����"+(dbPool == dbPool2));
		
		for(int i = 0; i < 15; i++) {
			DBConnection dbConn = dbPool.getConnection();
			System.out.println(dbConn.getDbConnectionName());
		}
	}

}
