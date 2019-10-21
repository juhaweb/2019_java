package sub03;
/*
 * 날짜 : 2019. 10. 21 
 * 이름 : 하정욱
 * 내용 : 오버라이드 메서드 실습하기
 */

public class OverrideTest {

	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method2(1);
		c.method3();
		
		
		// final 실습   
		// - final 변수 : 상수
		// - final 메서드 : 오버라이드 금지
		// - final 클래스 : 상속금지
		
		final int NUM = 1;
		final double PI = 3.14;
		//double pi = 3.14;
		// NUM = 2 ; // 상수는 값을 대입할 수 없다. - 상수 무조건 대문자로 쓰는 경향이 있다.
		
		
		
		
		

	}
	
}
