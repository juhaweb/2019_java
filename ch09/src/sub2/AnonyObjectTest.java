package sub2;
/*
 * ��¥ : 2019. 10. 22
 * �̸� : ������
 * ���� : �͸� Ŭ���� �ǽ��ϱ� ���� p3404
 */
public class AnonyObjectTest {

	public static void main(String[] args) {
		
		// �������̽� �ٷλ��  (�͸�Ŭ����. ctrl+space. �ȵ���̵��Ҷ� ���̳���. )
		Person p = new Person () {
			
			@Override
			public void info() {
				System.out.println("Person info .... ");
			}
			
			@Override
			public void hello() {
				System.out.println("Person say hello .... ");
			}
			
		};
		
		
		p.info();
		p.hello();
		
		
		
		
	}
	
	
}
