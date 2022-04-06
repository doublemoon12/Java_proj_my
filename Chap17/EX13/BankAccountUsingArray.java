package Chap17.EX13;

import java.util.Scanner;

class Account{				//��������
	private String ano;		//���� ��ȣ
	private String owner;	//���� ��, �̸�
	private int balance;	//���� �ݾ�
	
	Account(String ano, String owner, int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

public class BankAccountUsingArray {
	//�迭�� ����ؼ� Account��ü ���
	private static Account[] accountArray = new Account[100];	//�迭�� ��ü ����. 
	private static Scanner sc = new Scanner(System.in);
	private static void createAccount() {
		//�ڵ� �ۼ� : 1. ���� ����. ��ĳ�ʷ� 1) ���� ��ȣ 2) �̸� 3) �ʱ�����ݾ�
		System.out.println("1. ���»���");
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String ano = sc.next();
		System.out.println("�̸��� �Է��ϼ���");
		String owner = sc.next();
		System.out.println("�ʱ� ����ݾ��� �Է��ϼ���");
		int balance = sc.nextInt();
		
		//�� �ʵ��� ������ ����ڷκ��� �Ҵ�޾Ƽ� ��ü�� ���� �� ����
		Account newAccount = new Account(ano, owner, balance);
		//�迭�� ��ü�� ����. for���� ����ؼ� null�� ���� ã�Ƽ� null��� ��ü�� ����.
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("���°� ���������� �����Ǿ����ϴ�");
				break;
			}
		}
		
	}
	private static void accountList() {
		//�ڵ��ۼ� : ���� ��� ��� �迭�� ����� ��ü�� ������ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		//�迭�� �� ���� ��ȸ �ϸ鼭 null�� �ƴѰ�� 
		System.out.println("=====================");
		System.out.println("2. ���¸�����");
		System.out.println("=====================");
		
		//�迭�� ������ null�� �ƴѰ��, ��ü�� �ʵ��� ���� ���.
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.println(account.getAno());
				System.out.println("    ");
				System.out.println(account.getOwner());
				System.out.println("    ");
				System.out.println(account.getBalance());
				System.out.println();
			}
		}
	}
	private static void deposit() {
		//�ڵ��ۼ� : 3.���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Ա� �ݾ� : �ش� ���¿� ����.
		System.out.println("================");
		System.out.println("3.�����ϱ�");
		System.out.println("================");
		System.out.println("������ ���¹�ȣ �Է�");
		String ano = sc.next();
		System.out.println("������ �ݾ��� �Է� �ϼ���");
		int money = sc.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("��� : ������ ���������� �Ա� �Ǿ����ϴ�.");
		
	}
	private static void withdraw() {
		//�ڵ��ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ�޾� �ش� ���¸� ��ü���� ã�Ƽ� ���.
		System.out.println("================");
		System.out.println("3.����ϱ�");
		System.out.println("================");
		System.out.println("����� ���¹�ȣ �Է�");
		String ano = sc.next();
		System.out.println("����� �ݾ��� �Է� �ϼ���");
		int money = sc.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("��� : ����� ���������� �Ǿ����ϴ�.");
		System.out.println("���� �ݾ�" + account.getBalance());
	}
	//�迭���� Account��ü���� ano[���¹�ȣ]�� ������ ������ ã�Ƽ� ã�� ��ü�� �����ؼ� ������
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
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
