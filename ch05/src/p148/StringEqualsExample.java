package p148;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		
		String strVar1 = "������ ���ڿ�";
		String strVar2 = "������ ���ڿ�";
		
		if (strVar1 == strVar2) {
			System.out.println("������ ����");
		} else {
			System.out.println("������ �ٸ�");
		}
		
		
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����!");
		} else {
			System.out.println("strVar1�� strVar2�� ���ڿ��� �ٸ�!");
		}
		
		
		
		
		
		
		
		
		String strVar3 = new String("������ ���ڿ�");
		String strVar4 = new String("������ ���ڿ�");
		
		if (strVar3 == strVar4) {
			System.out.println("������ ����");
		} else {
			System.out.println("������ �ٸ�");
		}
		
		
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����!");
		} else {
			System.out.println("strVar3�� strVar4�� ���ڿ��� �ٸ�!");
		}
		
		
		
			
	}
	
	
}
