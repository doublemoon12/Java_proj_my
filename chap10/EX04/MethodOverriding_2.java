package chap10.EX04;

class Animal2{
	void run(){
		
	}
}

class Tiger extends Animal2{
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}

class Egle extends Animal2{
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void EgleEat() {
		System.out.println("독수리는 동물을 먹습니다.");
	}
}

class Snake extends Animal2{
	@Override
	void run() {
		System.out.println("벰은 기어다닙니다.");
	}
	void SnakeEat() {
		System.out.println("뱀은 동물을 먹습니다.");
	}
}

public class MethodOverriding_2 {

	public static void main(String[] args) {

		//1. 모든 객체를 Animal2타입으로 업캐스팅 해서 생성하고 오버라이딩
		Animal2 aa = new Animal2();
		Tiger ab = new Tiger();
		Egle ac = new Egle();
		Snake ad = new Snake();
		
		Animal2 a1 = new Tiger();
		Animal2 a2 = new Egle();
		Animal2 a3 = new Snake();

		//2. Animal2 배열에 각 객체를 저장.
		Animal2[] a4 = {a1, a2, a3};
		
		//3. for문으로 배열의 객체를 출력 .run 메소드출력
		for(int i = 0; i < a4.length; i++) {
			a4[i].run();
		}
		
		System.out.println("=======================");
		//4. Enhanced For문을 사용해서 객체의 run메소드 출력
		for(Animal2 i : a4) {
			i.run();
		}
		
		System.out.println("=========================");
		//5.다운 캐스팅 해서(instanceOf)로
		
		if(ab instanceof Tiger) {
			Tiger a_down = (Tiger) ab;
			ab.tigerEat();
		}
		if(ac instanceof Egle) {
			Egle a_down = (Egle) ac;
			ac.EgleEat();
		}
		if(ad instanceof Snake){
			Snake a_down = (Snake) ad;
			ad.SnakeEat();
		}
	}

}

