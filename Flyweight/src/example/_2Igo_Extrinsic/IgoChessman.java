package example._2Igo_Extrinsic;

public abstract class IgoChessman {

	public abstract String getColor();
	
	public void display(Coordinates coord) {
		System.out.println("������ɫ��"+this.getColor()+"������λ�ã�"+coord.getX()+"��"+coord.getY());
	}
}
