package sub2;
/*
 * 날짜 : 2019. 10. 16
 * 이름 : 하정욱
 * 내용 : 자바 클래스 실습하기
 */

public class ClassTest {

	public static void main(String[] args) {
		
		// 객체생성 및 멤버변수 초기화
		Account kb = new Account("국민은행","123-456-789-10","하정욱",10000);

		// 입금해볼게요 : 기능활용
		kb.deposit(20000);
		kb.withdraw(5000);
		// kb.money -= 1;	// 이런건 취약코드 -> 멤버변수의 캡슐화(privite)를 통한 취약코드 예방
		kb.info();
		
		// 객체생성 및 멤버변수 초기화
		Account wr = new Account("우리은행","123-456-789-10","하정욱",40000);
		
		// 기능활용 : 우리은행에 입금할게요
		wr.deposit(30000);
		wr.withdraw(6000);
		wr.deposit(30000);
		wr.withdraw(6000);
		wr.info();
		
		
		// 컴퓨터 객체생성 및..
		Computer samsung = new Computer("INTEL i7","16GB","2TB");
		Computer imac = new Computer("INTEL i5","8GB","2TB");
		
		samsung.calc();
		samsung.internet();
		samsung.info();
		
		imac.info();
		imac.calc();
		imac.internet();
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
