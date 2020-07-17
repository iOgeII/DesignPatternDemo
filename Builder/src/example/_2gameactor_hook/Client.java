package example._2gameactor_hook;

public class Client {

	public static void main(String[] args) {
		ActorBuilder ab = (ActorBuilder)XMLUtil.getBean();
		ActorController ac = new ActorController();
		Actor actor;
		actor = ac.construct(ab);
		System.out.println("角色："+actor.getType());
		System.out.println("性别："+actor.getSex());
		System.out.println("外貌："+actor.getFace());
		System.out.println("服装："+actor.getCostume());
		System.out.println("发型："+actor.getHairstyle());
	}
}
