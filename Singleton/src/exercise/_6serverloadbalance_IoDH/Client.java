package exercise._6serverloadbalance_IoDH;

public class Client {

	public static void main(String[] args) {
		// 1.�����ĸ�LoadBalancer����
		LoadBalancer balancer1,balancer2,balancer3,balancer4;
		balancer1 = LoadBalancer.getInstance();
		balancer2 = LoadBalancer.getInstance();
		balancer3 = LoadBalancer.getInstance();
		balancer4 = LoadBalancer.getInstance();
		
		// 2.�жϷ��������ؾ������Ƿ���ͬ
		if(balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
			System.out.println("���������ؾ���������Ψһ�ԣ�");
		}
		
		// 3.���ӷ�����
		balancer1.addServer("Server 1");
		balancer1.addServer("Server 2");
		balancer1.addServer("Server 3");
		balancer1.addServer("Server 4");
		balancer1.addServer("Server 5");
		
		// 4.���������
		for (int i = 0; i < 15; i++) {
			String server = balancer1.getServer();
			System.out.println("�ַ���������������"+server);
		}
	}
}
