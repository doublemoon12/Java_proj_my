package Ex;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		int i = 0;
		
		String[] ex = {"Ź��", "�߱�", "�౸", "��", "����"};
		int[] num = {2, 9, 11, 6, 2};
		
		for(i = 0; i < ex.length; i++) {
			System.out.println("���� �̸��� �Է� �ϼ���");
			name = sc.next();
		}
		
	}

}
