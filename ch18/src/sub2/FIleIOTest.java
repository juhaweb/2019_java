package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��¥ : 2019.11.05
 * �̸� : ������
 * ���� : ���� ����� ��Ʈ�� �ǽ� p1018
 */
public class FIleIOTest {

	public static void main(String[] args) throws IOException {
		
		// ���Ͽ��� (throws�� ����ó�� �Ϸ�) 
		String file1 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\cameron2.jpg";
		
		
		// �Է½�Ʈ�� ���� �� ���Ͽ��� (read)
		FileInputStream fis = new FileInputStream(file1);

		// ��½�Ʈ�� ���� �� ���Ͽ��� (write)
		FileOutputStream fos = new FileOutputStream(file2);
		
		
		while(true) {
			// �Է½�Ʈ������ ������ �б�
			int data = fis.read();
			if(data == -1) {
				break;	//���̻� ���� �����Ͱ� ������ 
			}
			
			// ��½�Ʈ������ ������ ����. 
			fos.write(data);
			
			// char ch = (char) data;
			// System.out.println(ch);
		}
		
		// ����½�Ʈ�� ����
		fis.close();
		fos.close();
		
		System.out.println("��Ʈ�� �۾� ��");
		
		
	}
	
	
}
