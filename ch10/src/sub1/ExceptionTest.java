package sub1;
/*
 * 날짜 : 2019.10.22
 * 이름 : 하정욱
 * 내용 : 예외처리 실습하기 교재 p422
 */
public class ExceptionTest {

	public static void main(String[] args) {
		
		
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0, rs2 = 0, rs3 = 0, rs4 = 0;
		
		//전체 트라이 로직에 추가. 
		try {
			// 에러가 발생할 가능성이 있는 코드로직
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;
				
		} catch (Exception e) {
			// 에러가 발생했을 때 처리할 로직  (밑에 이건 에러로직 확인.콘솔로출력하고 넘어가는..)
			e.printStackTrace();
		}
		
		// 프로그램에서는 어떤 수를 0으로 나눌 수 없다. (err)
		// -> catch해서 예외처리하라. 
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		
		
		System.out.println("프로그램 종료... ");
		
		
		
		
		
	}
}
