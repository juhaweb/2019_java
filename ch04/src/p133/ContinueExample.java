package p133;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i%2 != 0) {   // 2로 나눈 나머지가 0이 아닐 경우, (홀수일 경우 - continue->for문 재실행)
				continue;   
			}
			System.out.println(i);     // 홀수는 실행되지 않음. 
		}
		
		
	}
	
	
	
}
