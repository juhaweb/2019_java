package sub1;

					//  ���׸� ��ȣ�� �ִٰ� �����������. <T>
public class FruitBox<T> {

	private T fruit;
	
	// Getter : �ܺη� Ŭ������ ����� �����ϱ� ���� �޼��� 
	public T getF() {
		return fruit;
	}
	
	// Setter : �ܺο��� Ŭ������ ����� ���� �ޱ� ���� �޼���
	public void setF(T fruit) {
		this.fruit = fruit;
	}
		
	
}
