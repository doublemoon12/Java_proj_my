

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int nu  = 0;	//��ĳ�ʷ� ��ȣ�� ��ǲ�޴� ����
		
		do {
			System.out.println("================================================================");
			System.out.println(" 1. 19�� ��� | 2. Ȧ���ܸ� ��� | 3. 3�� ����ܸ� ��� | 4. ���α׷� ����");
			System.out.println("================================================================");
			System.out.println("��ȣ�� �Է��� �ּ���>>>");
			nu = sc.nextInt();
			if(nu == 1) {	//���� for���� ����ؼ� ��ĳ�ʿ��� 1���� ���������� if�ȿ� 19�� �ⷫ
				for(int i = 19; i < 20; i++) {
					for(int j = 1; j < 10; j++) {
						int n = i * j;
						System.out.println(i + " * " + j + " = " + n);
					}
				}
			}else if(nu == 2) {	//���� for������ Ȧ���ܸ� ���
				for(int i = 1; i < 20; i++) {
					for(int j = 1; j < 20; j++) {
						if(i % 2 == 1) {
						int m = i * j;
						System.out.println(i + " * " + j + " = " + m);
						}
					}
				}
			}else if(nu == 3) {	//3�� ����ܸ� ���
				for(int i = 1; i < 20; i++) {
					for(int j = 1; j < 20; j++) {
						if(i % 3 == 0) {
						int m = i * j;
						System.out.println(i + " * " + j + " = " + m);
						}
					}
				}
			}else if(nu == 4) {	//���α׷� ����
					break;
			}
		}while(run);
		
		//��ĳ�� Ŭ����
		
		Scanner close;
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}

}
