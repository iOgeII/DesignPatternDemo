package example._2FinanceInfoSys;

public class AccessValidator {

	// ģ��ʵ�ֵ�½��֤
	public boolean validate(String userId) {
		System.out.println("�����ݿ�����֤�û���"+userId+"���Ƿ�Ϊ�Ϸ��û���");
		if(userId.equalsIgnoreCase("���")) {
			System.out.println("��"+userId+"����¼�ɹ���");
			return true;
		}
		else {
			System.out.println("��"+userId+"����¼ʧ�ܣ�");
			return false;
		}
	}
}
