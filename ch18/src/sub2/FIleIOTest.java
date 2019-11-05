package sub2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2019.11.05
 * 이름 : 하정욱
 * 내용 : 파일 입출력 스트림 실습 p1018
 */
public class FIleIOTest {

	public static void main(String[] args) throws IOException {
		
		// 파일연결 (throws로 예외처리 완료) 
		String file1 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\cameron2.jpg";
		
		
		// 입력스트림 생성 및 파일연결 (read)
		FileInputStream fis = new FileInputStream(file1);

		// 출력스트림 생성 및 파일연결 (write)
		FileOutputStream fos = new FileOutputStream(file2);
		
		
		while(true) {
			// 입력스트림으로 데이터 읽기
			int data = fis.read();
			if(data == -1) {
				break;	//더이상 읽을 데이터가 없으면 
			}
			
			// 출력스트림으로 데이터 쓰기. 
			fos.write(data);
			
			// char ch = (char) data;
			// System.out.println(ch);
		}
		
		// 입출력스트림 해제
		fis.close();
		fos.close();
		
		System.out.println("스트림 작업 끝");
		
		
	}
	
	
}
