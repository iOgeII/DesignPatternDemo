package example._2gameactor_nodirector;

public class Client {

	public static void main(String[] args) {
		ActorBuilder ab = (ActorBuilder)XMLUtil.getBean();
		// 1. ֱ�ӽ�Director���е�construct����ԭ�������
		// ��Ҫ�ѷ���construct�ͷ��ؽ�ɫactor����Ϊ��̬
//		ActorController ac = new ActorController();
		Actor actor;
		// 1.
//		actor = ActorBuilder.construct(ab);
		// 2.���������construct�����Ĳ���ȥ��������ֱ�Ӳ���actor�͵���
		actor = ab.construct();
		System.out.println("��ɫ��"+actor.getType());
		System.out.println("�Ա�"+actor.getSex());
		System.out.println("��ò��"+actor.getFace());
		System.out.println("��װ��"+actor.getCostume());
		System.out.println("���ͣ�"+actor.getHairstyle());
	}
}
