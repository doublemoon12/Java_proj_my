package Chap15.EX05;
/*
 * ������ 4�� ���� : 1. Thread�� ���, 2. Runnable ����, 3.�͸� ����Ŭ���� ����
 * �� ���� String�迭�� ������ ���
 * ù��°		�ι�°	����°	�׹�°
 * �̸�		ȫ�浿	�̼���	�Ż��Ӵ�
 * ����			
 * ����
 * ����
 * ����
 */

class First extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(0);
		} catch (InterruptedException e1) {
		}
		String [] firstArray = {"�̸�", "����", "����", "����", "����"};
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
		String [] secondArray = {"ȫ�浿", "30", "80", "60", "100"};
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
				String[] thirdArray = {"�̼���", "50", "100", "50", "60"};
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
				String[] fourthArray = {"�Ż��Ӵ�", "60", "100", "60", "70"};
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
