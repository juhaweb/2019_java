package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	
	// ����ȭ��(synchronized) �������� �����尣 ������ ���´�. 
	public synchronized void setNum() {
		this.num++;
	}
	
	
}
