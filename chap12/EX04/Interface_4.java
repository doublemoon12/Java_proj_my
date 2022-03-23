package chap12.EX04;

//인터페이스 상속시 자식 클래스 접근 지정자 오류
	//인터페이스의 메소드를 구현 할때 반드시 public을 사용해야 한다.
interface A {
	public abstract void abc();
}

class F implements A{	//F 클래스는 완성된 메소드가 구현되어 있어야 한다.

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}	
	
}

interface B{	//public abstract가 생략 되었다.
	void abc();
}

class C implements A{
	public void abc() {	//A인터페이스의 abc()를 오버라이딩해서 구현한 메소드
					//자식은 부모보다 접근지정자가 같거나 넓어야 한다.
	}
}

class D implements B{
	public void abc() {		//인터페이스의 메소드를 구현할 떄는 반드시 public 접근지정자를 사용해야 낫다.
	}
}

class E implements B{

	@Override
	public void abc() {
		
	}
	
}
public class Interface_4 {

	public static void main(String[] args) {

	}

}
