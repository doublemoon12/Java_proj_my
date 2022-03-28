package chap13.EX09.EX01;

interface A{
	void cry();
	void fly();
}

class C{
	void abc(A a) {
		a.cry();
		a.fly();
	}
}


public class AnonymousClass_4_1 {

	public static void main(String[] args) {
		//1. 클래스x + 참조변수
		C c = new C();
		A a = new A() {

			@Override
			public void cry() {
				System.out.println("강아지는 멍멍");
			}

			@Override
			public void fly() {
				System.out.println("강아지는 날지는 못합니다.");
			}
			
		};
		c.abc(a);
		
		System.out.println("=====================");
		
		//2. 클래스x + 참조변수x
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("고양이는 야옹");
			}
			@Override
			public void fly() {
				System.out.println("고양이도 날지 못합니다.");
			}
		});
		
		
		
	}

}
