package Chap06_07.EX05;

public class Ex_C {

	public static void main(String[] args) {
		
		//���� ��Ű�� �ȿ��ִ�
		
		C c = new C();	//���� ��Ű�� �ȿ� �����ϴ� Ŭ����
		
		//c.company = "�Ｚ�ڵ���"	//private : �ܺ� Ŭ�������� ���� �Ұ�
		c.maxspeed = 180;		//public
		c.model = "starex";		//default
		c.color = "gray";		//protected
		
		c.print();
	}

}
