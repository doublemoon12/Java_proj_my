package chap11.EX06;

abstract class Animal{
	String name;
	int age;
	
	abstract void cry();
	abstract void run();
}

class Cat extends Animal{
	Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("�߿�");
	}
	void run() {
		System.out.println("����� �޸��ϴ�.");
	}
	@Override
	public String toString() {
		return "�����̸� : " + name + ", ���� : " + age;
	}
}

class Tiger extends Animal{
	Tiger(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("������");
	}
	void run() {
		System.out.println("�׹߷� ������ �޸��ϴ�.");
	}
	@Override
	public String toString() {
		return "�����̸� : " + name + ", ���� : " + age;
	}
}

class Eagle extends Animal{
	Eagle(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("����");
	}
	void run() {
		System.out.println("���� �ٴմϴ�.");
	}
	@Override
	public String toString() {
		return "�����̸� : " + name + ", ���� : " + age;
	}
}
public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����", 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Eagle("������", 15);
		
		//1. Animal �迭 ��ü�� ����
		Animal[] arr1 = {a1, a2, a3};
		
		//2. For���� ����ؼ� ��ü�� ��������� �̸��� ����, cry(), run() ��� 
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			arr1[i].cry();
			arr1[i].run();
		}
		System.out.println("=====================");
		
		//3. ���� for���� ����ؼ� �����ϰ� ���
		for(Animal k : arr1) {
			System.out.println(k);
			k.cry();
			k.run();
		}
	}

}
