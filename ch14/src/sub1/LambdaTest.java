package sub1;
/*
 * 날짜 : 2019.10.28
 * 이름 : 하정욱
 * 내용 : 람다식 실습하기 교재 p678
 * 		++ 쌤은 람다식 문법이 자바스럽지 않다고.. 좀 음 그래. 
 */
public class LambdaTest {

	public static void main(String[] args) {
		
		// 람다식 : 매개변수를 가진 코드블럭을 갖는 익명함수 
		Type1 t1 = () -> { System.out.println("Type1 (fx 메서드) 람다식 실행..."); };
		Type2 t2 = (x) -> { System.out.println("Type2 (fx(int x)메서드) 람다식 실행... : " + x);};
		
		Type3 t3 = (x, y) -> {
								int result = x + y;
								return result;
							 };
		
		// 람다식 실행
		t1.fx();
		t2.fx(1);
		
		int result = t3.fx(2,3);
		System.out.println("result : "+result );
		
		
	}
}
