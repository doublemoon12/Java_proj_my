package chap13.EX10;

//�̳��������̽� (InnerInterface)	: Ŭ���� ������ �������̽��� ����, �ܺ�Ŭ���� �����ϰ� ����� ��������
	//Ŭ���� ���ο� ����.
	//static�� �ڵ����� �����Ϸ��� ���ؼ� ����.	<== ����

class A{
	interface B{	//static�� �����Ϸ��� ���ؼ� �ڵ����� �߰�	//Ŭ����A������ ��� �� ���̱� ������ ���ο� ����
		void bcd();		//�������̽� �̱� ������ public abstract����
	}
}

//�̳� �������̽��� ������ Ŭ���� C
class C implements A.B{		//A.B 	: AŬ������ �̳��������̽�B�� ����, A,B : A�������̽�, B�������̽��� ����
	@Override
	public void bcd() {
		System.out.println("�̳��������̽��� ������ Ŭ����C");
	}
}


public class InnerInterface_1 {

	public static void main(String[] args) {
		
		//1. �ڽİ�ü�� ���� ���� �� ���(�ڽ�Ŭ������ �����ϴ� ���
		A.B ab = new C();	//�θ��� Ÿ������ ��ĳ���� �� �������̵��� ���ؼ� ����ϴ� ���
		ab.bcd();
		
		C c = new C();		//�ڱ� �ڽ�Ÿ���� ���� ȣ��
		c.bcd();
		
		//2. �͸� �̳�Ŭ������ ���(�ڽ� Ŭ���� ���� ���)
		A.B b = new A.B() {		//A.B	: AŬ���� ������ �������̽�(�̳� �������̽�)
			@Override
			public void bcd() {
				System.out.println("�͸� �̳�Ŭ���� ��ü ������ ���");
			}
		};		
		b.bcd();
	}

}
