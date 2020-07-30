package example._2antivirus;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFile folder1,folder2,folder3,folder4;
		AbstractFile file1,file2,file3,file4,file5;
		
		folder1 = new Folder("哈利波特资料");
		folder2 = new Folder("图像文件");
		folder3 = new Folder("文本文件");
		folder4 = new Folder("视频文件");
		
		file1 = new ImageFile("邓布利多.jpg");
		file2 = new ImageFile("格林德沃.png");
		file3 = new TextFile("穿越时光与战火.txt");
		file4 = new TextFile("格邓通讯集.pdf");
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
