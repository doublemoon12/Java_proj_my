package Chap15.EX01;

public class TheNeedForThread {

	public static void main(String[] args) {
		//1. 비디오 프레임 	: 1 ~ 5
		int [] intArray = {1,2,3,4,5};
		
		//2. 자막 프레임 	: 하나 ~ 다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		
		//3. 비디오 프레임 출력
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("(비디오 프레임)" + intArray[i]);
			try {
				Thread.sleep(200);	//Thread.sleep(ms) 0.2초동안 일시정지(delay)
			} catch (InterruptedException e) {}	
		}
		
		//4. 자바 프레임 출력
		for(int i = 0; i < strArray.length; i++) {
			System.out.println("(자막번호)" + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
		
		
	}

}
