package Chap06_07.EX06;



public class Bcd{
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	//Abc(){} <== �⺻ ������ : �ʵ��� �ʱⰪ�� �ο��ؼ� ��ü�� ����
	
	
	public void print1() {
		System.out.println("�ٸ� ��Ű������ ���� ����");
	}
	protected void print2() {
		System.out.println("�ٸ���Ű������ ���� ����(��Ӱ��谡 �����ɋ�) : protected");
	}
	void print3() {
		System.out.println("������Ű�������� ������ ���� : default");
	}
	private void print4() {
		System.out.println("���� Ŭ���������� ������ ����");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
