package p213;

public class Car {

	//�ʵ�
	String company ="�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	
	// ������1
	Car(){
	}
	
	
	
	// ������2
	Car(String model){
		this(model,"����",250);
	}
	
	
	
	// ������3
	Car(String model, String color) {
		this(model, color, 250);
	}
	
	
	
	// ������4
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	
	
	
	
}
