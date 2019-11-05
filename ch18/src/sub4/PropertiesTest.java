package sub4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * ��¥ : 2019.11.05
 * �̸� : ������
 * ���� : ������Ƽ �÷��� �ǽ��ϱ� ���� p748
 */
public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		
		// ������Ƽ �⺻ ������ ����, ���
		Properties prop = new Properties();
		prop.setProperty("101", "ȫ�浿");
		prop.setProperty("102", "��浿");
		prop.setProperty("103", "��浿");
		prop.setProperty("104", "�̱浿");
		prop.setProperty("105", "��浿");
		prop.setProperty("106", "�ڱ浿");
		
		System.out.println("101�� ������ : " +prop.getProperty("101"));
		System.out.println("104�� ������ : " +prop.getProperty("104"));
			
		// ��Ʈ���� ���� ������ �Է�
		
		String path = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\data.properties";
		FileReader fr = new FileReader(path);
		
		Properties prt = new Properties();
		prt.load(fr);
				
		System.out.println("101�� ������ : " +prt.getProperty("101"));
		System.out.println("102�� ������ : " +prt.getProperty("102"));
		System.out.println("103�� ������ : " +prt.getProperty("103"));

		
		
		
	}
	
	
	
}
