package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2019.11.05
 * 이름 : 하정욱
 * 내용 : 기본 입출력 스트림 교재 p994
 */
public class IOTest {

	public static void main(String[] args) {
		
		// 시스템 기본 입력스트림
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scan.nextLine();
		
		// 시스템 기본 출력스트림
		System.out.println("이름 : "+name);
				
		
		
		
	}
}
