package Chap06_07.EX06;

import Chap06_07.EX05.C;

public class Ex_C {

	public static void main(String[] args) {
		//다른 클래스에 존재하여 / public만 접근	/model, color는 메모리로 접근 불가해서 setter를 public를 통해 값을 출력
		C c = new C();	//다른 패키지임으로 import시켜야 한다.
		
		//company, model, color는 다른패키지에서 접근불가, setter를 통해서 메모리 값을 할당하도록 구성
		c.maxspeed = 180;	//다른패키지의 클래스에서는public, protected(상속설정을 해야한다)
		
		//setter를 통해서 메모리에 값을 부여
		c.setColor("khaki");
		c.setModel("retona");
		
		c.print();
	}

}
