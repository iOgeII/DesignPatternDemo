package example._2antivirus;

public class ImageFile extends AbstractFile {
	
	private String name;
	
	public ImageFile(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("[image:add]对不起，不支持增加");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("[image:remove]对不起，不支持删除");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("[image:getChild]对不起，不支持获取");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----[image:"+name+"]杀毒中...");
	}

}
