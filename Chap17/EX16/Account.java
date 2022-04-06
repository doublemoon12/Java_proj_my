package Chap17.EX16;

import java.util.Objects;

public class Account {

	private String ano; // 계좌 번호
	private String owner; // 계좌 주 , 이름
	private int balance; // 통장 금액,

	Account(String ano, String owner, int balance) { // 객체 생성시 필드의 값을 받아서 필드에 로드
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
	
	@Override
	public String toString() {
		return ano + owner + balance;
	}
}
