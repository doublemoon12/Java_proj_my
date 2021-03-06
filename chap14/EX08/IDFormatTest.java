package chap14.EX08;
//ID값을 Null을 넣을 경우Exception발생
//userID가 : 8자 이상 20자이하가 아닌경우 Exception

//일반 예외 생성
class IDFormatException extends Exception{	//2개의 생성자만 구성
	public IDFormatException() {
		super();
	}
	public IDFormatException(String messag) {	//예외 발생시 예외 메세지 출력, e.getMessage();를 사용
		super(messag);
	}
}

public class IDFormatTest {
	
	private String userID;	//체크 : null, 8자 이상 20자가 아닌 경우 Exception
		//userID 캡슐화됨. private : 외부나 다른 클래스에서 접근차단.
			//생성자, setter를 사용해서 값을 할당.
		//private으로 설정된 경우	: getter나 setter를 통해서 값을 넣거나 가지고온다.
	public String getUserID() {		//메소드 호출시 메모리의 userID를 던져줌
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException {	//setter: 메모리 값을 할당
		if(userID == null) {
			throw new IDFormatException("아이디는 Null일수 없습니다.");
		}else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자이상 20자 이하로 사용합니다");
		}else {
			System.out.println("정상적으로 잘 입력 되었습니다. ");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		//1. userID가 null인경우
		String userID = null;
		try {
			test.setUserID(userID);		//setter호출시 null값을 입력후 호출
		}catch(IDFormatException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("===========================");
		
		//2. userID를 7자를 넣은경우
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());//메세지 출력
		}
		
		System.out.println("===========================");
		
		//3. null이 아니고 8자이상 20자 이하일 경우
		userID = "123456790";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
