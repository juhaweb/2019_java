package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2019.11.05
 * 이름 : 하정욱
 * 내용 : 파일 리더 입출력 스트림 p1032
 */
public class FileReaderTest {

public static void main(String[] args) throws IOException {
		
		// 파일연결 (throws로 예외처리 완료) 
		String file1 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\sample1.txt";
		String file2 = "C:\\Users\\java\\Desktop\\workspace\\java\\ch18\\src\\sample2.txt";
		
		
		// 입력스트림 생성 및 파일연결 (read)
		FileReader fr = new FileReader(file1);
		
		
		while(true) {
			// 입력스트림으로 데이터 읽기
			int data = fr.read();
			if(data == -1) {
				break;	//더이상 읽을 데이터가 없으면 
			}
			
			// 출력스트림으로 데이터 쓰기. 
			char ch = (char) data;
			System.out.print(ch);

		}
		
		// 입출력스트림 해제
		fr.close();
		
		System.out.println("\n스트림 작업 끝");
		
		
	}
	
	
}
