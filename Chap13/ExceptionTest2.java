/*
2개의 정수를 입력 받아 나숫셈 하는 프로그램
 */

package chap_13;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdIn.nextInt();
		
		//try catch할 열을 드래그한 후 alt + shift + z
		
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("해당 예외 : " + e);
		}

	}

}
