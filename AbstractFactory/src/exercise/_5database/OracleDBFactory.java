package exercise._5database;

public class OracleDBFactory implements DBFactory {

	@Override
	public Connection createConnection() {
		// TODO Auto-generated method stub
		return new OracleConnection();
	}

	@Override
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return new OracleStatement();
	}

}
