package sub1;
/*
 * ��¥ : 2019.10.24
 * �̸� : ������
 * ���� : ���׸�Ŭ���� �ǽ��ϱ� ���� p654
 * 
 */
public class GenericTest {

	public static void main(String[] args) {
		
		Apple a = new Apple ("�ѱ�", 2000);
		Banana b = new Banana ("�븸", 1500);

		FruitBox<Apple> box1 = new FruitBox<Apple>();
		box1.setFruit(a);
											// <>�� ���⵵ ��. 
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(b);
		
		Apple	fr1 = box1.getFruit();
		Banana	fr2 = box2.getFruit();
		
		f1.info();
		f2.info();
		
		
		
		
		
		
	}
	
	
}
