package chap_13;

import java.io.FileWriter;
import java.io.IOException;

public class chap13_Ex4 {

	public static void main(String[] args) throws IOException {
		String source = "Have a good day, Have a nice day! Have good? Hove fun?";
		
		// 문자열 크기의 문자배열 생성
		char intxt[] = new char[source.length()];
		
		// 입력 배열을 intxt 문자 배열에 저장
		source.getChars(0, source.length(), intxt, 0);
		
		FileWriter fw = new FileWriter("temp.txt");
		
		// 문자 배열의 내용을 파일에 출력
		fw.write(intxt);
		
		fw.close();
	}

}
