package sub6;
/*
 * ��¥ : 2019.10.21
 * �̸� : ������
 * ���� : �߻�Ŭ���� �ǽ��ϰ� ���� p329
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		// �߻�Ŭ������ ��ä�� �����Ҽ� ����.
		// Unit unit = new Unit();
		
		// ��ĳ���� ����
		Unit u1 = new Marin ();
		Unit u2 = new Zealot ();
		Unit u3 = new Zergling ();
		
		u1.move();
		u1.attack();
		u1.special();
		
		u2.move();
		u2.attack();		
		u2.special();
		
		u3.move();
		u3.attack();
		u3.special();
		
		
	}
	
}
