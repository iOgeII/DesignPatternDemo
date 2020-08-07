package example._1framework;

import java.util.HashMap;

public class Context {

	// 存储公共信息，如变量名与值的映射
	private HashMap<String, String> map = new HashMap<String, String>();
	
	// 保存变量-值映射
	public void assign(String key, String value) {
		map.put(key, value);
	}
	
	// 查找变量-值映射
	public String lookup(String key) {
		return map.get(key);
	}

}
