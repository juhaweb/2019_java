package sub4;
/*
 * ��¥ : 2019. 10. 17.
 * �̸� : ������
 * ���� : �������� ����, �޼��� �ǽ��ϱ�
 */

public class Increment {

	private int num1;
	public static int num2;

	public Increment() {
		this.num1++;
		this.num2++;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	

	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}	
	
	// Ŭ���� �޼��� (�����޼���=static // �� Ȱ��Ǵ� ������ �ƴѵ� �˰�輼��)
	public static void add() {
		
		// static�޼��忡���� none static �޼��带 ������ �� ����. 
		// num1++;
		num2++;   //��� static�̶� ��������. 
		
	}
	
	
	
}
