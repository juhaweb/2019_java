package p112;
/*
 * if-else if-else 문 
 */
public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		int score = 75;
		if(score>=90) {
			System.out.println("점수가 100~90 입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~90 입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~80 입니다.");
		} else {
			System.out.println("점수가 70 미만 입니다.");
		}
		
		
	}
}
