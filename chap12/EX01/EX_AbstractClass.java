package chap12.EX01;

abstract class ABC{
	abstract void cry();	
	abstract void fly();
}

class Cat extends ABC{

	@Override
	void cry() {
		System.out.println("�߿�");
	}

	@Override
	void fly() {
		System.out.println("�� �� ����");
	}
	
}

class Eagle extends ABC{

	@Override
	void cry() {
		System.out.println("����");
		
	}

	@Override
	void fly() {
		System.out.println("�� �� �ִ�");
	}
	
}

public class EX_AbstractClass {

	public static void main(String[] args) {

		//1. �ڽ� Ŭ���� Cat, EagleŬ������ ������ ���
		ABC abc1 = new Cat();
		ABC abc2 = new Eagle();
		
		abc1.cry();
		abc1.fly();
		
		abc2.cry();
		abc2.fly();
		
		//2. �͸� Ŭ���� ������ ���
		
		ABC abc3 = new ABC() {
			void cry() {
				System.out.println("�۸�");
			}

			@Override
			void fly() {
				System.out.println("�� �� ����.");
			}
		};
		
		abc3.cry();
		abc3.fly();
	}
}
