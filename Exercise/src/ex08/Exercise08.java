package ex08;
/*
 * ��¥ : 2019/10/25
 * �̸� : ������
 * ���� : �������̽�
 */
public class Exercise08 {

	public static void main(String[] args) {
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
		
	}
}
