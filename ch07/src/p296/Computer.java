package p296;


// �ڽ�Ŭ����
public class Computer extends Calculator {

	@Override		// �������̵� : �޼ҵ� ������ 
	double areaCircle(double r) {
		
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI *r *r ;
		
	}
	
	
}
