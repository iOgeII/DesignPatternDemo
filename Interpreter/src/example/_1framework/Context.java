package example._1framework;

import java.util.HashMap;

public class Context {

	// �洢������Ϣ�����������ֵ��ӳ��
	private HashMap<String, String> map = new HashMap<String, String>();
	
	// �������-ֵӳ��
	public void assign(String key, String value) {
		map.put(key, value);
	}
	
	// ���ұ���-ֵӳ��
	public String lookup(String key) {
		return map.get(key);
	}

}
