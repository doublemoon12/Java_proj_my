package Chap15.EX07;

//일반스레드 : setDaemon(false)	 	: 마지막스레드가 종료 되더라도 자신의 일을 모두 마치고 종료
//데몬스레드 : setDaemon(true)		: 쓰레드를 start할때 설정, 수정 변경 불가.
//	- 마지막 스레드가 종료되는 시점에 종료
//	- 일반적으로 다른 스레드의 작업을 돕는 보조 스레드
//	- 종료시점이 마지막 일반스레드가 종료될때 종료점 이외에는 일반스레드와 동일
//	- 가비지 컬렉터(메모리의 사용되지 않는 객체를 가비지 컬렉터가 자동으로 객체를 제거)
//		- 프로세서가 종료되는 시점에 자동저장, 화면 자동 갱신...
//	- 무힌루프를 사용해서 항시 대기하고 있다가 특정조건을 만족하면 작업을 수행하고 다시 대기상태로 돌아감
class MyThread extends Thread{	//스레드를 작동시킬 클래스
	@Override
	public void run() {
		System.out.println(getName()+ " : " + (isDaemon()? "데몬스레드":"일반스레드"));
		for(int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		
	}
}

public class ThreadProperties_3 {

	public static void main(String[] args) {
		
		/*
		//1.일반 스레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);//디폴트는false
		thread1.setName("thread1");
		thread1.start();
		*/
		
		//2. Demon스레드	: 마지막 스레드가 종료 되는 시점에 종료
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);//디폴트는false
		thread2.setName("thread2");
		thread2.start();
		
		//2. 3.5초 후에 main Thread를 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
	
	
	
	
	}

}
