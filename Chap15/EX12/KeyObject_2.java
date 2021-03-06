package Chap15.EX12;

class A{}
class B{}
class C{}

class MyData {
	// 공유 객체 :
	// 동기화된 메소드는 Key값이 모두 this가 자동으로 등록되고 수정이 불가
	// 동기화 메소드는 Key값을 넣을 수 없다
	// 하나의 스레드가 접근할때 key를 가지고 동기화된 메소드를 접근 가능하다
	// Key는 객체를 키로 사용할 수 없다
	// 동기화 블럭은 Key값을 임의로 할당 가능하다.
	synchronized void abc() { // 여러스레드가 접근할때 동시성 문제를 방지하기 위해 동기화 처리
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	synchronized void bcd() { // 여러스레드가 접근할때 동시성 문제를 방지하기 위해 동기화 처리
		try {
			Thread.sleep(20);
		} catch (InterruptedException e1) {
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	void cde() { // 여러스레드가 접근할때 동시성 문제를 방지하기 위해 동기화 처리
		synchronized (new Object()) {	//별도의 키를 생성 : 임의의 키, 스레드가 접근하는 키
			try {
				Thread.sleep(30);
			} catch (InterruptedException e1) {
			}
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}

public class KeyObject_2 {

	public static void main(String[] args) {

		// 공유 객체
		MyData myData = new MyData();

		// 세개의 스레드가 각각의 메소드 호출
		new Thread() { // 익명 클래스 : 스레드 클래스를 구현하는 자식 익명 클래스
			public void run() {
				myData.abc(); // abc() 호출
			};
		}.start();

		new Thread() { // 익명 클래스 : 스레드 클래스를 구현하는 자식 익명 클래스
			public void run() {
				myData.bcd(); // bcd() 호출
			};
		}.start();

		new Thread() { // 익명 클래스 : 스레드 클래스를 구현하는 자식 익명 클래스
			public void run() {
				myData.cde(); // cde() 호출
			};
		}.start();

	}

}
