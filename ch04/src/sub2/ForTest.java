package sub2;

public class ForTest {

	public static void main(String[] args) {
		
		// for (초기식;조건식;증감식)
		for( int i=1; i<=5; i++ ) {
			System.out.println("Hello java!");
		}
		
		
		
		// 1부터 10까지 합
		int sum = 0;
		
		for ( int k=1; k<=10; k++) {
			sum += k;
			// sum = sum + k; 같은뜻입니다. 
		}
		System.out.println("1부터 10까지의 합 " + sum);
		
		
		
		
		// 1부터 10까지 짝수 합
		int total = 0;
		for (int k=0; k<=10; k+=2) {
			total += k;			
		}
		System.out.println("1부터 10까지 짝수 합 : " + total );
		
	
		// 1부터 10까지 짝수 합 2
		int total1 = 0;
		for (int k=0; k<=10; k++) {
			if(k%2==0) { total1 += k; }
		}
		System.out.println("1부터 10까지 짝수 합 : " + total1 );
		
	
		// 1부터 10까지 홀수 합
		int total2 = 0;
		for (int k=0; k<=10; k++) {
			if(k%2==1) { total2 += k; }
		}
		System.out.println("1부터 10까지 홀수 합 : " + total2 );
		
		
		
		
		// 중첩 for 문
		for (int a=1; a<=3; a++) {
			System.out.println("a : " + a);
			for(int b=1; b<=5; b++) {
				System.out.println("b : " + b);
			}
		}
		
		
	
		
		// 구구단
		for (int a=2; a<=9; a++) {
			System.out.println("\n");
			System.out.println(a +  "단");
			for(int b=1; b<=9; b++) {
				int c = a * b;
				System.out.println(a+"x"+b+"="+c);
			}	
		}
		
		
		
		
		// 별삼각형 출력
		for (int start=1; start<=10; start++) {
			for(int end=1; end<=start; end++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}

		
		
		
		// 별삼각형 역으로 출력 
		for (int start=10; start>=1; start--) {
			for(int end=1; end<=start; end++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		// 별네모 출력
		for(int a=1; a<=5; a++ ) {
			System.out.println(a);
			for (int b=1; b<=5-a; b++) {
				System.out.print("★");
			}
			for (int c=1; c<=a; c++ ) {
				System.out.print("⭐︎");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
	}
	
}
