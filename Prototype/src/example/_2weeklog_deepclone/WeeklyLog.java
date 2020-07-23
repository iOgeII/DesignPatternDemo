package example._2weeklog_deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//��Ϊ�����л���
public class WeeklyLog implements Serializable{

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
	
//	// ��ʹ��clone()����ʵ��ǳ��¡
//	public WeeklyLog clone() {
//		Object object = null;
//		try {
//			object = super.clone();
//			return (WeeklyLog)object;
//		} catch (CloneNotSupportedException e) {
//			// TODO: handle exception
//			System.out.println("��֧�ָ��ƣ�");
//			return null;
//		}
//	}
	
	// �����Լ���д��deepClone()ʵ�����¡
	public WeeklyLog deepClone() {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			return (WeeklyLog)ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
