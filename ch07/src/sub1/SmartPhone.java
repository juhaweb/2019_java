package sub1;

public class SmartPhone extends Computer {

	// Ư��
	private String brand;
	private String tel;
	private int price;
	
	
	// ������
	public SmartPhone(String cpu, String ram, String hdd, String brand, String tel, int price) {
		super(cpu, ram, hdd);

		this.brand = brand;
		this.tel = tel;
		this.price = price;
	}

	
	// ���	
	public void call(){
		System.out.println(tel + "��ȭ��ȣ�� �Ŵ���...."); 
	}
	
	public void info() {
		// super.info(); ���⼭ �θ��� info�� ����
		
		System.out.println("CPU : " +super.cpu);
		System.out.println("CPU : " +ram);   // protected �������� �����ڸ� ����ϸ鼭 super. �������� 
		System.out.println("CPU : " +hdd);
		
		System.out.println("��ǰ�� : " +brand);
		System.out.println("����ȣ : " +tel);
		System.out.println("��ǰ���� : " +price);
	}
	
	
	
}
