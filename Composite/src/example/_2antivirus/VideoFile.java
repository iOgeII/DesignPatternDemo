package example._2antivirus;

public class VideoFile extends AbstractFile {

	private String name;
	
	public VideoFile(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("[Video:add]�Բ��𣬲�֧������");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("[Video:remove]�Բ��𣬲�֧��ɾ��");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("[Video:getChild]�Բ��𣬲�֧�ֻ�ȡ");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("----[Video:"+name+"]ɱ����...");
	}

}
