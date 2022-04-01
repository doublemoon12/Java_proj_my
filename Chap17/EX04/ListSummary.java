package Chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {

	public static void main(String[] args) {
		//1. ArrayList
		List<String> arrayList = new ArrayList();	
		arrayList.add("다");
		arrayList.add("마");
		arrayList.add("나");
		arrayList.add("가");
		System.out.println(arrayList);
		
		//2. Vector
		List<String> vectorList = new Vector();	
		vectorList.add("다");
		vectorList.add("마");
		vectorList.add("나");
		vectorList.add("가");
		System.out.println(vectorList);
		
		//3. LinkedListk
		List<String> linkedList = new LinkedList();	
		linkedList.add("다");
		linkedList.add("마");
		linkedList.add("나");
		linkedList.add("가");
		System.out.println(linkedList);
	}

}
