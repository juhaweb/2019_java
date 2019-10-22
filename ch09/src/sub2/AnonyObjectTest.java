package sub2;
/*
 * 날짜 : 2019. 10. 22
 * 이름 : 하정욱
 * 내용 : 익명 클래스 실습하기 교재 p3404
 */
public class AnonyObjectTest {

	public static void main(String[] args) {
		
		// 인터페이스 바로사용  (익명클래스. ctrl+space. 안드로이드할때 많이나옴. )
		Person p = new Person () {
			
			@Override
			public void info() {
				System.out.println("Person info .... ");
			}
			
			@Override
			public void hello() {
				System.out.println("Person say hello .... ");
			}
			
		};
		
		
		p.info();
		p.hello();
		
		
		
		
	}
	
	
}
