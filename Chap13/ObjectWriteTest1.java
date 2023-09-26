package chap_13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class PersonInfo implements Serializable{
	String name;;
	String city;
	int age;
	
	// 생성자
	public PersonInfo(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
}

public class ObjectWriteTest1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력 파일명 입력 : ");
		
		String fileName = sc.next();
		
		String s1 = "***고객정보***";
		
		// 직렬화된 객체 2개 생성
		
		PersonInfo p1 = new PersonInfo("김주안", "부산", 22);
		PersonInfo p2 = new PersonInfo("김중머", "서울", 25);
		
		// 직렬화된 객체를 2진수로 기록할 파일을 지정
		// 객체를 기록할 수 있는 ObjectOutputStream 객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)); 
		
		// 직렬화된 객체를 2진수로 기록
		oos.writeObject(s1);
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
		System.out.println(fileName + "파일명으로 객체 파일 생성");
	}

}
