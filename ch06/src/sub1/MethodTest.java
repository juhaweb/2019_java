package sub1;
/*
 * ��¥ : 2019. 10. 15
 * �̸� : ������
 * ���� : �޼ҵ�(�Լ�) �ǽ��ϱ� ���� p214
 */
public class MethodTest {

	
	// main �޼��� : �ڹ����α׷� ������
	public static void main(String[] args) {
		
		// �޼��� ����(ȣ��)
		int rs1 = fx(1);
		int rs2 = fx(2);
		int rs3 = fx(3);
		
		System.out.println("rs1 :" + rs1);
		System.out.println("rs2 :" + rs2);
		System.out.println("rs3 :" + rs3);

		
	}
	

	// fx �޼��� ����          �� �޼��� �̸��� �ҹ���. java.classŬ���� ���� �빮��. 
	public static int fx(int x) {

		int y = 2 * x + 1 ;
		return y;

	}
	
	
	
	
	
}
