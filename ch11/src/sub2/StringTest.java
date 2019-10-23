package sub2;
/*
 * ��¥ : 2019.10.23
 * �̸� : ������
 * ���� : �ڹ� ����Ŭ���� String �ǽ��ϱ� ���� p496 
 */
public class StringTest {

	public static void main(String[] args) {
		
		// ���ڿ� = ���� + �迭�� �ռ��� 
		String s = "Hello";
		char[] c = {'H','e','l','l','o'};
		
		// ���ڿ� ��ü����
		String str1 = new String("Hello");  // ���� �̷��Ծ����ѵ�
		String str2 = new String("Hello");  
		String str3 = "Hello"; // = ���ͷ��� �����Ǹ� ���� �ּҰ��� ����. 
		String str4 = "Hello";
		
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� ������(�ּҰ�)�� ����");
		}else {
			System.out.println("str1�� str2�� ������(�ּҰ�)�� �ٸ���");
		}
		
		if(str2 == str3) {
			System.out.println("str2�� str3�� ������(�ּҰ�)�� ����");
		}else {
			System.out.println("str2�� str3�� ������(�ּҰ�)�� �ٸ���");
		}
		
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� ������(�ּҰ�)�� ����");
		}else {
			System.out.println("str3�� str4�� ������(�ּҰ�)�� �ٸ���");
		}
		
		
		// ���ڿ� ��
		if(str1.equals(str2)){
			System.out.println("str1�� str2�� ������(�ּҰ�)�� ����");
		}else {
			System.out.println("str1�� str2�� ������(�ּҰ�)�� �ٸ���");
		}
		
		if(str2.equals(str2)) {
			System.out.println("str2�� str3�� ������(�ּҰ�)�� ����");
		}else {
			System.out.println("str2�� str3�� ������(�ּҰ�)�� �ٸ���");
		}
		
		if(str3.contentEquals(str4)) {
			System.out.println("str3�� str4�� ������(�ּҰ�)�� ����");
		}else {
			System.out.println("str3�� str4�� ������(�ּҰ�)�� �ٸ���");
		}
				
		
		/**
		 * String#equals()�� String�� ������ ���һӸ� �ƴ϶� 
		 * �ٸ� ��ü�� String�� �ν��Ͻ����� ���ε� Ȯ���մϴ�. 
		 * String#contentEquals()�� ���� (���� ������) �� ���ϰ� 
		 * �ٸ� ��ü�� String�� �ν��Ͻ����� ���δ� Ȯ������ �ʽ��ϴ�. 
		 * �װ��� a.o�� �ٷ�� CharSequence�� ���� �� �� �����̵� �� �� �ֽ��ϴ�. 
		 * String, StringBuilder, StringBuffer, CharBuffer ��
		 * 
		 */
				
	}
	
	
}
