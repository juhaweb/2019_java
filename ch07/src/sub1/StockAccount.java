package sub1;

						//extends 상속. 
public class StockAccount extends Account {
	
	// 특성 (멤버변수)
	private String stock;
	private int amount;
	private int stockPrice;
	
	// 생성자
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int stockPrice) {
		super(bank, id, name, money);
		// super = 부모클래스 (ctrl+마우스 대면 해당 메서드로 바로 이동됨. )
		
		this.stock = stock;
		this.amount = amount;
		this.stockPrice = stockPrice;
	}
		
	
	// 기능 (멤버메서드)
	public void sell(int amount) {
		this.amount -= amount;

	}
	
	public void buy(int amount) {
		this.amount += amount;
	}
	
	public void info() {
		super.info();  // 여기서 부모의 info를 실행. 
		System.out.println("주식종목 : " +stock);
		System.out.println("주식가격 : " +stockPrice);
		System.out.println("주식수량 : " +amount);
	} 
	
	
	
	
	
	
}
