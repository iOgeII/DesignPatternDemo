package exercise._6ComponentLib;

import java.util.ArrayList;

public class PanelContainer extends Component {

private ArrayList<Component> components = new ArrayList<Component>();
    
	private String name;
	
	public PanelContainer(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		components.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		components.remove(c);
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return components.get(i);
	}

	@Override
	public void useComponent() {
		// TODO Auto-generated method stub
		System.out.println(">使用面板控件："+name);
		for(Object obj:components) {
			System.out.print(">");
			((Component)obj).useComponent();
		}
	}

}