package example._4Calculator;

public class Adder {

	private int num = 0;
	
	// 加法操作，每次传入的值与num做加法运算，再将结果返回
	public int add(int value) {
		num +=value;
		return num;
	}
}
