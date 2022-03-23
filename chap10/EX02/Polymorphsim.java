package chap10.EX02;

//������(Polymorphsim) : ��ü�� ��Ӱ��迡�� ���� ������ Ÿ������ ��ȯ ����

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphsim {

	public static void main(String[] args) {
		//1. ��ĳ����(�ڵ����� ��ȯ) : ������ �����Ϸ��� �ڵ����� �߰�;
		A ac = (A) new C();		//C�� A�� ��ȯ�� �ȴ�. ,ac�� D�� ������ ��� Ŭ������ �ʵ�� �޼ҵ带 �����ϰ� ������ AŸ���� �ʵ�� �޼ҵ常 ���ٰ���
		A ab = new B();			//��ĳ���� �Ҷ��� �θ�Ÿ���� �����ص� ��� ����, ab�� A, BŬ������ �ʵ�� �޼ҵ常 ����, A�� �ʵ�� �޼ҵ忡�� ���� ����
		B bd = new D();			//D�� B�� ��ĳ���� �ȴ�, bd�� A,B,D�� �ʵ�� �޼ҵ尡 ���Եǰ�, A,B�� �ʵ�� �޼ҵ带 ��밡���ϴ�
		C c = new C();			//C�� C��. C�� ��Ӱ��迡 ���ؼ� A,B,C�� �ʵ�� �޼ҵ尡 ���� �Ǿ� �ְ�, A,B,C��� ���� �����ϴ�
		
		//��ü ������ �Ҽ� ���� ���(���)
		//B b = new A();	//����
		//C cc1 = new B();
		//D dd1 = new B();
		//C cd = new D();
		
		//2. �ٿ� ĳ���� : �θ� ==> �ڽ� (������ȯ) : ĳ������ �Ұ��� �ϸ� (����� ��Ÿ�� ���� �߻�)
		A aa = new A();			//aa�� AŸ�Ը� ����
		//B b1 = (B) aa;		//A�� B�� �ٿ� ĳ����(���� ��ȯ) <== ����� ���� �߻�
				//java.lang.ClassCastException: �ٿ� ĳ���ý� ��ü ���� �ش� Ÿ���� �������� �ʴ°��
		//C c = (C) aa;	//aa�� C Ÿ���� ���������� �ʴµ� �ٿ� ĳ������ �Ұ�� (����� ����)
		
		//������ ���� : ���α׷� ������ ��Ŭ������ üũ
		//��Ÿ�� ���� : ����� �߻��Ǵ� ����
		
		//3. �ٿ� ĳ������ ������ ���(������ȯ) : ��ü ���ο� �ڽ� ������ Ÿ���� ������ ������ ĳ���� ����
		A ac3 = new C();	//ac3�� A, B, C ����. A�� ��� ����
		
		B ac5 = (B) ac3;	//A -> B Ÿ������ �ٿ� ĳ����
		C ac6 = (C) ac3;	//A -> C
		
		A ad2 = new D();	//ad�� A, B, D���� , A�� ��밡��
		B bd3 = (B) ad2;
		D dd4 = (D) ad2;
		
		
		
		
		
	}

}