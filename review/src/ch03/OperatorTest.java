package ch03;


public class OperatorTest {

	public static void main(String[] args) {
		
		
		
		// byte, short, int, long
		
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num3 * num4;
		int rs4 = num4 / num2;
		int rs5 = num4 % num3;	
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		System.out.println("rs5 : " + rs5);

		
		
		// 증감연산자
		
		num1++;
		++num1;
		num2--;
		--num2;
		
		System.out.println(num1);	// 1+1+1 = 3
		System.out.println(num1);	// 2-1-1 = 0 
		

		
		// 
		
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4, n5 = 5;

		n1 += 1;	// n1 = n1 + 1
		n2 -= 2;	// n2 = n2 - 2
		n3 *= 3;	// n3 = n3 * 3
		n4 /= 4;	// n4 = n4 / 4
		n5 %= 5;	// n5 = n5 % 5
		
		System.out.println("n1 :" + n1);
		System.out.println("n2 :" + n2);
		System.out.println("n3 :" + n3);
		System.out.println("n4 :" + n4);
		System.out.println("n5 :" + n5);
		
		
		
		// 
		
		int var1 = 1, var2 = 2;
		
		boolean r1 = var1 > var2;	
		boolean r2 = var1 < var2;	
		boolean r3 = var1 >= var2;	
		boolean r4 = var1 <= var2;	  
		boolean r5 = var1 == var2;	
		boolean r6 = var1 != var2;	
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		System.out.println("r5 : " + r5);
		System.out.println("r6 : " + r6);
	
		
		
		// 
		
		boolean res1 = (var1 > 1) && (var2 < 3);	
		boolean res2 = (var1 > 0) && (var2 <= 2);	
		boolean res3 = (var1 > 0) || (var2 > 3);	
		boolean res4 = (var1 < 0) || (var2 > 3);	
		boolean res5 = !(var1 > var2);				
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
		
		
	}
	
}