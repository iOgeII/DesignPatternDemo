package exercise._6LeaveNote;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Approver director,manager,generalManager,denied;
		director = new Director();
		manager = new Manager();
		generalManager = new GeneralManager();
		denied = new Denied();
		
		director.setSuccessor(manager);
		manager.setSuccessor(generalManager);
		generalManager.setSuccessor(denied);
		
		director.checkLeaveNote(new LeaveNote(1));
		director.checkLeaveNote(new LeaveNote(3));
		director.checkLeaveNote(new LeaveNote(15));
		director.checkLeaveNote(new LeaveNote(100));
	}

}
