package Chap15.EX20;

class DataBox {
	boolean isEmpty = true;		//기본값 세팅
	int data; // 공유 필드

	synchronized void inputData(int data) { // 동기화 메소드
		if(!isEmpty) {		//false일때 wait(); 호출 동기화 블럭이나 동기화 메소드에서  Waiting상태로 전환
			//data필드의 값이 비어있지 않을때 잠시 대기, t2스레드가 처리하도록 넘김 
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty = false;	//data 필드에 값을 넣고 t2스레드가 값을 읽을수 있도록 false로 기본 세팅
		
		this.data = data;
		System.out.println("입력 데이터" + data); // data : 매개변수 값으로 들어온 데이터
		notify();
	}

	synchronized void outputData() { // 동기화 메소드
		if(isEmpty) {
			try {wait();} catch (InterruptedException e) {}	//Waiting 상태로 진입
		}
		isEmpty = true;
		
		System.out.println("출력 데이터" + data); // data : 메모리의 data, this생략되어 있음.
		notify();	//input data메소드에 wait()된 스레드를 깨워준다.
	}
}

public class Waiting_WaitNotify_2 {

	public static void main(String[] args) {

		DataBox dataBox = new DataBox();

		// 첫번째 스레드 : 공유 객체에 값을 넣는 스레드
		Thread t1 = new Thread() { // 익명 내부클래스
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};

		// 두번쨰 스레드 : 공유 객체로부터 값을 읽어오는 메소드
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
		};

		t1.start();
		t2.start();

	}

}
