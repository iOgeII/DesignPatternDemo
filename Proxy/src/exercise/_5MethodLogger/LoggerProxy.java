package exercise._5MethodLogger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerProxy extends Subject {

	private RealSubject realSubject;
	
	public LoggerProxy(RealSubject realSubject) {
		// TODO Auto-generated constructor stub
		this.realSubject = realSubject;
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		try {
			realSubject.method();
			after();
		} catch (Exception e) {
			// TODO: handle exception
			afterFailed();
		}
	}

	private void before() {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("方法method()被调用，调用时间为"+sdf.format(date));
	}

	private void after() {
		// TODO Auto-generated method stub
		System.out.println("方法method()调用成功");
	}

	private void afterFailed() {
		// TODO Auto-generated method stub
		System.out.println("方法method()调用失败");
	}

}
