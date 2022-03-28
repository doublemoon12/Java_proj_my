package chap14.EX08;

//메소드의 throws를 전가, 전가, 전가 main전가
	//main메소드까지 전가가 된경우 예외의 결과창을 띄우고 프로그램 종료.
	//main 메소드는 예외 처리 하지 않는다.

class AA{
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");	//Exception발생
	}
	
}


public class ExceptionMethod {

	public static void main(String[] args) throws NumberFormatException {

		//1. 객체생성
		AA aa = new AA();
		
		//2.메소드 호출
		try {
			aa.abc();	//실행예외(컴파일 단계에서는 오류가 없다.)
		}catch(NumberFormatException e) {
			
			//e.printStackTrace(); //예외의 자세한 정보를 출력
		}
	
		System.out.println("프로그램 종료");
	
	
	}
}
