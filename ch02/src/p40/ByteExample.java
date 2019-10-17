package p40;

public class ByteExample {

	public static void main(String[] args) {
		
		byte var1 = -128, var2 = -30, var3 = 0, var4 = 30, var5 = 127;
		// byte var6 = 128 // 컴파일 에러
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		/**
		byte의 경우 -128(최소값) ~ 127 (최대값)을 넘으면 다시 -128부터 시작하게된다.  
		값이 초과되어 저장될 경우 '엉터리값 = 쓰레기값' 이라고 한다. 
		 */
		
	}
}
