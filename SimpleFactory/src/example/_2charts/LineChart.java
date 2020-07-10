package example._2charts;

/**
 * 简单工厂模式中的 ConcreteProductB
 * @author 香南鹤砚
 *
 */
public class LineChart implements Chart {
	
	public LineChart() {
		System.out.println("创建折线图。");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示折线图。");
	}

}
