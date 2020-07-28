package exercise._8EncryptSession;

public interface DatabaseOperation {
	
	public void insert(String statement);
	
	public void select(String statement);
	
	public void update(String statement);
	
	public void delete(String Statement) ;

}
