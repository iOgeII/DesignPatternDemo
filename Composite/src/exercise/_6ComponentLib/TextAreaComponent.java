package exercise._6ComponentLib;

public class TextAreaComponent extends Component {

    private String name;
	
	public TextAreaComponent(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("�Բ��𣬲�֧�ָò���");
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("�Բ��𣬲�֧�ָò���");
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("�Բ��𣬲�֧�ָò���");
		return null;
	}

	@Override
	public void useComponent() {
		// TODO Auto-generated method stub
		System.out.println(">ʹ���ı���"+name);
	}

}
