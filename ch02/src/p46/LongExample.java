package p46;

public class LongExample {

	public static void main(String[] args) {
	
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000 ; // 컴파일 에러 
		long var4 = 1000000000000L ;	
		// int타입의 저장 범위를 넘어서는 정수 리터럴에는 L을 붙여야함. (소문자도 가능.햇갈려서 잘안씀 ) 
	
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}	
}
