package sub3;

public class Adder {

	// public int x = 0;
	public int x;
	
	// 아래 add는 오버로드 메서드 : 매개변수로 구분하고 있음. 
	public void add(int x) {
		this.x = x + 50;
	}
	
	public void add(int[] arr) {
		arr[0]++;
	}
	
	public void add(Adder a1) {
		a1.x = a1.x + 40;
	}
	
	public Adder addNew(Adder a2) {
		a2 = new Adder();
		return a2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
