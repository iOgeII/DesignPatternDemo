package exercise._6LeaveNote;

public class Manager extends Approver {

	@Override
	public void checkLeaveNote(LeaveNote leaveNote) {
		// TODO Auto-generated method stub
		if(leaveNote.getDayNum()<10) {
			System.out.println("���"+leaveNote.getDayNum()+"�죬��������ͨ����");
		}
		else {
			this.successor.checkLeaveNote(leaveNote);
		}
	}

}
