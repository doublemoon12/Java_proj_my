package Chap06_07.EX06;

import Chap06_07.EX05.C;

public class Ex_C {

	public static void main(String[] args) {
		//�ٸ� Ŭ������ �����Ͽ� / public�� ����	/model, color�� �޸𸮷� ���� �Ұ��ؼ� setter�� public�� ���� ���� ���
		C c = new C();	//�ٸ� ��Ű�������� import���Ѿ� �Ѵ�.
		
		//company, model, color�� �ٸ���Ű������ ���ٺҰ�, setter�� ���ؼ� �޸� ���� �Ҵ��ϵ��� ����
		c.maxspeed = 180;	//�ٸ���Ű���� Ŭ����������public, protected(��Ӽ����� �ؾ��Ѵ�)
		
		//setter�� ���ؼ� �޸𸮿� ���� �ο�
		c.setColor("khaki");
		c.setModel("retona");
		
		c.print();
	}

}
