package exercise._8EncryptSession;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String statement = new String("test");
		
		EncryptSession_extends ese = new EncryptSession_extends();
		
		EncryptSession_member esm = new EncryptSession_member();
		
		ese.insert(statement);
		ese.select(statement);
		
		System.out.println("------------");
		
		esm.delete(statement);
		esm.update(statement);
	}

}
