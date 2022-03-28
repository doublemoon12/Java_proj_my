package chap13.EX09.EX01;

interface A{
	void cry();
	void fly();
}

class C{
	void abc(A a) {
		a.cry();
		a.fly();
	}
}


public class AnonymousClass_4_1 {

	public static void main(String[] args) {
		//1. Ŭ����x + ��������
		C c = new C();
		A a = new A() {

			@Override
			public void cry() {
				System.out.println("�������� �۸�");
			}

			@Override
			public void fly() {
				System.out.println("�������� ������ ���մϴ�.");
			}
			
		};
		c.abc(a);
		
		System.out.println("=====================");
		
		//2. Ŭ����x + ��������x
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("����̴� �߿�");
			}
			@Override
			public void fly() {
				System.out.println("����̵� ���� ���մϴ�.");
			}
		});
		
		
		
	}

}
