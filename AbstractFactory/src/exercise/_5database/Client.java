package exercise._5database;

public class Client {

	public static void main(String[] args) {
		
		DBFactory dbFactory;
		Connection connection;
		Statement statement;
		
		dbFactory = (DBFactory)XMLUtil.getBean();
		connection = dbFactory.createConnection();
		statement = dbFactory.createStatement();
		
		connection.connect();
		statement.getStatement();
	}
}
