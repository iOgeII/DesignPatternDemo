package example._2weeklog_deepclone;

import java.io.Serializable;

// 改为可序列化类
public class Attachment implements Serializable{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void download() {
		System.out.println("下载附件，文件名："+name);
	}
}
