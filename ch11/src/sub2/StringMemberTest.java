package sub2;

public class StringMemberTest {

	public static void main(String[] args) {
		
		
		String str = "Hello Korea";	   // String�迭[]���� ��������⿡ �迭������ ����. 
		
		
		// ���ڿ�����
		System.out.println("str ���ڿ� ���� : "+ str.length());
		
		
		// charAt() - ��������
		System.out.println("str ��������" + str.charAt(6));
		
		
		// substring() - ���ڿ� �ڸ���
		System.out.println("str ���ڿ� �ڸ���" + str.substring(2, 5)); // 2���� 5����
		System.out.println("str ���ڿ� �ڸ���" + str.substring(3));   // 3���� ����������
		
		
		// indexOf(), lastIndexOf() - Ư�� ������ �ε����� ����
		int idx1 = str.indexOf("e");
		int idx2 = str.indexOf("o");
		
		System.out.println(idx1);
		System.out.println(idx2);
		
		
		// replace() - ���ڿ� ��ü
		String rs = str.replace("Korea", "Busan");
		System.out.println(rs);
		
		
		// valueOf() - �⺻Ÿ��(����Ÿ��) ������ ���ڿ��� ��ȯ �ڡ� �߿�
		int var1 = 1;
		double var2 = 2.12;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);	// valueOf Ŭ����Ÿ�Կ� �ٷ� ������ : Ŭ�����޼���(�����ż���)  // Ŭ���� �ż���� ���� ���ϱ�.... ��������ִ°�. 
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;					// ������� �̷��Ե� ����. 
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
