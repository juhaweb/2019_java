package sub6;

public class Marin extends Unit {

	@Override	// 추상메서드 추가
	public void attack() {
		System.out.println("Marin Attack ....");
	}

	@Override
	public void special() {
		System.out.println("Marin Special Attack ....");
		
	}
	
	

}
