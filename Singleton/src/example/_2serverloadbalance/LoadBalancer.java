package example._2serverloadbalance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {

	private static LoadBalancer instance = null;
	
	private List serverList = null;
	 
	private LoadBalancer() {
		serverList = new ArrayList();
	}
	
	public static LoadBalancer getInstance() {
		if(instance == null) {
			instance = new LoadBalancer();
		}
		return instance;
	}
	
	// 添加服务器
	public void addServer(String server) {
		serverList.add(server);
	}
	
	// 删除服务器
	public void removeServer(String server) {
		serverList.remove(server);
	}
	
	// 随机获取服务器
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return (String)serverList.get(i);
	}
	
	
}
