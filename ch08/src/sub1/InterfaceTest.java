package sub1;
/*
 * ��¥ : 2019. 10. 22
 * �̸� : ������
 * ���� : �߻�Ŭ�������� �� �߻����� �������̽� �ǽ��ϱ� ���� p329
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		
		// �������̽� �ǽ�1 - Ŭ���� ������ ǥ�� ���̵� ���� . 
		// RemoteLG, RemoteSamsung���� ������ ���� -> RemoteControl

		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOff();
		lg.chUp();
		lg.soundUp();
		
		samsung.chDown();
		samsung.powerOff();
		samsung.soundUp();
	}
	
}
