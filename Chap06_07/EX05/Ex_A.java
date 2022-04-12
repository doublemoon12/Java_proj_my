package Chap06_07.ex05;

//같은 패키지 내에서 class A를 접근

public class Ex_A {

	public static void main(String[] args) {
		// A class는 같은 패키지 내부에 존재 함으로 import를 사용하지 않고 사용
		
		A a = new A();		//import없이 사용 : A class가 같은 패키지 내에 존재 하기 때문
		
		a.m = 10;	//A class의 접근 제어자가 default 되어있기 떄문에 접근 가능(같은 패키지내에서만)
		a.n = 20;
		
		a.print();	// default 접근 제어자 이므로 접근 가능
	}

}
