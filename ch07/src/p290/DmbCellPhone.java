package p290;

// �ڽ�Ŭ����

public class DmbCellPhone extends CellPhone {

	//�ʵ�
	int channel;
	
	
	//������
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� dmb");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("ä�κ��� : "+channel);
	}
	
	void turnOffDmb() {
		System.out.println("��ۼ��ų�");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
