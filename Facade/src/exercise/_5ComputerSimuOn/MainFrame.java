package exercise._5ComputerSimuOn;

public class MainFrame {

	private Memory memory;
	private CPU cpu;
	private HardDisk hardDisk;
	private OS os;
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		memory = new Memory();
		cpu = new CPU();
		hardDisk = new HardDisk();
		os = new OS();
	}
	
	public void On() {
		memory.check();
		cpu.run();
		hardDisk.read();
		os.load();
		System.out.println("开机成功！");
	}
}
