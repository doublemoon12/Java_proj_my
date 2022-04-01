package Chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// java.lang ��Ű���� Ŭ�������� import�� �ʿ� ����.
// �׿��� Ŭ�������� import�� �ʿ��ϴ�.

/*
 * �÷��� 	: ������ �ڷ����� ����. ���� ũ�Ⱑ �������� ��ȭ. 
 * �迭		: ������ �ڷ����� ����. ���� ũ�Ⱑ ���� �Ǿ��ִ�. �迭 ������ ���� ũ�⸦ ����, ���� ũ��� ���� �Ұ�.
 * 
 * List<E> 	: �������̽�, ���ʸ� �������̽� : �پ��� ������ Ÿ���� ��� ����
 * 			: �ε���(���ȣ)�� ������ �ִ�. ���� ũ��� �������� ���Ѵ�.
 * 		- 
 * 		- ArrayList<E>	: �̱� ������ ȯ�濡�� ���. �˻��� ������ ���� �߰��ϰų� �����Ҷ��� ������.
 * 		- Vector<E>		: ��Ƽ ������ ȯ�濡�� ���. ��� �޼ҵ尡 ����ȭ �Ǿ��ִ�.
 * 		- LinkedList<E>	: �˻��� ������ ���� �߰��ϰų� �����Ҷ� ������.
 */
 

public class ArrayList_1 {

	public static void main(String[] args) {
		//1. �迭
		String[] array = new String[] {"��", "��", "��", "��", "��", "��", "��"};	//���� ũ�⸦ �����ϸ� �ȵȴ�.
		System.out.println(array.length);
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);
		
		//1) Array.toString(�迭����)
		System.out.println(Arrays.toString(array));	
		
		//2) for���� ����ؼ� ���
		for(int i = 0; i < array.length; i++) {
			if(i == array.length -1) {	//������ �� ��ȣ������ , �� ������� ����.
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ", ");
			}
		}
		//3) Enhanced for���� ����� ���
		for(String k : array) {
			System.out.print(k + ", ");	
		}
		
		System.out.println();
		System.out.println("=============================");
		
		//2. List : �������̽�, ��ü������ �� �� ����, Ÿ���� ��������
		List<String> aList1 = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
		
		//List���� ���� ���� ��� : aList.size();	<=== List
		System.out.println(aList1.size());	//���� ũ��� : 0
		
		//List�� �� �Ҵ� �ϱ� : aList.add(��)
		aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");
		//List�� ����� �������� ���� ���ϱ� : aList.size();
		System.out.println(aList1.size());
		System.out.println();
		
		//List�� ����� ���� ���� : aList.remove("������ ����")
		aList1.remove("��");
		aList1.remove("��");
		System.out.println(aList1.size());
		
		
		//List�� index�� ������ �ִ�.(for������ ó��)
		for(int i = 0; i < aList1.size(); i++) {	//aList.size() : ���� ���� ���
			if(i == aList1.size() -1) {	//������ �� ��ȣ������ , �� ������� ����.
				System.out.println(aList1.get(i));
			}else {
				System.out.print(aList1.get(i) + ", ");
			}
		}
		//Enhanced for���� ����Ͽ� ���
		for(String k : aList1) {
			System.out.print(k + ", ");
		}
		
		System.out.println();
		
		//��ü�� toString()�� ȣ���ؼ� ���
		System.out.println(aList1);		//List�� toString�޼ҵ尡 ������ �Ǿ��ִ�.
		
	}

}
