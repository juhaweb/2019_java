package p213;

public class Car {

	//필드
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자1
	Car(){
	}
	
	
	
	// 생성자2
	Car(String model){
		this(model,"은색",250);
	}
	
	
	
	// 생성자3
	Car(String model, String color) {
		this(model, color, 250);
	}
	
	
	
	// 생성자4
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	
	
	
	
}
