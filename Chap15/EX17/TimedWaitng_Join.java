package Chap15.EX17;

//a.join(1000)	: a객체에게 CPU를 할당하고 자신은 TimeWaiting 상태로 대기

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 100000000000L; i++) {}
		for(long i = 0; i < 100000000000L; i++) {}
		for(long i = 0; i < 100000000000L; i++) {}
	}
}

class MyThread2 extends Thread{
	MyThread1 myThread1;	//클래스 타입 참조 변수;
	public MyThread2(MyThread1 myThread1) {	//생성자를 통해서 참조변수의 값 할당.
		this.myThread1 = myThread1;
	}
	@Override
	public void run() {
		try {
			myThread1.join(3000);	//MyThread2는 3초 대기하고 myThread1에게 CPU할당.
		} catch (InterruptedException e) {
			System.out.println("---join(...) 진행중 Interrupt발생");
			for(long i = 0; i < 100000000L; i++) {}
		}
	}
}

public class TimedWaitng_Join {

	public static void main(String[] args) {
		//1. 객체생성
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1);} catch (InterruptedException e) {}	//Thread시작전 준비 시간 0.1초
		System.out.println("MyThread1 State : " + myThread1.getState());	
		System.out.println("MyThread2 State : " + myThread2.getState());
		
		myThread2.interrupt(); 		//3초 대기중 전에 인터럽트가 발생 되면 예외를 발생시키고 Runnable로 이동함.
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread1 State : " + myThread1.getState());	
		System.out.println("MyThread2 State : " + myThread2.getState());
		
		
		
	}

}
