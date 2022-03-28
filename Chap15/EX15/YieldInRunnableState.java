package Chap15.EX15;

//Thread.yield()	: 스레드의 실행 상태(RUNNABLE)에 있는 특정 스레드에게 자신의 스레드는 일시 양보 
	// 실행상태 내부에서 다른 스레드를 먼저 실행 하도록 양보.
	// 동기화에서 key를 서로 점유하는 현상이 발생되는데

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while (true) {	//무한 루프
			if(yieldFlag) {
				Thread.yield(); 	//yieldFlag가 True일때 스레드를 양보 해준다.
			}else {
				System.out.println(getName() + "실행");
				for(long i = 0; i < 100000000L; i++) {}	//0.5초 시간 지연
			}
		}
	}
}

public class YieldInRunnableState {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;	//false일때 스레드 정보 출력
		thread1.setDaemon(true);	//마지막 스레드가 종료 될때 종료, while 무한 루프로 인해 빠져나오기 위해
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;	//false일때 스레드 정보 출력
		thread2.setDaemon(true);	//마지막 스레드가 종료 될때 종료
		thread2.start();
		
		//스레드 6초 지연(1초마다 한번씩 양보)
		for(int i = 0; i < 3; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			thread1.yieldFlag =! thread1.yieldFlag;		//참일땐 거짓, 거짓일땐 참 저장
			thread2.yieldFlag =! thread2.yieldFlag;
			
		}
		
	}

}
