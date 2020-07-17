package example._2gameactor_hook;

public abstract class ActorBuilder {

	protected Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairstyle();
	
	// ¹³×Ó·½·¨
	public boolean isBareheaded() {
		return false;
	}
	
	public Actor createActor() {
		return this.actor;
	}
}
