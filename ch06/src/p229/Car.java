package p229;

public class Car {

	// �ʵ�
	int speed;
	
	
	// ������
	
	
	
	
	// �޼ҵ�
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	void run() {
		for(int i=10; i<=50; i++) {
			speed = i;
		}
		System.out.println("�޸��ϴ�.(�ü�"+speed+"km/h)");
	}
}
