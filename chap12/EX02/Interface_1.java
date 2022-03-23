package chap12.EX02;

//인터페이스(interface) : 외부와 내부를 연결해 주는 접점... 콘센트(외부 전기장치 >> 콘센트를 통해 << 전기)
						// 리모컨(사람, TV) , API 
	//객체 생성 불가, 타입은 설정 가능
	//모든 필드는 반드시 public static final이 들어감
	//모든 메소드는 public abstract가 들어가지만 생략되어있다. 1.8 : (default 메소드 제외)

interface A{	//정식 표현
	public static final int A = 3;	//Interface 필드의 정식 표현
	public abstract void abc(); 	//Interface 메소드의 정식 표현
}

interface B{	//생략된 구현
	int A = 3;
	void abc();		//추상메소드
}

abstract class C{			//추상 클래스 일때는 abstract키가 생략될 수 없다.
	abstract void abc();	//생략시 오류
}

public class Interface_1 {

	public static void main(String[] args) {
		//인터페이스는 객체 생성 불가. 구현되지 않는 메소드가 포함되어 있기 때문에
		//A a = new A();	//A가 인터페이스이므로 객체 생성 불가
		//1. 인터페이스의 static 필드의 내용을 출력
		
		System.out.println(A.A);	//인터페이스의 필드 출력, A <== static
		System.out.println(B.A);
		
		//2.final이 적용되어 있기 때문에 값을 수정 불가
		//A.A = 5;	//final일 설정되어 있기때문에 설정 불가
		//B.A = 5;
	}

}
