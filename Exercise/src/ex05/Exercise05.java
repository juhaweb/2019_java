package ex05;
/*
 * ��¥ : 2019/10/25
 * �̸� : ������
 * ���� : ��ü�������α׷���
 */
public class Exercise05 {
	
	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong","12345");
		
		if(result) {
			
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
			
		} else {
			
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
			
		}
		
	}
	
}