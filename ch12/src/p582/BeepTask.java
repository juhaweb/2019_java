package p582;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
 public void run() {
	 
	 Toolkit toolkit = Toolkit.getDefaultToolkit(); 	// Toolkit ��ü ���
		for(int i=0; i<5; i++) {
			
			toolkit.beep();								// ������ �߻�
			try {Thread.sleep(5000);} catch(Exception e) {}
				// 0.5�ʰ� �Ͻ�����
		}
 }
}
