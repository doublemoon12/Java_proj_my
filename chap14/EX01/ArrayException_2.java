package chap14.EX01;

//Exception�� ������ �ֻ��� Ŭ�����̴�.
//ArrayIndexOutOfBoundsException�� Exception�� ����ϰ� �ִ�.

public class ArrayException_2 {

	public static void main(String[] args) {

		int[] arr = new int[5];		//arr�迭�� �迭�� 5���� ����
		
		
		try {	
			for(int i = 0; i < 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {	//������ ��� ���ܸ� ó���� �� �ִ�.
			e.printStackTrace();	//���ܿ� ���� ������ ���
			System.out.println("�迭�� �ε��� ���ȣ�� �Ѱܽ��ϴ�.");
		}finally {
			System.out.println("���(fially)");
		}
			System.out.println("���α׷� ����");
		
	}

}