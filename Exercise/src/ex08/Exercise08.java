package ex08;
/*
 * 날짜 : 2019/10/25
 * 이름 : 하정욱
 * 내용 : 인터페이스
 */
public class Exercise08 {

	public static void main(String[] args) {
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
		
	}
}
