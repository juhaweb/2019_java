package sub6;

// abstract �߻�Ŭ���� 
// - �߻�ż��带 ���� Ŭ����  (<-������ �ڼ��� ���� A��°� ����.. ��������)
// - ����� ���� Ŭ����
// - ����ȭ�� Ŭ���� ���踦 �����Ѵ�. 
// - �� �����ʰ� �������̽��� �� ���� ���. (������ �� ����)

public abstract class Unit {

	public void move() {
		System.out.println("Unit move... ");
	}
	
	// �޼��� ����  (���� {}x )
	public abstract void attack();
	public abstract void special();
	
	
	
}
