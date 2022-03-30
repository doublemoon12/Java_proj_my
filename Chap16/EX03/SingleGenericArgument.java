package Chap16.EX03;

//Object		: 모든 객체를 저장할 수 있지만, 다운캐스팅이 필요하다, 캐스팅시 예외가 발생할 수 있다.(약한 타입 체크)
//Generic class	: 하나의 클래스에서 다양한 데이터 타입을 처리 할 수 있다.
	//Generic 타입 변수 : T(타입), K(Key), V(Value), N(Number, 숫자), E(Element, 원소)
		//A ~ Z 까지 임의로 넣을 수 있다.
		//wrapper클래스가 올 수 있다. : 기본타입을 객체화 시켜 놓은 클래스이다.
			//int (기본타입) ==> Integer(객체), boolean ==> Boolean, char ==> Charter, double ==> Double, float ==> Float
			//byte ==> Byte, short ==> Short, long ==> Long, 
//Generic class
class MyClass<T>{
	private T t;
	
	public T get() {		//getter : 필드의 값을 가져옴
		return t;
	}
	public void set(T t) {	//setter : 필드의 값을 할당
		this.t = t;
	}
	
}
	


public class SingleGenericArgument {

	public static void main(String[] args) {
		//1. Generic class 객체 생성	자료형<String>을 입력
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		//2. Generic class 객체 생성	자료형<Ineger>를 입력
		MyClass<Integer> mc2 = new MyClass<Integer>();	//wrapper 클래스를 할당 헤애 한다.
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3. Generic class 객체 생성	자료형<Double>를 입력
		MyClass<Double> mc3 = new MyClass();	//생성자의 자료형은 생략 가능
		mc3.set(100.33);
		System.out.println(mc3.get());
		
		//4. 강한 타입 체크(컴파일 단계에서 오류를 출력해줌)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();
		mc4.set(true);
		mc4.set(false);
		//mc4.set("안녕");	//강한 타입 체크, 실행시에 오류를 방지 시켜줌
		
		
		
		
	}

}
