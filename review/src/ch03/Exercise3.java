package ch03;

public class Exercise3 {

	public static void main(String[] args) {
		
		
		//Exercise02 p102
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(y);
	
		
		
		//Exercise03 p102 : 삼항연산자  (조건식)? 참:거짓;
		int score = 85;
		String result3 = (!(score>90))? "가":"나";		// score가 90보다 !안클때 
		System.out.println(result3);
		
		
		
		//Exercise04 p103
		int pencils = 534;
		int student = 30;
		
		int pencilsPerStudent = (pencils/student);	// 몫 (17.****)
		System.out.println(pencilsPerStudent);
		
		int pencilLeft = (pencils%student);			// 나머지 (
		System.out.println(pencilLeft);
		
		
		
		//Exercise05 p103
		int value = 356;
		System.out.println((356/100) *100); 		// 100의자리 이하를 버리는 코드
		
		
		
		//Exercise06 p104
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop+lengthBottom)*height/2.0 ;			// /2.0을하면 전체 연산식이 소숫점을 포함한 답이 산출된다. 
		System.out.println(area);
		
		
		
		//Exercise07 p104
		int xx = 10;
		int yy = 5; 
		
		System.out.println( (xx>7)&&(yy<=5) );
		System.out.println( (xx%3==2) || (yy%2!=1) );
		
		
	
		//Exercise08 p105
		double xxx = 5.0;
		double yyy = 0.0;
		
		double zzz = xxx % yyy;
		
		if(Double.isNaN(zzz)) {
			System.out.println("0.0으로 못나눔");
		}else {
			double result8 = zzz + 10;
			System.out.println(result8);
		}
		
		
		
	}
	
	
}
