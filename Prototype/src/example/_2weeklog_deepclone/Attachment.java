package example._2weeklog_deepclone;

import java.io.Serializable;

// ��Ϊ�����л���
public class Attachment implements Serializable{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void download() {
		System.out.println("���ظ������ļ�����"+name);
	}
}
