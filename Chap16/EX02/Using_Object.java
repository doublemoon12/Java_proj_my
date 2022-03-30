package Chap16.EX02;

//Object�� ��� ��ü�� ���� �� �� �ִ�.
//��ǰ�� �����ϴ� Ŭ���� �� ObjectŸ������ �����ϸ� ��� ��ü�� ���� �� �ִ�.
//Object�� ���� 	: ��� ��ü�� ���� �� �ִ�.(casting)
		//����	: �Ź� �ٿ� ĳ������ ����� �Ѵ�.
		//���� Ÿ�� üũ : ����� ClassCastException�� �߻��� �� �ִ�.

class Apple{
	String name;
	int price;
	
	Apple(String name, int price){		//������
		this.name = name;
		this.price = price;
	}
	public void abc() {
		System.out.println("abc()�޼ҵ� ���");
	}
	@Override
	public String toString() {		//��ü ��ü�� ��� �Ҷ� ��ü�� �ּҰ� �ƴ� �ʵ��� ������ ���.
		return "�̸� : " + name + " , ���� : " + price;
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


class Goods{	//Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.
	private Object object = new Object();	//��� Ŭ������ ObjectŸ������ ��ȯ�� ����	

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {	//ObjectŸ������ ��ĳ���õ�.
		this.object = object;
	}
	
}

public class Using_Object {

	public static void main(String[] args) {
		
		//1. Apple�� ������ ���. Object 
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("���3", 4000));	//setter�� ���Ҵ�
		System.out.println((Apple)goods1.getObject());		//getter�� ��ü�� ��� : ObjectŸ���� ��ü�� �������� ������ Apple�� �ٿ�ĳ������ ����� �Ѵ�.
		((Apple)goods1.getObject()).abc();	//Object ==> Apple�� �ٿ� ĳ������ abc() ȣ��
		
		//1. Pencil�� ������ ���. Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("����3", 5000));	//setter�� ���Ҵ�
		System.out.println((Pencil)goods2.getObject());		//getter�� ��ü�� ��� : ObjectŸ���� ��ü�� �������� ������ Apple�� �ٿ�ĳ������ ����� �Ѵ�.
		
		//3. �߸��� ĳ�������� �� �ִ�.(���� Ÿ�� üũ) : Object�� ������
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���4", 6000));
		System.out.println((Pencil)goods3.getObject());		//���� Ÿ�� üũ : ����� ���� �߻�
		
		
	}

}
