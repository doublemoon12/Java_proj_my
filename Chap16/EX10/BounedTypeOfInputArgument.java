package Chap16.EX10;

//���ʸ� �޼ҵ忡�� �Ű��������� ���� ����

class A {}
class B	extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{		//���ʸ� Ŭ����
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

class Test{		//�Ϲ� �޼ҵ��, �Ű������� ������ Ÿ���� ���ʸ� Ÿ���̴�.
	void method1 (Goods<A> g) {}	//g�� �Ű������� AŬ������ ��ü�� ���� �� �ִ�.
	void method2 (Goods<?> g) {}	//g�� �Ű������� A,B,C,DŬ������ ��ü ��� ���� �� �ִ�.
	void mehtod3 (Goods<? extends B> g) {}	//g�� �Ű������� B,C,DŬ������ ��ü�� ���� �� �ִ�.
	void mehtod4 (Goods<? super B> g) {}	//g�� �Ű������� B,AŬ������ ��ü�� ���� �� �ִ�.
}

public class BounedTypeOfInputArgument {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		//1. method1
		t.method1(new Goods<A>());	//���� �۵�
		//t.method1(new Goods<B>());	//����
		//t.method1(new Goods<C>());	//����
		//t.method1(new Goods<D>());	//����
		
		//2. method2
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//3. method3	
		//t.mehtod3(new Goods<A>());	//����
		t.mehtod3(new Goods<B>());
		t.mehtod3(new Goods<C>());
		t.mehtod3(new Goods<D>());
		
		//4. method4
		t.mehtod4(new Goods<A>());
		t.mehtod4(new Goods<B>());
		//t.mehtod4(new Goods<C>());	//����
		//t.mehtod4(new Goods<D>());	//����
		
		
	}

}