package chap10.EX04;

//�޼ҵ� �����ε��� �޼ҵ� ���� ���̵�

//1. �޼ҵ� �����ε� : ������ �޼ҵ� �̸����� (�Ű����� Ÿ��, �Ű����� ��)�� ���� �ش� �޼ҵ尡 ȣ��
//��Ӱ��� ������ ����, �����ڿ��� ���� ���...
//2. �޼ҵ� �������̵� : �ݵ�� ��� ���迡�� ���.
//	�θ��� �޼ҵ带 �ڽĿ��� ���Ӱ� �����ؼ� ���.
	//1. ��Ӱ���, 2, �޼ҵ��� �ñ״��İ� ���ƾ� �Ѵ�.(�޼ҵ��, �Ű����� ����, �Ű����� Ÿ��)
	//3. �ڽĿ��� �θ��� ���� �����ڿ� ���ų� �� ���� ������� �Ѵ�

class Ab{
	void print1() {	//���� ���̵�
		System.out.println("Ab Ŭ������ print1()");
	}
	void print2() {	//���� �ε�
		System.out.println("Ab Ŭ������ print2()");
	}
}

class Bc extends Ab{
	@Override
	void print1() {
		System.out.println("Bc Ŭ������ print1");
	}
	void print2(int a) {	//�����ε�
		System.out.println("Bc Ŭ������ print2");
	}
	
}


public class Overloding_VS_Overriding {

	public static void main(String[] args) {
		//1. AbŸ�� ����
		
		Ab aa = new Ab();	
		aa.print1();		//Ab Ŭ������ print1 ȣ��
		aa.print2();		//Ab Ŭ������ print2 ȣ��
		
		System.out.println("=======================");
		
		//2. BcŸ���� ����, ������ ȣ�� Bc
		Bc bc = new Bc();
		bc.print1();		//BcŬ������ print1ȣ��
		bc.print2();		//AbŬ������ print2ȣ�� : �θ� Ŭ������ �޼ҵ� ȣ��
		bc.print2(3);		//BcŬ������ print2(3) ȣ�� : �ڽ�Ŭ������ �޼ҵ� ȣ��
		System.out.println("========================");
		
		//3. AbŸ������ ���� + Bc Ÿ�� ������ ȣ��
		Ab cc = new Bc();
		cc.print1();		//�޼ҵ� �������̵��� �Ǿ� �����Ƿ� ���� ���ε��� ���ؼ� Bc�� print1()�� ȣ��
		cc.print2();		//AbŬ������ �޼ҵ常 ȣ���� ����
		
		
		
	}

}
