package chap13.EX10.EX01;

class A{
	B b;	//B		: �������̽� Ÿ��, b		: ���� ����
			//b		: null
				//1. ��ü ������ ���� �Ҵ�.
				//2. �����ڸ� ���ؼ� ���� �Ҵ�.
				//3. setter�� ���ؼ� ���� �Ҵ�.
	
	A(){}		//�⺻ ������
	A(B b){
		this.b = b;
	}
	
	public void setB(B b) {
		this.b = b;
	}
	
	interface B{
		void play();
		void stop();
	}
	
	void abc() {	//play()������,stop()������
		b.play();
		b.stop();
	}
	
}

public class InnerInterface_1_1 {

	public static void main(String[] args) {
		A a = new A();		//3. setter�� �̿�
		a.setB(new A.B() {	//�������̽� : A.B

			@Override
			public void play() {
				System.out.println("�÷��� ��ư");
			}

			@Override
			public void stop() {
				System.out.println("��ž ��ư");
			}
		});
		a.abc();
		
		System.out.println("==============================");
		
		A a1 = new A();		//1. ��ü ������ �� �Ҵ�
		a1.b = (A.B) new A.B() {
			public void play() {System.out.println("±±");};
			public void stop() {System.out.println("���� �ϴ��� ���ϴ�.");};
		};		
		a1.abc();
		
		System.out.println("=============================");
		
					//2. �����ڸ� �̿��ؼ� ���� �Ҵ�
		A a2 = new A(		//������ ���ο� A.BŸ���� ��ü ���� �� ����
				new A.B() {
					
					@Override
					public void stop() {
						System.out.println("���� ����");
					}
					
					@Override
					public void play() {
						System.out.println("���� ����");
					}
				}
				);
		a2.abc();
		
		
		
		
		
		
	}

}
