package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2019.11.05
 * 이름 : 하정욱
 * 내용 : 파일 버퍼 입출력 스트림 p1032
 */
public class BufferIOTest {


	public static void main(String[] args) throws IOException {
		
		// 파일연결 (throws로 예외처리 완료) 
		String file1 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\cameron2.jpg";
				
		// 입출력스트림 생성 및 파일연결 
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		
		// 버퍼스트림 생성및 연결
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while(true) {
			// 입력스트림으로 데이터 읽기
			int data = bis.read();
			if(data == -1) {
				break;	//더이상 읽을 데이터가 없으면 
			}
			
			// 출력스트림으로 데이터 쓰기. 
			bos.write(data);
		
		}
		
		// 입출력스트림 해제
		fis.close();
		fos.close();
		
		System.out.println("스트림 작업 끝");
		
		
	}	
	
	
}
