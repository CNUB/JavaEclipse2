package chap_13;

public class chap13_Ex1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		
		try {
			System.out.print("2 / 0은 : ");
			int div = b / a;
			System.out.println(div);
		} catch (RuntimeException ex) {
			System.out.println("RuntimeExeption 예외 발생");
		} catch (Exception ex) {
			System.out.println("Exeption 예외 발생");
		}
	}

}
