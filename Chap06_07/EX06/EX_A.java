package Chap06_07.ex06;

import Chap06_07.ex05.A;

public class EX_A {

	public static void main(String[] args) {

		//�ٸ� ��Ű���� ��ü�� ����ϴ� ���
			//1. ��ü Ŭ���� �̸��� ����ϴ� ���
		Chap06_07.ex05.A a = new Chap06_07.ex05.A();	//Ŭ������ ��ü�̸��� ��� : ��Ű����.Ŭ������
		
		//a.m = 10;	//���� �Ұ� : default�� �ٸ� ��Ű���� Ŭ���������� ������ �Ұ�.
		a.k = 50;	//public�� �� �־� �ٸ� ��Ű���� Ŭ�������� ������ ����
		a.print2();
		
			//2. import�� ����ؼ� �����ϴ� ���
		A aa = new A();
		aa.k = 100;
		aa.print2();
	}

}
