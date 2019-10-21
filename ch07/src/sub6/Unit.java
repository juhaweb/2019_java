package sub6;

// abstract 추상클래스 
// - 추상매서드를 갖는 클래스  (<-아이콘 자세히 보면 A라는게 있음.. 오버레이)
// - 상속을 위한 클래스
// - 구조화된 클래스 설계를 제공한다. 
// - 잘 쓰진않고 인터페이스를 더 많이 사용. (장점이 더 많다)

public abstract class Unit {

	public void move() {
		System.out.println("Unit move... ");
	}
	
	// 메서드 선언  (구현 {}x )
	public abstract void attack();
	public abstract void special();
	
	
	
}
