package test;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * ��¥ : 2019.10.31 
 * �̸� : ������
 * ���� : �����ͺ��̽� ���α׷���
 */
public class MysqlTest {

	public static void main(String[] args) throws Exception{

		// DB ����
		String host = "jdbc:mysql://192.168.44.9:3306/hju";
		String user = "hju";
		String pass = "1234";
		
		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn !=null) {
			System.out.println("DB���� ����");			
		}
		
		// 3�ܰ� - SQL ���ఴü ����
		
		
		// 4�ܰ� - SQL ����
		
		
		// 5�ܰ� - SELECT ����� ó��
		
	
			
			
		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
		
		
		
		
	}
	
	
	
}
