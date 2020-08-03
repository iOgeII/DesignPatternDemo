package exercise._6LeaveNote;

public class Director extends Approver {

	@Override
	public void checkLeaveNote(LeaveNote leaveNote) {
		// TODO Auto-generated method stub
		if(leaveNote.getDayNum()<3) {
			System.out.println("请假"+leaveNote.getDayNum()+"天，主任审批通过！");
		}
		else {
			this.successor.checkLeaveNote(leaveNote);
		}
	}

}
