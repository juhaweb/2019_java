package sub1;

public interface RemoteControl {

	// �߻�޼��� ���� (abstract ��������)
	// �߻�Ŭ������� �����ص� �����ѵ�, �������̽��� �޼��常 ������. sys.out������ �ȵ�. 
	 	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
}
