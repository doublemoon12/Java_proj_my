package Chap18.EX08;

//배열의 생성자에 참조

interface AA{
	int[] abc (int len);
}


public class ReOfArrayConstrunctor {

	public static void main(String[] args) {

		//배열의 생성자 참조.
		//1. 익명 이너클래스
		AA a1 = new AA() {		//배열선언 int[] arr = new int[방의 갯수] <== 배열 선언
			@Override
			public int[] abc(int len) {
				return new int[len];		//정수를 받아서 배열의 방의 크기를 리턴 돌려줌.
			}
		};
		
		//2. 람다식
		AA a2 = (int len) -> {return new int[len];};
		
		//3. 배열의 생성자 참조 표현식.
		AA a3 = int[]::new;
		
		//배열 선언 구문
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
