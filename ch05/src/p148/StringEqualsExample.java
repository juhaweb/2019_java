package p148;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		
		String strVar1 = "동일한 문자열";
		String strVar2 = "동일한 문자열";
		
		if (strVar1 == strVar2) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		
		
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음!");
		} else {
			System.out.println("strVar1과 strVar2는 문자열이 다름!");
		}
		
		
		
		
		
		
		
		
		String strVar3 = new String("동일한 문자열");
		String strVar4 = new String("동일한 문자열");
		
		if (strVar3 == strVar4) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		
		
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음!");
		} else {
			System.out.println("strVar3과 strVar4는 문자열이 다름!");
		}
		
		
		
			
	}
	
	
}
