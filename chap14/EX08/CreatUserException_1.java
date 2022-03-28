package chap14.EX08;

//����� ���� Exception
//1. Exception�� ����ϴ� ����			: Checked(�Ϲݿ���) Exception - ������ �ܰ迡�� ����ó�� �ʿ�
//2. RuntimeException�� ����ϴ� ����	: UnCkecked(���࿹��) Exception

class MyException extends Exception { // �Ϲ� ����
	public MyException() { // �⺻ ������
		super();
	}

	public MyException(String message) { // ���� �޼��� ��½� ���
		super(message);
	}
}

class MyRTException extends RuntimeException { // ���࿹��
	public MyRTException() {
		super();
	}

	public MyRTException(String message) { // ���� �߻��� �޼����� ������ִ� ������
		super(message);
	}
}

class A {
	// 1. ����� ���� ���� ��ü ���� (�Ϲ� ���� ��ü)
	MyException me1 = new MyException(); // me1�� �⺻������ ȣ��
	MyException me2 = new MyException("���� �޼��� : MyException"); // ���ܰ� �߻��� �� ���� �޼����� ����ϴ� ������ ȣ��

	// 2. ��Ÿ�� ���� ��ü
	MyRTException mre1 = new MyRTException(); // �⺻������
	MyRTException mre2 = new MyRTException("���� �޼��� : MyRTException");

	// ���ܸ� ������ �߻� ��Ű��(throw)
	void abc_1(int num) {

		try {
			if (num > 70) { // abc_1()
				System.out.println("�����۵�");
			} else {
				throw me2; // ���ܸ� ������ �߻� ��Ŵ
			}
		} catch (MyException e) {	//me1�� ������ throw�� ����ؼ� ���ܸ� �߻���Ŵ
			System.out.println("70���� ���� �־����ϴ�, 70�ʰ� ���� �־��ּ���");
			System.out.println(e.getMessage());
		}
	}
	void bcd_1() {
		abc_1(65);		//���ܰ� �߻�
	}
	
	//������ ����(throws)
	void abc_2(int num) throws MyException {
		if(num > 70) {
			System.out.println("���� �۵�");
		}else {
			throw me2;	//���� ���� �߻�
		}
	}
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("70�̻��� ���� ��������");
			System.out.println(e.getMessage());
		}
	}
}

public class CreatUserException_1 {

	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();		//���ܸ����� ����
		a.bcd_2();		//throws�� ���� ����, ȣ���ϴ� �ʿ��� ���� ó��
		
	}

}
