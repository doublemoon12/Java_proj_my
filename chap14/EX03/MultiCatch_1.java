package chap14.EX03;

//�������� Exception�� ���ÿ� �߻��ɰ�� ó��

public class MultiCatch_1 {

	public static void main(String[] args) {

		// 1. ���� Exceptionó�� try catch�� ó��

		try {
			// ArithmeticException
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			// catch����� �ƹ� ������ ��� ����ó��
			System.out.println("���� ���(ArithmeticException)");
		}

		// NumberFormatException
		try {
			int num = Integer.parseInt("10A");
		} catch (NumberFormatException e) {
			System.out.println("���� ���(NumberFormatException)");
		}

		System.out.println("======================================");

		// 2. ���� Exception ó��

		try { // try ������� ���� ���ܰ� �߻��� ���
			System.out.println(10 / 0);
			int num2 = Integer.parseInt("10A");
		} catch (ArithmeticException e) {
			System.out.println("0 ArithmeticException ���");
		} catch (NumberFormatException e) {
			System.out.println("1 NumberFormatException ���");
		}

		// 3. ���� Exception ó�� 2
		try {
			System.out.println(10 / 0);
			int num3 = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
				System.out.println("���� ����ó��");
		}

		System.out.println("���α׷� ����");
	}

}
