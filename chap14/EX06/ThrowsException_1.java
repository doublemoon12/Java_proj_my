package chap14.EX06;

/*
 * 예외처리 2가지 방법
 * 	1. 직접 처리 		: try, catch
 * 	2. 예외전가(미룬다)	: throws(메소드를 호출하는 쪽에서 예외를 처리 하도록 전가(미룬다)
 * 		throw : 강제로 예외 발생시킨다.
 */		

class A {		//메소드 내에서 예외처리를 직접 구현
	void abc() {
		bcd();
	}
	void bcd() {		
		
		try {
			Thread.sleep(1000);		//일반 예외 : InterruptedException
		} catch (InterruptedException e) {
			//e.printStackTrace();
			System.out.println("예외 발생 1");
		}		
	}
}

class B{
	void abc() {	//bcd()메소드의 예외를 처리할 의무를 가진다.(호출을 미루었기때문에)
		try {
			bcd();
		} catch (InterruptedException e) {
			//e.printStackTrace();
			System.out.println("예외 발생 2");
		}		
	}
	
	void bcd() throws InterruptedException{		//bcd()메소드를 호출하는 쪽에서 예외를 처리하도록 미룬다.
		Thread.sleep(1000);
	}
}




public class ThrowsException_1 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.abc();
		
	}

}
