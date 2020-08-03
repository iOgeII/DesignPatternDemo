package exercise._6LeaveNote;

public class Denied extends Approver {

	@Override
	public void checkLeaveNote(LeaveNote leaveNote) {
		// TODO Auto-generated method stub
		System.out.println("请假"+leaveNote.getDayNum()+"天，超过规定时长，请假失败！");
	}

}
