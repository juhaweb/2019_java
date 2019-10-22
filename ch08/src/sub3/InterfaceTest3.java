package sub3;
/*
 * 날짜 : 2019. 10. 22
 * 이름 : 하정욱
 * 내용 : 추상클래스보다 더 추상적인 인터페이스 실습하기 교재 p344
 */
public class InterfaceTest3 {

		public static void main(String[] args) {
			
			// 인터페이스 실습 3 - 객체간의 결합도를 완화
			// 응집도 ↑ (캡슐화)  / 결합도 ↓ (
			
			Bulb bulb = new Bulb();
			Socket socket = new Cable(bulb);
			// 여기 다형성. 
			
			socket.switchOn();
			socket.switchOff();
			
			
			
			
			
			
		}
	
	
	
}
