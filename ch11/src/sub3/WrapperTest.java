package sub3;

/* 
 * 날짜 : 2019.10.23
 * 이름 : 하정욱
 * 내용 : 자바 Wrapper클래스 실습하기 교재 p527
 */
public class WrapperTest {

	public static void main(String[] args) {
		
		// 기본타입을 랩핑
		// 기본타입 변수
		int var1 = 1;
		double var2 = 2.12;
		boolean var3 = true;
		char var4 = 'A';
		
		// WrapperClass
		Integer w1 = new Integer(var1);
		Double w2 = new Double(var2);
		Boolean w3 = new Boolean(var3);
		Character w4 = new Character(var4);
	
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		
		
		/***************************************/
		
		
		// 기본타입(원시타입) -> 문자열로 변환
		int var5 = 1;
		double var6 = 2.12;
		boolean var7 = true;
		
		String s1 = String.valueOf(var5);	// valueOf 클래스타입에 바로 실행한 : 클래스메서드(정적매서드)  // 클래스 매서드는 자주 쓰니까.... 만들어져있는것. 
		String s2 = String.valueOf(var6);
		String s3 = ""+var7;					// 약식으로 이렇게도 쓴다. 
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);				

		/***************************************/
		
		// 문자열 -> 기본타입 변환
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "false";
		
		int		v1 = Integer.parseInt(str1);
		double	v2 = Double.parseDouble(str2);
		boolean	v3 = Boolean.parseBoolean(str3);
				
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		/***************************************/
		
		// 문자열 -> Wrapper 변환
		Integer	wr1 = Integer.valueOf(str1);
		Double	wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		/***************************************/
		
		// Wrapper -> 문자열로 변환
		String ss1 = w1.toString();
		String ss2 = w1.toString();
		String ss3 = w1.toString();
		
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);

		/***************************************/
		
		
		
		
		
		
		
		
	}
}
