package Chap06_07.ex06;

class Abc{		//�ܺ� Ŭ���� : public �����ڸ� ��� ���Ѵ�.(�⺻������ default) public�����ڴ� �Ѱ��ۿ� ������
				//class : public�� default
				//���������ڰ� ������ �ִ� Ű���� : class��, �ʵ�, �޼ҵ�, ������
				//�ݵ�� ���� �����ڰ� �Ҵ� �Ǿ� �ִ�. �����Ǿ������� default
				//���������� :
					//1. public : �ٸ� ��Ű������ ���� ����
					//2. protected : �ٸ���Ű������ ������ ����(��ӱ����� �Ǿ��־���Ѵ�)
					//3. default : ���� ��Ű������ ������ ����, ���� ��Ű���� �����ϴ� Ŭ������ import���� ���.
					//4. private : ����Ŭ���� ���ο����� ��밡��
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	//Abc(){} <== �⺻ ������ : �ʵ��� �ʱⰪ�� �ο��ؼ� ��ü�� ����
	
	
	public void print1() {
		System.out.println("�ٸ� ��Ű������ ���� ����");
	}
	protected void print2() {
		System.out.println("�ٸ���Ű������ ���� ����(��Ӱ��谡 �����ɋ�) : protected");
	}
	void print3() {
		System.out.println("������Ű�������� ������ ���� : default");
	}
	private void print4() {
		System.out.println("���� Ŭ���������� ������ ����");
	}
	
}					

public class Ex06_All {

	public static void main(String[] args) {

		Abc abc1 = new Abc();		//�⺻ ������ ȣ��
		//Abc : Ŭ������, abc1 : �޸𸮿� �ε��� ��ü��, new = ��ü�� Heap ������ ����, Abc() = ������ ȣ��
			//Abc() : �⺻ ������ : ���� ����, Abc(){}
				//������ : 1. Ŭ���� �̸��� ������ �޼ҵ�, ����Ÿ���� ���� �޼ҵ� ������
		
		abc1.a = 100;
		abc1.b = 200;
		abc1.c = 300;
		//abc1.d = 400;	���� �ٸ� Ŭ���������� ���� �Ұ�
		
		abc1.print1();
		abc1.print2();
		abc1.print3();
		//abc1.print4(); ����
		
	}

}
