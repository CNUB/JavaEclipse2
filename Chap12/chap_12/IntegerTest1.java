package chap_12;

public class IntegerTest1 {

	public static void main(String[] args) {
		// 정수 값을 인수로 받아 Integer 객체를 생성하는 것
		// Integer num1 = new Integer(13); java 9 이상부터 사용하지 않음
		Integer num1 = Integer.valueOf(13); // valueOf 사용
		Integer num2 = 25;	// Autoboxing 이용 
		
		System.out.println("num1이 포장하고 있는 정수는 : " + num1.intValue());
		System.out.println("num2가 포장하고 있는 정수는 : " + num2);
		
		num2 = num1 + num2;
		
		System.out.println("두 수의 합 : " + num2);
		
		System.out.println("if(num1 == num2) : " + num1.equals(num2));
		
		Integer num3 = Integer.valueOf(444);
		System.out.println("문자열 '444'의 값 : " + num3.intValue());
		System.out.println("2진수 1001001 의 100진값 : " + Integer.parseInt("1001001", 2));

	}

}
