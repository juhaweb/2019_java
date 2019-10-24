package p290;

// 자식클래스 사용

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("셀폰","검정",200);
		
				
		//CellPhone으로부터 상속받은 필드
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		
		
		//DmbCellPhone 필드
		System.out.println(dmbCellPhone.channel);
		
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOff();
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello");
		dmbCellPhone.receiveVoice("hi");
		dmbCellPhone.sendVoice("okok");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(333);
		dmbCellPhone.turnOffDmb();
		
		
		
		
		
		
		
	}
	
	
	
	
}
