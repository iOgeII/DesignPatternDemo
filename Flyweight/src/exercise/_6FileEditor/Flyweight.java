package exercise._6FileEditor;

public abstract class Flyweight {

	public abstract String getFileName();
	
	public void showFlyweight(Location l) {
		System.out.println("�ĵ��в��룺"+this.getFileName()+"���ĵ���ƫ�ƣ�"+l.getOffset()+"���ļ���С��"+l.getSize());
	}
}
