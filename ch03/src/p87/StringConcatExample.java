package p87;

/* 
 * 문자열 연결 연산자
 * 문자열과 인접한 피연산자도 문자열로 변환해 결합된다. 
 * */


public class StringConcatExample {

	public static void main(String[] args) {
		
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		System.out.println(str3);
		
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str4);
		
	}
	
}
