package chap10.ex02;

//다형성(Polymorphsim) : 객체의 상속관계에서 여러 데이터 타입으로 변환 가능

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphsim {

	public static void main(String[] args) {
		//1. 업캐스팅(자동으로 변환) : 생략시 컴파일러가 자동으로 추가;
		A ac = (A) new C();		//C는 A로 변환이 된다. ,ac는 D를 제외한 모든 클래스의 필드와 메소드를 포함하고 있지만 A타입의 필드와 메소드만 접근가능
		A ab = new B();			//업캐스팅 할때는 부모타입을 생략해도 상관 없다, ab는 A, B클래스의 필드와 메소드만 포함, A의 필드와 메소드에만 접근 가능
		B bd = new D();			//D는 B롤 업캐스팅 된다, bd는 A,B,D의 필드와 메소드가 포함되고, A,B의 필드와 메소드를 사용가능하다
		C c = new C();			//C는 C다. C는 상속관계에 의해서 A,B,C의 필드와 메소드가 포함 되어 있고, A,B,C모두 접근 가능하다
		
		//객체 생성을 할수 없는 경우(상속)
		//B b = new A();	//오류
		//C cc1 = new B();
		//D dd1 = new B();
		//C cd = new D();
		
		//2. 다운 캐스팅 : 부모 ==> 자식 (수동변환) : 캐스팅이 불가능 하면 (실행시 런타임 오류 발생)
		A aa = new A();			//aa는 A타입만 내포
		//B b1 = (B) aa;		//A를 B로 다운 캐스팅(수동 변환) <== 실행시 오류 발생
				//java.lang.ClassCastException: 다운 캐스팅시 객체 내의 해당 타입이 존재하지 않는경우
		//C c = (C) aa;	//aa는 C 타입을 내포하지는 않는데 다운 캐스팅을 할경우 (실행시 오류)
		
		//컴파일 오류 : 프로그램 실행전 이클립스가 체크
		//런타임 오류 : 실행시 발생되는 오류
		
		//3. 다운 캐스팅이 가능한 경우(수동변환) : 객체 내부에 자식 데이터 타입을 가지고 있으면 캐스팅 가능
		A ac3 = new C();	//ac3는 A, B, C 포함. A만 사용 가능
		
		B ac5 = (B) ac3;	//A -> B 타입으로 다운 캐스팅
		C ac6 = (C) ac3;	//A -> C
		
		A ad2 = new D();	//ad는 A, B, D포함 , A만 사용가능
		B bd3 = (B) ad2;
		D dd4 = (D) ad2;
		
		
		
		
		
	}

}
