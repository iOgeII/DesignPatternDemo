package example._3userlogin;

public class LoginAction {
	
	private UserDAO userDAO;

	public LoginAction(int arg) {
		this.userDAO = UserDAOFactory.createUserDAO(arg);
		this.userDAO.findUserById();
	}
	
	public static void main(String[] args) {
		//execution
		LoginAction login = new LoginAction(1);
		
	}
}
