package Chap16.EX09;

//���ʸ� �޼ҵ��� ���� ����

class A{	//�Ϲ� Ŭ�������� ���ʸ� �޼ҵ�
	
	//Number : Boolean, Charator�� ������ 6���� Ÿ��(Byte, Short, Integer, Long, Float, Double) 
	public<T extends Number> void method1(T t) {
		System.out.println(t.intValue());	//Number Ÿ���� �޼ҵ� .t.intValue(), ������ ���
	}
}

interface MyInterface{
	void print();	//public abstract ����
}

class C implements MyInterface{		//�������̽��� ������ Ŭ����
	
	public void print() {
		System.out.println("�������̽��� ������ Ŭ���� - ���");
	}
}

class B {	//���ʸ� Ÿ�� ���ο��� �������̽��� ������ ���� extendsŰ�� ����Ѵ�.
	
	public<T extends MyInterface> void method2(T t) {	//T�� �ü��ִ� Ÿ���� MyInterface�� ������ Ŭ������ �� �� �ִ�. 
		t.print();
	}
}

class D{
	public <T extends String> void abc(T t){
		System.out.println(t); 		//String�� toString�޼ҵ尡 ������ �Ǿ��ִ�.
		System.out.println(t.toString());
	}
}

public class BoudedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();	//�Ϲ� Ŭ���� ��ü ���� �� ���ʸ� �޼ҵ� ȣ��
		a.<Double>method1(5.8);
		a.method1(22.5);		//�Ű� ������ ������ ���� Ÿ���� �ĺ� �� �� �ִ� ��� ���� ����
		a.<Long>method1(1000L);	
		a.<Float>method1(100.55555F);
		//a.<Boolean>method1(true);	//Charter�� Boolean�� �����߻�
		
		//method2�� �Ű������� �� �� �ִ� ���� �������̽� Ÿ��, �������̽��� ������ �ڽ� Ŭ����
		//�������̽��� ������ ���� �͸� Ŭ����,
		B b = new B();		
		b.<MyInterface>method2(new MyInterface() {
			public void print() {
				System.out.println("print() �͸� Ŭ������ ���");
			}
		}
				);			
		b.<MyInterface> method2(new C());	//�Ű������� �������̽��� ������ �ڽ� ��ü
		
		//�͸� Ŭ������ ���ʸ� �޼ҵ� ȣ���� �Ű������� �����ֱ�
		
		b.method2(new MyInterface() {
			@Override
			public void print() {
				System.out.println("�͸����� ó���� Ŭ���� ���");
			}
		}); 	
		
		D d = new D();
		d.<String> abc("�ȳ�");
		d.abc("�ϼ���");
		
		
	}

}
