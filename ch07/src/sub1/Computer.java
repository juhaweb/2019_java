package sub1;

public class Computer {

	// Ư�� (��� ����)      
	// protected (�������� ������)
	protected String cpu;
	protected String ram;
	protected String hdd;
	
	// ������ 
	public Computer (String cpu, String ram, String hdd) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	
	// ��� (��� �޼���)
	public void calc() {
		System.out.println("��ǻ�� �����...");
	}
	
	public void internet () {
		System.out.println("���ͳ� �� ... ");
	}
	
	public void info() {
		System.out.println("==================");
		System.out.println("CPU : " + this.cpu);
		System.out.println("RAM : " + this.ram);
		System.out.println("HDD : " + this.hdd);
		System.out.println("==================");
		
	}
	
	
	
	
	
	
	
	
}
