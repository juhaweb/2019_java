package sub1;

/*
 * 날짜 : 2019. 10. 11
 * 이름 : 하정욱
 * 내용 : 조건문 연습문제
 * */
public class ifTest {

	public static void main(String[] args) {
	
		int score = 86;
		
		if(score >= 100 && score >= 90) {
			System.out.println("A 입니다.");
		} else if (score >= 80 && score > 90) {
			System.out.println("C 입니다.");
		} else if (score >= 70 && score > 80) {
			System.out.println("D 입니다.");
		} else if (score >= 60 && score > 70) {
			System.out.println("E 입니다.");
		} else if (score >= 50 && score > 60) {
			System.out.println("E 입니다.");
		} else {
			System.out.println("F 입니다.");
		}
		
		
		
	}
	
}
