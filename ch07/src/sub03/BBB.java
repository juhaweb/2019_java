package sub03;

// public final class BBB extends AAA { : ��Ӿȵ�. 
public class BBB extends AAA {

	@Override // ���� ���� ���̴°�. �Ⱥٿ��� ����� ����. 
	public void method1() {
		System.out.println("BBB - method1()...");
	}

	// Overload
	public void method2(int a) {
		System.out.println("BBB - method2()...");
	}

	@Override
	public void method3() {
	//public final void method3() {   // final �������̵� ����. 
	System.out.println("BBB - method3()...");
	}
	

	
}
