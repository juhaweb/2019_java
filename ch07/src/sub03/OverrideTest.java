package sub03;
/*
 * ��¥ : 2019. 10. 21 
 * �̸� : ������
 * ���� : �������̵� �޼��� �ǽ��ϱ�
 */

public class OverrideTest {

	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method2(1);
		c.method3();
		
		
		// final �ǽ�   
		// - final ���� : ���
		// - final �޼��� : �������̵� ����
		// - final Ŭ���� : ��ӱ���
		
		final int NUM = 1;
		final double PI = 3.14;
		//double pi = 3.14;
		// NUM = 2 ; // ����� ���� ������ �� ����. - ��� ������ �빮�ڷ� ���� ������ �ִ�.
		
		
		
		
		

	}
	
}
