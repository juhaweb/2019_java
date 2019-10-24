package sub3;

import java.util.HashMap;
import java.util.Map;

import sub1.Banana;

/*
 * 날짜 : 2019.10.24
 * 이름 : 하정욱
 * 내용 : 컬렉션 프레임워크 3.Map 실습하기 교재 p724
 */
public class MapTest {

	public static void main(String[] args) {
		
		// 맵 생성 및 데이터 저장
		// <K=key, V=value> 
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "한국");
		map1.put(102, "미국");
		map1.put(103, "중국");
		map1.put(104, "영국");
		
		System.out.println("map1 원소 개수 : "+map1.size());
		
		// 맵 원소 꺼내기
		String value = map1.get(101);
		
		System.out.println("value : "+value);
		System.out.println(map1.get(103));
		
		
		
		// 바나나 맵 생성 및 바나나 저장
		Map<String, Banana> map2 = new HashMap<>();
		map2.put("kor", new Banana("한국",2000));
		map2.put("usa", new Banana("미국",3000));
		map2.put("uk", new Banana("영국",4000));
		
		// 미국바나나 꺼내기
		
		Banana banana = map2.get("usa");
		banana.info();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
