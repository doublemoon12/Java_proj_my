package Chap16.EX01;

//Generic�� ������� �ʾ������� ������.	- ��ǰ�� ������ Ŭ������ �Ź� ��������� �Ѵ�. 
//��ü�� ���� Ŭ������ ���� ���, �Ź� ��ü�� ���� �Ҷ����� �� ��ü�� ���� Ŭ������ ����� ��� �Ѵ�.
//��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� ���ִ�. <=== ���ο� ��ǰ�� �߰� �ɶ� ���� �� ��ǰ�� ���� Ŭ������ ������ ����Ѵ�.
//�ڵ尡 ������ ����������.

class Apple{
	String name;
	int price;
	
	Apple(String name, int price){		//������
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		//��ü ��ü�� ��� �Ҷ� ��ü�� �ּҰ� �ƴ� �ʵ��� ������ ���.
		return "�̸� : " + name + " , ���� : " + price;
	}
}

//1. Apple�� ���� �� �ִ� Ŭ���� ����.
class Goods1{	//��ǰ�� ����� ���� Ŭ����
	private Apple apple = new Apple("���", 1000);

	public Apple getApple() {	//��ü �ʵ��� ������ ����Ѵ�
		return apple;
	}

	public void setApple(Apple apple) {	
		this.apple = apple;
	}	
}

class Pencil{
	String name;
	int price;
	Pencil(String name, int price){	//�����ڸ� ���ؼ� �ʵ��� �� �Ҵ�.
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		//��ü ��ü�� ��� �Ҷ� ��ü�� �ּҰ� �ƴ� �ʵ��� ������ ���.
		return "�̸� : " + name + " , ���� : " + price;
	}
}

//2. Pencil�� ���� �� �ִ� Ŭ���� ����
class Goods2{
	private Pencil pencil = new Pencil("����", 2000);

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//1. Goods1 ��ǰ�� ����Ǿ� �ִ�. Apple��ü �߰� �� ��������
		Goods1 goods1 = new Goods1();	//�⺻ ������
		goods1.setApple(new Apple("���2", 2000));	//setter�� ���� �Ҵ�
		System.out.println(goods1.getApple());						//gerrer�� �ʵ��� ������ ���
		
		//2. Goods2 ��ǰ�� ����Ǿ� �ִ�. pencil��ü �߰��� ��������
		Goods2 goods2 = new Goods2();	//�⺻ ������
		goods2.setPencil(new Pencil("����2", 3000));	//setter�� ���� �Ҵ�
		System.out.println(goods2.getPencil());
		
		
		
		
		
	}

}
