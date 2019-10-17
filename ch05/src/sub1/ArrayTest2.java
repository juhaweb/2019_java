package sub1;

/*
 * 날짜 : 2019. 10. 15
 * 이름 : 하정욱
 * 내용 : 다차원 배열 실습하기
 */

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		
		// 1차원 배열
		
		/*
		 * int[] srore = {};
		 * int score[] = {}; 
		 */ 
	
		int[] score = {80,60,70,85,65,79,82,44,68};
		
		int sum = 0;
		
		for (int i=0; i<9; i++) {
			sum += score[i];
		}
		
		System.out.println("점수의 총합 : " + sum );
		System.out.println("점수의 평균 : " + sum/score.length);
		

		// 배열의 반복문
		int jumsu[] = {10,20,30,40,50,60};
		int total = 0;
		
		// n : jumsu 배열의 길이만큼 n에 대입해 반복. 
		
		for(int n : jumsu) {
			total += n;			
		}
		
		System.out.println("jumsu배열의 합 : " + total);
		
		
		
		
		
		
		// 2차원 배열  ( ==행렬 )
		// int arr[row][column] = {{},{},{}};
		
		int arr[][] = { { 1, 2, 3},
						{ 4, 5, 6},
						{ 7, 8, 9},
						{10,11,12} };
		
		System.out.println("arr[0][0] : "+arr[0][0]);
		System.out.println("arr[0][1] : "+arr[0][1]);
		System.out.println("arr[0][2] : "+arr[0][2]);
		
		System.out.println("arr[1][0] : "+arr[1][0]);
		System.out.println("arr[1][1] : "+arr[1][1]);
		System.out.println("arr[1][2] : "+arr[1][2]);
		
		System.out.println("arr[2][0] : "+arr[2][0]);
		System.out.println("arr[2][1] : "+arr[2][1]);
		System.out.println("arr[2][2] : "+arr[2][2]);
		
		System.out.println("arr[3][0] : "+arr[3][0]);
		System.out.println("arr[3][1] : "+arr[3][1]);
		System.out.println("arr[3][2] : "+arr[3][2]);

		
		for(int a=0; a<=3; a++) {
			for(int b=0; b<=2; b++) {
				System.out.println("arr["+a+"]["+b+"] = " +arr[a][b]);
			}
		}
			
			
		// 3차원 배열 (도 있다고)
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
