package p582;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
 public void run() {
	 
	 Toolkit toolkit = Toolkit.getDefaultToolkit(); 	// Toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			
			toolkit.beep();								// 비프음 발생
			try {Thread.sleep(5000);} catch(Exception e) {}
				// 0.5초간 일시정지
		}
 }
}
