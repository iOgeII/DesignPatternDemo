package example._3OAdaoLog;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DAOLogHandler implements InvocationHandler {
	
	private Calendar calendar;
	private Object object;
	
	public DAOLogHandler() {
		// TODO Auto-generated constructor stub
	}
	
	// 自定义有参构造函数，用于注入一个需要代理的真实主题对象
	public DAOLogHandler(Object object) {
		this.object = object;
	}

	// 实现invoke()方法，调用在真实主题中定义的方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		beforeInvoke();
		Object result = method.invoke(object,args);
		afterInvoke();
		return null;
	}

	public void beforeInvoke() {
		// TODO Auto-generated method stub
		calendar = new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		String time = hour+":"+minute+":"+second;
		System.out.println("调用时间："+time);
	}
	
	public void afterInvoke() {
		// TODO Auto-generated method stub
		System.out.println("方法调用结束！");
	}

}
