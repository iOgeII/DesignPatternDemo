package exercise._5RequestLog;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigSettingnWindow csw = new ConfigSettingnWindow();
		Command command;
		ConfigOperator co = new ConfigOperator();
		
		command = new InsertCommand("����");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("��վ��ҳ");
		
		command = new InsertCommand("����");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("�˿ں�");
		
		command = new ModifyCommand("�޸�");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("��վ��ҳ");
		
		command = new ModifyCommand("�޸�");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("�˿ں�");
		
		System.out.println("----------------------------");    
        System.out.println("��������");    
        csw.save();    
                
        System.out.println("----------------------------");     
        System.out.println("�ָ�����");    
        System.out.println("----------------------------");     
        csw.recover();
		
	}

}
