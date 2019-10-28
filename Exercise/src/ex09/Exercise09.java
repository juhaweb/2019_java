package ex09;
/*
 * 날짜 : 2019/10/25
 * 이름 : 하정욱
 * 내용 : 문자열 <-> 기본타입 변환
 */
public class Exercise09 {

	public static void main(String[] args) {
		
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		String intData2 = "150";
		String strData2 = String.valueOf(intData2);
		
		System.out.println("int Data1 : "+intData1);
		System.out.println("str Data2 : "+strData2);
		
	}
	
}
