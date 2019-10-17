package sub4;
/*
 * 날짜 : 2019. 10. 17.
 * 이름 : 하정욱
 * 내용 : 정적영역 변수, 메서드 실습하기
 */

public class Increment {

	private int num1;
	public static int num2;

	public Increment() {
		this.num1++;
		this.num2++;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	

	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}	
	
	// 클래스 메서드 (정적메서드=static // 잘 활용되는 문법은 아닌데 알고계세여)
	public static void add() {
		
		// static메서드에서는 none static 메서드를 참조할 수 없다. 
		// num1++;
		num2++;   //얘는 static이라 참조가능. 
		
	}
	
	
	
}
