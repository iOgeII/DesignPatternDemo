package exercise._8EncryptSession;

public class EncryptSession_extends extends EncryptAPI implements DatabaseOperation{

	public void insert(String statement) {
		super.MD5();
		System.out.println("Inserting into database...");
	}
	
	public void select(String statement){
		super.MD5();
		System.out.println("Selecting from database...");
	}
	
	public void update(String statement){
		super.MD5();
		System.out.println("Updating database...");
	}
	
	public void delete(String statement) {
		super.MD5();
		System.out.println("deleting from database...");
	}
}
