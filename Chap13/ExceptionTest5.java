package chap_13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest5 {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.println((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println(e + "파일이 존제하지 않음");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없음");
		}
	}

}
