package chap_17;

import java.util.*;

public class TreeSetTest1 {

	public static void main(String[] args) {
		// TreeSet 객체 생서
		TreeSet<Integer> num1 = new TreeSet<Integer>();
		TreeSet<Integer> num2 = new TreeSet<Integer>();
		
		int i;
		
		for(i = 4; i >= 0; i--) {
			num1.add(i);
			num2.add(i*2);
		}
		
		// 순서에 상관없이 항상 정렬되어 출력
		System.out.println("num1<TreeSet> : " + num1);
		System.out.println("num2<TreeSet> : " + num2);
		
		//합집합 만들기
		TreeSet<Integer> union = new TreeSet<Integer>(num1);
		union.addAll(num2);
		
		//교집합 만들기
		TreeSet<Integer> intersection = new TreeSet<Integer>(num1);
		intersection.retainAll(num2);
		
		//차집합 만들기
		TreeSet<Integer> difference = new TreeSet<Integer>(num1);
		difference.removeAll(num2);
		
		System.out.println("합집합 : " + union); // 중복된 값은 출력하지 않음
		System.out.println("교집합 : " + intersection); // 
		System.out.println("차집합 : " + difference);
		
		
		
		// LinkedList 객체 생성
		LinkedList<Integer> num3 = new LinkedList<Integer>();
		LinkedList<Integer> num4 = new LinkedList<Integer>();
		
		for(i = 4; i >= 0; i--) {
			num3.add(i);
			num4.add(i*2);
		}
		System.out.println("num3<LinkedList> : " + num3);
		System.out.println("num4<LinkedList> : " + num4);
		
		LinkedList<Integer> union1 = new LinkedList<Integer>(num3);
		LinkedList<Integer> intersection1 = new LinkedList<Integer>(num3);
		LinkedList<Integer> difference1 = new LinkedList<Integer>(num3);
		
		union1.addAll(num4);
		intersection1.retainAll(num4);
		difference1.removeAll(num4);
		
		System.out.println("합집합 : " + union1); // 중복된 값 출력
		System.out.println("교집합 : " + intersection1); // 
		System.out.println("차집합 : " + difference1);
		
		
		
	}

}
