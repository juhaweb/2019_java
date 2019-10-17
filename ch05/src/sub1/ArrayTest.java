package sub1;
/*
 * 날짜 : 2019. 10. 15.
 * 이름 : 하정욱
 * 내용 : 배열 실습하기
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 변수
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// 배열 
		int num[] = {1,2,3,4,5};
		System.out.println("num 배열의 1번째 원소 : " + num[0]);
		System.out.println("num 배열의 2번째 원소 : " + num[1]);
		System.out.println("num 배열의 3번째 원소 : " + num[2]);
		System.out.println("num 배열의 4번째 원소 : " + num[3]);
		System.out.println("num 배열의 5번째 원소 : " + num[4]);
		
		
		
		for(int i=0; i<5; i++) {
			System.out.println("num 배열의"+(i+1) +"번째 원소 : " + num[i]);
		}
		
		
		// 확인연습
		String person1 = "김유신";
		String person2 = "김유삼";
		String person3 = "김유사";
		String person4 = "김유오";
		String person5 = "김유육";
		
		String person[] = {"김유신","김유삼","김유사","김유오","김유육"};
		for(int i=0; i<5; i++) {
			System.out.println("String 배열의"+i+" = " + person[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
