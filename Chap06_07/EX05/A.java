package Chap06_07.ex05;

	//접근제어자(캡슐화 : 데이터를 외부로부터 보호하는 역할을 함) : Public, protected, default, private
		//클래스 이름 앞에 할당, 필드명, 메소드명, 생성자명 <== 접근제어자가 반드시 할당이 되어 있다.
		//클래스 이름 앞에는 두가지 접근제어자만 사용가능 : Public, default

public class A {
	
	int m = 3;	//필드의 기본 접근 제어자는 default : 기본적으로 생략되어 있음, 같은 패키지 내에서만 접근이 가능
	int n = 4;			//default: 다른 패키지의 클래스에서는 접근이 불가능.
						//접근제어자 private : 외부 클래스에서 접근이 불가능
	
	public int k = 10;	//public은 다른 패키지에서 접근이 가능하다.
	
	
	void print() {	//default : 같은 패키지내의 클래스에서만 사용가능.
		System.out.println("임포트 성공" + m + " , " + n);
	}
	
	public void print2() {
		System.out.println("외부 패키지의 다른 클래스에서 접근 가능 " + k);
	}
	
	
	public static void main(String[] args) {
		
		
		
	}

}
