package example._2gameactor_hook;

public class DevilBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("��ħ");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("��");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("��ª");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("����");
	}

	@Override
	public void buildHairstyle() {
		// TODO Auto-generated method stub
		actor.setHairstyle("��ͷ");
	}
	
	// ���ǹ��ӷ���
	public boolean isBareheaded() {
		return true;
	}

}
