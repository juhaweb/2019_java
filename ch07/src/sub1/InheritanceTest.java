package sub1;

/*
 * ��¥ : 2019. 10. 17
 * �̸� : ������
 * ���� : Ŭ���� ��� �ǽ��ϱ� ���� p288
 */

public class InheritanceTest {
	
	
	public static void main(String[] args) {
		
		StockAccount kw = new StockAccount ("Ű������", "123-456-789-10", "������", 100000, "�Ｚ����", 10, 30000);
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
