package chap14.EX01;




public class ArrayException_1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];		//arr배열에 배열방 5개를 생성
	
		
	try {	
		for(int i = 0; i < 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();	//예외에 대한 정보를 출력
		System.out.println("배열의 인데스 방번호를 넘겨습니다.");
	}finally {
		System.out.println("출력(fially)");
	}
		System.out.println("프로그램 종료");
		
	}

}
