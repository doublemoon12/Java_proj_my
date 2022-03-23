package chap13.EX08;

//클래스 정의 및 참조 변수 사용/ 미사용인 경우 매개변수로 객체를 전달

interface A{
	public abstract void abc();
}

//1. 자식클래스를 직접 생성
class B implements A{
	@Override
	public void abc() {
	System.out.println("매개변수 전달");	
	}
}

class C{		//cde메소드에 인풋값으로 A 타입의 객체 a를 인풋으로 받는다.
	void cde(A a) {		//cde메소드를 호출하면서 매개변수 값으로 A타입의 객체를 전송한다.
		a.abc();
	}
}

public class AnonymousClass_3 {

	public static void main(String[] args) {

	//1번쨰 방법	: 클래스명 + 참조 변수명
	C c = new C();	
	
	A a = new B();	//클래스명(B), 참조 변수 생성(a)	<===첫번째 방법
	
	c.cde(a);		//매개변수에 객체a를 생성해서 던저줌
	
	System.out.println("======================================");
	
	//2번째 방법	: 클래스명 + 참조 변수명x
	c.cde(new B());
	
	
	}

}
