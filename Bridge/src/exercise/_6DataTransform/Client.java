package exercise._6DataTransform;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new DatabaseSQLite();
		FileFormat ff = new TXT();
		ff.setDatabase(db);
		ff.transformData();
		
		db = new DatabaseMySQL();
		ff = new PDF();
		ff.setDatabase(db);
		ff.transformData();
	}

}
