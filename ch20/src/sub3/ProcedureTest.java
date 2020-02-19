package sub3;

import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 이름 : 하정욱
 * 내용 : Procedure 실습하기
 */
public class ProcedureTest {

	public static void main(String[] args) throws Exception {
		
		// 1단계
		String host = "jdbc:mysql://192.168.44.7:3306/hju";
		String user = "hju";
		String pass = "1234";
				
		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		// 3단계
		CallableStatement cs = conn.prepareCall("CALL getArticle(?)");
		cs.setInt(1,  1);
		
		// 4단계
		ResultSet rs = cs.executeQuery();
		
		
		// 5단계
		if(rs.next()) {
			String seq  	= rs.getString(1);
			String title 	= rs.getString(5);
			String hit		= rs.getString(8);
			
			System.out.println("번호 : "+seq);
			System.out.println("제목 : "+title);
			System.out.println("조회 : "+hit);
		}
		
		// 6단계
		rs.close();
		conn.close();
		
		
	}
}
