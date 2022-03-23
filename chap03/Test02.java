package chap03;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("정수값을 입력하세요");
		
		int value2 = sca.nextInt();
		if (value2 % 3 == 0){
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}

}
