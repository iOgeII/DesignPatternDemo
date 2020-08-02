package exercise._6FileEditor;

public class Location {

	private int offset;
	private int size;
	
	public Location(int offset, int size) {
		this.offset = offset;
		this.size = size;
	}
	
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
