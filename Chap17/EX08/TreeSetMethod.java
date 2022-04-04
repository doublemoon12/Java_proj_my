package Chap17.EX08;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet	: ��½� ���ĵǾ ���. (�������� ����(ascending) : 1 --> 9, a --> z, �� --> ��)
			//��½� �˻��� �޼ҵ尡 ����.
			//������ ���� ������ Set�� ���ĵǾ �����, ��½ÿ� ������������ ���ĵǾ ����̵�.
			// Set <== SortedSet(���Ŀ� ���� �޼ҵ尡 ���ǵǾ��ִ�) <== NavifableSet (�˻� �޼ҵ� ����) <= TreeSet
			// TreeSet<String> treeSet = new Tree<String>(); Ÿ���� TreeSet���� �����ؾ� ����/�˻� ����� ���.
			// Set�������̽��� ��� �޼ҵ� ���.
			


public class TreeSetMethod {

	public static void main(String[] args) {
		//TreeSet�� Set�� ��� �޼ҵ� ���.
		//TreeSet�� ���� �־��� ��� �������� ���ĵǾ� ���� Set�� ����, ��½� �������� ���ķ� ���.
		TreeSet<Integer> treeSet = new TreeSet();	//Type�� TreeSet���� �����ؾ� ����(Sort)�� �˻��� ����� �� �ִ�.
		for(int i = 50; i > 0; i -= 2) {	//50, 48, 46, 44 .... 4, 2
			treeSet.add(i);		//���������� ������ ���� ������ ������������ ���ĵǾ� ���� ����.
		}
		System.out.println(treeSet);

		//TreeSet������ ��� ������ �޼ҵ�
		System.out.println("=========������ ��������=========");
		//1. first()	: ���� ó������ ����
		System.out.println(treeSet.first());
		//2. last()		: ���� ���������� ����
		System.out.println(treeSet.last());
		//3. lower(E element)	: element���� ���� ���� ���
		System.out.println(treeSet.lower(26));
		//4. higher(E element)	: element���� ū ���� ���
		System.out.println(treeSet.higher(26));
		//5. floor(E element)	: element���� ���� ���� ���
		System.out.println(treeSet.floor(25));
		System.out.println(treeSet.floor(26));
		//6. ceiling(E element)	: element�� �����ؼ� ū���� ���
		System.out.println(treeSet.ceiling(25));
		System.out.println(treeSet.ceiling(26));
		System.out.println("===========������ ������============");
		
		//7. pollFirse()	: ���� ���� ������
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		System.out.println();
		for(int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollFirst());
		}
		System.out.println();
		System.out.println(treeSet.size());		//0, treeSet�� ���� ����ִ� ����
		
		System.out.println();
		//8. PollLast()		: ���� �������� �������� 
		for(int i = 50; i > 0; i -= 2) {
			treeSet.add(i);		//������������ ���ĵǾ ����.
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		System.out.println(treeSet);
		
		for(int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollLast());
		}
		System.out.println(treeSet.size());
		
		System.out.println("==========����===========");
		
		//9. SortedSet<E> headSet(E element)	: ������ ����ϱ� ���ؼ� SortedSet<E> ��ü�� ����
			//SortedSet<E>	: ���ĵ� �����͸� �����ϴ� Set.
				//headSet(E element)	: element�� Head�������� ���� ����
		for(int i = 50; i > 0; i -= 2) {
			treeSet.add(i);		//������������ ���ĵǾ treeSet�� ����.
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20);
		//Set<Integer> sSet = treeSet.headSet(20);	//headSet(20)�� SortedSet���� ���ϰ��� ������
		System.out.println(sSet);
		
		//10. NavigableSet<E> headSet(E element, boolean inclusive)	: element�� ����(true), ������(false)�ؼ� head������ ���
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		//Set<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(nSet);
		
		//11. SortedSet<E> tailSet(E element)
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);	//���۰��� ������ �⺻, ������ �������� �⺻ <== <<��� ���� ������ ����>>
		//Set<Integer> sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		//12. NavigableSet<E> tailSet(E element, boolean inclusive)	: element�� ����(true), ������(false)�ؼ� tail������ ���
		NavigableSet nSet2 = treeSet.tailSet(20, true);
		//Set nSet2 = treeSet.tailSet(20, true);
		System.out.println(nSet2);
		System.out.println("=========================");
		//13. SortedSet<E> subSet(E element, E element); Ư�� ������ ���� set���� ������.
		SortedSet sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3);	//���۰��� ����, ������ ������. <== ��� ���α׷����� �⺻
		//14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, true, 20, true);
		System.out.println(nSet4);
		System.out.println("==========================");
		//15. NavigableSet<E> descendingSett()	: ���� ������ �������� �ݴ�� �����Ѵ�.	������ : descending<������������>
		System.out.println(treeSet);	//�������� ����
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		//Set<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		
		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);
		
		
		
	}

}
