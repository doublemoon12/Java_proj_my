package chap14.EX08;

//사용자 정의 Exception
//1. Exception을 상속하는 예외			: Checked(일반예외) Exception - 컴파일 단계에서 예외처리 필요
//2. RuntimeException을 상속하는 예외	: UnCkecked(실행예외) Exception

class MyException extends Exception { // 일반 예외
	public MyException() { // 기본 생성자
		super();
	}

	public MyException(String message) { // 예외 메세지 출력시 사용
		super(message);
	}
}

class MyRTException extends RuntimeException { // 실행예외
	public MyRTException() {
		super();
	}

	public MyRTException(String message) { // 예외 발생시 메세지를 출력해주는 생성자
		super(message);
	}
}

class A {
	// 1. 사용자 정의 예외 객체 생성 (일반 예외 객체)
	MyException me1 = new MyException(); // me1은 기본생성자 호출
	MyException me2 = new MyException("예외 메세지 : MyException"); // 예외가 발생할 때 예외 메세지를 출력하는 생성자 호출

	// 2. 런타임 예외 객체
	MyRTException mre1 = new MyRTException(); // 기본생성자
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException");

	// 예외를 강제로 발생 시키기(throw)
	void abc_1(int num) {

		try {
			if (num > 70) { // abc_1()
				System.out.println("정상작동");
			} else {
				throw me2; // 예외를 강제로 발생 시킴
			}
		} catch (MyException e) {	//me1에 강제로 throw를 사용해서 예외를 발생시킴
			System.out.println("70이하 값을 넣었습니다, 70초과 값을 넣어주세요");
			System.out.println(e.getMessage());
		}
	}
	void bcd_1() {
		abc_1(65);		//예외가 발생
	}
	
	//예외의 전가(throws)
	void abc_2(int num) throws MyException {
		if(num > 70) {
			System.out.println("정상 작동");
		}else {
			throw me2;	//강제 예외 발생
		}
	}
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("70이상의 값을 넣으세요");
			System.out.println(e.getMessage());
		}
	}
}

public class CreatUserException_1 {

	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();		//예외를직접 구현
		a.bcd_2();		//throws로 예외 전가, 호출하는 쪽에서 예외 처리
		
	}

}
