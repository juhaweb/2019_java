package sub1;

					//  ���׸� ��ȣ�� �ִٰ� �����������. <T>
public class FruitBox<T> {

	private T fruit;
	
	// Getter : �ܺη� Ŭ������ ����� �����ϱ� ���� �޼��� 
	public T getFruit() {
		return fruit;
	}
	
	// Setter : �ܺο��� Ŭ������ ����� ���� �ޱ� ���� �޼���
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
		
	
}
