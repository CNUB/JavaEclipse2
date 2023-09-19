package chap_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int age = 0;
		System.out.print("나이 입력 : ");
		
		try {
			age = std.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e + "\n정수로 입력하여야 합니다.");
		} finally{
			System.out.println("age : " + age);
		}
	}
}
