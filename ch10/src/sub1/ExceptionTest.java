package sub1;
/*
 * ��¥ : 2019.10.22
 * �̸� : ������
 * ���� : ����ó�� �ǽ��ϱ� ���� p422
 */
public class ExceptionTest {

	public static void main(String[] args) {
		
		
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0, rs2 = 0, rs3 = 0, rs4 = 0;
		
		//��ü Ʈ���� ������ �߰�. 
		try {
			// ������ �߻��� ���ɼ��� �ִ� �ڵ����
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;
				
		} catch (Exception e) {
			// ������ �߻����� �� ó���� ����  (�ؿ� �̰� �������� Ȯ��.�ַܼ�����ϰ� �Ѿ��..)
			e.printStackTrace();
		}
		
		// ���α׷������� � ���� 0���� ���� �� ����. (err)
		// -> catch�ؼ� ����ó���϶�. 
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		
		
		System.out.println("���α׷� ����... ");
		
		
		
		
		
	}
}
