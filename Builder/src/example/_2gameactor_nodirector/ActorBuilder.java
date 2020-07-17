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
	
	// 1.ֱ�ӽ�Director���е�construct����ԭ�������
	// ��Ҫ�ѷ���construct�ͷ��ؽ�ɫactor����Ϊ��̬
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
	
	// 2.���������construct�����Ĳ���ȥ��������ֱ�Ӳ���actor�͵���
	public Actor construct() {
		this.buildType();
		this.buildSex();
		this.buildFace();
		this.buildCostume();
		this.buildHairstyle();
		return this.actor;
	}
}
