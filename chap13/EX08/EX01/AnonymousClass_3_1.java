package chap13.EX08.EX01;

//3. 메소드의 매개 변수로 전달
//3-1	: 객체 생성후 매개변수로 전달 (클래스명 + 참조 변수)
//3-2	:

interface A{	//인터페이스, 추상 베소드를 정의
	public abstract void cry();		//추상메소드이고, public abstract생략
	void fly();
}

class B implements A{	//B는 A인터페이스를 구현한 클래스

	@Override
	public void cry() {
		System.out.println("멍멍 : 매개변수 전달 후 출력");
		}

	@Override
	public void fly() {
		System.out.println("날지 못합니다 : 매개변수 전달 후 출력");
	}	

}
class C{	//C 객체의 abc메소드 호출시 A타입을 매개 변수로 받는다
	void abc(A a) {	//하위 자식 클래스가 매개변수로 들어올 경우 A타입으로 자동으로 업캐스팅됨
		a.cry();
		a.fly();
	}
}


public class AnonymousClass_3_1 {

	public static void main(String[] args) {

		//1. 클래스가 존재 + 참조 변수 생성
		C c = new C();
		A a = new B();	//B를 객체화 해서 A 타입으로 생성, a : 참조 변수
		
		c.abc(a);	
		
		System.out.println("========================");
		
		//2. 클래스가 존재 + 참조 변수는 없음
		c.abc(new B());
		
	}

}
