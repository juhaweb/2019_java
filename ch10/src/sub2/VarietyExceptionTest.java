package sub2;
/*
 * 날짜 : 2019.10.22
 * 이름 : 하정욱
 * 내용 : 다양한 예외처리 실습하기! 이게더중요.   교재p433 
 */
public class VarietyExceptionTest {

	public static void main(String[] args) {
		
		
		// 범위에 벗어난 [배열] 인덱스값 참조에러
		try {
				int arr[] = {1,2,3};
			
				for(int i=0; i<=arr.length; i++) {
					System.out.println(arr[i]);
				}
			} catch(Exception e) {    //ArrayIndexOutOfBoundsException = Exception
				e.printStackTrace();
			}
		
		
		
		
		
		// NullPoint 에러
		
		try {
			Tiger t = new Tiger();
			Eagle e = null ;  // 선언만 해둘 경우가 있다.
			
			t.move();
			e.move();
		
		} catch (Exception e) {    //NullPointerException e 
			e.printStackTrace();
		}
		
		
		
		
		// 캐스팅 에러
		try {
		
			Animal ani = new Tiger();	// 다형성적용(업캐스팅)
			Tiger t = (Tiger) ani;		// 다운캐스팅
			Shark s = (Shark) ani;		// 잘못된 캐스팅     << ani가 위에보면 Tiger인데 Shark로 바꾸려고함..
		
		}catch (Exception e) {			// ClassCastException e
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("프로그램 종료.....");
	}
	
	
}
