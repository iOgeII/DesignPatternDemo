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
		System.out.println("[Text:add]�Բ��𣬲�֧������");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("[Text:remove]�Բ��𣬲�֧��ɾ��");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("[Text:getChild]�Բ��𣬲�֧�ֻ�ȡ");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----[Text:"+name+"]ɱ����...");
	}

}
