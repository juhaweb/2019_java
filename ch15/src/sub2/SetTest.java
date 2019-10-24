package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2019.10.24
 * 이름 : 하정욱
 * 내용 : 컬렉션 프레임워크 2.Set 실습하기 교재 p724
 */
public class SetTest {

	public static void main(String[] args) {
		
		// 집합 생성 및 데이터 저장
		// HashSet<Double> set = new HashSet<>(); 
		Set<Double> set = new HashSet<>();
		
		set.add(1.0);
		set.add(2.0);
		set.add(3.0);
		set.add(4.0);
		set.add(2.0);	// 중복허용안함
		
		System.out.println("원소갯수(중복은허용안함)"+set.size());
		
		//집합 원소 꺼내기 : 셀렉트 못하고 무작위로 나오기 때문에 반복문사용. (꺼내는 손:반복자) 
		Iterator<Double> it = set.iterator();	//집합 원소를 추출해주는 반복자.
		
		//hasNext 다음께 있으면 끄내고 없으믄 끝나는거. 순서는 랜덤.  
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}
	
}
