package exercise._6LeaveNote;

public class GeneralManager extends Approver {

	@Override
	public void checkLeaveNote(LeaveNote leaveNote) {
		// TODO Auto-generated method stub
		if(leaveNote.getDayNum()<30) {
			System.out.println("请假"+leaveNote.getDayNum()+"天，总经理审批通过！");
		}
		else {
			this.successor.checkLeaveNote(leaveNote);
		}
	}

}
