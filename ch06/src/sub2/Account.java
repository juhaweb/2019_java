package sub2;

public class Account {

	// Ư�� ( ��� ���� : ���� ���̹� )   (����� ĸ��ȭ�ؾ���. encapsulation : private )
	private String bank;
	private String id;
	private String name;
	public int money;
	
	// ������ : ��� ���� ĸ��ȭ �ؼ� �ʱ�ȭ�� �ȵǳ�.. ��ü���� �� �� ��������� �ʱ�ȭ �ϴ� �޼��� 
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;		
	}

	// ��� ( ��� �޼��� : ����� ���̹� )
	
	// 1. �Ա�
	public void deposit( int money ) {
		this.money += money;   
	}
	
	// 2. ���
	public void withdraw( int money ) {
		this.money -= money;		
	}
	
	// 3. �ܾ���ȸ
	public void info() {
		System.out.println("=========================");
		System.out.println("�� �� �� : "+ this.bank);
		System.out.println("���¹�ȣ : "+ id);
		System.out.println("�� �� �� : "+ name);
		System.out.println("�����ܾ� : "+ money);
		System.out.println("-------------------------");
	}
	
		
	
	// ������ ���� ����� ����. 
	
	
}
