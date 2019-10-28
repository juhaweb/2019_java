package sub3;
/*
 * 날짜 : 2019.10.28
 * 이름 : 하정욱
 * 내용 : 쓰레드(Thread) 실습하기 3. 
 */
public class SumThreadTest {

	
	public static void main(String[] args) throws Exception {
		
		SubThread st1 = new SubThread(1,50);
		SubThread st2 = new SubThread(51,100);
		//SubThread를 단일로 돌리기엔 아직 미완성의상태라 아래  
		
		Thread t1 = new Thread(st1);
		Thread t2 = new Thread(st2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		int rs1 = st1.getNum();
		int rs2 = st2.getNum();
		int tot = rs1+rs2;
		
		System.out.println("1~100까지의 합 : " + tot);
		
		
		
		
	}
}
