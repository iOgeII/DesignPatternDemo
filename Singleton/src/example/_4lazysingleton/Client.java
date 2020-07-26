package example._4lazysingleton;

public class Client {

	// 1.使用synchronized关键字对方法加锁，
	// →保证任意时刻只有一个线程可以执行该方法，但是性能差
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		LazySingleton ls1 = LazySingleton.getInstance();
//		LazySingleton ls2 = LazySingleton.getInstance();
//		
//		System.out.println("是否为同一实例："+(ls1==ls2));
//	}
	
	
	// 2.使用单重检查+锁定。
	//→会出现同时通过判断进入临界区
//	public static void main(String[] args) {
//		testThread th1 = new Client().new testThread("1.");
//		testThread th2 = new Client().new testThread("2.");
//		
//		th1.run();
//		th2.run();
//		 
//		System.out.println("是否为同一实例："+(th1.getLs()==th2.getLs()));
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

	// 3.使用双重检查+锁定
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LazySingleton ls1 = LazySingleton.getInstance();
		LazySingleton ls2 = LazySingleton.getInstance();
	
		System.out.println("是否为同一实例："+(ls1==ls2));
	}
	
}
