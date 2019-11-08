package sub1;

import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class UserController implements Initializable {
	
	@FXML private TextField txtUid;
	@FXML private TextField txtName;
	@FXML private TextField txtHp;
	@FXML private ComboBox<String> cbPos;
	@FXML private ComboBox<String> cbDep;
	@FXML private Button btnRegister;
	@FXML private Button btnCancel;	
	
	ObservableList<String> posList = FXCollections.observableArrayList("���","����","�븮","����","����","����","�̻�");
	ObservableList<String> depList = FXCollections.observableArrayList("101","102","103","104","105");
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// �޺��ڽ� ������ �߰�
		cbPos.setItems(posList);
		cbDep.setItems(depList);
		
	
		btnRegister.setOnAction(event->btnRegisterClick());
		
	} // initialize end
	
	
	// �ڵ鷯�Լ� ����� 
	public void btnRegisterClick () {
	
		String uid 	= txtUid.getText();
		String name	= txtName.getText();
		String hp	= txtHp.getText();
		String pos	= cbPos.getValue();
		String dep	= cbDep.getValue();
		
		

		// DB����
		String host = "jdbc:mysql://192.168.44.9:3306/hju";
		String user = "hju";
		String pass = "1234";
		java.sql.Connection conn = null;
		
		try {
			
			// 1�ܰ�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ�
			conn = DriverManager.getConnection(host, user, pass);
			
			// 3�ܰ�
			String sql = "INSERT INTO `MEMBER` VALUES (?,?,?,?,?,NOW());";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			psmt.setString(2, name);
			psmt.setString(3, hp);
			psmt.setString(4, pos);
			psmt.setString(5, dep);
						
			// 4�ܰ� (�߿�. �����ʿ�)
			psmt.executeUpdate();
								
			// 5�ܰ�
		
		}catch (Exception e){
			e.printStackTrace();
		}
			// 6�ܰ� 		
		
			try {conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		
		
	}
	
	
	
	
	
	
	
}
