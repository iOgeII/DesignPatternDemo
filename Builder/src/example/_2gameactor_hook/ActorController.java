package example._2gameactor_hook;

public class ActorController {

	public Actor construct(ActorBuilder ab) {

		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		if(!ab.isBareheaded()) {
			ab.buildHairstyle();
		}
		actor = ab.createActor();
		return actor;
		
	}
}
