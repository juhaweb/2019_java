package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTest {

	public static void main(String[] args) throws Exception {
		
		// DB����
		String host = "jdbc:mysql://192.168.44.9:3306/hju";
		String user = "hju";
		String pass = "1234";
		Connection conn = null;
		
		try {
		// 1. JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2. �����ͺ��̽� 
		conn = DriverManager.getConnection(host,user,pass);
		
		// 3. SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		// 4. SQL ����
		String sql ="DELETE FROM `USER2` WHERE `uid`='B101';"; 
		stmt.executeUpdate(sql);
		
		// 5. SELECT ����� ó��
		
		
		// 6. �����ͺ��̽� ����
		conn.close();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete �Ϸ�... ");
	}
	
}
