package Chap16.EX08;

//���ʸ� Ŭ������ �����ؼ�, Ÿ�� ����(Apple, Strawberry, Banana), pencil�� Ÿ������ ���� �� �� ������ ����

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
	public abstract void printing(); // �߻� �޼ҵ�
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
		return name + "�̰� ������ " + price;
	}
	@Override
	public void printing() {
		System.out.println("���");
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
		return name + "�̰� ������ " + price;
	}
	@Override
	public void printing() {
		System.out.println("����");
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
		return name + "�̰� ������ " + price;
	}
	@Override
	public void printing() {
		System.out.println("�ٳ���");
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
		return name + "�̰� ������ " + price;
	}
}
public class EX_Restric_Generic_Type {
	public static void main(String[] args) {
		
		Generic<Apple> apple1 = new Generic();
		apple1.setFurit(new Apple("���", 1000));
		Apple apple2 = apple1.getFurit();
		System.out.println(apple1);
		System.out.println(apple2);
		apple1.print();
		
		Generic<Strawberry> strawberry1 = new Generic();
		strawberry1.setFurit(new Strawberry("����", 2000));
		Strawberry strawberry2 = strawberry1.getFurit();
		System.out.println(strawberry1);
		System.out.println(strawberry2);
		strawberry1.print();
		
		Generic<Banana> banana1 = new Generic();
		banana1.setFurit(new Banana("�ٳ���", 3000));
		Banana banana2 = banana1.getFurit();
		System.out.println(banana1);
		System.out.println(banana2);
		banana1.print();
		
		/*
		Generic<Pencil> pencil1 = new Generic();
		pencil1.setFurit(new Pencil("���", 1000));
		Pencil pencil2 = pencil1.getFurit();
		System.out.println(pencil1);
		System.out.println(pencil2);
		pencil1.print();
		*/
		
	}

}
