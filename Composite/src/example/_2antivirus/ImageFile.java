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
		System.out.println("[image:add]�Բ��𣬲�֧������");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("[image:remove]�Բ��𣬲�֧��ɾ��");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("[image:getChild]�Բ��𣬲�֧�ֻ�ȡ");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----[image:"+name+"]ɱ����...");
	}

}
