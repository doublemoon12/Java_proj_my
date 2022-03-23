package chap12.EX09;


public class SamsungPhone implements PhoneInterface{

	//인터페이스에서 정의한 메소드를 구현 했다.
	@Override
	public void sendCall() {
		System.out.println("띠리리링~~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다~~~");
	}
	
	//추가적인 samsungphone 기능 추가
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
