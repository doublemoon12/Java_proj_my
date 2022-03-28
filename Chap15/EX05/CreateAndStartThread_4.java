package Chap15.EX05;

//객체 생성없이 익명 객체를 사용해서 쓰래드 생성. <== 제일 많이 사용한다.

public class CreateAndStartThread_4 {

	public static void main(String[] args) {
		// 자막 번호출력 - 쓰래드
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				// 1.자막번호 출력
				String[] strArray = { "하나", "둘", "셋", "넷", "다섯" };
				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
				}
				for (int i = 0; i < strArray.length; i++) {
					System.out.println("- 자막 번호 " + strArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					} // 0.2초 딜레이
				}

			};
		});

		// 비디오 프레임 출력 - 쓰래드
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// 2. 비디오 프레임 출력
				
				int[] intArray = { 1, 2, 3, 4, 5 };
				for (int i = 0; i < intArray.length; i++) {
					System.out.print("(비디오 프레임)" + intArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		
		//Thread출력
		thread1.start();
		thread2.start();
		
	}

}
