package chap14.EX02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//Checked Exception(일반 예외)	: 컴파일 단계에서 예외가 발생.
//	컴파일 하기(빌드)전에 예외처리 한다.	*.java ==> *.class, 
		

//unChecked Exception(실행예외), Runtime Exception	: 실행시에 예외가 발생 될 수 있다.
	//예외처리가 필수는 아니지만 그냥 해주면 된다.

class A{
	B b;	//b = null
	A(){}	//기본 생성자
	A(B b){
		this.b = b;
	}
	
	
	interface B{	//인터페이스 선언
		void cry();
	}
	void abc() {
		System.out.println(b);
		b.cry();
	}
	
}
	

public class CheckedException {

	public static void main(String[] args) {
		//1. 일반 예외		: 컴파일 단계에서 예외처리가 필요.
		
		//InterruptedException	: 스레드 중간에 끼어들기가 발생하면 예외가 발생
		//Thread.sleep(1000);
		
		//ClassNotFoundException	: 클래스를 찾지 못하는 예외가 발생될 수 있다.
		//Class cls = Class.forName("java.lang.Object");
		
		//IOException	: 네트워크에서 값(정보)을 못읽어 올 수 있는 예외
		//System.in		: 콘솔을 뜻함.
		InputStreamReader in = new InputStreamReader(System.in);
		//in.read();
		
		//FileNotFoundException		: 파일을 찾지 못하는 예외가 발생
		//FileInputStream fis = new FileInputStream("text.txt");
		
		//실행예외(unChecked Exception)	: 실행시에 발생되는 예외
		
		//NullPointException	: 객체가 Null인 상태에서 객체의  필드나 메소드 호출
		A a1 = new A();
		//a1.abc();			//컴파일시에는 예외가 발생되지 않고 실행시 발생
		
		
	}

}
