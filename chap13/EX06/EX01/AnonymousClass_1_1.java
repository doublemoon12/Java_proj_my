package chap13.EX06.EX01;
//1. 인터페이스의 추상메소드를 구현한 객체를 생성후 호출 : 빈번하게 사용하늕 경우
interface A{	//인터페이스, 추상 베소드를 정의
	public abstract void cry();		//추상메소드이고, public abstract생략
	void fly();
}

class B{
	
	A a = new C();
	void abc() {
		a.cry();
		a.fly();
	}
	
	class C implements A{	//class C는 A 인터페이스를 구현한 클래스

		@Override
		public void cry() {
			System.out.println("멍멍");
		}

		@Override
		public void fly() {
			System.out.println("날지 못합니다.");
		}
		
	}
}


public class AnonymousClass_1_1 {

	public static void main(String[] args) {

		B b = new B();
		b.abc();
		
		
	}

}
