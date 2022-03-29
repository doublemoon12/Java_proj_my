package Chap15.EX19;

//Waiting 	: 
	//a.join()	: 자신의 스레드는 Waiting상태이고 a객체에게 CPU를 할당(Runnable)
			//a 객체가 실행이 완료되면 자신의 스레드가(Runnable)로 이동
		//자신스레드의 처리할 내용이 다른 스레드의 결과를 받아서 처리해야 할 경우
	//wait(), notify(), notifyAll()	<== 동기화 블럭에서만 사용됨.
	//- wait()	: 동기화 블럭 내에서 wait()를 만나면 Waiting상태로 진입.
	//- notify(), notifyAll()가 wait()를 깨워줌		<== 반드시 다른 스레드에서 깨워줄 수 있다.

class DataBox{
	int data;	//공유 필드
	synchronized void inputData(int data) {		//동기화 메소드
		this.data = data;
		System.out.println("입력 데이터" + data);	//data : 매개변수 값으로 들어온 데이터
	}
	synchronized void outputData() {			//동기화 메소드
		System.out.println("출력 데이터" + data	);	//data : 메모리의 data, this생략되어 있음.
	}
}
public class Waiting_WateNotify_1 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		//첫번째 스레드 : 공유 객체에 값을 넣는 스레드
		Thread t1 = new Thread() {		//익명 내부클래스
			@Override
			public void run() {
				for(int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		//두번쨰 스레드	: 공유 객체로부터 값을 읽어오는 메소드
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
		};
		
		t1.start();
		t2.start();
		
		
	}

}
