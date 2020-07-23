package exercise._4datamanage;

import java.io.Serializable;

public class DataSet implements Serializable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("this is data chart:"+name);
	}
}
