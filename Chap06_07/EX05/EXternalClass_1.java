package Chap06_07.EX05;

class B{	//�ܺ� Ŭ���� : public�� �ü� ����.
			//�ٸ� ��Ű���� Ŭ���� ������ ������ �Ұ�, ���� ��Ű�� �������� ���� ����
	private int a = 1;	//private : ���� Ŭ���� �������� ���
	int b = 2;			//default : ���� ��Ű������ �ٸ� Ŭ�������� ���� ����
	protected int c = 3;//protected : default ���� + �ٸ� ��Ű���� ���� ���� (��ӵ� ��츸 ����)
	public int d = 4;	//public : �ٸ� ��Ű������ ������ ����
	
		//private < default < protected < public
	
	private void print1() {	//���� Ŭ���� ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	void print2() {	//���� Ŭ���� ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	protected void print3() {	//���� Ŭ���� ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	public void print4() {	//���� Ŭ���� ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
}

public class EXternalClass_1 {

	public static void main(String[] args) {
		
		B b = new B();		//default ���� �����ڰ� class�̸��� �Ҵ�/ ���� Ŭ������ �����ϱ� ������ BŬ���� ���� ����
	
		Bb bb = new Bb();	//public ���� ������, ���� ��Ű�� ������ ����
		
		//���� ��Ű���� �ٸ� Ŭ�������� ����
		
		//bb.a = 10;	//private : a�� Bb Ŭ���� ���ο����� ��밡��(����)
		bb.b = 1;		//default : ���� ��Ű���� Ŭ�������� ������ ���
		bb.c = 2;		//protected : default�� ����, + <�ٸ� ��Ű������ ������ ���������� ��Ӱ����϶���>
		bb.d = 3;		//pyblic : protected�� ���� + <��Ӱ��谡 �ƴϴ��� �ٸ� ��Ű������ ������ ����>
		
		//�޼ҵ� ����
		//bb.print1();	//private
		bb.print2();	//default
		bb.print3();	//protrected
		bb.print4();	//public
	}
	
}
