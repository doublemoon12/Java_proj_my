package Chap17.EX07;

//LinkedHashSet		: ���� ������ �� �� ���� ��ġ������ �� �� ���� ��ġ������ ������.
	//HashSet���� ������	: ��� �޼ҵ尡 �����ϴ�. �ߺ��� ���� �������� �ʴ´�. index���� ������ �ʴ´�.
						//�⺻ for������ ����� �� ����. iterator, Enhanced for���� ����� ����Ѵ�.
	//HasgSet���� �ٸ���	: HashSet�� ��½� �Է��� ��� ��µ��� �ʴ´�. LinkedHashSet�� �Է´�� ����� �ȴ�. 
	
//����Ű ���� Ȯ�� ctrl + shift + L
import java.util.Arrays;
//Set	: �������̽�, ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	//- HashSet			: �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�.
	//- LinkedHashSet	: �ߺ��� ���� ���� �� ����. ��½� ������� ���.
	//- TreeSet			: ����ɶ� ���� ������ �Ǿ ����. ascending(�������� ���ĵǾ� �����)0 - > 9, a - > z, �� -> ��
							//���� : descending(�������� ����) : 9 -> 0, z -> a, �� -> ��
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {

	public static void main(String[] args) {
		
		Set<String> linkedSet1 = new LinkedHashSet();	//Set�� Interface�̹Ƿ� Ÿ�����θ� ���� 
			//Set�� ���ʸ� Ÿ�� ������ WrapperŬ������ ����� ���, equals(),hashCode()�� ������ �Ǿ��ִ�, toString()�� ������ �Ǿ��ִ�.
		//1. add(E element) : Set�� ���� �߰�, 
		linkedSet1.add("��"); linkedSet1.add("��"); linkedSet1.add("��");
		System.out.println(linkedSet1);
		System.out.println(linkedSet1.toString()); 	//toString�޼ҵ尡 ������ �Ǿ��ִ�.
	
		System.out.println("============================");
		
		//2. addAll(�ٸ� set ��ü)	: �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰��ϸ� �ߺ��� ���� ������
		Set<String> linkedSet2 = new LinkedHashSet();
		linkedSet2.add("��");	linkedSet2.add("��");
		linkedSet2.addAll(linkedSet1);
		System.out.println(linkedSet2);
		
		//3. remove(Object o) : ������ ����, (List�� ��� �� ��ȣ�� ����)
		linkedSet2.remove("��");
		System.out.println(linkedSet2);
		
		//4. clear() : ��� ����
		linkedSet2.clear();
		System.out.println(linkedSet2);
		
		System.out.println("============================");
		
		//5. isEmpty() : ��������� true, ������� ������ false
		System.out.println(linkedSet2.isEmpty());
		
		//6. contains(Object o) : ���� Set�� �����ϸ� true, �������� ������ false
		Set<String> linkedSet3 = new LinkedHashSet<>();
		linkedSet3.add("��");linkedSet3.add("��");linkedSet3.add("��");
		System.out.println(linkedSet3);
		System.out.println(linkedSet3.contains("��"));
		
		System.out.println("============================");
		
		//7. size() : Set�� ���Ե� ���� ����
		System.out.println(linkedSet3.size());
		
		//8. iterator()	: Set�� index�� ������ �ʴ´� for���� ���ȣ�� ���� ���, enhanced for���� ��밡��
			//��ȸ��, Set�� ������ ��ȸ �ϸ鼭 ���
			//hasNext()	: Set�� ���� �����ϸ� true, �������� ������ false
			//next()		: ���� ���� ����ϰ� ���������� �̵�
		Iterator<String> iterator = linkedSet3.iterator();
			//Ŭ����<E> ���� ��ü = Set��ü.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("===============================");
		
		for(String k : linkedSet3) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		//9. toArray() : Set�� ������ �迭�� ������. ObjectŸ������ ����, �ٿ�ĳ������ �ʿ���.
		Object[] objArray = linkedSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		for(int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i]);
		}
		System.out.println();
		
		for(Object k : objArray) {	//�ٿ� ĳ������ �ʿ��ϴ�.
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=============================");
		
		//10. toArray(T[] t) : �ٷ� �ٿ� ĳ������ �� �� ���
		String[] strArray1 = linkedSet3.toArray(new String[0]);	//0 : ���� ũ�� ����
															//���� ũ�Ⱑ ���� ������ ���� ��� �����Ϸ��� ���� ũ�⸸ŭ ����
		System.out.println(Arrays.toString(strArray1));
		
		//11. ���� Set�� ������ ���� ��ũ�⸦ ũ�� ���� ���� Null���� ��� �� �� �ִ�.
		String[] strArray2 = linkedSet3.toArray(new String[5]);
		
		System.out.println(Arrays.toString(strArray2));
		
		System.out.println("=========================");
		
		Set<Integer> intSet1 = new LinkedHashSet();
		
		intSet1.add(30); intSet1.add(50); intSet1.add(100); intSet1.add(10); 
		
		Iterator<Integer> inte = intSet1.iterator();
		
		//iterator���, Enhanced for���� ����ؼ� ���
		while(inte.hasNext()) {
			System.out.print(inte.next() + " ");
		}
		System.out.println();
		
		for(Integer k : intSet1) {
			System.out.print(k + " ");
		}
		
		
		
		
		
		
		
		
	}

}
