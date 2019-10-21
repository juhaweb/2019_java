package sub04;
/*
 * 날짜 : 2019. 10. 21
 * 이름 : 하정욱
 * 내용 : 다형성(Polymorphism) 실습하기 교재 p305
 */
public class PolyTest {

	public static void main(String[] args) {
		
		// 다형성 - 객체의 선언타입을 부모클래스 지정하는것. 
		// 다형성을 통해 공통된 객체의 표준화 (t, e, s는 애니멀이다. ).
		// 프로그램을 조금 더 유연하게 만들수 있음. 
		
		Animal t = new Tiger();
		Animal e = new Eagle();
		Animal s = new Shark();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		
		
		
		
		
		
		
		
	}
	
	
}
