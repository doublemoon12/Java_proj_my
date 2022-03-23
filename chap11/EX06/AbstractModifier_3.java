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
		System.out.println("야옹");
	}
	void run() {
		System.out.println("사뿐히 달립니다.");
	}
	@Override
	public String toString() {
		return "동물이름 : " + name + ", 나이 : " + age;
	}
}

class Tiger extends Animal{
	Tiger(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("으르렁");
	}
	void run() {
		System.out.println("네발로 빠르게 달립니다.");
	}
	@Override
	public String toString() {
		return "동물이름 : " + name + ", 나이 : " + age;
	}
}

class Eagle extends Animal{
	Eagle(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("끼룩");
	}
	void run() {
		System.out.println("날라 다닙니다.");
	}
	@Override
	public String toString() {
		return "동물이름 : " + name + ", 나이 : " + age;
	}
}
public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("고양이", 10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Eagle("독수리", 15);
		
		//1. Animal 배열 객체에 저장
		Animal[] arr1 = {a1, a2, a3};
		
		//2. For문을 사용해서 객체를 출력했을때 이름과 나이, cry(), run() 출력 
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			arr1[i].cry();
			arr1[i].run();
		}
		System.out.println("=====================");
		
		//3. 향상된 for문을 사용해서 동일하게 출력
		for(Animal k : arr1) {
			System.out.println(k);
			k.cry();
			k.run();
		}
	}

}
