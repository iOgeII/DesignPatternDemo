package exercise._6LeaveNote;

public class Manager extends Approver {

	@Override
	public void checkLeaveNote(LeaveNote leaveNote) {
		// TODO Auto-generated method stub
		if(leaveNote.getDayNum()<10) {
			System.out.println("请假"+leaveNote.getDayNum()+"天，经理审批通过！");
		}
		else {
			this.successor.checkLeaveNote(leaveNote);
		}
	}

}
