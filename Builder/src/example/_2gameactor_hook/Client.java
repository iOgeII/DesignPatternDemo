package example._2gameactor_hook;

public class Client {

	public static void main(String[] args) {
		ActorBuilder ab = (ActorBuilder)XMLUtil.getBean();
		ActorController ac = new ActorController();
		Actor actor;
		actor = ac.construct(ab);
		System.out.println("��ɫ��"+actor.getType());
		System.out.println("�Ա�"+actor.getSex());
		System.out.println("��ò��"+actor.getFace());
		System.out.println("��װ��"+actor.getCostume());
		System.out.println("���ͣ�"+actor.getHairstyle());
	}
}
