package p210;

public class CarExample {

	public static void main(String[] args) {
	
		Car car1 = new Car();								//생성자선택1
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		Car car2 = new Car("자가용");								//생성자선택2
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		Car car3 = new Car("택시", "노랑");								//생성자선택2
		System.out.println("car2.company : " + car3.company);
		System.out.println("car2.model : " + car3.model);
		System.out.println("car2.color : " + car3.color);
		System.out.println();

		Car car4 = new Car("스포츠카", "파랑", 250);								//생성자선택2
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
	
	
	
	}
	
	
	
	
	
}
