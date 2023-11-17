package chap_17;

import java.util.*;

public class StackTest1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		// 사용자로부터 4개의 과일 이름을 입력 받아 stack에 저장
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.print("과일 이름 입력 : ");
			String fruits = sc.next();
			stack.push(fruits);
		}
		
		System.out.println("과일 리스트<스택> : " + stack);
		
		// 스택에서 과일 찾기
		System.out.print("찾고싶은 과일 이름 : ");
		String f = sc.next();
		int n = stack.search(f);
		
		if(n != -1) System.out.println("스택에서 " + f + "의 위치 : " + n + "번지");
		else System.out.println("스택에서 " + f + "은/는 존제하지 않음");
		
		System.out.println("과일 리스트<스택> 삭제");
		while(!stack.empty()) {
			String obj = stack.pop();
			System.out.println("<스택>에서 pop : " + obj);
		}
	}

}
