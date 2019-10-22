package sub2;
/*
 * ��¥ : 2019.10.22
 * �̸� : ������
 * ���� : �پ��� ����ó�� �ǽ��ϱ�! �̰Դ��߿�.   ����p433 
 */
public class VarietyExceptionTest {

	public static void main(String[] args) {
		
		
		// ������ ��� [�迭] �ε����� ��������
		try {
				int arr[] = {1,2,3};
			
				for(int i=0; i<=arr.length; i++) {
					System.out.println(arr[i]);
				}
			} catch(Exception e) {    //ArrayIndexOutOfBoundsException = Exception
				e.printStackTrace();
			}
		
		
		
		
		
		// NullPoint ����
		
		try {
			Tiger t = new Tiger();
			Eagle e = null ;  // ���� �ص� ��찡 �ִ�.
			
			t.move();
			e.move();
		
		} catch (Exception e) {    //NullPointerException e 
			e.printStackTrace();
		}
		
		
		
		
		// ĳ���� ����
		try {
		
			Animal ani = new Tiger();	// ����������(��ĳ����)
			Tiger t = (Tiger) ani;		// �ٿ�ĳ����
			Shark s = (Shark) ani;		// �߸��� ĳ����     << ani�� �������� Tiger�ε� Shark�� �ٲٷ�����..
		
		}catch (Exception e) {			// ClassCastException e
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("���α׷� ����.....");
	}
	
	
}
