package sub1;

public interface RemoteControl {

	// 추상메서드 선언 (abstract 생략가능)
	// 추상클래스라고 생각해도 무방한데, 인터페이스는 메서드만 선언함. sys.out같은거 안들어감. 
	 	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
}
