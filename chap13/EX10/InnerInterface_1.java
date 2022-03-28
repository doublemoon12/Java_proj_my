package chap13.EX10;

//이너인터페이스 (InnerInterface)	: 클래스 내부의 인터페이스가 선언, 외부클래스 간단하게 사용할 목적으로
	//클래스 내부에 선언.
	//static이 자동으로 컴파일러에 의해서 생성.	<== 주의

class A{
	interface B{	//static이 컴파일러에 의해서 자동으로 추가	//클래스A에서만 사용 할 것이기 때문에 내부에 선언
		void bcd();		//인터페이스 이기 때문에 public abstract생략
	}
}

//이너 인터페이스를 구현한 클래스 C
class C implements A.B{		//A.B 	: A클래스의 이너인터페이스B를 뜻함, A,B : A인터페이스, B인터페이스를 뜻함
	@Override
	public void bcd() {
		System.out.println("이너인터페이스를 구현한 클래스C");
	}
}


public class InnerInterface_1 {

	public static void main(String[] args) {
		
		//1. 자식객체를 직접 생성 후 출력(자식클래스가 존재하는 경우
		A.B ab = new C();	//부모의 타입으로 업캐스팅 후 오버라이딩을 통해서 출력하는 경우
		ab.bcd();
		
		C c = new C();		//자기 자신타입을 직접 호출
		c.bcd();
		
		//2. 익명 이너클래스로 출력(자식 클래스 없이 출력)
		A.B b = new A.B() {		//A.B	: A클래스 내부의 인터페이스(이너 인터페이스)
			@Override
			public void bcd() {
				System.out.println("익명 이너클래스 객체 생성후 출력");
			}
		};		
		b.bcd();
	}

}
