package sub2;

public class WhileTest {

	public static void main(String[] args) {
		
		// 1부터 10까지의 합. 
		int k = 1;
		int sum = 0;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지의 합 : " + sum );
		
		
		
		
		// do ~ while
		int total = 0;
		int i = 1;
		
		do {
			if(i%2==1) {
				total +=i;
			}
			i++;
		} while (i<=10);
		System.out.println("1부터 10까지 홀수 합 : " + total );
	
		
		
		
		// break
		int num = 0;
		while(true) {
			num++;
			
			if( num%5==0 && num%7==0 ) {
				break; // 반복문 종료 
			}
				
		}
		System.out.println("5와 7의 최소공배수 : " +num );
			
		
		
		
		
		
		
		
		// continue
		int tot = 0;
		
		for(int a=1; a<=10; a++) {
			
			if(a%2==0) {
				continue;   //반복문의 상위로 이동해서 반복 (a값이 짝수일 때 for문으로 다시 이동) 
 			}
			tot += a ;
		}
		System.out.println("1부터 10까지 홀수의 합 : " +tot);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
