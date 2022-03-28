package Chap03;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요?");
		
		int value1 = sc.nextInt();
		System.out.println((value1 % 3 == 0) ? "3의 배수 입니다." : "3의 배수가 아닙니다.");
	}
}
