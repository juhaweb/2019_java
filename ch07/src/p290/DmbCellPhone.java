package p290;

// 자식클래스

public class DmbCellPhone extends CellPhone {

	//필드
	int channel;
	
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 dmb");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("채널변경 : "+channel);
	}
	
	void turnOffDmb() {
		System.out.println("방송수신끝");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
