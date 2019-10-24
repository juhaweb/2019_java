package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * ��¥ : 2019.10.24
 * �̸� : ������
 * ���� : �÷��� �����ӿ�ũ 1.List �ǽ��ϱ� ���� p724
 */
public class ListTest {

	public static void main(String[] args) {
		
		// ����Ʈ ���� �� ������ ����
		// ArrayList<Integer> list1 = new ArrayList<>();
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);		//index��ȣ0
		list1.add(2);		//index��ȣ1
		list1.add(3);		//index��ȣ2
		list1.add(4);		//index��ȣ3
		list1.remove(2);  	//index��ȣ 2�� ��ü ����
		list1.add(0,5);		//index��ȣ 0�� 5�߰�
		list1.add(3,3);		//index��ȣ 3���ڸ��� 3�� �߰�. 
		
		System.out.println("list1 1��° ���� : " + list1.get(0));
		System.out.println("list1 2��° ���� : " + list1.get(1));
		System.out.println("list1 3��° ���� : " + list1.get(2));
		System.out.println("list1 4��° ���� : " + list1.get(3));
		System.out.println("list1 5��° ���� : " + list1.get(4));
		
		
		// ����Ʈ ���� �� ������ ����
		List<String> list2 = new ArrayList<>();
		list2.add("������");
		list2.add("�̼���");
		list2.add("�����");
		
		System.out.println(list2);	// �迭�� ����. 
		
		// ����Ʈ �ݺ���
		for(String name:list2) {
			System.out.println("list2���� : " +name);
		}
		
		
		// ��� ����Ʈ ���� �� ��� ����
		Apple a1 = new Apple("�ѱ�", 3000);
		Apple a2 = new Apple("�̱�", 4000);
		Apple a3 = new Apple("�븸", 5000);
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		System.out.println("��ü ��� ���� :" +list3.size());
											// ����Ʈ�� .length ��ſ� size ���

		// ��� ���
		Apple apple = list3.get(1);
		apple.info();
		
		list3.get(2).info();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
