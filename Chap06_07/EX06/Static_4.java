package Chap06_07.EX06;

class Cde{
	String name;	//�ν��Ͻ� �ʵ�	:��üȭ �ؾ� ��밡��
	int age;
	
	static String email;	//�����ʵ� : ��ü ���� ���� ��밡��(Ŭ������.�ʵ��) + ��ü ���� �Ŀ��� ��밡��
	static int num;
	
}

public class Static_4 {

	public static void main(String[] args) {
		Cde cde1 = new Cde(); //��üȭ
		//�ν��Ͻ� �ʵ�
		cde1.name = "ȫ�浿";
		cde1.age = 30;
		
		//static �ʵ�
		cde1.email = "cde1@naver.com";
		cde1.num = 100;
		
		//��ü���� ���� static �ʵ� ȣ�� : Ŭ���� ������ ȣ���� ���� : ���� ����
			//��� ��ü���� �����ϴ� ����
		Cde.email = "bbb@bbb.com";
		Cde.num = 5;
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		//�ν��Ͻ� �ʵ� : Heap������ ����, �� ��ü���� ���� ���� �ʴ� ������ ���� ������ �ִ�
		cde2.name = "������";
		cde2.age = 50;
		
		cde3.name = "�������";
		cde3.age = 60;
		
		cde4.name = "�Ż��Ӵ�";
		cde4.age = 40;
		
		//�ν��Ͻ� �ʵ� �� ���
		System.out.println(cde2.name + ", " + cde2.age);
		System.out.println(cde3.name + ", " + cde3.age);
		System.out.println(cde4.name + ", " + cde4.age);
		
		//static �ʵ��� ���� �����ϸ� ��� ��ü���� ���� ����ȴ�
		cde2.email = "lll@lll.com";
		cde2.num = 55;
		
		System.out.println(cde2.email);
		System.out.println(cde2.num);
		
		
		
	}

}
