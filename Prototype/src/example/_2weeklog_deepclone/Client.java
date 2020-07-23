package example._2weeklog_deepclone;

public class Client {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WeeklyLog logPrevious,logNew;
		logPrevious = new WeeklyLog();
		// 添加附件
		Attachment attachment = new Attachment();
		logPrevious.setAttachment(attachment);
		// 克隆
		logNew = logPrevious.deepClone();
		// 比较周报
		System.out.println("周报是否相同？"+(logPrevious == logNew));
		// 比较附件
		System.out.println("附件是否相同？"+(logPrevious.getAttachment() == logNew.getAttachment()));
		
	}

}
