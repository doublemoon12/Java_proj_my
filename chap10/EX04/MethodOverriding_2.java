package chap10.EX04;

class Animal2{
	void run(){
		
	}
}

class Tiger extends Animal2{
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}

class Egle extends Animal2{
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	void EgleEat() {
		System.out.println("�������� ������ �Խ��ϴ�.");
	}
}

class Snake extends Animal2{
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
	void SnakeEat() {
		System.out.println("���� ������ �Խ��ϴ�.");
	}
}

public class MethodOverriding_2 {

	public static void main(String[] args) {

		//1. ��� ��ü�� Animal2Ÿ������ ��ĳ���� �ؼ� �����ϰ� �������̵�
		Animal2 aa = new Animal2();
		Tiger ab = new Tiger();
		Egle ac = new Egle();
		Snake ad = new Snake();
		
		Animal2 a1 = new Tiger();
		Animal2 a2 = new Egle();
		Animal2 a3 = new Snake();

		//2. Animal2 �迭�� �� ��ü�� ����.
		Animal2[] a4 = {a1, a2, a3};
		
		//3. for������ �迭�� ��ü�� ��� .run �޼ҵ����
		for(int i = 0; i < a4.length; i++) {
			a4[i].run();
		}
		
		System.out.println("=======================");
		//4. Enhanced For���� ����ؼ� ��ü�� run�޼ҵ� ���
		for(Animal2 i : a4) {
			i.run();
		}
		
		System.out.println("=========================");
		//5.�ٿ� ĳ���� �ؼ�(instanceOf)��
		
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

