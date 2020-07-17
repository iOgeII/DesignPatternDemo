package example._2gameactor_hook;

public class DevilBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("¶ñÄ§");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("Ñý");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("³óÂª");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("ºÚÅÛ");
	}

	@Override
	public void buildHairstyle() {
		// TODO Auto-generated method stub
		actor.setHairstyle("¹âÍ·");
	}
	
	// ¸²¸Ç¹³×Ó·½·¨
	public boolean isBareheaded() {
		return true;
	}

}
