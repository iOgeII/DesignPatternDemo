package exercise._5StringHandling;

public abstract class Flyweight {

	public abstract String getStr();
	
	public void stringStyle(Style s) {
		System.out.println("�ַ�����"+this.getStr()+"����ɫ��"+s.getColor()+"����С"+s.getFont());
	}
}
