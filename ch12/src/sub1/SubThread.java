package sub1;

public class SubThread extends ThreadTest {

	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	
	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			
			Thread.sleep(1000);	
			
			System.out.println(name + "���������....");
		}
	
		System.out.println(name + "������ ����...");
		
				
		
	}

	
}
