package example._2RobotController;

public class AndNode extends AbstractNode {

	private AbstractNode left;
	private AbstractNode right;
	
	public AndNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return left.interpret() + " È»ºó " + right.interpret();
	}

}
