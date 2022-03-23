package chap13.EX02;

/*이너클래스에서 외부 클래스의 필드와 메소드 접근 방법
*오버라이딩		:1. 부모와 자식이 상속관계가 있어야 한다.
*			:2. <<인스턴스 메소드만 오버라이딩 가능>>
*			:3. 인스턴스 필드, static 필드, static 메소드는 오버라이딩 되지 않는다.
*/


class A{
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	
	void abc() {	//오버라이딩이 아니고 외부 내부 클래스의 동일한 메소드는 별개의 공간에 위치해있다.
		System.out.println("A 클래스의 abc()입니다.");
	}
	
	class B{	//이너클래스에서 외부 클래스의 중복된 필드나 메소드 호출할 경우 : A.this
		int a = 5;
		int b = 6;
		
		void abc() {	//오버라이딩이 아니라 별개의 메소드 입니다.
			System.out.println("B 클래스의 abc()입니다.");
		}
		
		void bcd() {
			//1. 자기자신(Inner클래스)의 필드와 메소드 호출
			System.out.println(a);
			System.out.println(b);
			abc();
			//2. Outer클래스의 필드와 메소드 호출
			System.out.println(A.this.a);	//상속관계가 아니기때문에 super를 사용하면 안된다.
			System.out.println(A.this.b);
			A.this.abc();
			//3. Outer클래스의 핃드와 메소드 호출
			System.out.println(c);
			System.out.println(d);
		}
	}
	
}



public class InnerClass_2 {

	public static void main(String[] args) {
		//1. 외부클래스 객체 생성
		A a = new A();
		//2. 이너클래스 객체 생성
		A.B b = a.new B();
		b.bcd();
		
		System.out.println("=======================");
		
		//3. 내부 클래스의 필드와 메소드 호출
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
		
	}

}
