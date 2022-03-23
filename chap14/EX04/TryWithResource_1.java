package chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		// 1. 수동 리소스 해제(기존 프로그램 사용) -- 코드가 길다.

		System.out.println("문자를 입력 하세요");

		InputStreamReader isr2 = null; // 사용후 반드시 메모리에서 객체를 삭제 해줘야함 ==> isr2.close() 호출
		//System.in		: 콘솔에서 입력을 받도록 처리. 1번만 인풋을 받을수 있다.
							//객체가 종료 되면 두번 인풋을 받지 못한다.
		
		//자동 메모리 해제
		try (InputStreamReader isr1 = new InputStreamReader(System.in);) {
			char input = (char) isr1.read();
			System.out.println("입력글자 = " + input);
		}catch(IOException e){
			e.printStackTrace();
		}		//finally생략하더라도 객체를 자동으로 isr1.close()를 함
		
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char) isr2.read(); // 일반 예외 (checked예외)
			System.out.println("입력글자 = " + input);
		} catch (IOException e) {
			e.printStackTrace(); // try블락에서 Exception이 발생할 경우 자세한 정보를 출력
		} finally { // 객체를 사용후에 메모리 영역에서 삭제해주는것을 finally영역에서 한다.
			// 리소스 해제 : isr2.close
			if (isr2 != null) {
				try {
					isr2.close(); // 일반예외 : IOException이 발생이 되어서 try,catch로 묶어주어야 한다
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		
		
		
		// 2. 자동 리소스 해제(Java 1.7부터 자동으로 리소스를 해제(조건필요)) -- 코드가 간결하다
			// 1) 사용하는 객체가 AutoCloseable 인터페이스를 구현한 객체여야 한다.
			// 2) 반드시 객체에 close()가 반드시 있어야한다.
			// 위의 두가지 조건을 만족할 떄 자동 리소스 해제
			// try(자동으로 리소스를 해제할 객체 선언){} catch{} finally{}
			
		//InputStreamReader는 AutoCloseable인터페이스를 구현하고 있다. close()를 가지고 있다.
		//Try with Resource	: try(with resource	: 객체 메모리 로드){}
		
		
		
		
		
		
		
	}

}
