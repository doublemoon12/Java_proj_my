package Chap17.EX03;

//

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMehotd_1 {

	public static void main(String[] args) {
		//List�� �޼ҵ� : 13���� �޼ҵ尡 �ִ�.
			//1. ArrayList
			//2. Vector
			//3. LinkedList
		
		List<Integer> linkedList1 = new LinkedList<Integer>();

		//1. add(E element)	: ������ ���� �߰�.
		linkedList1.add(3);linkedList1.add(4);linkedList1.add(5);
		System.out.println(linkedList1);
		System.out.println(linkedList1.size());
		
		//2. add(int index, E element)
		linkedList1.add(1, 6);
		System.out.println(linkedList1);	//���ȣ 1���� 6�� �߰�, ������ �ִ°� ����x
		
		System.out.println("========================");
		
		//3. addAll(�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer> linkedList2 = new LinkedList();
		linkedList2.add(1); linkedList2.add(2);
		
		linkedList2.addAll(linkedList1);
		System.out.println(linkedList2);
		
		System.out.println("=========================");
		
		//4. addAll(int index, �Ǵٸ� ��ü)
		List<Integer> linkedList3 = new LinkedList();
		linkedList3.add(1); linkedList3.add(2);
		
		linkedList3.addAll(1, linkedList3);	//�ڽ��� ���� �ٸ� ��ü�� �߰�
		
		System.out.println(linkedList3);
		
		//5. set(int index, E element) : Ư�� �� ��ȣ�� ���� ����
		linkedList3.set(1, 5); 	//1���� ��ȣ�� ���� 5�� ����
		linkedList3.set(3, 6);
		//linkedList3.set(4, 7);	//�����߻� IndexOutOfBoundsException
		System.out.println(linkedList3);
		
		//6. remove(int index)	: Ư�� ���ȣ�� ���� ����
		linkedList3.remove(1);	//�� ��ȣ�� ����ִ� ���� ����
		
		System.out.println(linkedList3);
		
		//7. remove(Object o)	: ������ ����
		linkedList3.remove(new Integer(2));	//������ ������ �� �� �ִ�.
		
		System.out.println(linkedList3);
		
		//8. clear()	: ��� ����
		linkedList3.clear();
		
		System.out.println(linkedList3);
		
		//9. isEmpty()	: ���� ��������� True, ������� ������ False
		System.out.println(linkedList3.isEmpty());
		
		//10. size()	: ���� ����, ���� ���� 
		System.out.println(linkedList3.size());
		
		linkedList3.add(1); linkedList3.add(2); linkedList3.add(3);
		
		System.out.println(linkedList3.size());
		
		System.out.println("=========================");
		
		//11. get(int index): ���ȣ�� ���� ���
		System.out.println(linkedList3.get(0));
		System.out.println(linkedList3.get(1));
		System.out.println(linkedList3.get(2));
		
		System.out.println("=========================");
		
		//12. toArray()		: List(����Ʈ) ===> Array(�迭)�� ��ȯ
		Object[] object = linkedList3.toArray();		//�⺻������ toArray�� ObjectŸ������ ������ �ȴ�.
												//�ٿ� ĳ������ �ʿ��ϴ�
		System.out.println(Arrays.toString(object));	//�迭�϶��� Array.toString()���
		
		System.out.println("=========================");
		
		//13-1 toArray(T[] t)	===> t[]���� ��ȯ : Integer�� �ٷ� ĳ���� 
		Integer[] integer1 = linkedList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
			//0�� �ǹ� : ����Ʈ�� ����� ������ ���� ��� ����Ʈ�� ����� ���� ������ �´�.
		
		//13-2 toArray(T[] t)	===> t[]���� ��ȯ : Integer�� �ٷ� ĳ���� 
		Integer[] integer2 = linkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
	}

}
