package ex06;
/*
 * 날짜 : 2019/10/25
 * 이름 : 하정욱
 * 내용 : 상속
 */
public class Child extends Parent {

	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
		
	}
}
