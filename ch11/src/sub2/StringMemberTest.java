package sub2;

public class StringMemberTest {

	public static void main(String[] args) {
		
		
		String str = "Hello Korea";	   // String배열[]에서 만들어졌기에 배열구조와 동일. 
		
		
		// 문자열길이
		System.out.println("str 문자열 길이 : "+ str.length());
		
		
		// charAt() - 문자추출
		System.out.println("str 문자추출" + str.charAt(6));
		
		
		// substring() - 문자열 자르기
		System.out.println("str 문자열 자르기" + str.substring(2, 5)); // 2에서 5까지
		System.out.println("str 문자열 자르기" + str.substring(3));   // 3부터 마지막까지
		
		
		// indexOf(), lastIndexOf() - 특정 문자의 인덱스값 추출
		int idx1 = str.indexOf("e");
		int idx2 = str.indexOf("o");
		
		System.out.println(idx1);
		System.out.println(idx2);
		
		
		// replace() - 문자열 교체
		String rs = str.replace("Korea", "Busan");
		System.out.println(rs);
		
		
		// valueOf() - 기본타입(원시타입) 변수를 문자열로 변환 ★★ 중요
		int var1 = 1;
		double var2 = 2.12;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);	// valueOf 클래스타입에 바로 실행한 : 클래스메서드(정적매서드)  // 클래스 매서드는 자주 쓰니까.... 만들어져있는것. 
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;					// 약식으로 이렇게도 쓴다. 
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
