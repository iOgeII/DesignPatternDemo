package exercise._6serverloadbalance_IoDH;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
	
	private List serverList = null;
	
	private LoadBalancer() {
		serverList = new ArrayList();
	}
	
	private static class HolderClass {
		private final static LoadBalancer instance = new LoadBalancer(); 
	}
	
	public static LoadBalancer getInstance() {
		return HolderClass.instance;
	}
	
	public void addServer(String server) {
		serverList.add(server);
	}
	
	public void removeServer(String server) {
		serverList.remove(server);
	}
	
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return (String) serverList.get(i);
	}
	
	
}
