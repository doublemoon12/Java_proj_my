package Chap16.EX09;

//제너릭 메소드의 범위 지정

class A{	//일반 클래스내의 제너릭 메소드
	
	//Number : Boolean, Charator를 제외한 6개의 타입(Byte, Short, Integer, Long, Float, Double) 
	public<T extends Number> void method1(T t) {
		System.out.println(t.intValue());	//Number 타입의 메소드 .t.intValue(), 정수만 출력
	}
}

interface MyInterface{
	void print();	//public abstract 생략
}

class C implements MyInterface{		//인터페이스를 구현한 클래스
	
	public void print() {
		System.out.println("인터페이스를 구현한 클래스 - 출력");
	}
}

class B {	//제너릭 타입 내부에서 인터페이스를 적용할 때는 extends키를 사용한다.
	
	public<T extends MyInterface> void method2(T t) {	//T에 올수있는 타입은 MyInterface를 구현한 클래스만 올 수 있다. 
		t.print();
	}
}

class D{
	public <T extends String> void abc(T t){
		System.out.println(t); 		//String은 toString메소드가 재정의 되어있다.
		System.out.println(t.toString());
	}
}

public class BoudedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();	//일반 클래스 개체 생성 후 제너릭 메소드 호출
		a.<Double>method1(5.8);
		a.method1(22.5);		//매개 변수로 던지는 값이 타입을 식별 할 수 있는 경우 생략 가능
		a.<Long>method1(1000L);	
		a.<Float>method1(100.55555F);
		//a.<Boolean>method1(true);	//Charter랑 Boolean은 오류발생
		
		//method2에 매개변수로 올 수 있는 것은 인터페이스 타입, 인터페이스를 구현한 자식 클래스
		//인터페이스를 구현한 내부 익명 클래스,
		B b = new B();		
		b.<MyInterface>method2(new MyInterface() {
			public void print() {
				System.out.println("print() 익명 클래스로 출력");
			}
		}
				);			
		b.<MyInterface> method2(new C());	//매개변수로 인터페이스를 구현한 자식 객체
		
		//익명 클래스로 제너릭 메소드 호출후 매개변수로 던져주기
		
		b.method2(new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명으로 처리된 클래스 출력");
			}
		}); 	
		
		D d = new D();
		d.<String> abc("안녕");
		d.abc("하세요");
		
		
	}

}
