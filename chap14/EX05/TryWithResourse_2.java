package chap14.EX05;

//직접 생성한 객체에서 AutoCloseable을 사용해 보기,
	// try(객체 생성 구문) {} catch {} : 자동으로 close()됨.	//try(with Resource)
	// 1. AutoCloseable 인터페이스의 close()를 오버라이딩 해야 한다.
	
	//java.lang.AutoClosseable	: java.lang클래스 <=== import문을 사용하지 않아도 된다.
	//java.lang.Object			: java.lang클래스는 import문이 필요가 없다.

	//예외를 처리하는 방법
		//1. try, catch를 사용해서 예외 처리		: 자신이 직접 예외를 처리하겠다.
		//2. throws를 통해서 예외를 처리하는 방법	: 예외를 내가 처리하지 않고 호출하는곳에서 처리하도록 미루는것
			//예외 전가. 메소드 블락에서 예외 전가
			//throw		: 예외를 강제로 발생 시킨다.

class A implements AutoCloseable{
	String resource;	//resource = null
		
	A (String resource){	//생성자의 매개변수로 String값을 받아서 메모리로 로딩
		this.resource = resource;
	}
	@Override
	public void close() throws Exception {	//close()가 자동으로 호출됨.
		System.out.println(resource);
		
		if(resource != null) {
			resource = null;
			System.out.println("리소스가 해제 되었습니다.");
			System.out.println(resource);
		}
		
	}
	
}

public class TryWithResourse_2 {

	public static void main(String[] args) {
		//1. 자동 리소스 해제 
		try(A a1 = new A("특정 파일");){
			
		}catch(Exception e) {
			System.out.println("예외가 발생되었습니다. ");
		}	//finally 블락에 a1.close()하지 않더라도 자동으로 호출됨
		
		System.out.println("============================");
		
		//2. 수동으로 리소스 해제
		A a2 = null;
		try {
			a2 = new A("생성자 초기값 할당");
		}catch(Exception e){
			
		}finally {
			if(a2.resource != null) {
				
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
