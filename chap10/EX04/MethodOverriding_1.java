package chap10.EX04;

//�޼ҵ� �������̵�

class Animal{
	void cry() {}
}

class Bird extends Animal{
	@Override
	void cry(){
		System.out.println("��±");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}

class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}

public class MethodOverriding_1 {

	public static void main(String[] args) {
		//1. ������ Ÿ������ ���� + ������ Ÿ������ ����
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
			aa.cry();	//Animal Ŭ������ cry()
			bb.cry();	//Bird
			cc.cry();	//Cat
			dd.cry();	//Dog
		System.out.println("============================");
		
		//2. Animal Ÿ������ ���� + �ڽ� Ÿ������ ���� : ���� ���ε��� ���ؼ� �θ��� cry()�� ȣ���� ��� �ڽ��� �����ε��� �޼ҵ�� ���ε� �� 
		Animal ab = new Bird();	//ab�� Animal, Bird Ÿ���� ���� Animal �ʵ�� �޼ҵ常 ����		
		Animal ac = new Cat();	//ab�� Animal, Cat Ÿ���� ���� Animal �ʵ�� �޼ҵ常 ����
		Animal ad = new Dog();	//ab�� Animal, Dog Ÿ���� ���� Animal �ʵ�� �޼ҵ常 ����
		
		ab.cry();	//Animal�� cry()�� ȣ���� ��� ���� ���ε��� ���ؼ� BirdŬ������ cry()�� ȣ�� 
		ac.cry();	//Animal�� cry()�� ȣ���� ��� ���� ���ε��� ���ؼ� CayŬ������ cry()�� ȣ��
		ad.cry();	//Animal�� cry()�� ȣ���� ��� ���� ���ε��� ���ؼ� DogŬ������ cry()�� ȣ��
		
		System.out.println("===========================");
		
		//3. ��ü �迭�� ����
		
		Animal[] animal = {ab, ac, ad};
		//��ü Ÿ�� �迭�̸� = {��ü, ��ü, ��ü}
		
		for(Animal k : animal) {
			k.cry();
		}
		
		System.out.println("=========================");
		for(int i = 0; i < animal.length; i++) {
			animal[i].cry();
		}
		
	}

}
