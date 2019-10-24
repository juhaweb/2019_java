package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2019.10.24
 * 이름 : 하정욱
 * 내용 : 컬렉션 프레임워크 1.List 실습하기 교재 p724
 */
public class ListTest {

	public static void main(String[] args) {
		
		// 리스트 생성 및 데이터 저장
		// ArrayList<Integer> list1 = new ArrayList<>();
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);		//index번호0
		list1.add(2);		//index번호1
		list1.add(3);		//index번호2
		list1.add(4);		//index번호3
		list1.remove(2);  	//index번호 2번 객체 제거
		list1.add(0,5);		//index번호 0에 5추가
		list1.add(3,3);		//index번호 3앞자리에 3을 추가. 
		
		System.out.println("list1 1번째 원소 : " + list1.get(0));
		System.out.println("list1 2번째 원소 : " + list1.get(1));
		System.out.println("list1 3번째 원소 : " + list1.get(2));
		System.out.println("list1 4번째 원소 : " + list1.get(3));
		System.out.println("list1 5번째 원소 : " + list1.get(4));
		
		
		// 리스트 생성 및 데이터 저장
		List<String> list2 = new ArrayList<>();
		list2.add("김유신");
		list2.add("이순신");
		list2.add("정약용");
		
		System.out.println(list2);	// 배열로 나옴. 
		
		// 리스트 반복문
		for(String name:list2) {
			System.out.println("list2원소 : " +name);
		}
		
		
		// 사과 리스트 생성 및 사과 저장
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 4000);
		Apple a3 = new Apple("대만", 5000);
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		System.out.println("전체 사과 개수 :" +list3.size());
											// 리스트는 .length 대신에 size 사용

		// 사과 출력
		Apple apple = list3.get(1);
		apple.info();
		
		list3.get(2).info();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
