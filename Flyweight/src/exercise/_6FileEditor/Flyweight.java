package exercise._6FileEditor;

public abstract class Flyweight {

	public abstract String getFileName();
	
	public void showFlyweight(Location l) {
		System.out.println("文档中插入："+this.getFileName()+"，文档中偏移："+l.getOffset()+"，文件大小："+l.getSize());
	}
}
