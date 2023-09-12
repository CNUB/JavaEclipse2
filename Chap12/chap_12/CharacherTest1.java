package chap_12;

public class CharacherTest1 {

	public static void main(String[] args) {
		char a[] = {'a', '?', '김', '5', 'A'};
		for(int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] 번째 요소 : " + a[i] + " :" );
			if(Character.isDigit(a[i])) System.out.print(" 숫자");
			if(Character.isLetter(a[i])) System.out.print(" 문자");
			if(Character.isUpperCase(a[i])) System.out.print(" 대문자");
			if(Character.isLowerCase(a[i])) System.out.print(" 소문자");
			System.out.println();
		}
		if(Character.isDefined(a[2])) {
			System.out.print("a[2] 번째 요소 : " + a[2] + " :");
			System.out.print(" 유니코드");
			
		}

	}

}
