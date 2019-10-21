package sub6;
/*
 * 날짜 : 2019.10.21
 * 이름 : 하정욱
 * 내용 : 추상클래스 실습하게 교재 p329
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		// 추상클래스는 객채를 생성할수 없다.
		// Unit unit = new Unit();
		
		// 업캐스팅 적용
		Unit u1 = new Marin ();
		Unit u2 = new Zealot ();
		Unit u3 = new Zergling ();
		
		u1.move();
		u1.attack();
		u1.special();
		
		u2.move();
		u2.attack();		
		u2.special();
		
		u3.move();
		u3.attack();
		u3.special();
		
		
	}
	
}
