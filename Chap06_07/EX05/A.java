package Chap06_07.ex05;

	//����������(ĸ��ȭ : �����͸� �ܺηκ��� ��ȣ�ϴ� ������ ��) : Public, protected, default, private
		//Ŭ���� �̸� �տ� �Ҵ�, �ʵ��, �޼ҵ��, �����ڸ� <== ���������ڰ� �ݵ�� �Ҵ��� �Ǿ� �ִ�.
		//Ŭ���� �̸� �տ��� �ΰ��� ���������ڸ� ��밡�� : Public, default

public class A {
	
	int m = 3;	//�ʵ��� �⺻ ���� �����ڴ� default : �⺻������ �����Ǿ� ����, ���� ��Ű�� �������� ������ ����
	int n = 4;			//default: �ٸ� ��Ű���� Ŭ���������� ������ �Ұ���.
						//���������� private : �ܺ� Ŭ�������� ������ �Ұ���
	
	public int k = 10;	//public�� �ٸ� ��Ű������ ������ �����ϴ�.
	
	
	void print() {	//default : ���� ��Ű������ Ŭ���������� ��밡��.
		System.out.println("����Ʈ ����" + m + " , " + n);
	}
	
	public void print2() {
		System.out.println("�ܺ� ��Ű���� �ٸ� Ŭ�������� ���� ���� " + k);
	}
	
	
	public static void main(String[] args) {
		
		
		
	}

}
