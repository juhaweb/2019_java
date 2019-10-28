package ex07;
/*
 * 날짜 : 2019/10/25
 * 이름 : 하정욱
 */
public class ShopService {

	private static ShopService instance = new ShopService();
	
	private ShopService(){}
	
	public static ShopService getInstance() {
		return instance;
	}
}
