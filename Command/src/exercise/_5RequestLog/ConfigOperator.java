package exercise._5RequestLog;

import java.io.Serializable;

public class ConfigOperator implements Serializable {

	public void insert(String args) {
		System.out.println("�����½ڵ㣺"+args);
	}
	
	public void modify(String args) {
		System.out.println("�޸Ľڵ㣺"+args);
	}
}
