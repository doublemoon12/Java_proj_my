package chap10.ex01;

class Dog_sub extends Dog{
	int dog_sub;
	
	void dog_sub(){
		System.out.println("Dog�� �ڽ� Ŭ���� �Դϴ�");
	}
}

class Tiger extends Animal{
	int leg;
	
	void tigerEat() {
		System.out.println("ȣ���̴� �ٸ� ������ ��� �Խ��ϴ�.");
	}
	
}
class Dog extends Animal{
	int dog;
	
	void dogEat() {
		System.out.println("���� ��ļ� �Դϴ�.");
	}
}
class Egle extends Animal{
	int egle;
	
	void egle() {
		System.out.println("�������� ����ٴѴ�.");
	}
}




public class Animal {
	String name;
	int age;
	String color;

	void eat() {
		System.out.println("��� ������ ������ �Դ´�");
	}
	void sleep() {
		System.out.println("��� ������ ���� �ܴ�.");
	}
	
	
	public static void main(String[] args) {

		//��ĳ������ ���������� ó���ϱ� ������ ���־��� ȿ�������� ���α׷����� ó��
			//������ : �������̵�(��ӿ��� ���)�� �̿��ؼ� ��ӿ��� �ϳ��� �޼ҵ�� ���� ������ ó���� �� �ִ�.
		
		//1. AnimalŬ���� ��ü��
		Animal a1 = new Animal();	//�ڽ��� �ʵ�� �޼ҵ常 ����
		
		//2. Dog Ŭ������ DogŸ������ ��üȭ
		Dog d1 = new Dog();			//Animal�� Dog�� �ʵ�� �޼ҵ带 ����
		
		//3.Dog�� AnimalŸ������ ��ĳ����
		Animal a2 = new Dog();		//a2�� Animal�� Dog�� �����ϰ� �ְ�, Animal�� �ʵ�� �޼ҵ常 ���ٰ���
		
		//4. Dog_sub�� AnimalŸ������ ��ĳ����
		Animal a3 = new Dog_sub();	//a3�� Animal,Dog,Dog_sub�� �����ϰ� �ִ�. Animal�� �ʵ�� �޼ҵ常 ����
			a3.name = "��ũ��Ʈ����";
			//a3.dog = 6;				//���ٺҰ�
		
		//5. Dog_sub�� Dog������ Ÿ������ ��ĳ����
		Dog d2 = new Dog_sub();		//d2�� Animal, Dog, Dog_sub�� �����ϰ� �ְ� Animal�� Dog�� �ʵ�� �޼ҵ� ���ٰ���
			d2.name = "���۵�";	//Animal
			d2.dog = 5;			//Dog
			//d2.dog_sub = 3;		//Dog_sub�� ���Ұ�
		
		//6.Dog_sub�� Dog_sub ������ Ÿ������ ��üȭ
		Dog_sub ds1 = new Dog_sub();
			//ds1�� ��� ��밡��
			ds1.name = "������";
			ds1.age = 4;	//Anmial
			ds1.dog = 3; 	//Dog
			ds1.dog_sub = 2;
		
		//��ӿ��� ��ĳ����, �ٿ� ĳ����
			
			//��ĳ���� : �ڽ�Ÿ���� ������ Ÿ�Կ��� �θ� ������ Ÿ������ ��ȯ
			//�θ�Ÿ���� �ʵ�� �޼ҵ常 ����
			//����Ÿ�� ��ȯ���� �ڵ����� ��ĳ����
			//ds1�� Dog_sub�� ������ Ÿ���� ������ �ִ�. (Animal, Dog, Dog_sub�� ��� �ʵ�� �޼ҵ� ������ ����)
			
			Dog ds1_c1 = ds1;		//��ĳ����	: Dog_sub ====> DogŸ������ ��ĳ����
			Animal ds1_c2 = ds1;	//��ĳ����	: Dog_sub ====> AnimalŸ������ ��ĳ����(
			
			//ds1 : Dog_sub (Animal, Dog, Dog_sub)
			//ds1_c1 : Dog (Animal, Dog)
			//ds1_c2 : Animal(Animal)
			
			
			//�ٿ�ĳ���� : �θ� ������ Ÿ���� �ٽ� �ڽ� ������ Ÿ������ ��ȯ
			//������ Ÿ�� ��ȯ�� �ʿ���
			//a3�� Animal, Dog, Dog_sub�� AnimalŸ�Ը� ����ϵ��� ��ĳ���� �Ǿ��ִ�.
			Dog a3_down1 = (Dog) a3;	//a3[Animal] ==>a3_down1[Dog]
			Dog_sub a3_down2 = (Dog_sub) a3;	//a3[animal] ==> �ٿ�
	}

}
