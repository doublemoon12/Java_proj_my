package Chap15.EX05;
/*
 * 쓰래드 4개 생성 : 1. Thread를 상속, 2. Runnable 구현, 3.익명 내부클래스 생성
 * 각 값을 String배열에 저장후 출력
 * 첫번째		두번째	세번째	네번째
 * 이름		홍길동	이순신	신사임당
 * 나이			
 * 국어
 * 영어
 * 수학
 */

class First extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(0);
		} catch (InterruptedException e1) {
		}
		String [] firstArray = {"이름", "나이", "국어", "영어", "수학"};
		for(int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + " \t ");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class Second implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
		}
		String [] secondArray = {"홍길동", "30", "80", "60", "100"};
		for(int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " \t ");
			try {Thread.sleep(200);} catch (InterruptedException e) {}	
		}
	}
	
}

public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		Thread first = new First();
		
		
		Runnable second1 = new Second();
		Thread second2 = new Thread(second1);
		
		
		Thread third = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
				}
				String[] thirdArray = {"이순신", "50", "100", "50", "60"};
				for(int i = 0; i < thirdArray.length; i++) {
					System.out.print(thirdArray[i] + " \t ");
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread fourth = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(30);
				} catch (InterruptedException e1) {
				}
				String[] fourthArray = {"신사임당", "60", "100", "60", "70"};
				for(int i = 0; i < fourthArray.length; i++) {
					System.out.println(fourthArray[i] + " \t ");
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		first.start();
		fourth.start();
		third.start();
		second2.start();
		
		
		
	}

}
