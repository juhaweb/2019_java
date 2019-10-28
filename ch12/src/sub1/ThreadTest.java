package sub1;
/*
 * 날짜 : 2019.10.28
 * 이름 : 하정욱
 * 내용 : 쓰레드(Thread) 실습하기 교재 p576
 */
public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("서브1");
		SubThread sub2 = new SubThread("서브2");
		
		sub1.run();
		sub2.run();
		
		for(int i=1; i<=10; i++) {
			
			Thread.sleep(1000);			// 1초간 쉬어감. (위에 InterruptedException)
			
			System.out.println("메인쓰레드 실행... ");
		}
		
		
		System.out.println("메인쓰레드 종료...");
		
		
	}
	
}
