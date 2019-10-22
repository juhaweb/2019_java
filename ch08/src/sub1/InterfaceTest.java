package sub1;
/*
 * 날짜 : 2019. 10. 22
 * 이름 : 하정욱
 * 내용 : 추상클래스보다 더 추상적인 인터페이스 실습하기 교재 p329
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		
		// 인터페이스 실습1 - 클래스 설계의 표준 가이드 역할 . 
		// RemoteLG, RemoteSamsung에서 다형성 적용 -> RemoteControl

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
