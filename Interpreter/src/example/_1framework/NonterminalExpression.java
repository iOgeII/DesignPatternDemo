package example._1framework;

public class NonterminalExpression extends AbstractExpression{

	private AbstractExpression left;
	private AbstractExpression right;
	
	public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String interpret(Context ctx) {
		// �ݹ����ÿ����ɲ��ֵ�interpret()����
		// �ڵݹ����ʱָ����ɲ��ֵ����ӷ�ʽ�������ս���Ĺ���
		// ������ʵ����
		return null;
	}
}
