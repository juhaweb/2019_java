package sub2;

public class Account {

	// 특성 ( 멤버 변수 : 명사로 네이밍 )   (얘들은 캡슐화해야함. encapsulation : private )
	private String bank;
	private String id;
	private String name;
	public int money;
	
	// 생성자 : 요기 위에 캡슐화 해서 초기화가 안되네.. 객체생성 할 때 멤버변수를 초기화 하는 메서드 
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;		
	}

	// 기능 ( 멤버 메서드 : 동사로 네이밍 )
	
	// 1. 입금
	public void deposit( int money ) {
		this.money += money;   
	}
	
	// 2. 출금
	public void withdraw( int money ) {
		this.money -= money;		
	}
	
	// 3. 잔액조회
	public void info() {
		System.out.println("=========================");
		System.out.println("은 행 명 : "+ this.bank);
		System.out.println("계좌번호 : "+ id);
		System.out.println("입 금 주 : "+ name);
		System.out.println("현재잔액 : "+ money);
		System.out.println("-------------------------");
	}
	
		
	
	// 정답이 없어 만들기 나름. 
	
	
}
