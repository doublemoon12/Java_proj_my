package chap03;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���");
		
		int value2 = sca.nextInt();
		if (value2 % 3 == 0){
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}

	}

}
