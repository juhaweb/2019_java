package sub1;
/*
 * 날짜 : 2019. 10. 15
 * 이름 : 하정욱
 * 내용 : 메소드(함수) 실습하기 교재 p214
 */
public class MethodTest {

	
	// main 메서드 : 자바프로그램 시작점
	public static void main(String[] args) {
		
		// 메서드 실행(호출)
		int rs1 = fx(1);
		int rs2 = fx(2);
		int rs3 = fx(3);
		
		System.out.println("rs1 :" + rs1);
		System.out.println("rs2 :" + rs2);
		System.out.println("rs3 :" + rs3);

		
	}
	

	// fx 메서드 정의          ↓ 메서드 이름은 소문자. java.class클래스 명은 대문자. 
	public static int fx(int x) {

		int y = 2 * x + 1 ;
		return y;

	}
	
	
	
	
	
}
