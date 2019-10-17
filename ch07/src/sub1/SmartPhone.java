package sub1;

public class SmartPhone extends Computer {

	// 특성
	private String brand;
	private String tel;
	private int price;
	
	
	// 생성자
	public SmartPhone(String cpu, String ram, String hdd, String brand, String tel, int price) {
		super(cpu, ram, hdd);

		this.brand = brand;
		this.tel = tel;
		this.price = price;
	}

	
	// 기능	
	public void call(){
		System.out.println(tel + "전화번호로 거는중...."); 
	}
	
	public void info() {
		// super.info(); 여기서 부모의 info를 실행
		
		System.out.println("CPU : " +super.cpu);
		System.out.println("CPU : " +ram);   // protected 접근제어 지시자를 사용하면서 super. 생략가능 
		System.out.println("CPU : " +hdd);
		
		System.out.println("제품명 : " +brand);
		System.out.println("폰번호 : " +tel);
		System.out.println("제품가격 : " +price);
	}
	
	
	
}
