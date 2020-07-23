package exercise._5document;

import java.util.Hashtable;

public class DocumentManager {

	private Hashtable docHashtable = new Hashtable();
	
	public DocumentManager() {
		docHashtable.put("Application", new ApplicationDocument());
		docHashtable.put("Notice", new NoticeDocument());
	}
	
	public void add(String key, Document doc) {
		docHashtable.put(key, doc);
	}
	
	public Document get(String key) {
		Document doc = (Document) docHashtable.get(key);
		return doc;
	}
}
