package exercise._6ComponentLib;

public class TextAreaComponent extends Component {

    private String name;
	
	public TextAreaComponent(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该操作");
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该操作");
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("对不起，不支持该操作");
		return null;
	}

	@Override
	public void useComponent() {
		// TODO Auto-generated method stub
		System.out.println(">使用文本框："+name);
	}

}
