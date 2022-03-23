package chap12.EX01;

abstract class ABC{
	abstract void cry();	
	abstract void fly();
}

class Cat extends ABC{

	@Override
	void cry() {
		System.out.println("야옹");
	}

	@Override
	void fly() {
		System.out.println("날 수 없다");
	}
	
}

class Eagle extends ABC{

	@Override
	void cry() {
		System.out.println("끼룩");
		
	}

	@Override
	void fly() {
		System.out.println("날 수 있다");
	}
	
}

public class EX_AbstractClass {

	public static void main(String[] args) {

		//1. 자식 클래스 Cat, Eagle클래스를 생성후 출력
		ABC abc1 = new Cat();
		ABC abc2 = new Eagle();
		
		abc1.cry();
		abc1.fly();
		
		abc2.cry();
		abc2.fly();
		
		//2. 익명 클래스 생성후 출력
		
		ABC abc3 = new ABC() {
			void cry() {
				System.out.println("멍멍");
			}

			@Override
			void fly() {
				System.out.println("날 수 없다.");
			}
		};
		
		abc3.cry();
		abc3.fly();
	}
}
