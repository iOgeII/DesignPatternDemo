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
	
	// �Զ����вι��캯��������ע��һ����Ҫ�������ʵ�������
	public DAOLogHandler(Object object) {
		this.object = object;
	}

	// ʵ��invoke()��������������ʵ�����ж���ķ���
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
		System.out.println("����ʱ�䣺"+time);
	}
	
	public void afterInvoke() {
		// TODO Auto-generated method stub
		System.out.println("�������ý�����");
	}

}
