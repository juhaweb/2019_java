package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ��¥ : 2019.10.24
 * �̸� : ������
 * ���� : �÷��� �����ӿ�ũ 2.Set �ǽ��ϱ� ���� p724
 */
public class SetTest {

	public static void main(String[] args) {
		
		// ���� ���� �� ������ ����
		// HashSet<Double> set = new HashSet<>(); 
		Set<Double> set = new HashSet<>();
		
		set.add(1.0);
		set.add(2.0);
		set.add(3.0);
		set.add(4.0);
		set.add(2.0);	// �ߺ�������
		
		System.out.println("���Ұ���(�ߺ���������)"+set.size());
		
		//���� ���� ������ : ����Ʈ ���ϰ� �������� ������ ������ �ݺ������. (������ ��:�ݺ���) 
		Iterator<Double> it = set.iterator();	//���� ���Ҹ� �������ִ� �ݺ���.
		
		//hasNext ������ ������ ������ ������ �����°�. ������ ����.  
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}
	
}
