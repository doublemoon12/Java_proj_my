package Chap06_07.EX06;

class Aaa{
	int m = 3;			//필드(인스턴스 필드) : 객체를 생성후에 사용가능
	static int n = 4;	//필드(static 필드) : 객체 생성없이 사용가능, 객체 생성 후에도 사용가능
							//모든 객체가 공유하는 변수
	void print1() {		//인스턴스 메소드 : 객체를 생성후 호출 가능
		//인스턴스 메소드는 인스턴스 필드와 스태틱 필드가 올수 있다.
		System.out.println("인스턴스 메소드 출력" + " : m : " + m + ", n : " + n);
	}
	
	static void print2() {		//스태틱 메소드 : 객체 생성 없이 호출, 객체 생성후에도 호출
		//static메소드 내에서는 인스턴스 필드가 올 수 없다. static필드만 와야한다.
		//static메소드는 객체 생성 없이도 호출이 되지만 인스턴스 필드는 객체가 없으면 안된다. 
		System.out.println("static 메소드 출력" + ": n : " + n);
	}
	
}

public class Static_1 {

	public static void main(String[] args) {

		//1. 객체 생성후 필드와 메소드 호출 (인스턴스 필드, 스태틱 필드, 인스턴스 메소드, 스태틱 메소드) 모두 호출
		Aaa aaa = new Aaa();
		aaa.m = 10;		//인스턴스 필드 호출
		aaa.n = 20;		//스태틱 필드 호출
		aaa.print1();	//인스턴스 메소드
		aaa.print2();	//스태틱 메소드
		
		
		//2. 객체 생성없이 클래스명으로 스태틱 필드와 메소드 호출 (스태틱 필드, 스태틱 메소드)
		Aaa.n = 100;	//스태틱 필드 : 클래스 명으로 호출됨
		Aaa.print2();	//스태틱 메소드 : 클래스 명으로 호출됨
		
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n);
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);
		
		eee.n = 300;
		System.out.println("=========static필드가 적용된 필드는 모든 객체에서 공통으로 바라보는 변수=========");
		
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
	}

}
