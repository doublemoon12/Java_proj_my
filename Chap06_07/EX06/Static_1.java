package Chap06_07.EX06;

class Aaa{
	int m = 3;			//�ʵ�(�ν��Ͻ� �ʵ�) : ��ü�� �����Ŀ� ��밡��
	static int n = 4;	//�ʵ�(static �ʵ�) : ��ü �������� ��밡��, ��ü ���� �Ŀ��� ��밡��
							//��� ��ü�� �����ϴ� ����
	void print1() {		//�ν��Ͻ� �޼ҵ� : ��ü�� ������ ȣ�� ����
		//�ν��Ͻ� �޼ҵ�� �ν��Ͻ� �ʵ�� ����ƽ �ʵ尡 �ü� �ִ�.
		System.out.println("�ν��Ͻ� �޼ҵ� ���" + " : m : " + m + ", n : " + n);
	}
	
	static void print2() {		//����ƽ �޼ҵ� : ��ü ���� ���� ȣ��, ��ü �����Ŀ��� ȣ��
		//static�޼ҵ� �������� �ν��Ͻ� �ʵ尡 �� �� ����. static�ʵ常 �;��Ѵ�.
		//static�޼ҵ�� ��ü ���� ���̵� ȣ���� ������ �ν��Ͻ� �ʵ�� ��ü�� ������ �ȵȴ�. 
		System.out.println("static �޼ҵ� ���" + ": n : " + n);
	}
	
}

public class Static_1 {

	public static void main(String[] args) {

		//1. ��ü ������ �ʵ�� �޼ҵ� ȣ�� (�ν��Ͻ� �ʵ�, ����ƽ �ʵ�, �ν��Ͻ� �޼ҵ�, ����ƽ �޼ҵ�) ��� ȣ��
		Aaa aaa = new Aaa();
		aaa.m = 10;		//�ν��Ͻ� �ʵ� ȣ��
		aaa.n = 20;		//����ƽ �ʵ� ȣ��
		aaa.print1();	//�ν��Ͻ� �޼ҵ�
		aaa.print2();	//����ƽ �޼ҵ�
		
		
		//2. ��ü �������� Ŭ���������� ����ƽ �ʵ�� �޼ҵ� ȣ�� (����ƽ �ʵ�, ����ƽ �޼ҵ�)
		Aaa.n = 100;	//����ƽ �ʵ� : Ŭ���� ������ ȣ���
		Aaa.print2();	//����ƽ �޼ҵ� : Ŭ���� ������ ȣ���
		
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n);
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);
		
		eee.n = 300;
		System.out.println("=========static�ʵ尡 ����� �ʵ�� ��� ��ü���� �������� �ٶ󺸴� ����=========");
		
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
	}

}
