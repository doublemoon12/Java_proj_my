package Chap16.EX10;

//제너릭 메소드에서 매개변수에서 값의 범위

class A {}
class B	extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{		//제너릭 클래스
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

class Test{		//일반 메소드들, 매개변수로 들어오는 타입이 제너릭 타입이다.
	void method1 (Goods<A> g) {}	//g의 매개변수로 A클래스의 객체만 들어올 수 있다.
	void method2 (Goods<?> g) {}	//g의 매개변수로 A,B,C,D클래스의 객체 모두 들어올 수 있다.
	void mehtod3 (Goods<? extends B> g) {}	//g의 매개변수로 B,C,D클래스의 객체만 들어올 수 있다.
	void mehtod4 (Goods<? super B> g) {}	//g의 매개변수로 B,A클래스의 객체만 들어올 수 있다.
}

public class BounedTypeOfInputArgument {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		//1. method1
		t.method1(new Goods<A>());	//정상 작동
		//t.method1(new Goods<B>());	//오류
		//t.method1(new Goods<C>());	//오류
		//t.method1(new Goods<D>());	//오류
		
		//2. method2
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//3. method3	
		//t.mehtod3(new Goods<A>());	//오류
		t.mehtod3(new Goods<B>());
		t.mehtod3(new Goods<C>());
		t.mehtod3(new Goods<D>());
		
		//4. method4
		t.mehtod4(new Goods<A>());
		t.mehtod4(new Goods<B>());
		//t.mehtod4(new Goods<C>());	//오류
		//t.mehtod4(new Goods<D>());	//오류
		
		
	}

}
