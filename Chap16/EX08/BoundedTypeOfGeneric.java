package Chap16.EX08;

class A {}
class B extends A {}
class C extends B {}

//���ʸ� Ÿ�� Ŭ���� : ���ʸ� Ÿ���� ������ ��ü�� ������ ��.
class D <T extends B>{	//T : classB�� classC�� �� �� �ִ�.
						//<T extends B> �ǹ� : T Ÿ�Կ� ������ ����
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class BoundedTypeOfGeneric {

	public static void main(String[] args) {

		//D<A> d1 = new D<A>();	//�Ұ��� : <T>�� �� ��ü�� ������ �� B, C Ŭ������ Ÿ�� ���� ����
		D<B> d2 = new D<B>();	//B, C�� Ÿ������ ���� ����
		D<C> d3 = new D<C>();	//C�� Ÿ�Ը� ���� ����
		
		D d4 = new D();			// = D(B), D(C) �� �� �ִ�. Ÿ���� �������� �ʰ� ��ü�� ����� �ֻ��� Ÿ������ ������
								// = D<B> d2 = new D<B>();
		
		d2.setT(new B());		//B ��ü ����.
		d2.setT(new C()); 		//C ��ü ����.
		//d2.setT(new A());		//����
		
		//d3�� CŸ�� ��ü�� �ü� �ִ�.
		//d3.setT(new B());	//���� �߻�
		d3.setT(new C());
		
		//d4.setT(new A());	//���� �߻�
		d4.setT(new B());
		d4.setT(new C());
		
		
	}

}
