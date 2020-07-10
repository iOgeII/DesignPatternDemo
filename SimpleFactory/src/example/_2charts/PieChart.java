package example._2charts;

/**
 * 简单工厂模式中的 ConcreteProductC
 * @author 香南鹤砚
 *
 */
public class PieChart implements Chart {
	
	public PieChart() {
		System.out.println("创建饼图。");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示饼图。");
	}

}
