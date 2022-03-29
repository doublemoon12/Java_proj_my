package Chap15.EX19;

//Waiting 	: 
	//a.join()	: �ڽ��� ������� Waiting�����̰� a��ü���� CPU�� �Ҵ�(Runnable)
			//a ��ü�� ������ �Ϸ�Ǹ� �ڽ��� �����尡(Runnable)�� �̵�
		//�ڽŽ������� ó���� ������ �ٸ� �������� ����� �޾Ƽ� ó���ؾ� �� ���
	//wait(), notify(), notifyAll()	<== ����ȭ �������� ����.
	//- wait()	: ����ȭ �� ������ wait()�� ������ Waiting���·� ����.
	//- notify(), notifyAll()�� wait()�� ������		<== �ݵ�� �ٸ� �����忡�� ������ �� �ִ�.

class DataBox{
	int data;	//���� �ʵ�
	synchronized void inputData(int data) {		//����ȭ �޼ҵ�
		this.data = data;
		System.out.println("�Է� ������" + data);	//data : �Ű����� ������ ���� ������
	}
	synchronized void outputData() {			//����ȭ �޼ҵ�
		System.out.println("��� ������" + data	);	//data : �޸��� data, this�����Ǿ� ����.
	}
}
public class Waiting_WateNotify_1 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		//ù��° ������ : ���� ��ü�� ���� �ִ� ������
		Thread t1 = new Thread() {		//�͸� ����Ŭ����
			@Override
			public void run() {
				for(int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		//�ι��� ������	: ���� ��ü�κ��� ���� �о���� �޼ҵ�
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
