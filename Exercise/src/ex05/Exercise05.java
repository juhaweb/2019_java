package ex05;
/*
 * 날짜 : 2019/10/25
 * 이름 : 하정욱
 * 내용 : 객체지향프로그래밍
 */
public class Exercise05 {
	
	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong","12345");
		
		if(result) {
			
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
			
		} else {
			
			System.out.println("id 또는 password가 올바르지 않습니다.");
			
		}
		
	}
	
}