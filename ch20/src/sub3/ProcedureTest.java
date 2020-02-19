package sub3;

import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * �̸� : ������
 * ���� : Procedure �ǽ��ϱ�
 */
public class ProcedureTest {

	public static void main(String[] args) throws Exception {
		
		// 1�ܰ�
		String host = "jdbc:mysql://192.168.44.7:3306/hju";
		String user = "hju";
		String pass = "1234";
				
		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		// 3�ܰ�
		CallableStatement cs = conn.prepareCall("CALL getArticle(?)");
		cs.setInt(1,  1);
		
		// 4�ܰ�
		ResultSet rs = cs.executeQuery();
		
		
		// 5�ܰ�
		if(rs.next()) {
			String seq  	= rs.getString(1);
			String title 	= rs.getString(5);
			String hit		= rs.getString(8);
			
			System.out.println("��ȣ : "+seq);
			System.out.println("���� : "+title);
			System.out.println("��ȸ : "+hit);
		}
		
		// 6�ܰ�
		rs.close();
		conn.close();
		
		
	}
}
