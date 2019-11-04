package sub1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayerController implements Initializable{

	@FXML private Button btnLogin;
	@FXML private Button btnCancel;
	@FXML private TextField txtUid;
	@FXML private TextField txtPass;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 직접 이벤트 핸들러(처리자. 취급자) 구현
		btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			        // 클릭을 했을때 아래 override 부분을 처리하시오. (안드로이드는 setonTouch쯤 될듯) 
			@Override
			public void handle(ActionEvent event) {
				
				String uid = txtUid.getText();
				String pass = txtPass.getText();
				
				if(uid.equals("hong") && pass.equals("1234")) {
					System.out.println(uid+"님 반갑습니다");					
				} else {
					System.out.println("로그인 실패...");
				}
								
			}
		});

		
		
		// 람다식을 이용한 이벤트 핸들러 구현
		btnCancel.setOnAction(event->btnCancelClick()); 	// 이벤트가 발생하면 event->요 매서드를 실행해라
		
		
	} // initialize end

	public void btnCancelClick() {
		System.out.println("취소버튼클릭");		
	}

	
	
}
