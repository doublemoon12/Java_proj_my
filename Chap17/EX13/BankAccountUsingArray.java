package Chap17.EX13;

import java.util.Scanner;

class Account{
	private String ano;		//���� ��ȣ
	private String owner;	//���� ��, �̸�
	private int balance;	//���� �ݾ�
	
	
}

public class BankAccountUsingArray {
	//�迭�� ����ؼ� Account��ü ���
	private static Account[] accountArray = new Account[100];	//�迭�� ��ü ����. 
	private static Scanner sc = new Scanner(System.in);
	
	private static void createAccount() {
		//�ڵ� �ۼ� : 1. ���� ����. ��ĳ�ʷ� 1) ���� ��ȣ 2) �̸� 3) �ʱ�����ݾ�
		//�迭 ��ü�� ����.
	}
	private static void accountList() {
		//�ڵ��ۼ� : ���� ��� ��� �迭�� ����� ��ü�� ������ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
	}
	private static void deposit() {
		//�ڵ��ۼ� : 3.���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Ա� �ݾ� : �ش� ���¿� ����.
	}
	private static void withdraw() {
		//�ڵ��ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ�޾� �ش� ���¸� ��ü���� ã�Ƽ� ���.
	}
	//�迭���� Account��ü���� ano[���¹�ȣ]�� ������ ������ ã�Ƽ� ã�� ��ü�� �����ؼ� ������
	private static Account findAccount(String ano) {
		Account account = null;
		return account;
	}
	
	public static void main(String[] args) {
		
		
		boolean run = true;
		while(run) {
			System.out.println("=============================");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("=============================");
			System.out.println("����>>");
			int selectNO = sc.nextInt();
			
			if(selectNO == 1) {
				createAccount();
			}else if(selectNO == 2) {
				accountList();
			}else if(selectNO == 3) {
				deposit();
			}else if(selectNO == 4) {
				withdraw();
			}else if(selectNO == 5) {
				System.out.println("����");
				run = false;
				break;
			}
		}
		sc.close();
		
	}

}
