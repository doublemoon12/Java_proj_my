package chap13.EX10;

class Button{
	//OnclickListner	: 객체 타입, ocl : 참조 변수
	OnClickListener ocl ;	//ocl 기본값으로 null
	
	//setter를 통해서 OnClickListener의 참조변수 ocl에 객체 주소 
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	
	//인터페이스만 존재하고 구현한 자식 클래스가 존재하지 않는다.
	//호출하는 곳에서 onClick()메소드를 재정의 해서 호출
	interface OnClickListener{	//InnerInterface, static, Button.OnClickListener
		void onClick();		//메소드 선언만 됨, 하위에서 오버라이딩 해서 재정의
	}
	
	void click() {		//실행 했을때 ocl.onClick()호출
		ocl.onClick();	//ocl	: 참조변수 : null ===> set
		System.out.println(ocl);
	}
}


public class ButtonAPIExample {

	public static void main(String[] args) {
		//개발자 1 	: 클릭시 음악 재생
		Button button1 = new Button();	
		
		//A.B ab = new A.B(){이너인터페이스B의 메소드를 구현한 코드};
		//OnclickListener 객체 타입을 객체 생성해서 매개변수로 전달
		button1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {

				System.out.println("개발자1. 음악재생");
			}
		});
		button1.click();
		
		System.out.println("================================");
		
		//개발자 2 	: 클리시 네이버 접속
		Button button2 = new Button();
		//setOnClickListener메소드에 매게변수로 OnClickListener의 하위 익명 객체를 생성후 OnClickListener
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자2. 네이버 접속");
			}
		});
		button2.click();
		
	}

}
