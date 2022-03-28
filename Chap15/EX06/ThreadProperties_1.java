package Chap15.EX06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		//1. 객체 가져오기(currtentThread())	//쓰래드 수 (activeCount())
			//static
		Thread curThread = Thread.currentThread();	//main Thread
		//클래스(타입)	참조변수 = 클래스명.메소드명
		System.out.println("현재 쓰래드 이름 : " + curThread.getName());
		System.out.println("동작하는 쓰래드수 : " + Thread.activeCount());
		
		System.out.println("=========================================");
		//2. 쓰래드의 이름 출력 (자동출력) - 내가 할당하지 않으면 JVM이 쓰래드 이름을 자동 할당 - Thread - 0 ,,,Thread-9
		for(int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());	//쓰래드 이름 출력
			thread.start();
		}
		
		System.out.println("=====================================");
		//3. 쓰래드 이름 직접 지정 : 객체명.setName()
		for(int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			thread.setName(i + " : 번째 쓰래드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("==================================");
		//4. 쓰래드의 이름 출력 (자동출력) - 내가 할당하지 않으면 JVM이 쓰래드 이름을 자동 할당 - Thread - 0 ,,,Thread-9
				for(int i = 0; i < 10; i++) {
					Thread thread = new Thread();
					System.out.println(thread.getName());	//쓰래드 이름 출력
					thread.start();
					try {Thread.sleep(1000);} catch (InterruptedException e) {}	
				}
				
		//5. 쓰래드 수 출력 하기
		System.out.println("동작하는 쓰래드수 : " + Thread.activeCount());
		
		
		
		
	}

}
