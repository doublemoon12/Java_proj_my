package chap13.EX04;

//지역 이너클래스	: 클래스의 메소드 내부에 선언된 클래스
	//메소드 내부의 필드는 final키가 자동으로 할당
	//지역 이너클래스에서 사용되는 변수는 자동으로final로 선언된다. 생략시 컴파일러가 자동응로 할당
class A{
	int a = 3;	//필드 : Heap, 반드시 초기화가 강제로 진행됨.
				//필드의 초기값을 할당 후에 값을 수정 할때는 객체화 하여 값을 수정 
				//생성자나 setter를 통해서 초기값을 할당 후에 객체를 생성
	void ccc() {	//지역변수 : 메서드 내부의 변수, 메모리의 스택 공간에 저장
		int a = 3;
		a = 4;
		a = 10;	
		int b;
		b = 0;
		
		System.out.println(a);	
		System.out.println(b);	//b는 초기값 할당하지 않음, 값을 강제 초기화 시키지 않음
		
		
	}
	
	
	void abc() {//지역변수	: 메소드 내부에 선언된 변수 (final)이 컴파이러에 의해서 할당됨
		//자동으로 final 키가 컴파일러에 의해서 자동으로 할당
		int b = 5;
		//b = 10;
		int c = 10;
		c = 20;
		
		class B{	//지역 이너클래스
			
			void bcd() {	 
				System.out.println(a); 		//필드
				System.out.println(b);		//지역변수	:값 수정 불가
				a = 5;
				//b = 7;	//지역클래스 내부에 선언된 지역변수는 자동으로 final키가 컴파일 된다.
			}
		}
		B bb = new B();
		bb.bcd();
		
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {
		//1. 객체를 생성후 메소드 호출
		 A a = new A();
		 
	}

}
