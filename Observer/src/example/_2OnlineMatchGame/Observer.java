package example._2OnlineMatchGame;

public interface Observer {

	public String getName();
	public void setName(String name);
	// ����֧Ԯ���ѷ���
	public void help();
	// �������ܹ�������
	public void beAttacked(AllyControlCenter acc);
}
