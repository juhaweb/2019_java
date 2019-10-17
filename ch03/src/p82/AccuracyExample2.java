package p82;


/* 
 * 정확한 계산이 필요하다면 정수연산으로 변경해서 다음과 같이 계산한다. */

public class AccuracyExample2 {

	public static void main(String[] args) {
		
		int apple = 1;
		
		int totalPieces = apple *10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다. ");
		
	}
	
	
}
