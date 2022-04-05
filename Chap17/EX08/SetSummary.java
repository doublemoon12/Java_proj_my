package Chap17.EX08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set	: 중복되지 않는 값을 저장 (equals(), hashCode() 메소드를 재정의), Wrapper 클래스는 모두 재정의 
	//1. HashSet		: 출력 되는 것이 랜덤하게 출력
	//2. LinkedHashSet	: 입력되는 대로 출력
	//3. TreeSet		: 입력값을 넣으면 내부적으로 정렬

public class SetSummary {

	public static void main(String[] args) {
		//1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		
		System.out.println(hashSet);
		
		//2. LinkedHashSet
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add("다");
		linkedhashSet.add("마");
		linkedhashSet.add("나");
		linkedhashSet.add("가");
		
		System.out.println(hashSet);
		
		//3. TreeSet	<== 정렬 하기위해 Comparable<E>, Comparator<E>
		Set<String> TreeSet = new TreeSet<String>();
		TreeSet.add("다");
		TreeSet.add("마");
		TreeSet.add("나");
		TreeSet.add("가");
		
		System.out.println(TreeSet);
		
		
		
		
	}

}
