package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2019.10.31
 * 이름 : 하정욱
 * 내용 : INSERT 연습하기
 */
public class InsertTest {

	public static void main(String[] args) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/hju";
		String user = "hju";
		String pass = "1234";
		
		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
				
		// 3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		// 4단계 - SQL 실행
		String sql ="INSERT INTO `USER2` VALUES ('B101','정약용','010-6657-7017',34);";
		stmt.executeUpdate(sql);
		
		// 5단계 - SELECT 결과셋 처리
		
		// 6단계 - 데이터베이스 종료
		conn.close();
		
		
		System.out.println("INSERT 완료...");
		
		
	}
	
	
	
	
	
	
	
}
