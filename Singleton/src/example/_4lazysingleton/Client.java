package example._4lazysingleton;

public class Client {

	// 1.ʹ��synchronized�ؼ��ֶԷ���������
	// ����֤����ʱ��ֻ��һ���߳̿���ִ�и÷������������ܲ�
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		LazySingleton ls1 = LazySingleton.getInstance();
//		LazySingleton ls2 = LazySingleton.getInstance();
//		
//		System.out.println("�Ƿ�Ϊͬһʵ����"+(ls1==ls2));
//	}
	
	
	// 2.ʹ�õ��ؼ��+������
	//�������ͬʱͨ���жϽ����ٽ���
//	public static void main(String[] args) {
//		testThread th1 = new Client().new testThread("1.");
//		testThread th2 = new Client().new testThread("2.");
//		
//		th1.run();
//		th2.run();
//		 
//		System.out.println("�Ƿ�Ϊͬһʵ����"+(th1.getLs()==th2.getLs()));
//	}
//	
//	public class testThread implements Runnable{
//
//		private LazySingleton ls;
//		private String name;
//		
//		public testThread(String name) {
//			// TODO Auto-generated constructor stub
//			this.name = name;
//		}
//		
//		public LazySingleton getLs() {
//			return ls;
//		}
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			LazySingleton ls = LazySingleton.getInstance();
//			System.out.println(name+"Initializing...");
//		}
//		
//	}

	// 3.ʹ��˫�ؼ��+����
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LazySingleton ls1 = LazySingleton.getInstance();
		LazySingleton ls2 = LazySingleton.getInstance();
	
		System.out.println("�Ƿ�Ϊͬһʵ����"+(ls1==ls2));
	}
	
}
