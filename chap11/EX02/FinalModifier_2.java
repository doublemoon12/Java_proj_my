package chap11.EX02;

import chap11.EX02.A;

//final �޼ҵ�� final class�� Ư¡
	//final �޼ҵ� 	: �������̵��� �Ұ� : ���� �߿��� �޼���� �ڽĿ��� ������ ���� ���ϵ��� ����
	//final Ŭ����	: ����� �Ұ��� Ŭ����

class A{
	void abc() {}
	final void bcd() {}	//final �Ҵ�� �޼ҵ�� �ڽ� Ŭ�������� �������̵��� �Ұ�
}

class B extends A{
	void abc() {}	//�޼ҵ� �������̵��� : �θ��� �޼ҵ� ����� �ڽĿ��� ���Ӱ� ����
	//void bcd() {}	//�������̵� �Ұ�
}

final class C{}
//class D extends C{}	//���� CŬ������ final�̱� ������

public class FinalModifier_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
