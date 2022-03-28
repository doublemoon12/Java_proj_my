package Chap15.EX10;

//동기화 : 여러 스레드가 공유된 필드에 접근할때 하나의 그레드 작업시 다른 스레드가 접근하지 못하도록 설정

//블락 동기화 : 메소드 *내부*의 일부분만 동기화 한다.
//	- 구문 형식 : synchronized(this){}
//						this : 자신의 객체, new 임의의 객체

class A{}
class B{}
class C{}

class MyData{	//스레드가 공유하는 객체 필드 생성
	int data = 3;	//데이터 가져오기
	
	public void plusData() {	
		synchronized(this) {	//블락 동기화 	: 메소드의 일부분만 동기화, this : 자신의 객체
								//this 		: 자신의 객체를 뜻하고, 동기화 블락에 접근하는 키이다.
								//모든 스레드는 key를 가져야 동기화 블락에 접근할 수 있다.
								//key는 임의의 객체를 키로 사용할 수 있다.
			int mydata = data;
			try {Thread.sleep(2000);} catch (InterruptedException e) {}
			data = mydata + 1;
		}
	}
}

class PlusThread extends Thread{	//1씩 증가하면서 두개의 스레드
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행결과" + myData.data);
	}
	
	
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		//공유 객체 생성
		MyData myData = new MyData();
		
		//1. PlusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		//2. PlusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
	}

}
