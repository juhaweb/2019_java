package sub03;

// public final class BBB extends AAA { : 상속안됨. 
public class BBB extends AAA {

	@Override // 눈에 띄라고 붙이는거. 안붙여도 상관은 없엉. 
	public void method1() {
		System.out.println("BBB - method1()...");
	}

	// Overload
	public void method2(int a) {
		System.out.println("BBB - method2()...");
	}

	@Override
	public void method3() {
	//public final void method3() {   // final 오버라이드 금지. 
	System.out.println("BBB - method3()...");
	}
	

	
}
