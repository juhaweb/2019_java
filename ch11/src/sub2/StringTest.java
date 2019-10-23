package sub2;
/*
 * 날짜 : 2019.10.23
 * 이름 : 하정욱
 * 내용 : 자바 내장클래스 String 실습하기 교재 p496 
 */
public class StringTest {

	public static void main(String[] args) {
		
		// 문자열 = 문자 + 배열의 합성어 
		String s = "Hello";
		char[] c = {'H','e','l','l','o'};
		
		// 문자열 객체생성
		String str1 = new String("Hello");  // 원래 이렇게쓰긴한데
		String str2 = new String("Hello");  
		String str3 = "Hello"; // = 리터럴로 생성되면 같은 주소값을 가짐. 
		String str4 = "Hello";
		
		
		if(str1 == str2) {
			System.out.println("str1과 str2의 참조값(주소값)이 같다");
		}else {
			System.out.println("str1과 str2의 참조값(주소값)이 다르다");
		}
		
		if(str2 == str3) {
			System.out.println("str2과 str3의 참조값(주소값)이 같다");
		}else {
			System.out.println("str2과 str3의 참조값(주소값)이 다르다");
		}
		
		
		if(str3 == str4) {
			System.out.println("str3과 str4의 참조값(주소값)이 같다");
		}else {
			System.out.println("str3과 str4의 참조값(주소값)이 다르다");
		}
		
		
		// 문자열 비교
		if(str1.equals(str2)){
			System.out.println("str1과 str2의 참조값(주소값)이 같다");
		}else {
			System.out.println("str1과 str2의 참조값(주소값)이 다르다");
		}
		
		if(str2.equals(str2)) {
			System.out.println("str2과 str3의 참조값(주소값)이 같다");
		}else {
			System.out.println("str2과 str3의 참조값(주소값)이 다르다");
		}
		
		if(str3.contentEquals(str4)) {
			System.out.println("str3과 str4의 참조값(주소값)이 같다");
		}else {
			System.out.println("str3과 str4의 참조값(주소값)이 다르다");
		}
				
		
		/**
		 * String#equals()은 String의 내용을 비교할뿐만 아니라 
		 * 다른 객체가 String의 인스턴스인지 여부도 확인합니다. 
		 * String#contentEquals()은 내용 (문자 시퀀스) 만 비교하고 
		 * 다른 객체가 String의 인스턴스인지 여부는 확인하지 않습니다. 
		 * 그것은 a.o를 다루는 CharSequence의 구현 인 한 무엇이든 될 수 있습니다. 
		 * String, StringBuilder, StringBuffer, CharBuffer 등
		 * 
		 */
				
	}
	
	
}
