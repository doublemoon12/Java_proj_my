package Chap06_07.EX06;

import Chap06_07.EX05.Bb;	//다른 패키지의 클래스에서 클래스를 import 할때 public 접근 제한자가 부여되어 있어야 한다	

// import Chap06_07.EX05.B;	//class B는 클래스 접근 제어자가 default임으로 다른 패키지에서 접근이 불가능 하다. 

public class ExternalClass_2 {

	public static void main(String[] args) {
		
		//B b = new B();	//오류
		
		//다른 패키지의 클래스에서 Bb클래스를 접근하는 경우
			//1. import를 먼저 사용
			//2. Bb클래스의 클래스 접근 제한자는 public이 들어가 있어야한다.
			//3. 필드, 메소드의 접근 제한자에 따라서 접근이 가능 할 수도 있고 불가능 할 수도 있다. 가능(protected(상속관계), public), 불가능(private, default)
		
		Bb bb = new Bb();	//다른 패키지의 클래스 : 1. 클래스 접근 제어자에 public
		
		bb.print4();
		
		//bb.a = 1;	//private :같은 클래스 내에서만 접근
		//bb.b = 2;	//default :같은 패키지 내에서 접근 가능
		//bb.c = 3;	//protected :default 포함 + 다른 패키지에서 접근이 가능(상속관계일때만)
		bb.d = 12;	//public : protected를 포함하고 있고 다른패키지에서 접근가능(상속관계필요 없다)
		
		//메소드 접근
		//bb.print1();	//private
		//bb.print2();	//default
		//bb.print3();	//protected 외부의 다른 패키지에서 접근 하려면 상속관계가 필요.
		bb.print4();	//public
	}

}
