package Chap06_07.ex06;

//정적 초기화 블록 : 생성자와 같이 static필드의 값을 호출시 초기화 하는 역할을 한다.(생성자와 비슷한 역할)

//생성자와 static블락
	//- 생성자 : 인스턴스 필드를 초기화, 정적 필드의 값도 초기화가능
	//- static 블락 : static필드의 값을 초기화, 인스턴스 필드의 값은 초기화 할 수 없다.
class E{
	int a;
	static int b;	//객체 생성 없이도 호출이 된다, 
	
	static {	//정적(static) 초기화 블록 : 객체 생성없이 클래스 명으로 호출할때 초기화 시켜주는 역할을 한다
		//a = 3;	//오류 발생, 인스턴스 필드 임으로 안됨
		b = 5;
		System.out.println("클래스 E가 로딩 되었습니다. 변수 b : " + b);
	}
	
	E(){	//생성자 : 객체화를 할때 필드의 값을 초기화 시켜준다.
		a = 3;	//인스턴스 필드 초기화
		b = 10;	//static 필드 초기화
	}
	
	
}


public class Static_3 {

	public static void main(String[] args) {
		
		System.out.println(E.b);		//객체 생성 없이 E.b의 값이 호출 될때 static 블락이 작동된다 : static의 값을 초기화 함. 
		
		
	}

}
