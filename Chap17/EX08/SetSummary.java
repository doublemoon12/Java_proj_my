package Chap17.EX08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set	: �ߺ����� �ʴ� ���� ���� (equals(), hashCode() �޼ҵ带 ������), Wrapper Ŭ������ ��� ������ 
	//1. HashSet		: ��� �Ǵ� ���� �����ϰ� ���
	//2. LinkedHashSet	: �ԷµǴ� ��� ���
	//3. TreeSet		: �Է°��� ������ ���������� ����

public class SetSummary {

	public static void main(String[] args) {
		//1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		
		System.out.println(hashSet);
		
		//2. LinkedHashSet
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		linkedhashSet.add("��");
		
		System.out.println(hashSet);
		
		//3. TreeSet	<== ���� �ϱ����� Comparable<E>, Comparator<E>
		Set<String> TreeSet = new TreeSet<String>();
		TreeSet.add("��");
		TreeSet.add("��");
		TreeSet.add("��");
		TreeSet.add("��");
		
		System.out.println(TreeSet);
		
		
		
		
	}

}
