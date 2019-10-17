package sub1;

/*
 * 날짜 : 2019. 10. 17
 * 이름 : 하정욱
 * 내용 : 클래스 상속 실습하기 교재 p288
 */

public class InheritanceTest {
	
	
	public static void main(String[] args) {
		
		StockAccount kw = new StockAccount ("키움증권", "123-456-789-10", "김춘추", 100000, "삼성전자", 10, 30000);
		kw.deposit(30000);
		kw.buy(15);
		kw.sell(5);
		kw.info();
			
	
		SmartPhone iphone = new SmartPhone ("A10","4GB","128GB","iphone xs","010-66577-017", 1300000);
		SmartPhone samsung = new SmartPhone ("A10","4GB","128GB","iphone xs","010-66577-017", 1300000);
	
		iphone.info();
		iphone.call();
		iphone.internet();
	
		samsung.info();
		samsung.call();
		samsung.calc();
	
	
	}

	
	
	
	
	
}
