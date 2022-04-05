package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

//�̸��� ���̸� �Է������� �̸����� ������������ ��� �ϵ��� ����. TreeSet�� name �÷���
//1. Comparable<E>�� compare()�޼ҵ� ������
	//������ ��ü������ �ʿ�
//2. Comparator<E>�� compare()����
	//������ ��ü�� �������� ����
class Abc{
	String name;	//<<�����÷�, �������� ����>> ȫ�浿, �̼���, ������
	int age;
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age;
	}
}

class Abc_T implements Comparable<Abc_T>{
	String name;	//<<�����÷�, �������� ����>> ȫ�浿, �̼���, ������
	int age;
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age;
	}
	@Override
	public int compareTo(Abc_T o) {
		return age;
	}
	
}

public class EX_TreeSetMethod_3 {

	public static void main(String[] args) {

		TreeSet<Abc_T> abc_T = new TreeSet();
		Abc_T a3 = new Abc_T("ȫ�浿", 20);
		Abc_T a1 = new Abc_T("������", 30);
		Abc_T a2 = new Abc_T("�̼���", 40);
		
		
		abc_T.add(a1);
		abc_T.add(a2);
		abc_T.add(a3);
		
		System.out.println(abc_T);
		
		TreeSet<Abc> abc = new TreeSet<Abc>(new Comparator<Abc>() {

			@Override
			public int compare(Abc o1, Abc o2) {
					return 1;
				}
		});
		Abc a4 = new Abc("ȫ�浿", 20);
		Abc a5 = new Abc("������", 30);
		Abc a6 = new Abc("�̼���", 40);
		
		
		abc.add(a4);
		abc.add(a5);
		abc.add(a6);
		
		System.out.println(abc);
	}

}

