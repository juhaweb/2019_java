package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2019.10.31
 * �̸� : ������
 * ���� : INSERT �����ϱ�
 */
public class InsertTest {

	public static void main(String[] args) throws Exception {
		
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/hju";
		String user = "hju";
		String pass = "1234";
		
		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
				
		// 3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		// 4�ܰ� - SQL ����
		String sql ="INSERT INTO `USER2` VALUES ('B101','�����','010-6657-7017',34);";
		stmt.executeUpdate(sql);
		
		// 5�ܰ� - SELECT ����� ó��
		
		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
		
		
		System.out.println("INSERT �Ϸ�...");
		
		
	}
	
	
	
	
	
	
	
}
