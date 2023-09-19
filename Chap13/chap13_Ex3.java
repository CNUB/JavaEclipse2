package chap_13;

public class chap13_Ex3 {

	public static void main(String[] args) {
		g("korea");

	}
	
	public static void g(String str) {
		float f = 0;
		try {
			f = Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			f = 0;	
			
		} finally {
			System.out.println(f);
		}
	}

}
