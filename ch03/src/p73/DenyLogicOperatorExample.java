package p73;

/*
 * 논리 부정 연산자 !
 * boolean타입에만 사용 가능하다. 
 * true / false 상태를 번갈아가며 변경하는 toogle 기능을 구현할때 주로 사용한다. 
 */

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println(play);

		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
	}
	
}
