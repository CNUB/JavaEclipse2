/*
2023_09_22
컴퓨터 소프트웨어 공학부 202095023 김주안
파일에 저장된 내용 가져오기
 */

package chap_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args){
		try {
			File file = new File("abc.txt");
			
			// FileReader 객체 사용
			FileInputStream fis = new FileInputStream(file);
			
			// 한 문자씩 읽기
			int i;
			while((i = fis.read()) != -1) {	// 데이터를 모두 읽으면 -1 반환
				System.out.println(i);
			}
			
			fis.close();
			System.out.println("파일로부터 바이트를 읽어 화면에 출력");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존제하지 않음");
		} catch (IOException e) {
			System.out.println("읽을 파일이 없음");
		}
		
	}

}