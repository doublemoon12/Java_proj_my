package Chap16.EX07;

//제너릭 메소드 내부에서 사용 가능한 메소드 : Object클래스의 메소드만 사용 가능 하다.

class A{
	public<T> void method(T t) {
		//System.out.println(t.length()); 	//t.length() : String 클래스에서 글자수를 리턴해준다.(사용불가)
		System.out.println(t.equals("안녕"));//t.equals는 Object클래스의 메소드이므로 사용가능
	}
	
	public <T extends Object> void method2(T t){	// 그냥 T라고만 선언하면 [extends Object]가 생략되어 있는 것이다.
		System.out.println(t.equals("반갑습니다"));
		//System.out.println(t.);
	}
	
	public <T extends Object> void method3(T t) {
		//System.out.println(t.length());
		//System.out.println(t.);
	}
}


public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {

		A a = new A();
		a.<String>method("안녕");
		
		
	}

}
