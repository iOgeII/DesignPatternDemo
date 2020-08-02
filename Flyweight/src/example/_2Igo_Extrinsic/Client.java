package example._2Igo_Extrinsic;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IgoChessman black1,black2,black3,white1,white2;
		IgoChessmanFactory factory;
		
		// ��ȡ��Ԫ��������
		factory = IgoChessmanFactory.getInstance();
		
		// ͨ����Ԫ������ȡ���ź���
		black1 = factory.getIgoChessman("b");
		black2 = factory.getIgoChessman("b");
		black3 = factory.getIgoChessman("b");
		System.out.println("�ж����ź����Ƿ���ͬ��"+((black1 == black2)&&(black2 == black3)));
		
		// ͨ����Ԫ������ȡ���Ű���
		white1 = factory.getIgoChessman("w");
		white2 = factory.getIgoChessman("w");
		System.out.println("�ж����Ű����Ƿ���ͬ��"+(white1 == white2));
		
		// ��ʾ����
		black1.display(new Coordinates(1, 2));
		black2.display(new Coordinates(3, 4));
		black3.display(new Coordinates(1, 3));
		white1.display(new Coordinates(2, 5));
		white2.display(new Coordinates(2, 4));
		
	}

}
