package sub3;
/*
 * ��¥ : 2019. 10. 22
 * �̸� : ������
 * ���� : �߻�Ŭ�������� �� �߻����� �������̽� �ǽ��ϱ� ���� p344
 */
public class InterfaceTest3 {

		public static void main(String[] args) {
			
			// �������̽� �ǽ� 3 - ��ü���� ���յ��� ��ȭ
			// ������ �� (ĸ��ȭ)  / ���յ� �� (
			
			Bulb bulb = new Bulb();
			Socket socket = new Cable(bulb);
			// ���� ������. 
			
			socket.switchOn();
			socket.switchOff();
			
			
			
			
			
			
		}
	
	
	
}
