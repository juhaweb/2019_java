package sub04;
/*
 * ��¥ : 2019. 10. 21
 * �̸� : ������
 * ���� : ������(Polymorphism) �ǽ��ϱ� ���� p305
 */
public class PolyTest {

	public static void main(String[] args) {
		
		// ������ - ��ü�� ����Ÿ���� �θ�Ŭ���� �����ϴ°�. 
		// �������� ���� ����� ��ü�� ǥ��ȭ (t, e, s�� �ִϸ��̴�. ).
		// ���α׷��� ���� �� �����ϰ� ����� ����. 
		
		Animal t = new Tiger();
		Animal e = new Eagle();
		Animal s = new Shark();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		
		
		
		
		
		
		
		
	}
	
	
}
