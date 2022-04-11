package Chap18.EX08;

//�迭�� �����ڿ� ����

interface AA{
	int[] abc (int len);
}


public class ReOfArrayConstrunctor {

	public static void main(String[] args) {

		//�迭�� ������ ����.
		//1. �͸� �̳�Ŭ����
		AA a1 = new AA() {		//�迭���� int[] arr = new int[���� ����] <== �迭 ����
			@Override
			public int[] abc(int len) {
				return new int[len];		//������ �޾Ƽ� �迭�� ���� ũ�⸦ ���� ������.
			}
		};
		
		//2. ���ٽ�
		AA a2 = (int len) -> {return new int[len];};
		
		//3. �迭�� ������ ���� ǥ����.
		AA a3 = int[]::new;
		
		//�迭 ���� ����
		//int[] array1 = new int[3]; 
		//int[] array2 = new int[]{1,2,3,4,5};
		//int[] array3 = {1,2,3,4,5}
		
		int[] array1 = a1.abc(3);
		System.out.println(array1.length);
		
		int[] array2 = a2.abc(4);
		System.out.println(array2.length);
		
		int[] array3 = a3.abc(5);
		System.out.println(array3.length);
		
		
	}

}
