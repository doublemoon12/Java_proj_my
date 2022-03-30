package Chap16.EX08;

//제너릭 클래스를 생성해서, 타입 제한(Apple, Strawberry, Banana), pencil은 타입으로 접근 할 수 없도록 설정

class Generic <T extends Fruit>{
	private T fruit;

	public T getFurit() {
		return fruit;
	}

	public void setFurit(T furit) {
		this.fruit = furit;
	}
	
	@Override
	public String toString() {
		return fruit.toString();
	}
	
	public void print() {
		fruit.printing();
	}
}

abstract class Fruit {
	public abstract void printing(); // 추상 메소드
}

class Apple extends Fruit{
	String name;
	int price;
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "이고 가격은 " + price;
	}
	@Override
	public void printing() {
		System.out.println("사과");
	}
}

class Strawberry extends Fruit{
	String name;
	int price;
	Strawberry(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "이고 가격은 " + price;
	}
	@Override
	public void printing() {
		System.out.println("딸기");
	}
}

class Banana extends Fruit{
	String name;
	int price;
	Banana(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "이고 가격은 " + price;
	}
	@Override
	public void printing() {
		System.out.println("바나나");
	}
}
class Pencil{
	String name;
	int price;
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "이고 가격은 " + price;
	}
}
public class EX_Restric_Generic_Type {
	public static void main(String[] args) {
		
		Generic<Apple> apple1 = new Generic();
		apple1.setFurit(new Apple("사과", 1000));
		Apple apple2 = apple1.getFurit();
		System.out.println(apple1);
		System.out.println(apple2);
		apple1.print();
		
		Generic<Strawberry> strawberry1 = new Generic();
		strawberry1.setFurit(new Strawberry("딸기", 2000));
		Strawberry strawberry2 = strawberry1.getFurit();
		System.out.println(strawberry1);
		System.out.println(strawberry2);
		strawberry1.print();
		
		Generic<Banana> banana1 = new Generic();
		banana1.setFurit(new Banana("바나나", 3000));
		Banana banana2 = banana1.getFurit();
		System.out.println(banana1);
		System.out.println(banana2);
		banana1.print();
		
		/*
		Generic<Pencil> pencil1 = new Generic();
		pencil1.setFurit(new Pencil("사과", 1000));
		Pencil pencil2 = pencil1.getFurit();
		System.out.println(pencil1);
		System.out.println(pencil2);
		pencil1.print();
		*/
		
	}

}
