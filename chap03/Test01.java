package Chap03;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���?");
		
		int value1 = sc.nextInt();
		System.out.println((value1 % 3 == 0) ? "3�� ��� �Դϴ�." : "3�� ����� �ƴմϴ�.");
	}
}
