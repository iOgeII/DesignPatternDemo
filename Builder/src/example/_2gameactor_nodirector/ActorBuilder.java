package example._2gameactor_nodirector;

import example._2gameactor_nodirector.Actor;

public abstract class ActorBuilder {

	protected static Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairstyle();
	
//	public Actor createActor() {
//		return this.actor;
//	}
	
	// 1.直接将Director类中的construct方法原样搬过来
	// 需要把方法construct和返回角色actor都改为静态
//	public static Actor construct(ActorBuilder ab) {
//
////		Actor actor;
//		ab.buildType();
//		ab.buildSex();
//		ab.buildFace();
//		ab.buildCostume();
//		ab.buildHairstyle();
////		actor = ab.createActor();
//		return actor;
//	}
	
	// 2.将搬过来的construct方法的参数去掉，即可直接操作actor和调用
	public Actor construct() {
		this.buildType();
		this.buildSex();
		this.buildFace();
		this.buildCostume();
		this.buildHairstyle();
		return this.actor;
	}
}
