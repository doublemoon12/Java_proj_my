package Chap16.EX12;

//���ʸ� �޼ҵ��� ��� : �Ϲ� Ŭ���� ���� ���ʸ� �޼ҵ�

class Parent{	//�Ϲ�Ŭ����
	
	//Number : Boolean, Charactor�� ������ Wrapper(�⺻ ������ Ÿ���� ��ü������ ��ȯ)Ÿ���� Ŭ������ �� �� �ִ�.
	<T extends Number> void print(T t) {	//���ʸ� �޼ҵ�
		System.out.println(t);
	}
}

class Child extends Parent{	//���ʸ� �޼ҵ� ����� �Ϲ� ��Ӱ� ����.
	
}

public class InheritanceGenericMethod {

	public static void main(String[] args) {
		//1. �θ�Ŭ������ ���ʸ� �޼ҵ� ���
		Parent p = new Parent();
		p.<Integer>print(100);
		p.<Double>print(100.11);
		//p.<String>print("�ȳ�");	//���� Number�� �� �� �ִ�.
		p.print(300); 				//�Ű������� ���� ���� Ÿ���� �� �� �ִ°�� ��������
		p.print(300.333);
		
		//2. �ڽ�Ŭ�������� ���ʸ� �޼ҵ� ���
		Child c = new Child();
		c.<Integer>print(200);
		c.<Double>print(200.222);
		
		
		
	}

}