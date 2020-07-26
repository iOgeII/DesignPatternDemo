package exercise._8dbconnpool;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConnectionPool dbPool = DBConnectionPool.getDBConnectionPool();
		DBConnectionPool dbPool2 = DBConnectionPool.getDBConnectionPool();
		System.out.println("两个连接池引用是否为同一个实例？"+(dbPool == dbPool2));
		
		for(int i = 0; i < 15; i++) {
			DBConnection dbConn = dbPool.getConnection();
			System.out.println(dbConn.getDbConnectionName());
		}
	}

}
