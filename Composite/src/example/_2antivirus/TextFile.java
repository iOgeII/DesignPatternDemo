package example._2antivirus;

public class TextFile extends AbstractFile {

	private String name;
	
	public TextFile(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("[Text:add]对不起，不支持增加");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("[Text:remove]对不起，不支持删除");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("[Text:getChild]对不起，不支持获取");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----[Text:"+name+"]杀毒中...");
	}

}
