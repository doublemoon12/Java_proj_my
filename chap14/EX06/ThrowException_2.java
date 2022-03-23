package chap14.EX06;

//일반 예외(checked Exception)		: 컴파일 단계에서 예외가 발생
	//1. 직접 처리하는 경우
	//2. throws로 전가 시키는 경우

	//main메소드에 throws를 한 경우 , Exception이 발생될 경우 정보를 출력해 주고 중지됨

public class ThrowException_2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//정상적으로 파일이 존재 합니다. ClassNotFoundException이 발생되지 않는다.
		Class cls1 = Class.forName("java.lang.Object");
		
		//파일이 존재하지 않는 경우. ClassNotFoundException이 발생된다.
		Class cls2 = Class.forName("java.lang.Object00");
		
	}

}
