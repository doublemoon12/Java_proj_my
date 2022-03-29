package Chap16.EX01;

//Generic을 사용하지 않았을시의 문제점.	- 상품을 저장할 클래스를 매번 생성해줘야 한다. 
//객체를 담을 클래스를 만들 경우, 매번 객체를 생성 할때마다 그 객체를 담을 클래스를 만들어 줘야 한다.
//객체를 저장할 클래스를 생성해서 객체 정보를 담을 수있다. <=== 새로운 상품이 추가 될때 마다 그 상품을 담을 클래스를 생성해 줘야한다.
//코드가 굉장히 복잡해진다.

class Apple{
	String name;
	int price;
	
	Apple(String name, int price){		//생성자
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		//객체 자체를 출력 할때 객체의 주소가 아닌 필드의 정보를 출력.
		return "이름 : " + name + " , 가격 : " + price;
	}
}

//1. Apple을 담을 수 있는 클래스 생성.
class Goods1{	//상품에 사과를 담은 클래스
	private Apple apple = new Apple("사과", 1000);

	public Apple getApple() {	//객체 필드의 정보를 출력한다
		return apple;
	}

	public void setApple(Apple apple) {	
		this.apple = apple;
	}	
}

class Pencil{
	String name;
	int price;
	Pencil(String name, int price){	//생성자를 통해서 필드의 값 할당.
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		//객체 자체를 출력 할때 객체의 주소가 아닌 필드의 정보를 출력.
		return "이름 : " + name + " , 가격 : " + price;
	}
}

//2. Pencil을 담을 수 있는 클래스 생성
class Goods2{
	private Pencil pencil = new Pencil("연필", 2000);

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//1. Goods1 상품이 저장되어 있다. Apple객체 추가 및 가져오기
		Goods1 goods1 = new Goods1();	//기본 생성자
		goods1.setApple(new Apple("사과2", 2000));	//setter로 값을 할당
		System.out.println(goods1.getApple());						//gerrer로 필드의 내용을 출력
		
		//2. Goods2 상품이 저장되어 있다. pencil객체 추가및 가져오기
		Goods2 goods2 = new Goods2();	//기본 생성자
		goods2.setPencil(new Pencil("연필2", 3000));	//setter로 값을 할당
		System.out.println(goods2.getPencil());
		
		
		
		
		
	}

}
