package chap10.EX04;

//메소드 오버라이딩과 접근 지정자와의 관계
	//자식의 클래스에서 부모의 메소드를 재정의 할 경우 접근 지정자는 부모와 같거다 넓어야 한다.

class Aaa{
	protected void abc() {}
}

class Bbb extends Aaa{
	@Override
	public void abc() {}
	
}

class B2 extends Aaa{
	@Override
	protected void abc() {}
}

class B3 extends Aaa{
	//@Override
	//void abc() {}	//오류 : 오버라이딩 할 메소드에 접근 지정자 문제(부모보다 접근지정자가 같거나 넓어야 한다.)
}

class B4 extends Aaa{
	//@Override
	//private void abc() {}	//오류 : 오버라이딩 할 메소드에 접근 지정자 문제
}


public class MethodOverriding_3 {

	public static void main(String[] args) {

		
		
	}

}
