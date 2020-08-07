package example._2RobotController;

public class ActionNode extends AbstractNode {
	
	private String action;

	public ActionNode(String action) {
		this.action = action;
	}

	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		if(action.equalsIgnoreCase("move")) {
			return "�ƶ�";
		}
		else if(action.equalsIgnoreCase("run")) {
			return "�����ƶ�";
		}
		else {
			return "ָ����Ч��";
		}
	}

}
