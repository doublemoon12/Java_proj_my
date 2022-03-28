package Chap15.EX03;

//두번째 쓰래드
class SMIFileThread extends Thread { // 자막파일 처리하는 쓰래드
	@Override
	public void run() {
		// 1. 자막 번호 출력
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
			} // 0.2초 딜리에
		}
	}
}

//세번째 쓰래드
class VideoFileThread extends Thread { // 비디오 프레임을 처리하는 쓰래드
	@Override
	public void run() {
		// 2. 비디오 프레임 출력
		try {Thread.sleep(200);} catch (InterruptedException e) {}
		int[] intArray = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("(비디오 프레임)" + intArray[i]);
		}
	}

	public class CreateAndThread_2 {

//첫번째 main쓰래드
		public static void main(String[] args) {
			// SMIFileThread 객체 시작
			Thread smi = new SMIFileThread();
			smi.start();

			// VideoFileThread객체 시작
			Thread vid = new VideoFileThread();
			vid.start();

		}

	}

}
