package Chap06_07.EX06;

import Chap06_07.EX05.Bb;	//�ٸ� ��Ű���� Ŭ�������� Ŭ������ import �Ҷ� public ���� �����ڰ� �ο��Ǿ� �־�� �Ѵ�	

// import Chap06_07.EX05.B;	//class B�� Ŭ���� ���� �����ڰ� default������ �ٸ� ��Ű������ ������ �Ұ��� �ϴ�. 

public class ExternalClass_2 {

	public static void main(String[] args) {
		
		//B b = new B();	//����
		
		//�ٸ� ��Ű���� Ŭ�������� BbŬ������ �����ϴ� ���
			//1. import�� ���� ���
			//2. BbŬ������ Ŭ���� ���� �����ڴ� public�� �� �־���Ѵ�.
			//3. �ʵ�, �޼ҵ��� ���� �����ڿ� ���� ������ ���� �� ���� �ְ� �Ұ��� �� ���� �ִ�. ����(protected(��Ӱ���), public), �Ұ���(private, default)
		
		Bb bb = new Bb();	//�ٸ� ��Ű���� Ŭ���� : 1. Ŭ���� ���� �����ڿ� public
		
		bb.print4();
		
		//bb.a = 1;	//private :���� Ŭ���� �������� ����
		//bb.b = 2;	//default :���� ��Ű�� ������ ���� ����
		//bb.c = 3;	//protected :default ���� + �ٸ� ��Ű������ ������ ����(��Ӱ����϶���)
		bb.d = 12;	//public : protected�� �����ϰ� �ְ� �ٸ���Ű������ ���ٰ���(��Ӱ����ʿ� ����)
		
		//�޼ҵ� ����
		//bb.print1();	//private
		//bb.print2();	//default
		//bb.print3();	//protected �ܺ��� �ٸ� ��Ű������ ���� �Ϸ��� ��Ӱ��谡 �ʿ�.
		bb.print4();	//public
	}

}
