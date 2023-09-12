package chap_12;

public class StringBufferTest1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello Java");
		StringBuffer sb2 = new StringBuffer(" 처음 시작하는 자바");
		
		System.out.println(" 문자열 : " + sb1); // 버퍼를 포함하여 배정된 공간을 출력
		System.out.println(" 문자열 길이 : " + sb1.length());
		System.out.println(" 버퍼를 포함한 길이 : " + sb1.capacity());
		System.out.println(" 버퍼에 들어있는 내용 : " + sb2);
		System.out.println(" 문자열 끼워넣기 : " + sb2.insert(8, "Power "));
		System.out.println(" 버퍼의 8번째 문자 : " + sb2.charAt(8));
		sb2.setCharAt(5, '되');
		System.out.println(" 5번째 값을 '되로 변경 : " + sb2);
		sb2.setLength(5); // 문자열의 길이를 고정(나머지는 삭제
		System.out.println(" 버퍼의 새로운 값 : " + sb2);
		System.out.println(" 문자열 역출력 : " + sb2. reverse());
	}

}
