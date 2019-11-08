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
	
	ObservableList<String> posList = FXCollections.observableArrayList("사원","주임","대리","과장","차장","부장","이사");
	ObservableList<String> depList = FXCollections.observableArrayList("101","102","103","104","105");
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 콤보박스 데이터 추가
		cbPos.setItems(posList);
		cbDep.setItems(depList);
		
	
		btnRegister.setOnAction(event->btnRegisterClick());
		
	} // initialize end
	
	
	// 핸들러함수 만들고 
	public void btnRegisterClick () {
	
		String uid 	= txtUid.getText();
		String name	= txtName.getText();
		String hp	= txtHp.getText();
		String pos	= cbPos.getValue();
		String dep	= cbDep.getValue();
		
		

		// DB정보
		String host = "jdbc:mysql://192.168.44.9:3306/hju";
		String user = "hju";
		String pass = "1234";
		java.sql.Connection conn = null;
		
		try {
			
			// 1단계
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계
			conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계
			String sql = "INSERT INTO `MEMBER` VALUES (?,?,?,?,?,NOW());";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			psmt.setString(2, name);
			psmt.setString(3, hp);
			psmt.setString(4, pos);
			psmt.setString(5, dep);
						
			// 4단계 (중요. 복습필요)
			psmt.executeUpdate();
								
			// 5단계
		
		}catch (Exception e){
			e.printStackTrace();
		}
			// 6단계 		
		
			try {conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		
		
	}
	
	
	
	
	
	
	
}
