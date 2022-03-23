package chap13.EX02;

/*�̳�Ŭ�������� �ܺ� Ŭ������ �ʵ�� �޼ҵ� ���� ���
*�������̵�		:1. �θ�� �ڽ��� ��Ӱ��谡 �־�� �Ѵ�.
*			:2. <<�ν��Ͻ� �޼ҵ常 �������̵� ����>>
*			:3. �ν��Ͻ� �ʵ�, static �ʵ�, static �޼ҵ�� �������̵� ���� �ʴ´�.
*/


class A{
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	
	void abc() {	//�������̵��� �ƴϰ� �ܺ� ���� Ŭ������ ������ �޼ҵ�� ������ ������ ��ġ���ִ�.
		System.out.println("A Ŭ������ abc()�Դϴ�.");
	}
	
	class B{	//�̳�Ŭ�������� �ܺ� Ŭ������ �ߺ��� �ʵ峪 �޼ҵ� ȣ���� ��� : A.this
		int a = 5;
		int b = 6;
		
		void abc() {	//�������̵��� �ƴ϶� ������ �޼ҵ� �Դϴ�.
			System.out.println("B Ŭ������ abc()�Դϴ�.");
		}
		
		void bcd() {
			//1. �ڱ��ڽ�(InnerŬ����)�� �ʵ�� �޼ҵ� ȣ��
			System.out.println(a);
			System.out.println(b);
			abc();
			//2. OuterŬ������ �ʵ�� �޼ҵ� ȣ��
			System.out.println(A.this.a);	//��Ӱ��谡 �ƴϱ⶧���� super�� ����ϸ� �ȵȴ�.
			System.out.println(A.this.b);
			A.this.abc();
			//3. OuterŬ������ ����� �޼ҵ� ȣ��
			System.out.println(c);
			System.out.println(d);
		}
	}
	
}



public class InnerClass_2 {

	public static void main(String[] args) {
		//1. �ܺ�Ŭ���� ��ü ����
		A a = new A();
		//2. �̳�Ŭ���� ��ü ����
		A.B b = a.new B();
		b.bcd();
		
		System.out.println("=======================");
		
		//3. ���� Ŭ������ �ʵ�� �޼ҵ� ȣ��
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
		
	}

}
