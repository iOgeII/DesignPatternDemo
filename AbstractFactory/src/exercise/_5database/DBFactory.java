package exercise._5database;

public interface DBFactory {

	public Connection createConnection();
	public Statement createStatement();
}
