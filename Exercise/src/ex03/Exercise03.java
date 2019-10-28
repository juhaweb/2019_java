package ex03;
/*
 * 날짜 : 2019/10/25
 * 이름 : 하정욱
 * 내용 : for문 (1~100사이 정수 중 3의배수의 총합)
 */
public class Exercise03 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			
			if( i%3 == 0)
			
				sum += i;
		}
		
		System.out.println("3의 배수의 합 : " + sum);
		
	}
}
