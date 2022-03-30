package Chap16.EX11;

//제너릭 클래스의 상속 : 자식 클래스는 부모 클래스의 제너릭 변수(K,V,T,E)왁 같거나 더많아야 한다.

class Parent<T>{
	T t;	//default

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T>{	//제너릭클래스를 상속 받는 자식 클래스는 부모의 타입의 인자갯수와 같거나 커야한다.
	
}

class Child2<T, V> extends Parent<T>{
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}

public class InheritanceGenericClass {

	public static void main(String[] args) {
		//1. 부모 제너릭 클래스 생성
		Parent<String> p = new Parent<String>();	//전체 완성된 구문
		//Parent<String> p = new Parent();	//뒤의 생성자 호출시에는 생략가능
		//Parent<String> p = new Parent<>();
		
		p.setT("부모의 제너릭 클래스");
		System.out.println(p.getT());
		
		Parent<Integer> i1 = new Parent();
		i1.setT(1);
		System.out.println(i1.getT());
		
		//2. 자식클래스1
		Child1 <String> c1 = new Child1();
		c1.setT("자식1 제너릭 클래스");		//부모에서 상속된 메소드
		System.out.println(c1.getT());
		
		//3. 자식클래스2
		Child2 <String, Integer> c2 = new Child2<>();
		c2.setT("자식2 - 제너릭 클래스");	//부모 클래스의 메소드
		c2.setV(100); 					//자식 클래스의 메소드
		System.out.println(c2.getT());
		System.out.println(c2.getV());
		
		
	}

}
