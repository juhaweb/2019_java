package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/*
 * ��¥ : 2019.10.24
 * �̸� : ������
 * ���� : �÷��� �����ӿ�ũ ���� �ǽ��ϱ� ���� p724
 */
public class CollectionTest {
	public static void main(String[] args) {
		
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("�ѱ�",2000));
		m1.put(102, new Apple("�̱�",4000));
		m1.put(103, new Apple("����",6000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("�߱�",2000));
		m2.put(202, new Apple("ȣ��",4000));
		m2.put(203, new Apple("�븸",6000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("�±�",2000));
		m3.put(302, new Apple("�ʸ���",4000));
		m3.put(303, new Apple("�ε�",6000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		System.out.println("��ü����" + list.size());
		
		// �ѱ����
		Map<Integer,Apple> mp1 = list.get(0);
		Apple apple = mp1.get(101);
		apple.info();
		
		// �������
		list.get(0).get(103).info();
		
		// �븸���
		list.get(1).get(203).info();
		
		// �ε����
		list.get(2).get(303).info();
		
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
