package example._2antivirus;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFile folder1,folder2,folder3,folder4;
		AbstractFile file1,file2,file3,file4,file5;
		
		folder1 = new Folder("������������");
		folder2 = new Folder("ͼ���ļ�");
		folder3 = new Folder("�ı��ļ�");
		folder4 = new Folder("��Ƶ�ļ�");
		
		file1 = new ImageFile("�˲�����.jpg");
		file2 = new ImageFile("���ֵ���.png");
		file3 = new TextFile("��Խʱ����ս��.txt");
		file4 = new TextFile("���ͨѶ��.pdf");
		file5 = new VideoFile("Young and beautiful.mkv");
		
		folder1.add(folder2);
		folder1.add(folder3);
		folder1.add(folder4);
		
		folder2.add(file1);
		folder2.add(file2);
		folder3.add(file3);
		folder3.add(file4);
		folder4.add(file5);
		
		folder4.killVirus();
		
		System.out.println("--------------------");
		
		folder1.killVirus();
	}

}
