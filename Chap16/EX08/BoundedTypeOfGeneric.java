package Chap16.EX08;

class A {}
class B extends A {}
class C extends B {}

//제너릭 타입 클래스 : 제너릭 타입의 들어오는 객체를 제한을 둠.
class D <T extends B>{	//T : classB와 classC만 올 수 있다.
						//<T extends B> 의미 : T 타입에 접근을 제한
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class BoundedTypeOfGeneric {

	public static void main(String[] args) {

		//D<A> d1 = new D<A>();	//불가능 : <T>에 들어갈 객체를 제한을 둠 B, C 클래스만 타입 지정 가능
		D<B> d2 = new D<B>();	//B, C를 타입으로 설정 가능
		D<C> d3 = new D<C>();	//C를 타입만 저장 가능
		
		D d4 = new D();			// = D(B), D(C) 올 수 있다. 타입을 지정하지 않고 객체를 만들면 최상위 타입으로 설정됨
								// = D<B> d2 = new D<B>();
		
		d2.setT(new B());		//B 객체 저장.
		d2.setT(new C()); 		//C 객체 저장.
		//d2.setT(new A());		//오류
		
		//d3는 C타입 객체만 올수 있다.
		//d3.setT(new B());	//오류 발생
		d3.setT(new C());
		
		//d4.setT(new A());	//오류 발생
		d4.setT(new B());
		d4.setT(new C());
		
		
	}

}
