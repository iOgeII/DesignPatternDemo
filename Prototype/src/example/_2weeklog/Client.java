package example._2weeklog;

public class Client {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WeeklyLog logPrevious,logNew;
		logPrevious = new WeeklyLog();
		// ��Ӹ���
		Attachment attachment = new Attachment();
		logPrevious.setAttachment(attachment);
		// ��¡
		logNew = logPrevious.clone();
		// �Ƚ��ܱ�
		System.out.println("�ܱ��Ƿ���ͬ��"+(logPrevious == logNew));
		// �Ƚϸ���
		System.out.println("�����Ƿ���ͬ��"+(logPrevious.getAttachment() == logNew.getAttachment()));
		
	}

}
