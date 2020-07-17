package example._2gameactor_nodirector;

public class Client {

	public static void main(String[] args) {
		ActorBuilder ab = (ActorBuilder)XMLUtil.getBean();
		// 1. 直接将Director类中的construct方法原样搬过来
		// 需要把方法construct和返回角色actor都改为静态
//		ActorController ac = new ActorController();
		Actor actor;
		// 1.
//		actor = ActorBuilder.construct(ab);
		// 2.将搬过来的construct方法的参数去掉，即可直接操作actor和调用
		actor = ab.construct();
		System.out.println("角色："+actor.getType());
		System.out.println("性别："+actor.getSex());
		System.out.println("外貌："+actor.getFace());
		System.out.println("服装："+actor.getCostume());
		System.out.println("发型："+actor.getHairstyle());
	}
}
