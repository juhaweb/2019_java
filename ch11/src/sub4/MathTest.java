package sub4;
/*
 * 날짜 : 2019.10.23
 * 이름 : 하정욱
 * 내용 : 자바 Math클래스 실습하기 교재 p533
 */
public class MathTest {

	public static void main(String[] args) {
		
		// Math는 객체를 생성할 수 없는 클래스
		// Math m = new Math();
		
		System.out.println("PI :" +Math.PI);
										// 대문자. 상수. 고정된값. 
		
		System.out.println("절대값 : " +Math.abs(-5)); 
		System.out.println("절대값 : " +Math.abs(-3.14));	
		
		System.out.println("제곱근 : " +Math.sqrt(9));
		
		System.out.println("올림값 : " +Math.ceil(1.2));
		System.out.println("올림값 : " +Math.ceil(1.8));
		
		System.out.println("내림값 : " +Math.floor(1.2));
		System.out.println("내림값 : " +Math.floor(1.8));
		
		System.out.println("반올림 : " +Math.round(1.2));
		System.out.println("반올림 : " +Math.round(1.8));
		
		
		
		// random
		
		double num1 = Math.random();	// 0~1 사이의 실수가 나옴. 
		System.out.println("num1 : " + num1); 
		
		double num2 = num1*10;			// 0~10 사이의 실수
		System.out.println("num2 : " + num2);
		
		double num3 = Math.ceil(num2);	// 0~1 사이의 정수가 나옴. 
		System.out.println("num3 : " + num3); 
		
		double num4 = Math.ceil(Math.random() * 10);
		System.out.println("num4 : " + num4);
		
		double num5 = Math.ceil(Math.random() * 45);
		System.out.println("num5 : " + num5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
