package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * ��¥ : 2019.11.05
 * �̸� : ������
 * ���� : ���� ���� ����� ��Ʈ�� p1032
 */
public class FileReaderTest {

public static void main(String[] args) throws IOException {
		
		// ���Ͽ��� (throws�� ����ó�� �Ϸ�) 
		String file1 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\sample1.txt";
		String file2 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\sample2.txt";
		
		
		// �Է½�Ʈ�� ���� �� ���Ͽ��� (read)
		FileReader fr = new FileReader(file1);
		
		
		while(true) {
			// �Է½�Ʈ������ ������ �б�
			int data = fr.read();
			if(data == -1) {
				break;	//���̻� ���� �����Ͱ� ������ 
			}
			
			// ��½�Ʈ������ ������ ����. 
			char ch = (char) data;
			System.out.print(ch);

		}
		
		// ����½�Ʈ�� ����
		fr.close();
		
		System.out.println("\n��Ʈ�� �۾� ��");
		
		
	}
	
	
}
