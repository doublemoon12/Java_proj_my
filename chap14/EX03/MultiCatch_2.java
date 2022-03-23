package chap14.EX03;



public class MultiCatch_2 {

	public static void main(String[] args) {

		//1. Exception���� ��� ���ܸ� ó���� �� �ִ�
			//��� ���ܴ� Exception�� ��ӹޱ� ������
		
		try {
			System.out.println(10 / 0);
			int um = Integer.parseInt("10A");
		}catch(Exception e) {
			//try{}������� �߻��ϴ� ��� ���ܴ� ExceptionŬ������ �� ó��
			System.out.println("����ó�� (Exception)");
		}
		
		//2. catch�����  ������ �߸��� ���	: Exception�� catch�� �������� ��ġ�ؾ� �Ѵ�.
		
		/*
		try {
			System.out.println(10 / 0);
			int um = Integer.parseInt("10A");
		}catch(Exception e) {
			//try{}������� �߻��ϴ� ��� ���ܴ� ExceptionŬ������ �� ó��
			System.out.println("����ó�� (Exception)");
		}catch(ArithmeticException e) {
			
		}catch(NumberFormatException e) {
			
		}
		*/
		
		//3. catch ����� �ùٸ� ����	: �ֻ��� Exception�� catch����� ���� �������� ��ġ�ؾ��Ѵ�.
		
		try {
			System.out.println(10 / 0);
			int um = Integer.parseInt("10A");
		}catch(ArithmeticException e) {	//�������� 
			
		}catch(NumberFormatException e) {
			
		}catch(Exception e) {	//�ֻ��� �θ��� Exception
			
		}
		
		//4. �������� Exception�� �����ؼ� ����
		
		try {
			System.out.println(10 / 0);
			int um = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException e) {	
			//�������� Exception�� ����
		}catch(Exception e) {
			
		}
		
		System.out.println("���α׷� ����");
		
	}

}
