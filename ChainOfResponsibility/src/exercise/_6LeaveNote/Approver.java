package exercise._6LeaveNote;

public abstract class Approver {

	protected Approver successor;
	
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}
	
	public abstract void checkLeaveNote(LeaveNote leaveNote);
}
