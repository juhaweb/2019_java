package sub4;

public class Calc {

	
	// 싱글톤(정적) 객체  //이건 그냥 기억하셈 ! 고급문법임 = 공식
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	
	
	
	// 
	
		
	private Calc () {}
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	
	public int div(int x, int y) {
		int z = x / y;
		return z;
	}
	
	
	
	
	
	
	
	
}
