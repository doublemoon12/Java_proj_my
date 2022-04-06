package Chap17.EX13;

import java.util.Scanner;

class Account{				//계좌정보
	private String ano;		//계좌 번호
	private String owner;	//계좌 주, 이름
	private int balance;	//통장 금액
	
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
	//배열을 사용해서 Account객체 등록
	private static Account[] accountArray = new Account[100];	//배열에 객체 저장. 
	private static Scanner sc = new Scanner(System.in);
	private static void createAccount() {
		//코드 작성 : 1. 계좌 생성. 스캐너로 1) 계좌 번호 2) 이름 3) 초기통장금액
		System.out.println("1. 계좌생성");
		System.out.println("계좌번호를 입력하세요");
		String ano = sc.next();
		System.out.println("이름을 입력하세요");
		String owner = sc.next();
		System.out.println("초기 통장금액을 입력하세요");
		int balance = sc.nextInt();
		
		//각 필드의 정보를 사용자로부터 할당받아서 객체를 생성 후 저장
		Account newAccount = new Account(ano, owner, balance);
		//배열에 객체를 저장. for문을 사용해서 null인 방을 찾아서 null경우 객체를 저장.
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 성공적으로 생성되었습니다");
				break;
			}
		}
		
	}
	private static void accountList() {
		//코드작성 : 계좌 목록 출력 배열에 저장된 객체를 가지고와서 계좌번호, 이름, 금액을 출력
		//배열의 각 방을 순회 하면서 null이 아닌경우 
		System.out.println("=====================");
		System.out.println("2. 계좌목록출력");
		System.out.println("=====================");
		
		//배열의 각방의 null이 아닌경우, 객체의 필드의 값을 출력.
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
		//코드작성 : 3.예금 <== 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금 금액 : 해당 계좌에 저장.
		System.out.println("================");
		System.out.println("3.예금하기");
		System.out.println("================");
		System.out.println("예금할 계좌번호 입력");
		String ano = sc.next();
		System.out.println("예금할 금액을 입력 하세요");
		int money = sc.nextInt();
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과 : 해당 계좌가 존재하지 않습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공적으로 입금 되었습니다.");
		
	}
	private static void withdraw() {
		//코드작성 : 4. 출금 <== 계좌 번호를 인풋받아 해당 계좌를 객체에서 찾아서 출금.
		System.out.println("================");
		System.out.println("3.출금하기");
		System.out.println("================");
		System.out.println("출금할 계좌번호 입력");
		String ano = sc.next();
		System.out.println("출금할 금액을 입력 하세요");
		int money = sc.nextInt();
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과 : 해당 계좌가 존재하지 않습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공적으로 되었습니다.");
		System.out.println("남은 금액" + account.getBalance());
	}
	//배열에서 Account객체내의 ano[계좌번호]와 동일한 계조를 찾아서 찾은 객체를 리턴해서 돌려줌
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
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("=============================");
			System.out.println("선택>>");
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
				System.out.println("종료");
				run = false;
				break;
			}
		}
		sc.close();
		
	}

}
