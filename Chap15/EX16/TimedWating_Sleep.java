package Chap15.EX16;

//Thread.sleep(1000) ===> TimeWaiting상태로 이동 ===> 특정 시간(1초)이 경과되면 Runnable 상태로 이동
										//	  ===> 인터럽트가 발생되면 예외를 발생시키고 Runnable
//인스턴스명(객체명).join(1000)	 ===> TimeWaiting상태로 이동 ===> 특정 시간이 경과되면 Runnable상태로 이동
	//a.join(1000)	: 자신의 스레드는 1초를 기다리고 a객체에게 cpu할당 (Runnable), 
					// 1초 뒤에는 자신의 스레드도 Runnable상태로 이동
//참고) 인스턴스명(객체명)[a].join()	===> Waiting 상태로 이동 ===> 
		//자신의 스레드는 잠시 Waiting상태로 가고 a객체에게 CPU를(Runnable)상태로 할당.
		//a 객체가 모두 완료된 경우 자신의 스레드도 Runnable

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);	//3초동안 TimedWaiting 상태로 진입, 3초후 자동으로 Runnable상태로 이동
								//interrupt가 발생되면 예외 발생 시키고 Runnable상태로 이동
		} catch (InterruptedException e) {
			System.out.println("---sleep() 진행중 Interrupt 발생");
			for(long i = 0; i < 100000000L; i++) {}	//시간지연 0.5초
		}
	}
}

public class TimedWating_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}	//스레드 시작 준비시간
		System.out.println("MyThread State : " + myThread.getState());	//Timed_Waiting
		
		//3초 이전에 인터럽트 강제 발생
		myThread.interrupt(); 	//TimedWaiting상태
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State 2 : " + myThread.getState());	//runnable 상태
		
		
		
		
	}

}
