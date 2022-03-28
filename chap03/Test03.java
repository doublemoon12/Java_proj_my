package Chap03;

public class Test03 {

	public static void main(String[] args) {

		System.out.println(2+3/2);
		System.out.println(10%3+5/3);
		System.out.println((4+5/2)%4);
		
		System.out.println("=================");
		
		int a = 5;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(a++ + --b);
		System.out.println(a+b);
		
		System.out.println("=================");
		
		System.out.println(5 & 3);
		System.out.println(5 | 3);
		System.out.println(5 ^ 3);
		System.out.println(~ 5);
		
	}

}
