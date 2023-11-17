package chap_17;

import java.util.*;

public class QueueTest1 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		
		// 사용자로부터 4개의 과일 이름을 입력 받아 queue에 저장
		Scanner sc = new Scanner(System.in);
				
		for(int i = 0; i < 4; i++) {
			System.out.print("과일 이름 입력 : ");
			String fruits = sc.next();
			queue.offer(fruits);
		}
				
		System.out.println("과일 리스트<queue> : " + queue);
				
		// queue에서 과일 찾기 indexOf()
		System.out.print("찾고싶은 과일 이름 : ");
		String f = sc.next();
		int n = queue.indexOf(f);
				
		if(n != -1) System.out.println("queue에서 " + f + "의 위치 : " + n + "번지");
		else System.out.println("queue에서 " + f + "은/는 존제하지 않음");
				
		// queue 리스트의 과일 삭제 poll(), isEmpty()
		System.out.println("과일 리스트<queue> 삭제");
		while(!queue.isEmpty()) {
			String obj = queue.poll();
			System.out.println("<queue>에서 pop : " + obj);
		}

	}

}
