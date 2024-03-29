package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PsmtTest {
	
	public static void main(String[] args) throws Exception {
		
		do {
		
			// 사용자로부터 데이터를 입력받는 클래스
			Scanner sc = new Scanner(System.in);
			
			System.out.println("사용자등록입니다. 종료:0, 등록:1");
			System.out.println("입력 : ");
			int result = sc.nextInt();
			
			if(result == 0) {
				break;		
			} 
			
			System.out.println("아이디 입력 : ");
			String uid = sc.next();
			
			System.out.println("이름 입력 : ");
			String name = sc.next();
			
			System.out.println("휴대폰 입력: ");
			String hp = sc.next();
			
			System.out.println("나이 입력 : ");
			int age = sc.nextInt();
			
			insert(uid, name, hp, age);
			
		} while(true);
			System.out.println("종료되었습니다. ");
		
			
		
		
	} //main end
	
	
	public static void insert (String uid, String name, String hp, int age) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/hju";
		String user = "hju";
		String pass = "1234";
				
		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		// 3단계 - SQL 실행객체 생성(PrepareStatement)
		String sql = "INSERT INTO `USER2` VALUES (?,?,?,?); ";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setInt(4, age);
		
		// 4단계 - SQL 실행
		psmt.executeUpdate();
		
		// 5단계 - SELECT 결과셋 처리
		
		// 6단계 - 데이터베이스 종료
		psmt.close();
		conn.close();	

		System.out.println("INSERT 완료... ");
	}
}
