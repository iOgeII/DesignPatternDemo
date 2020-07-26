package exercise._8dbconnpool;

import java.util.ArrayList;

public class DBConnectionPool {
	
	private DBConnectionPool() {}
	
	private static class HolderClass {
		private final static DBConnectionPool dbConnectionPool = new DBConnectionPool();		
	}
	
	public static DBConnectionPool getDBConnectionPool() {
		return HolderClass.dbConnectionPool;
	}
	
	public DBConnection getConnection() {
		return DBConnection.getInstance();
	}
}
