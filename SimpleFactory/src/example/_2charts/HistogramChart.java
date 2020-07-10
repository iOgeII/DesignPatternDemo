package example._2charts;

/**
 * 简单工厂模式中的 ConcreteProductA
 * @author 香南鹤砚
 *
 */
public class HistogramChart implements Chart {

	public HistogramChart() {
		System.out.println("创建柱状图。");
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示柱状图。");
	}

}
