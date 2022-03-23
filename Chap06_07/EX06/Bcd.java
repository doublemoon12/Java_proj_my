package Chap06_07.EX06;



public class Bcd{
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	//Abc(){} <== 기본 생성자 : 필드의 초기값을 부여해서 객체를 생성
	
	
	public void print1() {
		System.out.println("다른 패키지에서 접근 가능");
	}
	protected void print2() {
		System.out.println("다른패키지에서 접근 가능(상속관계가 구성될떄) : protected");
	}
	void print3() {
		System.out.println("같은패키지에서만 접근이 가능 : default");
	}
	private void print4() {
		System.out.println("같은 클래스에서만 접근인 가능");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
