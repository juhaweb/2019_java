package ex07;
/*
 * ��¥ : 2019/10/25
 * �̸� : ������
 */
public class ShopService {

	private static ShopService instance = new ShopService();
	
	private ShopService(){}
	
	public static ShopService getInstance() {
		return instance;
	}
}
