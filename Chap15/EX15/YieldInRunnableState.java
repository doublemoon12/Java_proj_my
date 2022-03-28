package Chap15.EX15;

//Thread.yield()	: �������� ���� ����(RUNNABLE)�� �ִ� Ư�� �����忡�� �ڽ��� ������� �Ͻ� �纸 
	// ������� ���ο��� �ٸ� �����带 ���� ���� �ϵ��� �纸.
	// ����ȭ���� key�� ���� �����ϴ� ������ �߻��Ǵµ�

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while (true) {	//���� ����
			if(yieldFlag) {
				Thread.yield(); 	//yieldFlag�� True�϶� �����带 �纸 ���ش�.
			}else {
				System.out.println(getName() + "����");
				for(long i = 0; i < 100000000L; i++) {}	//0.5�� �ð� ����
			}
		}
	}
}

public class YieldInRunnableState {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;	//false�϶� ������ ���� ���
		thread1.setDaemon(true);	//������ �����尡 ���� �ɶ� ����, while ���� ������ ���� ���������� ����
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;	//false�϶� ������ ���� ���
		thread2.setDaemon(true);	//������ �����尡 ���� �ɶ� ����
		thread2.start();
		
		//������ 6�� ����(1�ʸ��� �ѹ��� �纸)
		for(int i = 0; i < 3; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			thread1.yieldFlag =! thread1.yieldFlag;		//���϶� ����, �����϶� �� ����
			thread2.yieldFlag =! thread2.yieldFlag;
			
		}
		
	}

}
