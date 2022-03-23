package chap13.EX03;

//static 이너 클래스	: 외부 클래스의 인스턴스 필드, 인스턴스 메소드 접근이 불가능 하다.
					//외부클래스의 static 필드나 static메소드는 접근이 가능함.

class A{
	int a = 3;	//인스턴스 필드, 객체화 해야 접근 가능.
	static int b = 4;	//스태틱 필드
	void method1() {	//인스턴스 메소드 : 객체 생성후 접근
		System.out.println("instance Method");
	}
	static void method2() {
		System.out.println("Static Method");
	}
	
	static class B{	//static 이너 클래스	: 외부 개체를 생성하지 않고 객체 생성이 가능
		void bcd() {
			//1. static 클래스에서 외부 클래스의 인스턴스 필드 접근 (접근 불가)
			//System.out.println(a); 		//외부 클래스의 인스턴스 필드(접근 불가)
			System.out.println(b); 		//static 이너클래스에서 외부 클래스의 static 필드나 메소드 접근 가능
			
			//2. 메소드 호출
			//method1();	//인스턴스 메소드 호출 불가
			method2();	//static 메소드 호출 가능
			
		}
	}
	
}

public class InnerClass_3 {

	public static void main(String[] args) {

		//1. Static이너클래스 객체생성
		A.B b = new A.B();	//static 이너클래스는 외부 객체 생성 없이 객체 생성
		b.bcd();
		
	}

}
