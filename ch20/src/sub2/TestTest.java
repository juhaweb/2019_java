package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTest {

	public static void main(String[] args) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.9:3306/hju";
		String user = "hju";
		String pass = "1234";
		Connection conn = null;
		
		try {
		// 1. JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2. 데이터베이스 
		conn = DriverManager.getConnection(host,user,pass);
		
		// 3. SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		// 4. SQL 실행
		String sql ="DELETE FROM `USER2` WHERE `uid`='B101';"; 
		stmt.executeUpdate(sql);
		
		// 5. SELECT 결과셋 처리
		
		
		// 6. 데이터베이스 종료
		conn.close();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료... ");
	}
	
}
