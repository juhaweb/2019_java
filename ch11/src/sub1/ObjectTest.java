package sub1;
/*
 * 날짜 : 2019.10.23
 * 이름 : 하정욱
 * 내용 : 자바 내장클래스 Object 실습하기 교재 p457
 */
public class ObjectTest {
	
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 2000);
		Apple a2 = new Apple("독일", 4000);
		Banana b1 = new Banana("미국", 3000);
		Banana b2 = new Banana("필리핀", 3500);
		
		
		// 다형성에 활용되는 Object 클래스
		Object fruit[] = {a1, a2, b1, b2};
		
		// 다운캐스팅
		Apple f1 = (Apple) fruit[0];
		// Apple f2 = (Apple) fruit[2];    ---- fruit 2번재 배열은 b1인데 사과로 바꿀수없어. 
		Banana f3 = (Banana) fruit[2];    // fruit 2번재 배열은 b1인데 사과로 바꿀수없어.
		
		f1.info();
		f3.info();
	
		
		
		
		
	}
	

}
