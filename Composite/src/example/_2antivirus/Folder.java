package example._2antivirus;

import java.util.ArrayList;

public class Folder extends AbstractFile {

	private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
	private String name;
	
	public Folder(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.add(file);
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.remove(file);
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		return fileList.get(i);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("****[folder:"+name+"]");
		for(Object obj:fileList) {
			((AbstractFile)obj).killVirus();
		}
	}

}
