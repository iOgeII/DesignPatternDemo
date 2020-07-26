package exercise._6serverloadbalance_IoDH;

public class Client {

	public static void main(String[] args) {
		// 1.创建四个LoadBalancer对象
		LoadBalancer balancer1,balancer2,balancer3,balancer4;
		balancer1 = LoadBalancer.getInstance();
		balancer2 = LoadBalancer.getInstance();
		balancer3 = LoadBalancer.getInstance();
		balancer4 = LoadBalancer.getInstance();
		
		// 2.判断服务器负载均衡器是否相同
		if(balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
			System.out.println("服务器负载均衡器具有唯一性！");
		}
		
		// 3.增加服务器
		balancer1.addServer("Server 1");
		balancer1.addServer("Server 2");
		balancer1.addServer("Server 3");
		balancer1.addServer("Server 4");
		balancer1.addServer("Server 5");
		
		// 4.分配服务器
		for (int i = 0; i < 15; i++) {
			String server = balancer1.getServer();
			System.out.println("分发请求至服务器："+server);
		}
	}
}
