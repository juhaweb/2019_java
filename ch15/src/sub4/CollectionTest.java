package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/*
 * 날짜 : 2019.10.24
 * 이름 : 하정욱
 * 내용 : 컬렉션 프레임워크 응용 실습하기 교재 p724
 */
public class CollectionTest {
	public static void main(String[] args) {
		
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국",2000));
		m1.put(102, new Apple("미국",4000));
		m1.put(103, new Apple("영국",6000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("중국",2000));
		m2.put(202, new Apple("호주",4000));
		m2.put(203, new Apple("대만",6000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("태국",2000));
		m3.put(302, new Apple("필리핀",4000));
		m3.put(303, new Apple("인도",6000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		System.out.println("전체갯수" + list.size());
		
		// 한국사과
		Map<Integer,Apple> mp1 = list.get(0);
		Apple apple = mp1.get(101);
		apple.info();
		
		// 영국사과
		list.get(0).get(103).info();
		
		// 대만사과
		list.get(1).get(203).info();
		
		// 인도사과
		list.get(2).get(303).info();
		
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
