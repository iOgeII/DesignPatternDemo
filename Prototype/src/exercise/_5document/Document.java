package exercise._5document;

public class Document implements Cloneable {
	
	private String title;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public void download() {
		System.out.println("Downloading......");
	}
	
	public Document Clone() {
		Document doc = null;
		try {
			doc = (Document)super.clone();
			return doc;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("不支持复制！");
			return null;
		}
	}
}
