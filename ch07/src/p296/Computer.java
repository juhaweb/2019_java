package p296;


// 자식클래스
public class Computer extends Calculator {

	@Override		// 오버라이딩 : 메소드 재정의 
	double areaCircle(double r) {
		
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI *r *r ;
		
	}
	
	
}
