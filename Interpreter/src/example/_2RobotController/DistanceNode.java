package example._2RobotController;

public class DistanceNode extends AbstractNode {

	private String distance;
	
	public DistanceNode(String distance) {
		this.distance = distance;
	}

	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return this.distance;
	}

}
