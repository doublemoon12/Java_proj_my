package Chap06_07.ex06;

class Abc{		//외부 클래스 : public 제어자를 사용 못한다.(기본적으로 default) public제어자는 한개밖에 못쓴다
				//class : public과 default
				//접근제어자가 붙을수 있는 키워드 : class앞, 필드, 메소드, 생성자
				//반드시 접근 제어자가 할당 되어 있다. 생략되어있으면 default
				//접근제어자 :
					//1. public : 다른 패키지에서 접근 가능
					//2. protected : 다른패키지에서 접근이 가능(상속구현이 되어있어야한다)
					//3. default : 같은 패키지에서 접근이 가능, 같은 패키지에 존재하는 클래스는 import없이 사용.
					//4. private : 같은클래스 내부에서만 사용가능
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	//Abc(){} <== 기본 생성자 : 필드의 초기값을 부여해서 객체를 생성
	
	
	public void print1() {
		System.out.println("다른 패키지에서 접근 가능");
	}
	protected void print2() {
		System.out.println("다른패키지에서 접근 가능(상속관계가 구성될떄) : protected");
	}
	void print3() {
		System.out.println("같은패키지에서만 접근이 가능 : default");
	}
	private void print4() {
		System.out.println("같은 클래스에서만 접근인 가능");
	}
	
}					

public class Ex06_All {

	public static void main(String[] args) {

		Abc abc1 = new Abc();		//기본 생성자 호출
		//Abc : 클래스명, abc1 : 메모리에 로드할 객체명, new = 객체를 Heap 영역에 생성, Abc() = 생성자 호출
			//Abc() : 기본 생성자 : 생략 가능, Abc(){}
				//생성자 : 1. 클래스 이름과 동일한 메소드, 리턴타입이 없는 메소드 생성자
		
		abc1.a = 100;
		abc1.b = 200;
		abc1.c = 300;
		//abc1.d = 400;	오류 다른 클래스에서는 접근 불가
		
		abc1.print1();
		abc1.print2();
		abc1.print3();
		//abc1.print4(); 오류
		
	}

}
