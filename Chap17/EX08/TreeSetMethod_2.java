package Chap17.EX08;

import java.util.TreeSet;

//TreeSet�� ���� : 1. �ߺ����� ���� �ʴ´�. 2. �������� ���ĵǾ �Է��� �ȴ�. 3. ���ĵǾ� ���(��������), 4. �˻������ ���, 5. Ư�������� ���� ����, 6. asc(�������� ����), desc(�������� ����)
				//
//TreeSet�� �Ϲ� ��ü�� ������ ���, Ư�� �ʵ带 ũ����ϴ� �����ʵ尡 �����ؾ��Ѵ�.
	//1. Comparable<E> �������̽��� compareTo() : TreeSet�� �Ϲ� ��ü�� �����Ҷ� �Ϲݰ�ü�� Ư�� �ʵ带 �������ؾ� �Ѵ�.
	//2. Comparable<E> �������̽��� compare()�� ������ ��.
	//3. �͸� ���ΰ�ü�� ����ؼ� ó���ϴ� ���.

class MyClass{
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}
//Comparable<E> �������̽��� ������ Ŭ���� ����
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public int compareTo(MyComparableClass o) {	//��ü�� ũ��� ������ �����ϴ� �޼ҵ�, <<TreeSet���� ���>>	(����, 0, ���)
										//�������� ó�� ���
		if(this.data1 < o.data1) {			//this.data1 ���ذ��� ������� : -1
			return -1;
		}else if(this.data1 == o.data1) {	//this.data1 ���ذ��� ������� : 0
			return 0;
		}else {								//this.data1 ���ذ��� Ŭ��� : 1
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return data1 + ", " + data2;
	}
}


public class TreeSetMethod_2 {

	public static void main(String[] args) {

		//Wrapper Ŭ������ comparable<E> �������̽��� compareTo()�� ������ �ϰ� �ִ�.
			//WrapperŬ������ ���� TreeSet�� ������ ���ĵǾ� ����.
		
		//1. Integer wrapperŬ������ ũ�� ��
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);	//ū��
		//Integer intValue1 = 3;
		Integer intValue2 = new Integer(10);	//������
		
		treeSet1.add(intValue1);	
		treeSet1.add(intValue2);	
		
		System.out.println(treeSet1);	//�������� ���� ���
		
		//2. String wrapperŬ������ ũ�� ��.
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("����");		//������
		//String str1 = "����";
		String str2 = new String("�ٶ�");		//ū��
		
		treeSet2.add(str1);		//treeSet2.add()�� ����ؼ� ��ü�� ������ ��� ���� ũ�⸦ ���ϴ� �ʵ尡 ���ǰ� �Ǿ��־�� �Ѵ�.
		treeSet2.add(str2);		//Comparable<E> �������̽��� compareTo()�� ������ �Ǿ�� �Ѵ�.
		System.out.println(treeSet2);
		
		//3. MyClass�� TreeSet�� ������ �ɱ�?(������� ���Ѵ�)Comparable<E> �������̽��� compareTo()�� ������ �Ǿ�� �Ѵ�.
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass myClass1 = new MyClass(2, 5);
//		MyClass myClass2 = new MyClass(3, 3);
//		
//		treeSet3.add(myClass1);
//		treeSet3.add(myClass2);
//		
//		System.out.println(treeSet3);
		
		//4. MyCompareableClass ��ü ũ�� ��.
		TreeSet<MyComparableClass> treeSet4 = new TreeSet();
		MyComparableClass m1 = new MyComparableClass(2, 5);
		MyComparableClass m2 = new MyComparableClass(5, 3);
		MyComparableClass m3 = new MyComparableClass(4, 3);
		
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		treeSet4.add(m3);
		System.out.println(treeSet4);
		
		
		
		
		
	}

}
