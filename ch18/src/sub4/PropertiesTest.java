package sub4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2019.11.05
 * 이름 : 하정욱
 * 내용 : 프로퍼티 컬렉션 실습하기 교재 p748
 */
public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		
		// 프로퍼티 기본 데이터 저장, 출력
		Properties prop = new Properties();
		prop.setProperty("101", "홍길동");
		prop.setProperty("102", "고길동");
		prop.setProperty("103", "장길동");
		prop.setProperty("104", "이길동");
		prop.setProperty("105", "김길동");
		prop.setProperty("106", "박길동");
		
		System.out.println("101번 데이터 : " +prop.getProperty("101"));
		System.out.println("104번 데이터 : " +prop.getProperty("104"));
			
		// 스트림을 통한 데이터 입력
		
		String path = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\data.properties";
		FileReader fr = new FileReader(path);
		
		Properties prt = new Properties();
		prt.load(fr);
				
		System.out.println("101번 데이터 : " +prt.getProperty("101"));
		System.out.println("102번 데이터 : " +prt.getProperty("102"));
		System.out.println("103번 데이터 : " +prt.getProperty("103"));

		
		
		
	}
	
	
	
}
