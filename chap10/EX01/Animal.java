package chap10.ex01;

class Dog_sub extends Dog{
	int dog_sub;
	
	void dog_sub(){
		System.out.println("Dog의 자식 클래스 입니다");
	}
}

class Tiger extends Animal{
	int leg;
	
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아 먹습니다.");
	}
	
}
class Dog extends Animal{
	int dog;
	
	void dogEat() {
		System.out.println("개는 잡식성 입니다.");
	}
}
class Egle extends Animal{
	int egle;
	
	void egle() {
		System.out.println("독수리는 날라다닌다.");
	}
}




public class Animal {
	String name;
	int age;
	String color;

	void eat() {
		System.out.println("모든 동물은 음식을 먹는다");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잔다.");
	}
	
	
	public static void main(String[] args) {

		//업캐스팅은 다형성으로 처리하기 때문에 아주아주 효율적으로 프로그래밍을 처리
			//다형성 : 오버라이딩(상속에서 사용)을 이용해서 상속에서 하나의 메소드로 여러 정보를 처리할 수 있다.
		
		//1. Animal클래스 객체와
		Animal a1 = new Animal();	//자신의 필드와 메소드만 접근
		
		//2. Dog 클래스를 Dog타입으로 객체화
		Dog d1 = new Dog();			//Animal과 Dog의 필드와 메소드를 접근
		
		//3.Dog를 Animal타입으로 업캐스팅
		Animal a2 = new Dog();		//a2는 Animal과 Dog를 내포하고 있고, Animal의 필드와 메소드만 접근가능
		
		//4. Dog_sub를 Animal타입으로 업캐스팅
		Animal a3 = new Dog_sub();	//a3는 Animal,Dog,Dog_sub를 내포하고 있다. Animal의 필드와 메소드만 접근
			a3.name = "요크세트리아";
			//a3.dog = 6;				//접근불가
		
		//5. Dog_sub를 Dog데이터 타입으로 업캐스팅
		Dog d2 = new Dog_sub();		//d2는 Animal, Dog, Dog_sub를 내포하고 있고 Animal과 Dog의 필드와 메소드 접근가능
			d2.name = "세퍼드";	//Animal
			d2.dog = 5;			//Dog
			//d2.dog_sub = 3;		//Dog_sub는 사용불가
		
		//6.Dog_sub를 Dog_sub 데이터 타입으로 객체화
		Dog_sub ds1 = new Dog_sub();
			//ds1은 모두 사용가능
			ds1.name = "진돗개";
			ds1.age = 4;	//Anmial
			ds1.dog = 3; 	//Dog
			ds1.dog_sub = 2;
		
		//상속에서 업캐스팅, 다운 캐스팅
			
			//업캐스팅 : 자식타입의 데이터 타입에서 부모 데이터 타입으로 변환
			//부모타입의 필드와 메소드만 접근
			//강제타입 변환없이 자동으로 업캐스팅
			//ds1은 Dog_sub의 데이터 타입을 가지고 있다. (Animal, Dog, Dog_sub의 모든 필드와 메소드 접근이 가능)
			
			Dog ds1_c1 = ds1;		//업캐스팅	: Dog_sub ====> Dog타입으로 업캐스팅
			Animal ds1_c2 = ds1;	//업캐스팅	: Dog_sub ====> Animal타입으로 업캐스팅(
			
			//ds1 : Dog_sub (Animal, Dog, Dog_sub)
			//ds1_c1 : Dog (Animal, Dog)
			//ds1_c2 : Animal(Animal)
			
			
			//다운캐스팅 : 부모 데이터 타입을 다시 자식 데이터 타입으로 변환
			//강제로 타입 변환이 필요함
			//a3는 Animal, Dog, Dog_sub중 Animal타입만 사용하도록 업캐스팅 되어있다.
			Dog a3_down1 = (Dog) a3;	//a3[Animal] ==>a3_down1[Dog]
			Dog_sub a3_down2 = (Dog_sub) a3;	//a3[animal] ==> 다운
	}

}
