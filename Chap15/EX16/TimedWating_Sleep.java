package Chap15.EX16;

//Thread.sleep(1000) ===> TimeWaiting���·� �̵� ===> Ư�� �ð�(1��)�� ����Ǹ� Runnable ���·� �̵�
										//	  ===> ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable
//�ν��Ͻ���(��ü��).join(1000)	 ===> TimeWaiting���·� �̵� ===> Ư�� �ð��� ����Ǹ� Runnable���·� �̵�
	//a.join(1000)	: �ڽ��� ������� 1�ʸ� ��ٸ��� a��ü���� cpu�Ҵ� (Runnable), 
					// 1�� �ڿ��� �ڽ��� �����嵵 Runnable���·� �̵�
//����) �ν��Ͻ���(��ü��)[a].join()	===> Waiting ���·� �̵� ===> 
		//�ڽ��� ������� ��� Waiting���·� ���� a��ü���� CPU��(Runnable)���·� �Ҵ�.
		//a ��ü�� ��� �Ϸ�� ��� �ڽ��� �����嵵 Runnable

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);	//3�ʵ��� TimedWaiting ���·� ����, 3���� �ڵ����� Runnable���·� �̵�
								//interrupt�� �߻��Ǹ� ���� �߻� ��Ű�� Runnable���·� �̵�
		} catch (InterruptedException e) {
			System.out.println("---sleep() ������ Interrupt �߻�");
			for(long i = 0; i < 100000000L; i++) {}	//�ð����� 0.5��
		}
	}
}

public class TimedWating_Sleep {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}	//������ ���� �غ�ð�
		System.out.println("MyThread State : " + myThread.getState());	//Timed_Waiting
		
		//3�� ������ ���ͷ�Ʈ ���� �߻�
		myThread.interrupt(); 	//TimedWaiting����
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State 2 : " + myThread.getState());	//runnable ����
		
		
		
		
	}

}
