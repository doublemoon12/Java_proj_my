package Chap06_07.EX05;

public class Ex_C {

	public static void main(String[] args) {
		
		//같은 패키지 안에있다
		
		C c = new C();	//같은 패키지 안에 존재하는 클래스
		
		//c.company = "삼성자동차"	//private : 외부 클래스에서 접근 불가
		c.maxspeed = 180;		//public
		c.model = "starex";		//default
		c.color = "gray";		//protected
		
		c.print();
	}

}
