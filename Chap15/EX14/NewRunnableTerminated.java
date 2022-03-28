package Chap15.EX14;

//������ ����
	//1. NEW		: ������ ��ü ������ .start()�� ȣ��Ǳ��� ����
	//2. RUNNABLE	: .start()�� ȣ��Ǹ� run()������ �ڵ尡 CPU���� ����ǰ� �ִ� ����
	//3. TERMINATED	: run()�� ��� �ڵ尡 ����Ǹ� ������ ����
	//4. Timed wait	: Ư�� �ð� ���ȸ� ��� ����, Thread.sleep(ms), 
					//a.join(ms)	<== ���� �ڽ��� ������� 1�ʴ�� ���¿� �ְ�, a��ü�� ���� ���·� ���� ����(�纸)
					//Ư�� �ð��� ����Ǹ� ���� ���·ΰ�, ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� ������·� ���ư�
	//5. Block		: ����ȭ ó������ Lock�� �ɷ��� ������ ��� ���ܵ� ����, lock�� �� �����尡 Ű�� �ݳ��� ��� Ű�� ȹ���ؼ� ���� ���·� ��.
	//6. wait		: ������ ��� ����, ���� ������� �������� �� �� �ִ�. �ٸ� �����尡 ������� ��

public class NewRunnableTerminated {

	public static void main(String[] args) {
		
		//�������� ���¸� ���� �س��� Ŭ�����̴�. �� 6���� ���¸� ���� �� �� �ִ�.
		Thread.State state;		//state�������� 6���� ����� ���� ����
		
		//1. ��ü ����(NEW)	<== �͸� ���� Ŭ����
			//NEW : ������ ��ü ������ start()ȣ�� �Ǳ� ������
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i < 100000000L; i++) {}	//0.5�� ����, CPU���� ����
				//��ü ������ �ణ�� �ð��� �ʿ�.
				//�޸��� �Ҵ� �ð��� �ʿ�.
			}
		};
		
		state = myThread.getState();	//�������� ���¸� ������ �ͼ� state������ �Ҵ�.
		System.out.println("mtThread State : " + state);	//NEW
		
		//2. myThread ����
		myThread.start();		//�����带 ���۽� CPU���� �����
		state = myThread.getState();
		System.out.println("myThrad State : " + state);		//RUNNABLE
		
		//3. myThread����
		
			//myThread.join(); �� ������(main)�� ����ϰ�, myThread�� ó���϶�.
		try {myThread.join();} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread State : " + state);	//TERMINATED
		
		
		
		
		
	}

}
