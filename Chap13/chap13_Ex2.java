package chap_13;

public class chap13_Ex2 {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println("메소드 호출 후");
		} catch (ArrayStoreException ex) {
			System.out.println("ArrayStoreExeption 예외 발생");
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException 예외 발생");
		}

	}
	static void method1() throws RuntimeException{
		int a = 0;
		int b = 2 / a;
		System.out.println("나눗셈 후");
	}

}
