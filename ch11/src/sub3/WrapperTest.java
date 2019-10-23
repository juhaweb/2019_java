package sub3;

/* 
 * ��¥ : 2019.10.23
 * �̸� : ������
 * ���� : �ڹ� WrapperŬ���� �ǽ��ϱ� ���� p527
 */
public class WrapperTest {

	public static void main(String[] args) {
		
		// �⺻Ÿ���� ����
		// �⺻Ÿ�� ����
		int var1 = 1;
		double var2 = 2.12;
		boolean var3 = true;
		char var4 = 'A';
		
		// WrapperClass
		Integer w1 = new Integer(var1);
		Double w2 = new Double(var2);
		Boolean w3 = new Boolean(var3);
		Character w4 = new Character(var4);
	
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		
		
		/***************************************/
		
		
		// �⺻Ÿ��(����Ÿ��) -> ���ڿ��� ��ȯ
		int var5 = 1;
		double var6 = 2.12;
		boolean var7 = true;
		
		String s1 = String.valueOf(var5);	// valueOf Ŭ����Ÿ�Կ� �ٷ� ������ : Ŭ�����޼���(�����ż���)  // Ŭ���� �ż���� ���� ���ϱ�.... ��������ִ°�. 
		String s2 = String.valueOf(var6);
		String s3 = ""+var7;					// ������� �̷��Ե� ����. 
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);				

		/***************************************/
		
		// ���ڿ� -> �⺻Ÿ�� ��ȯ
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "false";
		
		int		v1 = Integer.parseInt(str1);
		double	v2 = Double.parseDouble(str2);
		boolean	v3 = Boolean.parseBoolean(str3);
				
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		/***************************************/
		
		// ���ڿ� -> Wrapper ��ȯ
		Integer	wr1 = Integer.valueOf(str1);
		Double	wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		/***************************************/
		
		// Wrapper -> ���ڿ��� ��ȯ
		String ss1 = w1.toString();
		String ss2 = w1.toString();
		String ss3 = w1.toString();
		
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);

		/***************************************/
		
		
		
		
		
		
		
		
	}
}
