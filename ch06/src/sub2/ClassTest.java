package sub2;
/*
 * ��¥ : 2019. 10. 16
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */

public class ClassTest {

	public static void main(String[] args) {
		
		// ��ü���� �� ������� �ʱ�ȭ
		Account kb = new Account("��������","123-456-789-10","������",10000);

		// �Ա��غ��Կ� : ���Ȱ��
		kb.deposit(20000);
		kb.withdraw(5000);
		// kb.money -= 1;	// �̷��� ����ڵ� -> ��������� ĸ��ȭ(privite)�� ���� ����ڵ� ����
		kb.info();
		
		// ��ü���� �� ������� �ʱ�ȭ
		Account wr = new Account("�츮����","123-456-789-10","������",40000);
		
		// ���Ȱ�� : �츮���࿡ �Ա��ҰԿ�
		wr.deposit(30000);
		wr.withdraw(6000);
		wr.deposit(30000);
		wr.withdraw(6000);
		wr.info();
		
		
		// ��ǻ�� ��ü���� ��..
		Computer samsung = new Computer("INTEL i7","16GB","2TB");
		Computer imac = new Computer("INTEL i5","8GB","2TB");
		
		samsung.calc();
		samsung.internet();
		samsung.info();
		
		imac.info();
		imac.calc();
		imac.internet();
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
