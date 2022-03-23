package chap13.EX05;

//지역 이너클래스의 컴파일 이후 생성 클래스 파일
//지역 이너크래스	: 메소드 내부에 선언된 클래스

class A{			//A.class
	void abc() {
		class B{}	//A$1B.class
		class C{}	//A$1C.class
	}
	
	void bcd() {
		class C{}	//A$2C.class
		class D{}	//A$1D.class
	}
	
	void cde() {
		class B{}	//A$2B.class
	}
	
}

public class InnerClass_5 {

	public static void main(String[] args) {

	}

}
