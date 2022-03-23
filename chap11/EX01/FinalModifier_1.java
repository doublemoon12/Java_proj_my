package chap11.EX01;

/* Final 	: 마지막
 * 			-필드명, 지역변수명 	: 상수, final double PI = 3.14;
 * 				: 상수는 값을 변경할 수 없다.
 * 				: 클래스영역내의 상수영역에 값이 복사 ,객체나 메소드가 사라질경우에도 복사 가능
 * 			-메소드명			: 오버라이딩이 불가한 메소드(자식클래스에서 부모클래스로 메소드 오버라이딩 불가)
 * 				: final void print(){}
 * 			-클래스명			: 상속이 불가한 클래스
 * 				: fianl class A{} <== 자식클래스를 두지 않는 마지막 클래스
 */

class A1{
	int a = 3;			
	final int B = 5;	//상수명 대문자로 사용. 값을 변경할 수 없다.
	A1(){}
}

class A2{
	int a;
	final int B;
	A2(){
		a = 3;
		B = 5;
	}
}

class A3{
	int a = 3;
	final int b = 5;	//상수 	: 값을 변경 불가
	A3(){
		a = 5;
		//b = 10;		//final은 값을 수정 할 수 없다.
	}
}

class B1{
	void bcd() {	//지역변수 : 메소드에서 선언한 변수(메소드 호출이 끝나면 지역변수는 사라짐)
		int a = 3;	//스택 공간에 변수의 값이 할당. 메소드 호출이 끝나면 사라짐
		final int B = 5;	//상수는 클래스 영역의 상수영역에 복사가 되어서 메소드가 끝나더라도 상수영역에 남아있음
		a = 7;
		//B = 9;	//fianl값 수정 불가
	}
}


public class FinalModifier_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
