package Chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {

	public static void main(String[] args) {
		//1. ArrayList
		List<String> arrayList = new ArrayList();	
		arrayList.add("��");
		arrayList.add("��");
		arrayList.add("��");
		arrayList.add("��");
		System.out.println(arrayList);
		
		//2. Vector
		List<String> vectorList = new Vector();	
		vectorList.add("��");
		vectorList.add("��");
		vectorList.add("��");
		vectorList.add("��");
		System.out.println(vectorList);
		
		//3. LinkedListk
		List<String> linkedList = new LinkedList();	
		linkedList.add("��");
		linkedList.add("��");
		linkedList.add("��");
		linkedList.add("��");
		System.out.println(linkedList);
	}

}
