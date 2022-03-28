package Chap15.EX18;

//BLOCKED상태 : 동기화메소드나 동기화 블락에서 한 스레드가 키를 점유한 경우 대기상태의 스레드

class MyBlockTest{
	//1. 공유객체(동기화 메소드, 동기화 블락)
	MyClass mc = new MyClass();
	//2. 세개의 스레드 필드 생성
	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	Thread t2 = new Thread("thread2") {
		public void run() {
			mc.syncMethod();
		};
	};
	Thread t3 = new Thread("thread3") {
		public void run() {
			mc.syncMethod();
		};
	};
	void startALL() {
		t1.start();
		t2.start();
		t3.start();
	}


class MyClass{	//MyBlockTest의 내부클래스
	synchronized void syncMethod() {	// 동기화 메소드 : 스레드가 키를 가진 스레드만 접근
		try {Thread.sleep(100);} catch (InterruptedException e) {}	//스레드 준비시간 0.1초 지연
		System.out.println("====" + Thread.currentThread().getName() + "====");
		System.out.println("thread1 ->" + t1.getState());
		System.out.println("thread2 ->" + t2.getState());
		System.out.println("thread3 ->" + t3.getState());
		
	}
}
}

public class BlockedState {

	public static void main(String[] args) {

		MyBlockTest mbt = new MyBlockTest();
		mbt.startALL();
		
	}

}
