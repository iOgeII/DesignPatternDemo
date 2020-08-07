package exercise._5RequestLog;

import java.io.Serializable;

public abstract class Command implements Serializable {
	
	protected String name;
	protected String args;
	protected ConfigOperator configOperator;
	
	public Command(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setConfigOperator(ConfigOperator config) {
		this.configOperator = config;
	}
	
	public abstract void execute(String args);
	public abstract void execute();
}
