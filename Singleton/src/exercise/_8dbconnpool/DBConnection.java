package exercise._8dbconnpool;

import java.util.ArrayList;
import java.util.Random;

public class DBConnection {

	private static int MAX_CONNECTION = 3;
	
	private static ArrayList<DBConnection> dbConnections = null;
	
	private String dbConnectionName;
	
	// private boolean inUse; 
	
	public String getDbConnectionName() {
		return dbConnectionName;
	}

	private DBConnection(String dbConnectionName) {
		// TODO Auto-generated constructor stub
		this.dbConnectionName = dbConnectionName;
		// this.inUse = false;
	}
	
	private static void init() {
		for (int i = 0; i < MAX_CONNECTION; i++) {
			dbConnections.add(new DBConnection(("数据库连接"+i).toString()));
		}
	}
	
	public static DBConnection getInstance() {
		if(dbConnections == null) {
			dbConnections = new ArrayList<DBConnection>();
			init();
		}
		Random random = new Random();
		int i = random.nextInt(MAX_CONNECTION);
		return DBConnection.dbConnections.get(i);
	}
}
