package chap13.EX09;

//�Ű������� �޾Ƽ� ó�� : �������̽��� ������ Ŭ������ ���� ���

interface A{
		void abc();
}

class C{
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		
		C c = new C();
		//3. ���� ���̽��� ������ Ŭ���� x + ���� ����
		A a = new A() {		//�������̽��� ������ �ڽ� �͸� ��ü������ Ÿ���� A�� ������ ���� ���� ����
			@Override
			public void abc() {
				System.out.println("Ŭ����x + ��������");
			}
		};
		c.cde(a);
		
		System.out.println("======================================");
		
		//4. ���� ���̽��� ������ Ŭ���� x + ���� ���� x	<== ���� ���� ���(�ӽ÷� �ѹ��� ���)
			//�̺�Ʈ ó�� ���
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("Ŭ����x + ��������x");
			}
		});
	}

}
