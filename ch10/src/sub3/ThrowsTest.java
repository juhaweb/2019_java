package sub3;
/*
 * 날짜 : 2019.10.23
 * 이름 : 하정욱
 * 내용 : 
 */
public class ThrowsTest {
											// throws jvm에서 에러처리. 
	public static void main(String[] args) throws Exception {
		
		Calc cal = new Calc();
		
		int rs1 = cal.plus(1, 2);
		int rs2 = cal.minus(1, 2);
		int rs3 = cal.mult(1, 2);
				
		int rs4 = 0;
		
		try {rs4 = cal.div(1, 0);}
		catch (Exception e) {
			// 전달된 에러를 처리 . 
			e.printStackTrace();			
		}
				
		
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		System.out.println(rs4);
		
		
		System.out.println("프로그램 종료");
		
		
		
		
		
	}
}
