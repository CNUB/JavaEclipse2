package chap_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class chap13_Ex5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int[] num = { 1, 2, 3, 4, 5 };
		String[] st = {"Kim", "Park", "Jung", "Lee" };
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tmp.txt")); 
		oos.writeObject(num); // 파일에 num 객체를 쓴다
		oos.writeObject(st); // 파일에 st 객체를 쓴다
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tmp.txt")); 
		int[] num2 = (int[]) ois.readObject();	// 파일로부터 객체를 읽는다
		String[] st2 = (String[]) ois.readObject(); // 객체의 내욜을 출력
		
		for(int i = 0; i < num2.length; i++) {  // 객체 내용 출력
			System.out.print(num2[i] + " ");
			System.out.println();
		}
		
		for(int i = 0; i < st2.length; i++) {
			System.out.print(st2[i] + " ");
		}
		
		ois.close();
	}

}
