package chap13.EX06.EX01;
//1. �������̽��� �߻�޼ҵ带 ������ ��ü�� ������ ȣ�� : ����ϰ� ����ψd ���
interface A{	//�������̽�, �߻� ���ҵ带 ����
	public abstract void cry();		//�߻�޼ҵ��̰�, public abstract����
	void fly();
}

class B{
	
	A a = new C();
	void abc() {
		a.cry();
		a.fly();
	}
	
	class C implements A{	//class C�� A �������̽��� ������ Ŭ����

		@Override
		public void cry() {
			System.out.println("�۸�");
		}

		@Override
		public void fly() {
			System.out.println("���� ���մϴ�.");
		}
		
	}
}


public class AnonymousClass_1_1 {

	public static void main(String[] args) {

		B b = new B();
		b.abc();
		
		
	}

}
