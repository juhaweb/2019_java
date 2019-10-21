package sub4;
/*
 * 날짜 : 2019. 10. 21
 * 이름 : 하정욱
 * 내용 : 다형성 실습 2
 */
public class PolyTest2 {

	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();
		
		
		// 다형성을 이용한 객체 배열
		Animal objs[] = {t, e, s};
		
		objs[0].move();
		objs[0].hunt();
		
		objs[1].move();
		objs[1].hunt();
		
		objs[2].move();
		objs[2].hunt();
		
		
		
		
		
		// 다형성을 이용한 메서드의 매개변수
		
		move(t);
		move(e);
		move(s);
		
	}
	
		//
		public static void move(Animal a) {
			a.move();
			a.hunt();
			
		}
		

		
		
	
	
	
}
