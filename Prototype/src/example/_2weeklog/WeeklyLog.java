package example._2weeklog;

public class WeeklyLog implements Cloneable {

	Attachment attachment;
	String name;
	String date;
	String content;
	
	public Attachment getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	// →使用clone()方法实现浅克隆
	public WeeklyLog clone() {
		Object object = null;
		try {
			object = super.clone();
			return (WeeklyLog)object;
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			System.out.println("不支持复制！");
			return null;
		}
	}
}
