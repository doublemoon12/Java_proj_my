package Chap06_07.ex05;

//���� ��Ű�� ������ class A�� ����

public class Ex_A {

	public static void main(String[] args) {
		// A class�� ���� ��Ű�� ���ο� ���� ������ import�� ������� �ʰ� ���
		
		A a = new A();		//import���� ��� : A class�� ���� ��Ű�� ���� ���� �ϱ� ����
		
		a.m = 10;	//A class�� ���� �����ڰ� default �Ǿ��ֱ� ������ ���� ����(���� ��Ű����������)
		a.n = 20;
		
		a.print();	// default ���� ������ �̹Ƿ� ���� ����
	}

}
