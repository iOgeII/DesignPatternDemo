package exercise._8EncryptSession;

public class EncryptSession_member implements DatabaseOperation {

	EncryptAPI eAPI = new EncryptAPI();
	
	public void insert(String statement) {
		eAPI.MD5();
		System.out.println("Inserting into database...");
	}
	
	public void select(String statement){
		eAPI.MD5();
		System.out.println("Selecting from database...");
	}
	
	public void update(String statement){
		eAPI.MD5();
		System.out.println("Updating database...");
	}
	
	public void delete(String statement) {
		eAPI.MD5();
		System.out.println("deleting from database...");
	}
}
