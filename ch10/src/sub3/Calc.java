package sub3;

public class Calc {

	public int plus(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public int minus(int a, int b) {
		int c = a - b;
		return 0;
	}
	
	public int mult(int a, int b) {
		int c = a * b;
		return c;
	} 
	
	// 에러가 발생할 때 메서드를 호출하는 쪽으로 에러를 던진다. 
	public int div(int a , int b) throws Exception {
		int c = a/b;
		return c;
			
			
	}


}
	
