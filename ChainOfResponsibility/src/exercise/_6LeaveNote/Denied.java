package exercise._6LeaveNote;

public class Denied extends Approver {

	@Override
	public void checkLeaveNote(LeaveNote leaveNote) {
		// TODO Auto-generated method stub
		System.out.println("���"+leaveNote.getDayNum()+"�죬�����涨ʱ�������ʧ�ܣ�");
	}

}
