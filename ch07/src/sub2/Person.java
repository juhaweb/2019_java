package sub2;

public class Person {

	// 특성
	protected String name;
	protected int age;
	
	
	// 생성자
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
		
	
	//기능
	public void hello() {
		System.out.println(name+"입니다.");
		System.out.println(age+"살 입니다.");
	}
	
}
