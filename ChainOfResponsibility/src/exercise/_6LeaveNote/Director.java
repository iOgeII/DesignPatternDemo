package exercise._6LeaveNote;

public class Director extends Approver {

	@Override
	public void checkLeaveNote(LeaveNote leaveNote) {
		// TODO Auto-generated method stub
		if(leaveNote.getDayNum()<3) {
			System.out.println("���"+leaveNote.getDayNum()+"�죬��������ͨ����");
		}
		else {
			this.successor.checkLeaveNote(leaveNote);
		}
	}

}
