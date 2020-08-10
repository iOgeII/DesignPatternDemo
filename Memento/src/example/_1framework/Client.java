package example._1framework;

public class Client {

	public static void main(String[] args) {
		// ����ԭ��������
		Originator ori = new Originator("״̬��1��");
		System.out.println(ori.getState());
		
		// ���������˶��󣬱��洴���ı���¼����
		Caretaker ct = new Caretaker();
		ct.setMemento(ori.createMemento());
		
		ori.setState("״̬��2��");
		System.out.println(ori.getState());
		
		// �Ӹ����˶�����ȡ������¼����ʵ�ֳ���
		ori.restoreMemento(ct.getMemento());
		System.out.println(ori.getState());
	}
}
