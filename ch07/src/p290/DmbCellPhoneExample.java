package p290;

// �ڽ�Ŭ���� ���

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("����","����",200);
		
				
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		
		
		//DmbCellPhone �ʵ�
		System.out.println(dmbCellPhone.channel);
		
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOff();
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello");
		dmbCellPhone.receiveVoice("hi");
		dmbCellPhone.sendVoice("okok");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(333);
		dmbCellPhone.turnOffDmb();
		
		
		
		
		
		
		
	}
	
	
	
	
}
